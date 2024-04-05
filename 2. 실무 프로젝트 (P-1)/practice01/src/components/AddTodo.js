import { MdOutlineAdd } from 'react-icons/md';

const AddTodo = ({ onSubmit, onChange, todo, message }) => {
  return (
    <form onSubmit={onSubmit} autoComplete="off">
      <input type="type" value={todo} onChange={onChange} autoFocus />
      <button type="submit">
        <MdOutlineAdd />
      </button>
      {message && <div>{message}</div>}
    </form>
  );
};
export default AddTodo;
