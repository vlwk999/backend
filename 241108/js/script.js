$('.m_menu > li > a').click(function(){
    var abc = $(this).next('.sub').css('display');
        if(abc == 'none'){
            $('sub').slideUp();
            $(this).next('.sub').slideDown();
        }else{
            $(this).next('.sub').slideUp();
        }
        return false;
    
});