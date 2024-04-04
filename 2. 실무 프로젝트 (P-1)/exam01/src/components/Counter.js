import { useRef, useState } from 'react';
//렌더링 할때마다 num 이 10으로 초기화

const Counter = () => {
  const [number, setNumber] = useState(0);
  let num = useRef(10);
  console.log('Rendering!', number, num);
  const plus = () => {
    num.current++;
    setNumber(number + 100);
    console.log(num);
  };
  const minus = () => setNumber(number - 10);
  return (
    <>
      <h1>{number}</h1>
      <button type="button" onClick={plus}>
        +1
      </button>
      <button type="button" onClick={minus}>
        -1
      </button>
    </>
  );
};

export default Counter;
