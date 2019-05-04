var id;
var val;
var cid;

var vue = new Vue({
	el: "#content",
	data: {
		notice: {},
		dynamic: {},
		next: [],
		pre: [],
		clazzInfo: {},
		clazz: null,
		plans: [],
		nHide:false,
		plus:false,
		freeInfo : {
			list : []
		},
		stuInfo : {
			list : []
		},remove:false
	},methods : {
		stupage : function(i) {
			$("#stuPond").fadeOut(300);
			$("#stuPond").fadeIn(500);
			setTimeout(function(){
				queryStu(i)
			},300);
		},
		freepage : function(i) {
			$("#freePond").fadeOut(300);
			$("#freePond").fadeIn(500);
			setTimeout(function(){
				frees(i);
			},300);
		}
	}
});

queryClazz(1);

function queryStu(i) {
	$.ajax({
		url : URL + "page/finishCore",
		data : {
			page : i,
			cid : cid
		},
		success : function(e) {
			vue.stuInfo = e;
		}
	});
}

function frees(i) {
	$.ajax({
		url : URL + "page/finishFail",
		data : {
			page : i,
			cid : cid
		},
		success : function(e) {
			vue.freeInfo = e;
		}
	});
}

function queryClazz(i){
	$.ajax({
		url: URL + "page/allClazz",
		data:{
			page:i,
			size:7
		},success: function(e) {
			vue.clazzInfo = e;
		}
	});	
}

function queryNotice(i) {
	$.ajax({
		url: URL + "page/mynotice",
		data: {
			id:cid,
			page: i
		},
		success: function(e) {
			vue.notice = e;
		}
	});
}

$("#content").on("click", "#notice .next", function() {
	val = $(this).attr("value");
	$(".show-it").show();
	$(".notice-next").hide();
	$(".notice-pre").hide();
	id = setInterval(function() {
		if ($(".notice-next").length > 0) {
			clearInterval(id);
			$(".notice-next").show(400);
			$(".show-it").slideUp(400);
			setTimeout(function() {
				queryNotice(val);				
			}, 400);
		}
	}, 100);
	$.ajax({
		url: URL + "page/mynotice",
		data: {
			id:cid,
			page: val
		},
		success: function(e) {
			vue.next = e.list;
		}
	});
});

$("#content").on("click", "#notice .prev", function() {
	val = $(this).attr("value");
	$(".show-it").show();
	$(".notice-next").hide();
	$(".notice-pre").hide();
 	id = setInterval(function() {
		if ($(".notice-pre").length > 0) {
			clearInterval(id);
			$(".notice-pre").show(400);
			$(".show-it").slideUp(400);
			vue.nHide=true;
			setTimeout(function() {
				queryNotice(val);
			}, 400);
		}
	}, 100);
	$.ajax({
		url: URL + "page/mynotice",
		data: {
			id:cid,
			page: val
		},
		success: function(e) {
			vue.pre = e.list;
		}
	});
 });

$("#content").on("click","#clazz-div .page-btn",function(){
	var page=$(this).attr("value");
	$("#clazz-div table").fadeOut(300);
	$("#clazz-div table").fadeIn(300);
	setTimeout(function(){
		queryClazz(page);
	},300);
});

$("#content").on("click", ".info", function() {
	cid = $(this).attr("value");
	$("#clazz-div").hide();
	$("#clazz-info").show();
	$.ajax({
		url: URL + "clazzInfo",
		data: {
			id: cid
		},
		success: function(e) {
			vue.clazz = e;
			$.ajax({
				url: URL + "clazzPlan",
				data: {
					id: cid
				},
				success: function(e) {
					queryNotice(1);
					vue.plans = e;
					$("#clazz-info .x").addClass("show-x");
					$("#clazz-info .y").addClass("show-y");
					$("#clazz-info .x").removeClass("hide-x");
					$("#clazz-info .y").removeClass("hide-y");
				},error:function(){
					alert("服务器异常");
				}
			});

		}
	});
});

var tid=setInterval(function(){
	if($("#huanqiu_div0")){
		$("#huanqiu_div0").remove();
		clearInterval(tid);
	}
},1000);

$("#content").on("click",".im-close",function(){
	$("#clazz-info .x").addClass("hide-x");
	$("#clazz-info .y").addClass("hide-y");
	$("#clazz-info .x").removeClass("show-x");
	$("#clazz-info .y").removeClass("show-y");
	setTimeout(function(){
		$("#clazz-info .x").removeClass("hide-x");
		$("#clazz-info .y").removeClass("hide-y");
		$("#clazz-info").hide();
		$("#clazz-div").fadeIn();
	},1000);
});

$("#content").on("click","#finish",function(){
	if($("#pond").is(":visible")){
		$("#pond").slideUp(400);
		$("#students").show(400);		
	}else{
		$.ajax({
			url: URL +"finishBegin",
			data:{
				id:cid
			},success:function(){
				$("#pond").show(400);
				$("#students").slideUp(400);
				queryStu(1);
				frees(1);
			}
		});
	}
});
