import React from 'react';
import { FaCheckSquare, FaRegCheckSquare } from 'react-icons/fa';
import { CiSquareRemove } from 'react-icons/ci';
import styled from 'styled-components';

const ItemBox = ({ item, onToggle, onRemove, className }) => {//className을 추가해야 스타일을 적용할 수 있다
  const { id, title, content, done } = item;
  return (
    <li key={id} onClick={() => onToggle(id)} className={className}>
      <div>
        {done ? <FaCheckSquare /> : <FaRegCheckSquare />}
        {title}
        <CiSquareRemove onClick={() => onRemove(id)} />
      </div>
      <div>
        {content && <div>{content}</div>}
      </div>
    </li>);
};

const StyledItemBox = styled(ItemBox)`
    display: flex;
    border: 1px solid #000;
    padding: 10px;

    & + & {
        margin-top: 10px;
    }
`;

const TodoList = ({ items, onToggle, onRemove }) => {
  return (
    <ul>
      {items &&
        items.length > 0 &&
        items.map((item) => (
          <StyledItemBox key={item.id} item={item} onToggle={onToggle} onRemove={onRemove} />
        ))}
    </ul>
  );
};

export default React.memo(TodoList);