/**
 * Created by Administrator on 2017/7/18.
 */
window.onload=function(){
    var region=$("#region");
    var welcom=$("#welcom");
    var shade=$("#shade");
    welcom.animate({top:'350px',opacity:'0',width:'-=15%',marginLeft:'+=7.5%'},0);
    welcom.animate({top:'350px',opacity:'1'},800);
    shade.animate({opacity:'0.3'},800);
    region.animate({top:'300',opacity:'0'},0);
    region.animate({top:'500',opacity:'1'},700);
    var user=$("#user");
    var shadee=$("#shadee");
    user.animate({top:'100px',opacity:'0.3'},0);
    user.animate({top:'0px',opacity:'1'},800);
    shadee.animate({opacity:'0.3'},500);
    var nothing = $("#nothing");
    var find = $("#find");
    nothing.animate({top:'200px', opacity: '1'}, 800);
    find.animate({top:'200px', opacity: '1'}, 800);
};

