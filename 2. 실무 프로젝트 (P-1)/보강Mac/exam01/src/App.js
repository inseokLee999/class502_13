import Buttons from './components/Buttons'

function App() {
    const name = "아잉속"
    return (
        <>
            {name && <h1>안녕하세요!, {name}</h1>}
            <h2>반갑소</h2>
            <Buttons/>
        </>
    );
}

export default App;
