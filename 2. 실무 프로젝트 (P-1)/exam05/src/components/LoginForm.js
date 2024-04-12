import styled, { css } from 'styled-components';
import { BigButton } from './commons/ButtonStyle';
const commonStyle = css`
  width: 100%;
`;
const OuterBox = styled.div`
  ${commonStyle}
  position: fixed;
  height: 100%;
  left: 0;
  top: 0;
  display: flex;
  align-items: center;
`;
const InputBox = styled.input`
  ${commonStyle}
  display: block;
  height: 45px;
  border: 1px solid #ccc;
  border-radius: 5px;
  background: #ffd9fa;
  border-color: black;

  padding: 0 10px;
  & + & {
    margin-top: 5px;
  }
`;

const FormBox = styled.form`
  h1 {
    text-align: center;
  }
  width: 420px;
  margin: 0 auto;
`;

const LoginForm = () => {
  return (
    <OuterBox>
      <FormBox autoComplete="off">
        <h1>로그인</h1>
        <InputBox type="text" placeholder="아이디" />
        <InputBox type="password" placeholder="비빔국수" />
        <BigButton type="submit" bgcolor="blue" selected={true}>
          로그인
        </BigButton>
      </FormBox>
    </OuterBox>
  );
};

export default LoginForm;
