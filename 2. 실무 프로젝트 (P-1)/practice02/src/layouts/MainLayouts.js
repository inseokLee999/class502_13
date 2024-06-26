import React from 'react';
import { Outlet } from 'react-router-dom';
import Header from '../outlines/Header';
import Footer from '../outlines/Footer';
import styled from 'styled-components';
const MainBox = styled.main`
  min-height: 700px;
  background: gray;
`;

const MainLayouts = () => {
  return (
    <>
      <Header />
      <MainBox>
        <Outlet />
      </MainBox>
      <Footer />
    </>
  );
};

export default React.memo(MainLayouts);
