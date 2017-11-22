var PACK={};
if(typeof acwsContext == 'undefined')packContext = "/officeApply";//上下文
PACK.debug=true;
//静态加载js
function packInclude(url) {
	document.write("<script type='text/javascript' src='" + packContext + url + "'></script>");
}
//静态加载css
function packIncludeCss(url){
	document.write("<link rel='stylesheet' type='text/css' href='" + packContext + url + "'/>");
}
packIncludeCss('/component/common/css/bootstrap.min.css');
packInclude('/component/common/js/jquery-3.2.1.min.js');

/**
 * springmvc ajax调用统一入口
 * @param {} settings 同jquery ajax(settings)方法的参数
 * @returns {} 
 */
PACK.restAjax = function(settings){
	//默认使用POST请求
	settings.type = settings.type||'POST';
	//url增加项目前缀
	settings.url = packContext + settings.url;
	//POST请求公用处理
	if(settings.type == 'POST'){
		settings.dataType = 'json';
		settings.contentType = 'application/json;';
		settings.data = JSON.stringify(settings.data);
	}
	settings.cache = false;
	return $.ajax(settings);
}

/**
 * 判断字符串是否是空或undefined
 */
PACK.isNull = function(str){
    if (str == null || (str + '').replaceAll(" ", "") == '' || typeof(str) == 'undefined') {
        return true;
    }
    return false;
}

/**
 * 输出json对象
 * @param msg
 * @returns
 */
function _d(msg){
	if(!PACK.debug) return;
	if(typeof msg == 'object') {
		alert(JSON.stringify(msg));
	} else {
		alert(msg)
	}
}