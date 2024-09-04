import React from 'react';

const Greeting = ({ name, age, children }) => {
  age = age ?? 20;
  // console.log('props', props);
  // console.log(Object.getOwnPropertyDescriptors(props));
  // console.log('isExtensible', Object.isExtensible(props));
  // console.log('isFrozen', Object.isFrozen(props));
  // const { name } = props;
  // console.log('name', name);
  return (
    <div>
      <h1>{name}님 안녕하소</h1>
      <h2>나이는 : {age}</h2>
      <div>{children(100)}</div>
    </div>
  );
};
/*
Greeting.defaultProps = {
  age: 20,
};
*/
export default Greeting;
