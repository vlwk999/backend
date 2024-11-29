import MultiInputForm from './MultiInputForm';
import React, {useState} from 'react';
function App(){
    return(
        <div>
            {/* <InputSample4/> */}
            {/* <div>
                <h1>좋아요 수:{likeCount}</h1>
                <button onClick={() => setLikeCount(likeCount + 1)}>좋아요</button>
            </div> */}
            <MultiInputForm/>
        </div>

    );
}
export default App;