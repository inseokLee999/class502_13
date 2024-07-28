import React from "react";

// function Buttons({color,children}) {
// const {color, children} = props;// 매개변수로 받아 온것을 비구조 할당으로 받는다.
const Buttons = ({color, children}) => {
    const styles = {
        background: color,
    };
    return <button style={styles}>클릭!</button>
}

export default Buttons;