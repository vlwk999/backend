const btnCollapse = document.querySelector('#btn-collapse');//all버튼
const heading = document.querySelectorAll('.panel-heading');
const question = document.querySelectorAll('.panel-question');
// heading 과 body를 감싸는 qusstion
const p_body = document.querySelectorAll('.panel-body');

heading.forEach(function(headingElement){

    headingElement.addEventListener('click',function(e){
        question.forEach(function(q){
            q.classList.remove('on');
        });
        e.target.parentNode.classList.add('on');

    });

});
btnCollapse.addEventListener('click',function(){
    question.forEach(function(q){
        q.classList.remove('on');
    });
});

// p_body.forEach(function(item){
//     item.addEventListener('click',function(){
//         var subHeight = this.nextElementSibling.height;

//         if(subHeight === '0px'){
//             slideUp();
//             this.nextElementSibling.style.height='108px'
//         }else{
//             this.nextElementSibling.style.height='0px'
//         }
//     });
// });
// function slideUp(){
//     p_body.forEach(function(item){
//         item.style.height='0px'
//     });
// };