import { useState, useRef, useCallback } from 'react';
import AddTodo from '../components/AddTodo';
import TodoList from '../components/TodoList';
import { produce } from 'immer';
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
  {
    id: 3,
    title: '할일 3',
    done: false,
  },
];
let submitFunc;
const TodoContainer = () => {
  //업데이트시 매번 호출
  const [items, setItems] = useState(initialValue);
  const [todo, setTodo] = useState('');
  const [message, setMessage] = useState('');
  let id = useRef(4); //할일 id
  const onSubmit = useCallback(
    (e) => {
      e.preventDefault();
      if (!todo.trim()) {
        setMessage('할일을 입력하세요');
        return;
      }

      /*
      //입력시 새로운 item리스트 만들고
      const newItems = items.concat({
        id: id.current,
        title: todo.trim(),
        done: false,
      });
  */
      //newitems으로 할당
      setItems(
        produce((draft) => {
          draft.push({
            id: id.current,
            title: todo.trim(),
            done: false,
          });
        }),
      );
      id.current++;
      //입력시 창 초기화
      setTodo('');
      setMessage('');
    },
    [todo],
  );
  console.log('같은 함수 :?', submitFunc === onSubmit);
  //할일 입력시 todo 변경
  const onChange = useCallback((e) => setTodo(e.currentTarget.value), []);

  //할일 목록 완료 여부 토글
  const onToggle = useCallback((id) => {
    /*
    const newItems = items.map((item) =>
      item.id === id ? { ...item, done: !item.done } : item,
    );
    setItems(newItems);
    
    setItems((prevItems) =>
      prevItems.map((item) =>
        item.id === id ? { ...item, done: !item.done } : item,
      ),
    );
    */
    /*
    setItems(
      items.map(
        (item) => (item.id === id ? { ...item, done: !item.done } : item), //item의 id값이랑 지금 들어온 값의 id값 이랑 같은거만 Toggle하고 나머지는 그냥 item을 반환
      ),
    );
    */
    setItems(
      produce((draft) =>
        draft.forEach((item) => item.id === id && (item.done = !item.done)),
      ),
    );
  }, []);
  const onRemove = (id) => {
    const newItems = items.filter((item) => item.id !== id);
    setItems(newItems);
  };
  return (
    <>
      <AddTodo
        onSubmit={onSubmit}
        onChange={onChange}
        todo={todo}
        message={message}
      />
      <TodoList items={items} onToggle={onToggle} onRemove={onRemove} />
    </>
  );
};
export default TodoContainer;
