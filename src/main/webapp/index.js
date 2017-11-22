function getAll() {
	var json = {"userId":"u1101"};
	PACK.restAjax({
       url:"/view3",
       type: 'GET',
       data: json,
	}).then(function(jso){
		alert(jso.flag);
	});
}