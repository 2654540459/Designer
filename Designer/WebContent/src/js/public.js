$(document).ready(function(){
  open_bg();//商品详情立即下单 购物车下单	
  touxian();//个人资料头像修改
  change_radio();//购物车选择
  clear_lishi();
  togglePwd();//密码的显示与隐藏
  agree();//注册同意用户协议
  add_jian();//数量加减效果

});// JavaScript Document// JavaScript Document
function open_bg(){
	$(".robot-a2,.pro-xiadan,.wode-clear").click(function(){
		$(".gou-mai").css("display","block");
		$(".wode-queren").css("display","block");
		$(".gou-mai-con").css("display","block");
		})
		$(".detail-close,.que-bottom-txt-one,.que-bottom-txt-two").click(function(){
		$(".gou-mai").css("display","none");
		$(".gou-mai-con").css("display","none");
		$(".wode-queren").css("display","none");
		$(".gou-mai-con").css("display","none");
		})	
}
function touxian(){
	$(".came-pho").click(function(){
		$(".huise-bg").css("display","block");
		$(".bottom-choose").css("display","block");
		})
		$(".cancel").click(function(){
		$(".huise-bg").css("display","none");
		$(".bottom-choose").css("display","none");
		})	
}
function change_radio(){
	var La=$(".change-radio");
	var Lb=$(".radio-blue");
	var Lc=$(".pro-footer");
	var Ld=$(".niming-pingjia");
	var Le=$(".detail-change");
	var Lf=$(".detail-color-width");
	Ld.click(function(){			 
	var afg=$(this).hasClass("niming-pingjia-red");
	if(afg==false){
		$(this).addClass("niming-pingjia-red");
		}else{
			$(this).removeClass("niming-pingjia-red");
		}
});
Le.click(function(){			 
	var afg=$(this).hasClass("detail-color-blue");
	if(afg==false){
		Le.removeClass("detail-color-blue");
		$(this).addClass("detail-color-blue");
		}else{
			$(this).removeClass("detail-color-blue");
		}
});
Lf.click(function(){			 
	var akg=$(this).hasClass("detail-color-blue");
	if(akg==false){
		Lf.removeClass("detail-color-blue");
		$(this).addClass("detail-color-blue");
		}else{
			$(this).removeClass("detail-color-blue");
		}
});
	La.click(function(){			 
	var abc=$(this).hasClass("change-pur-radio");
	if(abc==false){
		$(this).addClass("change-pur-radio");
		$(this).nextAll(".car-clear,.gw_num").css("display","block");
		}else{
			$(this).removeClass("change-pur-radio");
			$(this).nextAll(".car-clear,.gw_num").css("display","none");
		}
});
Lb.click(function(){			 
	var afc=$(this).hasClass("radio-white");
	if(afc==false){
		$(".radio-blue").removeClass("radio-white");
		$(this).addClass("radio-white");
		}else{
			$(this).removeClass("radio-white");
		}
});
	Lc.click(function(){			 
	var abe=$(this).hasClass("change-pur-radio");
	if(abe==false){
		$(this).addClass("change-pur-radio");
		La.addClass("change-pur-radio");
		}else{
			La.removeClass("change-pur-radio");
			$(this).removeClass("change-pur-radio");
		}
					  });
}
function clear_lishi(){
   $(".clear-lishi").click(function(){
	   $(".lishi-search").hide();
	   })
}
function togglePwd(obj) {
    var pwdInput = $("#passwd");
    var ptype = pwdInput.attr("type");	
    if (ptype == "password") {
        pwdInput.attr("type", "text");
		$("#showPs").html("隐藏");
    } else {
        pwdInput.attr("type", "password");
		$("#showPs").html("显示");
    }
};
function agree(){
	var Lb=$(".i-agree");
	Lb.click(function(){			 
	var afc=$(this).hasClass("blue-agree");
	if(afc==false){
		$('.regist-submit').removeAttr('disabled');
		$(this).addClass("blue-agree");
		$(".submit input").addClass("blue-tijiao");
		}else{
		$('.regist-submit').attr('disabled','disabled');
			$(this).removeClass("blue-agree");
			$(".submit input").removeClass("blue-tijiao");
		}
});
}
function add_jian(){
	$(".add").click(function(){
var n=$(this).prev().html();
var num=parseInt(n)+1;
if(num==0){ return;}
$(this).prev().html(num);
$('#price').html(num*159);
});
//减的效果
$(".jian").click(function(){
var n=$(this).next().html();
var num=parseInt(n)-1;
if(num==0){ return}
$(this).next().html(num);
$('#price').html(num*159);
});
}
