/**
 * Created by Administrator on 2017/7/18.
 */
window.onload=function(){
    var region=$("#region");
    var welcom=$("#welcom");
    var shade=$("#shade");
    welcom.animate({top:'300px',opacity:'0',width:'-=15%',marginLeft:'+=7.5%'},300);
    welcom.animate({top:'350px',opacity:'1'},500);
    shade.animate({opacity:'0.3'},1000);
    region.animate({top:'500',opacity:'1'},100);
    region.animate({top:'380',opacity:'0.5'},300);
    region.animate({top:'500',opacity:'1'},150);
    region.animate({top:'420',opacity:'0.6'},120);
    region.animate({top:'500',opacity:'1'},110);
    region.animate({top:'460',opacity:'0.7'},100);
    region.animate({top:'500',opacity:'1'},100);
    region.animate({top:'480',opacity:'0.8'},100);
    region.animate({top:'500',opacity:'1'},100);
    region.animate({top:'490',opacity:'0.9'},50);
    region.animate({top:'500',opacity:'1'},50);
    region.animate({top:'495',opacity:'0.9'},50);
    region.animate({top:'500',opacity:'1'},50);
};