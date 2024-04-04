import {
  MdOutlineCheckBox,
  MdOutlineCheckBoxOutlineBlank,
} from 'react-icons/md';

const items = [
  { id: 1, title: '학원가기', done: false },
  { id: 2, title: '공부하기', done: true },
  { id: 3, title: '복습하기', done: false },
  { id: 4, title: '자습하기', done: false },
  { id: 5, title: '운동하기', done: true },
];

const Todos = () => {
  //const listItems = items.map((item) => <li>{item.title}</li>);

  return (
    <ul>
      <MdOutlineCheckBoxOutlineBlank />
      {items.map(({ id, title, done }) => (
        <li key={id}>
          {done ? <MdOutlineCheckBox /> : <MdOutlineCheckBoxOutlineBlank />}
          {title}
        </li>
      ))}
    </ul>
  );
};

export default Todos;
