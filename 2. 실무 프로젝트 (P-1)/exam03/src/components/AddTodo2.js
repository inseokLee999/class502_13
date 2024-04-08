import { useEffect } from 'react';
import { MdOutlineAdd } from 'react-icons/md';
const AddTodo = ({ onSubmit, onChange, todo, message }) => {
  useEffect(() => {
    //componentDidmount(),componentDidUpdate()- 시점 두가지
    console.log('todo,message 값 변경-렌더링 후');
    return () => {
      console.log('뒷정리함수');
    };
  }, [todo, message]);//변화감지 기준
  
  /*
  useEffect(() => {
    console.log('메시지값 변경');
  }, [message]);
  */
  /*
  useEffect(() => {
    console.log('마운트 시 한번');
  }, []);
  */
  return (
    <form onSubmit={onSubmit} autoComplete="off">
      <input type="text" value={todo ?? ''} onChange={onChange} />
      <button type="submit">
        <MdOutlineAdd />
      </button>
      {message && <div>{message}</div>}
    </form>
  );
};
export default AddTodo;
