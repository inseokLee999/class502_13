'use client';
import ContextEx2 from './ContextEx2';
import { UserProvider } from './UserContext';
import ContextEx3 from '@/app/context/ContextEx3';

const ContextEx = () => {
  return (
    <UserProvider>
      <ContextEx3 />
      <ContextEx2 />
    </UserProvider>
  );
};

export default ContextEx;