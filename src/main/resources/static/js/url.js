var host=window.location.host;
var URL="http://"+host+"/ajax/";

$("#iframeSec").hide();

$("#sideNav li ul").click(function(){
	$("#iframeSec").show();
	console.log($("#iframeSec iframe"));
	$("#iframeSec").css("height","10000px");
	$("#content").hide();
});