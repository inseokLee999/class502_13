import { useState, useRef } from 'react';
import AddTodo from '../components/AddTodo';
import TodoList from '../components/TodoList';
const initialValue = [
  {
    id: 1,
    title: '할일 1',
    done: false,
  },
];
const TodoContainer = () => {
  const [items, setItems] = useState(initialValue); //초기값 설정
  const [todo, setTodo] = useState('');
  let id = useRef(2);
  const onSubmit = (e) => {
    e.preventDefault();
    const newItems = items.concat({
      id: id.current,
      title: todo.trim(),
      done: false,
    });
    setItems(newItems);
    id.current++;
  };
  const onChange = (e) => setTodo(e.currentTarget.value);

  return (
    <>
      <AddTodo onSubmit={onSubmit} onChange={onChange} todo={todo} />
      <TodoList items={items} />
    </>
  );
};

export default TodoContainer;
