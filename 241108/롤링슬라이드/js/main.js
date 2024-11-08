var show_num =3;
var total = $('#banner li').length;
var li_w = $('#banner li').eq(0).width();
var copyobj = $('#banner li:lt(3)').clone();

$('#banner li').append(copyobj);
var num = 0;

$('.next').click(function(){
    if(num == total){
        num = 0;
        $('#banner li').css('margin-left','0');      
    }
    num++;
    $('#banner li').stop().animate({marginLeft : -li_w*num},500);
    return false;
});

$('.prev').click(function(){
    if(num == 0){
        num = 5;
        $('#banner').css('margin-left',-li_w*num);
    }
    num--;
    $('#banner').stop().animate({marginLeft : -li_w*num},500);
}); 