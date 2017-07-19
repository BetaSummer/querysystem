/**
 * Created by Administrator on 2017/7/18.
 */
window.onload=function(){
    var region=$("#region");
    var welcom=$("#welcom");
    var shade=$("#shade");
    welcom.animate({top:'350px',opacity:'0',width:'-=15%',marginLeft:'+=7.5%'},0);
    welcom.animate({top:'350px',opacity:'1'},500);
    shade.animate({opacity:'0.3'},500);
    region.animate({top:'500',opacity:'1'},500);
    var user=$("#user");
    var shadee=$("#shadee");
    user.animate({top:'100px',opacity:'0.3'},0);
    user.animate({top:'0px',opacity:'1'},800);
    shadee.animate({opacity:'0.3'},500);
};
