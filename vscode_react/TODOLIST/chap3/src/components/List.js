import React, { useState } from 'react'
import TodoItem from './TodoItem';
import "./List.css"
function List({todos, onUpdate, onDelete}) {
const [search, setSearch] = useState("");

const onChangeSearch = (e) => {
	setSearch(e.target.value);
	//입력한 값을 search에 저장
}
const getFilteredData = () =>{
	if (search===""){
		return todos;
	}
	//검색창에 아무것도 입력이 안되면 todos전체를 반환(보여줌)
	return todos.filter((todo)=> 
		todo.content.toLowerCase().includes(search.toLowerCase())
		//대소문자를 구분하지 않고 검색어가 포함된 할일을 찾습니다.
	);
};
const filterdTodos =  getFilteredData(); 
//getFilteredData() 실행시킨 결과를(반환) 할 일 목록을 filterdTodos저장

  return (
	<div className='List'>
	  <h4>Todo List</h4>
	  <input 
	  value={search} 
	  onChange={onChangeSearch} 
	  placeholder='검색어를 입력하세요' />
	  <div className='todos_wrapper'>
	  {filterdTodos.map((todo)=>{
		return (<TodoItem key={todo.id} {...todo} onUpdate={onUpdate} onDelete={onDelete}/>)
	  })
	  }
	  </div>
	</div>
  )
}
 
export default List;
