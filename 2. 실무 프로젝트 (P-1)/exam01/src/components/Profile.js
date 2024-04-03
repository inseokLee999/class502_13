import { useState } from 'react';

const Profile = () => {
  const [data, setData] = useState({
    name: '이인석',
    age: 40,
  });

  const changeProfile = () => {
    //data.name = '김이름';
    //data.age = 30;
    //console.log(data);
    //setData(data);
    //setData({ name: '김이름', age: 30 });
    //setData({ ...data, name: '홍길동' });
    /*setData((state) => {
      console.log('이전상태값:', state);
      return { ...data, name: '김이름' };
    });*/
    setData(function (prevState) {
      console.log('변경전 상태값:', prevState);
      return { ...prevState, name: '김이름' };
    });
  };

  const { name, age } = data;
  return (
    <>
      <h1>{name}</h1>
      <h2>{age}</h2>
      <button type="button" onClick={changeProfile}>
        변경
      </button>
    </>
  );
};
export default Profile;
