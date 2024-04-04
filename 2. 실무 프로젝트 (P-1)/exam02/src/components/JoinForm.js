import { useState } from 'react';

const JoinForm = () => {
  const [userId, setUserId] = useState('');
  const [userPw, setUserPw] = useState('');

  const onUserIdChange = (e) => setUserId(e.currentTarget.value);

  const onUserPwChange = (e) => setUserPw(e.currentTarget.value);

  const onSubmit = (e) => {
    e.preventDefault();
    console.log(userId, userPw);
  };

  return (
    <form onSubmit={onSubmit}>
      <dl>
        <dt>ㅇㅏㅇㅣㄷㅣ</dt>
        <dd>
          <input type="text" onChange={onUserIdChange} autoFocus />
        </dd>
      </dl>
      <dl>
        <dt>ㅂㅣㅁㅣㄹㅂㅓㄴㅎㅗ</dt>
        <dd>
          <input type="password" onChange={onUserPwChange} />
        </dd>
      </dl>
      <dl>
        <dt>Confirm Password</dt>
        <dd>
          <input type="password" />
        </dd>
      </dl>
      <dl>
        <dt>UserName</dt>
        <dd>
          <input type="text" />
        </dd>
      </dl>
      <button type="submit">가입하기</button>
    </form>
  );
};

export default JoinForm;
