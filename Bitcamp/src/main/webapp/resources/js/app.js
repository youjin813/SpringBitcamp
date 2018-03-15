/*공통 JavaScript*/

var app = app ||  {};   //객체 선언 ,있으면 덮었<거 없ㅇ,면 새로 만들어라
var route = route || {};

app = (()=>{
	var init = x =>{
		route.init(x);
		app.board.init();
		onCreate();
	};
	var onCreate=()=>{
		setContentView();
	};
	var setContentView=()=>{
		move("main/home");
	};
	var move = x =>{
		location.href = route.$()+"/move/"+x;
	};	
	var boardList=x=>{
		app.board.list(x);
	};
	var boardDetail=x=>{
		app.board.detail(x);
	};
	return {init:init,
			move:move,
			boardList:boardList,
			boardDetail:boardDetail};	
})(); 
app.board =(()=>{
	var init=()=>{
		onCreate();
	};
	var onCreate=()=>{
		setContentView();
		list();
	};
	var setContentView=()=>{
		
	};
	var list=x=>{
		location.href = route.$()+"/board/list?pageNum="+x;
	};
	var detail=x=>{
		location.href = route.$()+"/board/detail/"+x;
	}
	return {
		onCreate:onCreate,
		init:init,
		list:list,
		detail:detail
	};
})();

route = (()=>{
	return {
			init:x => 
			{sessionStorage.setItem('x',x);},
			$:() =>
			{return sessionStorage.getItem('x');},
			$s:() =>
			{return sessionStorage.getItem('x')+'/resources/js';},
			$c:() =>
			{return sessionStorage.getItem('x')+'/resources/css';},
			$i:() =>
			{return sessionStorage.getItem('x')+'/resources/img';}
			};
})();

