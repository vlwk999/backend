import { useState } from "react";
function Counter(){
    const [number, serNumber] = useState(0);
    const onIncrease=()=>{
        serNumber(number + 1);
    }
    const onDecrease=()=>{
        serNumber(number - 1);
    }
    return (
        <div>
            <h1>{number}</h1>
            <button onClick={onIncrease}>+1</button>
            <button onClick={onDecrease}>-1</button>
        </div>
    );
}
export default Counter;

