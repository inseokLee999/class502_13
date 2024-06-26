import { MdOutlineAdd } from 'react-icons/md';

const AddTodo = ({onSubmit,onChange,todo}) => {
  return (
    <form onSubmit={onSubmit}>
      <input type="type" value={todo} onChange={onChange}/>
      <button type="submit"  >
        <MdOutlineAdd />
      </button>
    </form>
  );
};
export default AddTodo;
