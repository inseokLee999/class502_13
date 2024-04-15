import React from 'react';
import { Outlet } from 'react-router-dom';
import Header from '../outlines/Header';
import Footer from '../outlines/Footer';

const MainLayouts = () => {
  return (
    <>
      <Header />
      <main>
        <Outlet />
      </main>
      <Footer />
    </>
  );
};

export default React.memo(MainLayouts);
