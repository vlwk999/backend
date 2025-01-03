import React, { useRef, useState } from 'react'
import Header from './components/Header'
import Editor from './components/Editor'
import List from './components/List'
import "./App.css";
const mockData =[
  {
    id:0,
    isDone:false,
    content:"React 공부하기",
    date:new Date().getTime(),
  },
  {
    id:1,
    isDone:false,
    content:"빨래하기",
    date:new Date().getTime(),
  } ,
  {
    id:2,
    isDone:false,
    content:"노래연습하기",
    date:new Date().getTime(),
  }
];

function App() {
  const [todos, setTodos] = useState(mockData);
  const idRef = useRef(3); //초기번호는 mockData 0,1,2 -> 3번부터

  const onCreate = (content) =>{
    const newTodo ={
      id:idRef.current++,//3
      isDone:false,
      content : content,//sdfsd
      date:new Date().getTime(),
    }
    setTodos([newTodo, ...todos]);
    //기존의 목데이터를 뒤에놓고 새로만든 newTodo를 최상위로 추가
  }
  const onUpdate = (targetId) => {
    // todos State의 값들 중에
    // targetId와 일치하는 id를 갖는 투두 아이템의 isDone 변경
    // 인수: todos 배열에서 targetId와 일치하는 id를 갖는 요소의 데이터만 딱 바꾼 새로운 배열
    setTodos(
      todos.map((todo) =>
        todo.id === targetId
          ? { ...todo, isDone: !todo.isDone } //false -> true 체크를 되게하라
          : todo
      )
    );
  };
  
  const onDelete = (targetId) =>{
    //todos 배열에서 targetId와 일치하는 id를 갖는 요소만 삭제한 새로운 배열
    setTodos(todos.filter((todo) => todo.id !== targetId));
  }
// onDelete 함수는 targetId 기준으로 todos 배열에서 해당 id를 가진 항목을 제외하고
// 새로운 배열을 만들어 상태를 업데이트 하는 함수

  return (
    <div className='App'>
      <Header/>
      <Editor onCreate={onCreate}/>
      {/* oncreate 함수를 props로 전달하여 할일 추가 될수 있도록 */}
      <List todos={todos} onUpdate={onUpdate} onDelete={onDelete}/>
    </div>
  )
}

export default App

