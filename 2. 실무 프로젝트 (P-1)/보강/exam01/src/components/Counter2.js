import React, {useState} from "react";

const Counter2 = () => {
    const [data, setData] = useState({
        number: 0,
        name: '인석',
    });//[상태값, 상태를 바꾸는 함수]
    const {number, name} = data;
    const decrease = () => {
        // setData({...data, number: number - 1})
        setData((prev) => ({...prev, number: number - 1}))
    };
    const increase = () => {
        setData({...data, number: number + 1})
    };
    return (
        <>
            <h1>{number}{name}</h1>
            <button type={"button"} onClick={decrease}>-1</button>
            <button type={"button"} onClick={increase}>+1</button>
        </>
    )
};
export default Counter2;