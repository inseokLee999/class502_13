import PropTypes from 'prop-types';
const MyComponent = ({ name, num, children }) => {
  name = name || '기본이름';
  return (
    <>
      <div>안녕하세요! 제 이름은 {name}입니다</div>
      <div>좋아하는 숫자는 {num}입니다. </div>
      {children}
    </>
  );
};
MyComponent.propTypes = {
  name: PropTypes.string,
  num: PropTypes.number.isRequired,
};
MyComponent.defaultProps = {
  //기본값 설정
  name: '기본이름',
};
export default MyComponent;
