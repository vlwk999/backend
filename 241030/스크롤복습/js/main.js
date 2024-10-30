$(function(){

    $(window).scroll(function(){
        var sct = $(this).scrollTop();
        //현재스크롤위치(양)
        $('#stop').text(sct);
        pdt = sct * 0.001;
        if(pdt <= 1){
            $('#pdt_basic').css('opactiy',pdt);
        }
        if(sct >=100){
            $('nav').addClass('fixed');
        }else{
            $('nav').removeClass('fixed');
        }

        // if(sct >= $('section>div').eq(0).offset().top){
        //     $('nav ul li').removeClass('on');
        //     $('nav ul li').eq(0).addClass('on');
        // }
        // if(sct >= $('section>div').eq(1).offset().top){
        //     $('nav ul li').removeClass('on');
        //     $('nav ul li').eq(1).addClass('on');
        // }
        // if(sct >= $('section>div').eq(2).offset().top){
        //     $('nav ul li').removeClass('on');
        //     $('nav ul li').eq(2).addClass('on');
        // }
        // if(sct >= $('section>div').eq(3).offset().top){
        //     $('nav ul li').removeClass('on');
        //     $('nav ul li').eq(3).addClass('on');
        // }
        // if(sct >= $('section>div').eq(4).offset().top){
        //     $('nav ul li').removeClass('on');
        //     $('nav ul li').eq(4).addClass('on');
        // }
        for(var i =0; i < 5; i++){
            if(sct >= $('section>div').eq(i).offset().top){
                $('nav ul li').removeClass('on');
                $('nav ul li').eq(i).addClass('on')
            }
        }    

    });

    $('nav ul li').click(function(){
        var i = $(this).index();
        //현재 네비게이션에 클릭된 인덱스값
        //alert(i);
       var offset_div =$('section>div').eq(i).offset().top;
      // alert(offset_div);
       //$('nav ul li').removeClass('on');
       //$('nav ul li').eq(i).addClass('on');   
       $('html, body').stop().animate({scrollTop:offset_div},1000);

    });

        $('section>div').mousewheel(function(evnet,d){
        if(d > 0){
            var prev = $(this).prev().offset().top;
            $('html,body').stop().animate({scrollTop:prev},1000,'easeOutBounce')
        }    
        if(d < 0){
            var next = $(this).next().offset().top;
            $('html,body').stop().animate({scrollTop:next},1000,'easeOutBounce')
        }    
    });
    $("#popup").draggable();

    // $.cookie('pop','no',{expires:1});
    if($.cookie('pop')!="no"){
        $('#popup').show();
    }
    $('#popup area:eq(0)').click(function(){
        $('#popup').fadeOut('fast');
    });
    //닫기 버튼을 클릭하면 popup창을 서서히 사라지게함
    $('#popup area:eq(1)').click(function(){
        $.cookie('pop','no',{expires:1});
        $('#popup').fadeOut('fast');
    });

    $("#notice_wrap").draggable();

    if($.cookie('popup')=='none'){
        $('#notice_wrap').hide();
    }

    var chk = $('expiresChk');

    $('.closeBtn').on('click',closePop);

    function closePop(){
        if(chk.is(':checked')){ //input창에 checked가 있으면
            $.cookie('popup','none',{expires:3});
            //chk 변수가 checked를 가지고 있으면 
            //popup에 none을 3일동안 저장해라
        }
        $('#notice_wrap').fadeout('fast');
    }
});




















// $(function(){
//     $(window).scroll(function(){
//         var sct = $(window).scrollTop();
//         $('#Top').text(sct);
//         if(sct >=100){
//             $('nav').addClass('fixed');
//         }else{
//             $('nav').removeClass('fixed');
//         }
        
//     });
 

//     $('nav ul li').click(function(){
//         $('nav ul li').removeClass('on');
//         $(this).addClass('on');

//         var i = $(this).index();
//         var offset_nav = $ ('section>div').eq(i).offset().top;
//         $('html,body').stop().animate({scrollTop:offset_nav},1000);

//         return false;
//     });

//     $('section>div').mousewheel(function(evnet,d){
//         if(d > 0){
//             var prev = $(this).prev().offset().top;
//             $('html,body').stop().animate({scrollTop:prev},1000,'easeOutBounce')
//         }    
//         if(d < 0){
//             var next = $(this).next().offset().top;
//             $('html,body').stop().animate({scrollTop:next},1000,'easeOutBounce')
//         }    
//     });

// });