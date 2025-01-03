import { useRef,useState } from "react";
import "./Editor.css"
function Editor({onCreate}) {
const [content, setContent] = useState("");
const inputRef = useRef();	//input창 접근

const onChangeContent = (e) =>{
	setContent(e.target.value);
};
const onKeydown = (e) => {
	if(e.keyCode === 13)
		onsubmit();
};
const onsubmit = () =>{
	if(content === ""){
    //아무것도 입력이 안되면 현재창에 포커스(클릭해서 깜박이게) -입력이 안됐으니 입력하라
		inputRef.current.focus();
		return;
	}
	console.log("추가된 할일 : ",content);
	onCreate(content); //부모 component에 새 할일 전달
	setContent("");
}

  return (
	<div className='Editor' >
	  <input 
	  ref={inputRef} 
	  value={content} 
	  onChange={onChangeContent}  
	  onKeyDown={onKeydown} 
	 placeholder='새로운 Todo...'/>
	  <button onClick={onsubmit}>추가</button>
	</div>
  )
}

export default Editor;