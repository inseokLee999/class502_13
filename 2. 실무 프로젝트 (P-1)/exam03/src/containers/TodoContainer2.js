import { useState, useReducer, useRef, useCallback } from 'react';
import AddTodo from '../components/AddTodo2';
import TodoList from '../components/TodoList2';

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
function reducer(items, action) {
  switch (action.type) {
    case 'ADD':
      return items.concat(action.todo);
    case 'TOGGLE':
      return items.map((item) =>
        item.id === action.id ? { ...item, done: !item.done } : item,
      );
    case 'REMOVE':
      return items.filter((item) => item.id !== action.id);
    default:
      break;
  }
  return items;
}
let submitFunc;
const TodoContainer = () => {
  const [items, dispatch] = useReducer(reducer, initialValue);
  //업데이트시 매번 호출
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
      //입력시 새로운 item리스트 만들고

      //newitems으로 할당
      dispatch({
        type: 'ADD',
        todo: {
          id: id.current,
          title: todo,
          done: false,
        },
      });
      id.current++;
      //입력시 창 초기화
      setTodo('');
      setMessage('');
    },
    [items, todo],
  );
  console.log('같은 함수 :?', submitFunc === onSubmit);
  //할일 입력시 todo 변경
  const onChange = useCallback((e) => setTodo(e.currentTarget.value), []);

  //할일 목록 완료 여부 토글
  const onToggle = useCallback(
    (id) => {
      /*
    const newItems = items.map((item) =>
      item.id === id ? { ...item, done: !item.done } : item,
    );
    setItems(newItems);
    */
      dispatch({ type: 'TOGGLE', id });
    },
    [],
    /*
    setItems(
      items.map(
        (item) => (item.id === id ? { ...item, done: !item.done } : item), //item의 id값이랑 지금 들어온 값의 id값 이랑 같은거만 Toggle하고 나머지는 그냥 item을 반환
      ),
    );
    */
  );
  const onRemove = useCallback((id) => {
    dispatch({ type: 'REMOVE', id });
  }, []);
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
