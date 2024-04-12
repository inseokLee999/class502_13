import { Link } from "react-router-dom";

const Home = () => {
  return (
    <>
      <h1>메인페이지</h1>
      <Link to={"/about"}>About 페이지</Link><br/>
      <a href="/about">About페이지 a태그</a>{/*새로 서버에서 받아옴*/}
    </>
  );
};
export default Home;
