import styled, { css } from 'styled-components';

export const BigButton = styled.button`
  width: 100%;
  height: 45px;
  border: 0;
  background: ${({ bgcolor }) => bgcolor ?? 'orange'};
  font-size: 1rem;
  color: purple;
  ${({ selected, bgcolor }) =>
    selected &&
    css`
      border: 1px solid ${bgcolor ?? 'orange'};
      background: #fff;
    `}
`;

//${({bgcolor})=>bgcolor??'orange'}; 비구조 할당
