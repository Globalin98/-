/**
 * 
 */

function setCookie(name, value, seconds) {
	const date = new Date();
	date.setTime(date.getTime()+ seconds*1000); //days를 밀리초로
	const exprises = "exprises=" + date.toUTCString();
	document.cookie = name + "=" + value + ";" + exprises + ";path=${pageContext.request.contextPath }";
}

function getCooke(name) {
	const cookies = document.cookie.split("; ");
	for (let cookie of cookies){
		const [key, value] = cookie.split("=")
		if (key==name) return value;
	}
	return null;
}