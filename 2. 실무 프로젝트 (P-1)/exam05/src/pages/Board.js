import React from 'react';
import { useParams, useLocation, useSearchParams } from 'react-router-dom';
const posts = {
  post1: {
    subject: '게시글 1',
    content: '게시글 1 내용',
  },
  post2: {
    subject: '게시글 2',
    content: '게시글 2 내용',
  },
};
const Board = () => {
  const { id } = useParams();
  const data = posts[`post${id}`];
  //const location = useLocation();
  //console.log(location);
  //const [searchParams, setSearchParams] = useSearchParams();

  //console.log(searchParams.get('key1'));
  //setSearchParams('k1=v1&k2=v2');
  //console.log(searchParams.toString());
  return (
    <>
      {data ? (
        <>
          <h1>{data.subject}</h1>
          <div>{data.content}</div>
        </>
      ) : (
        <div>게시글이 없습니다.</div>
      )}
    </>
  );
};
export default React.memo(Board);
