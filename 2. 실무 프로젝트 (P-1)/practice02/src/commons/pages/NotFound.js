import React from 'react';
import { useNavigate } from 'react-router-dom';//exam05 에 있음
const NotFound = () => {
  const navigate = useNavigate();
  return (
    <>
      <h1>페이지 없음</h1>
      <button type="button" onClick={() => navigate(-1)}>
        이전 페이지로 이동
      </button>
      <button
        type="button"
        onClick={() => navigate('/', { replace: true })}
      >메인페이지로 이동</button>
    </>
  );
};

export default React.memo(NotFound);
