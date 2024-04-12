import { useParams, useSearchParams } from 'react-router-dom';
const Board = () => {
  const params = useParams();
  const [searchParams, setSearchParams] = useSearchParams();
  //searchParams===new URLSearchParams(location.search)
  console.log(params);
  //const key1 = searchParams.get('key1');
  //console.log(key1);
  //searchParams.append('key3', 'value3');// 실 주소가 변경 x
  //setSearchParams(searchParams.toString());// 실 주소가 변경
  return <h1>게시글</h1>;
};

export default Board;
