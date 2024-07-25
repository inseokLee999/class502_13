import React, {Component} from "react";

class Counter extends Component {
    state = {
        number: 0
    }

    render() {
        const {number} = this.state;//state값이 바뀔때 마다 render 가 호출
        this.state.number--;
        // const number = this.state.number;
        return (
            <>
                <h1>{number}</h1>
                <button type={'button'} onClick={() => this.setState({number: number - 1})}>-1</button>
                <button type={'button'} onClick={() => this.setState({number: number + 1})}>+1</button>
            </>
        )
    }
}

export default Counter;