const $slideWrap=document.querySelector('.main_visual');
const $slideContainer=document.querySelector('.main_visual .main_visual_img');
const $slide=document.querySelectorAll('.main_visual .main_visual_img .banner_img');
const $stopBtn=document.querySelector('.stop_btn a')
const $overBtn=document.querySelector('.over-btn')
const $prev=document.querySelector('.prev')
const $next=document.querySelector('.next')
const $pager=document.querySelectorAll('.indicator')
const $pagerBtn=document.querySelectorAll('.indicator li')

let $currentIndex=0;
const $slideCount=$slide.length;
let $timer=undefined;
let $isAutoSlideOn =true;
const $stopBtnImg=document.querySelector('.stop_btn a img');
const $imgOn=$stopBtnImg.getAttribute('src')
const $imgOff=$imgOn.replace('stop','play')


//슬라이드함수
function goToSlide(idx){
    $slideContainer.classList.add('animate');
    $slideContainer.style.left=-100*idx+'%';
    $currentIndex=idx;
    updatePagerButtons(idx);
}
goToSlide(0);

function updatePagerButtons(index) {
    $pagerBtn.forEach((btn, i) => {
        btn.classList.toggle('active', i === index);
    });
}
$pagerBtn.forEach((btn, idx) =>{
    btn.addEventListener('click', () =>{
        goToSlide(idx)
    })
})

$next.addEventListener('click',function(){
    goToSlide(($currentIndex+1) % $slideCount);
});
$prev.addEventListener('click',function(){
    goToSlide(($currentIndex-1 + $slideCount) % $slideCount)
})

//자동 슬라이드
startAutoSlide()
function startAutoSlide(){
    $timer=setInterval(()=>{
        let nextIdx=($currentIndex+1) % $slideCount;
        goToSlide(nextIdx)
    },2000)
}
function stopAutoSlide(){
    clearInterval($timer)
}
$stopBtn.addEventListener('click', function(){
    if($isAutoSlideOn){
        stopAutoSlide();
        $stopBtnImg.src=$imgOff

    }else{
        startAutoSlide()
        $stopBtnImg.src=$imgOn
    }
    $isAutoSlideOn=!$isAutoSlideOn;
})