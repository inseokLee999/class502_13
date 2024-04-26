//1. 액션 명
const INSERT = "todo/INSERT";
const REMOVE = "todo/REMOVE";

//2. 액션 객체 생성 함수
export const insert = (todo) => ({ type: INSERT, todo });
export const remove = (id) => ({ type: REMOVE, id });

//3. 리듀서 함수 정의(상태 변화를 일으키는 함수 )
const initialValue = [
  { todo: "할일 1", id: 1 },
  { todo: "할일 2", id: 2 },
  { todo: "할일 3", id: 3 },
];
function todo(state = initialValue, action) {
  switch (action.type) {
    case INSERT:
      const id = state.length > 0 ? state[state.length - 1].id + 1 : 1;
      return state.concat({
        todo: action.todo,id
      });
    case REMOVE:
      return state.filter((todo) => todo.id !== action.id);
    default:
      return state;
  }
}
export default todo;
