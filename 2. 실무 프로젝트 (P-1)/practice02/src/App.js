import { Route, Routes } from 'react-router-dom';
import loadable from '@loadable/component';

const MainLayouts = loadable(() => import('./layouts/MainLayouts'));
const Main = loadable(() => import('./main/pages/Main'));
const NotFound = loadable(() => import('./commons/pages/NotFound'));

/*회원페이지 S*/
const Join = loadable(() => import('./member/pages/Join'));
const Login = loadable(() => import('./member/pages/Login'));
/*회원페이지 E*/
const App = () => {
  return (
    <Routes>
      <Route path="/" element={<MainLayouts />}>
        <Route index element={<Main />} />
        <Route path="member">
          <Route path="join" element={<Join />} />
          <Route path="login" element={<Login />} />
        </Route>
        <Route path="*" element={<NotFound />} />
      </Route>
    </Routes>
  );
};
export default App;
