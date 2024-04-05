import { useState } from 'react';
import {
  MdOutlineCheckBox,
  MdOutlineCheckBoxOutlineBlank,
} from 'react-icons/md';

const initialValue = [
  { id: 1, title: '학원가기', done: false },
  { id: 2, title: '공부하기', done: true },
  { id: 3, title: '복습하기', done: false },
  { id: 4, title: '자습하기', done: false },
  { id: 5, title: '운동하기', done: true },
];

const Todos = () => {
  //const listItems = items.map((item) => <li>{item.title}</li>);
  const [items, setItems] = useState(initialValue); //usestate 사용

  const onToggle = (id) => {
    const newItems = items.map((item) =>
      item.id === id ? { ...item, done: !item.done } : item,
    );
    setItems(newItems);
    console.log(newItems);
  };
  return (
    <ul>
      {items.map(({ id, title, done }) => (
        <li key={id} onClick={() => onToggle(id)}>
          {done ? <MdOutlineCheckBox /> : <MdOutlineCheckBoxOutlineBlank />}
          {title}
        </li>
      ))}
    </ul>
  );
};

export default Todos;
