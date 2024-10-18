const targetLink = document.querySelectorAll('.menu a');
const tabContent=document.querySelectorAll('#tabcontent>div');

for(let i=0; i<targetLink.length;i++){
    targetLink[i].addEventListener('click',function(e){
        e.preventDefault(); 
        const orgTarget = e.target.getAttribute('href');
        const tabTarget=orgTarget.replace("#","");
        //alert(tabTarget);
        for(let j=0; j<tabContent.length; j++){
            tabContent[j].style.display="none"
        }
        document.getElementById(tabTarget).style.display='block';
        for(let k=0; k<targetLink.length; k++){
            targetLink[k].classList.remove('active');
           
            
        } 
        e.target.classList.add('active');
    }); 


}

// var list = document.getElementById('banner');
// var listLi = document.querySelectorAll('#banner li'); 
// var show_num = 1;  //보여지는 사진은 1장
// var total = 3;
// var li_width = document.querySelector('#banner li').offsetWidth;
// var prev = document.querySelector('.prev');
// var next = document.querySelector('.next');
// //alert(li_width);
// //var li_width= 1200;
// var num = 0;
// next.addEventListener('click',function(){
//     if(num === 3){
//         num = 0;
//         list.style.transition = "none";
//         list.style.marginLeft = "0px";
//     }
//     //한번만 실행 - 50 - 0.05 (setTimeout쓰는 이유 num =0 -> 1 가는게 동시실행방지)
//     setTimeout(function(){
//         num++;
//         list.style.transition = "margin-left 0.5s";
//         list.style.marginLeft = -li_width * num + "px";
//     },50);
// });
// prev.addEventListener('click',function(){
//     if(num === 0){
//         num = 3;
//         list.style.transition = "none";
//         list.style.marginLeft = -li_width * num + "px";
//     }
//     //한번만 실행 - 50 - 0.05 (setTimeout쓰는 이유 num =0 -> 1 가는게 동시실행방지)
//     setTimeout(function(){
//         num--;
//         list.style.transition = "margin-left 0.5s";
//         list.style.marginLeft = -li_width * num + "px";
//     },50);
// });


// function autoplay(){
//     if(num === 3){
//         num = 0;
//         list.style.transition = "none";
//         list.style.marginLeft = "0px";
//     }
//     //한번만 실행 - 50 - 0.05 (setTimeout쓰는 이유 num =0 -> 1 가는게 동시실행방지)
//     setTimeout(function(){
//         num++;
//         list.style.transition = "margin-left 0.5s";
//         list.style.marginLeft = -li_width * num + "px";
//     },50);
// }
// setInterval(autoplay, 3000);
// //autoplay라는 함수를 3초마다 실행 - 자동슬라이드 
