const App = () => {
  const name = 'js';
  const style = {
    backgroundColor: 'orange',
    color: 'white',
    height: '100px',
  };
  return (
    <>
      {/*주석..... */}
      <div className="subject" style={style}>
        첫번째 컴포넌트!
      </div>
      <div style={{ color: 'blue' }}>신(?)나는, {name && name} 공부</div>
      {name === 'React' && <h1>아~~ 재미없다~</h1>}
      <input type="text" />
    </>
  );
};

export default App;
