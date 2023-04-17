<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>

<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
	/* $("#aa").on("click", function () {
	    alert("aa");
	}); */
	
	alert(aa());
	
	function aa() {
		for(var i = 0; i < 10; i++) {
			alert(i);
		}
	}
	
	
</script>
</head>
<body>
	<form>
		<button id="aa" value="aa">하하</button>
	</form>
</body>
</html>