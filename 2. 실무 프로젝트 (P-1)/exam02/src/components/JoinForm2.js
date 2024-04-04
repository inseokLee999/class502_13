import { useState, useEffect, useRef } from 'react';

const JoinForm = (props) => {
  const [form, setForm] = useState({});

  let userIdEl = useRef();

  useEffect(() => {
    //userIdEl.focus()
    //console.log(userIdEl);
    userIdEl.current.focus();
  }, [userIdEl]);

  const onChange = (e) => {
    const newForm = { ...form, [e.currentTarget.name]: e.currentTarget.value };
    setForm(newForm);

    //참고) e.currentTarget === this,document 객체
    //setForm({ ...form, [e.currentTarget.name]: e.currentTarget.value });  도 됨
    //form[e.currentTarget.name]=e.currentTarget.value; 이거는 기존 객체와 주소가 동일 하기 때문에 렌더링이 되지 않음
    //setForm({ ...form, [e.currentTarget.name]: e.currentTarget.value });
    /*
    const name = e.currentTarget.name;
    const value = e.currentTarget.value;
    setForm((prevForm) => ({
      ...prevForm,
      [name]: value,
      
    })); //함수형 업데이트
    */
  };

  const onSubmit = (e) => {
    e.preventDefault();
    //처리 완료

    //양식 값을 비워주기
    setForm({});
  };
  return (
    <form onSubmit={onSubmit}>
      <dl>
        <dt>아이디({form.userId})</dt>
        <dd>
          <input
            type="text"
            name="userId"
            onChange={onChange}
            value={form.userId ?? ''}
            //ref={(ref) => (userIdEl = ref)}
            ref={userIdEl}//간단 version userIdEl=useRef()
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호</dt>
        <dd>
          <input
            type="password"
            name="userPw"
            onChange={onChange}
            value={form.userPw ?? ''}
          />
        </dd>
      </dl>
      <dl>
        <dt>비밀번호 확인</dt>
        <dd>
          <input
            type="password"
            name="confirmPw"
            onChange={onChange}
            value={form.confirmPw ?? ''}
          />
        </dd>
      </dl>
      <dl>
        <dt>회원명</dt>
        <dd>
          <input
            type="text"
            name="userNm"
            onChange={onChange}
            value={form.userNm ?? ''}
          />
        </dd>
      </dl>
      <button type="submit">가입하기</button>
    </form>
  );
};

export default JoinForm;
