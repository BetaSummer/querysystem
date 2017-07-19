/**
 * Created by Administrator on 2017/7/18.
 */
$("#welcom").click(function(){
    var welcom=$("#welcom");
    var h=$("#h");
    var hh=$("#hh");
    welcom.animate({top:'350px'},1000);
    h.animate({fontSize:'1.5em',opacity:'0'},500);
    h.animate({fontSize:'1em',opacity:'0'},500);
    h.animate({opacity:'1'},700);
    hh.animate({fontSize:'0.5em',opacity:'0'},500);
    hh.animate({fontSize:'0.3em',opacity:'0'},100);
    hh.animate({opacity:'1'},700);
    welcom.css("z-index",1);

});
$("#welcom").click(function(){
    var shade=$("#shade");
    shade.animate({height:'768px',opacity:'0.5'},1300);

});
$("#welcom").click(function(){
    var region=$("#region");
    region.animate({top:'500',opacity:'1'},1500);

});