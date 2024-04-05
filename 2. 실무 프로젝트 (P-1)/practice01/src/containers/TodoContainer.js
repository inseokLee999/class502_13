import { useState, useRef } from 'react';
import AddTodo from '../components/AddTodo';
import TodoList from '../components/TodoList';
const initialValue = [
  {
    id: 1,
    title: '할일 1',
    done: true,
  },
  {
    id: 2,
    title: '할일 2',
    done: false,
  },
];
const TodoContainer = () => {
  const [items, setItems] = useState(initialValue); //초기값 설정
  const [todo, setTodo] = useState('');
  const [message, setMessage] = useState('');
  let id = useRef(3); //내부 변수 설정
  const onSubmit = (e) => {
    e.preventDefault();
    if (!todo.trim()) {
      setMessage('할 일을 입력하세요');
      return 0;
    }
    const newItems = items.concat({
      id: id.current,
      title: todo.trim(),
      done: false,
    });
    setItems(newItems);
    id.current++;
    setTodo('');
    setMessage('');
  };
  const onChange = (e) => setTodo(e.currentTarget.value);
  function onRemove(id) {
    const newItems = items.filter((item) => item.id !== id);
    setItems(newItems);
  }
  /*
  const onRemove = (id) => {
  const newItems = items.filter((item) => item.id !== id);
  setItems(newItems);
  };
  */
  const onToggle = (id) => {
    setItems(
      items.map(
        (item) => (item.id === id ? { ...item, done: !item.done } : item), //item의 id값이랑 지금 들어온 값의 id값 이랑 같은거만 Toggle하고 나머지는 그냥 item을 반환
      ),
    );
  };
  return (
    <>
      <AddTodo
        onSubmit={onSubmit}
        onChange={onChange}
        todo={todo}
        message={message}
      />
      <TodoList items={items} onRemove={onRemove} onToggle={onToggle} />
    </>
  );
};

export default TodoContainer;
