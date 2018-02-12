package JQuery.수업_20180212;

public class jquery_event_8 {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <title>Document</title>
		    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
		    <script>
		        $(function(){
		            $("#user_id").keydown(function(e){ //키보드 자판을 눌렀을 때
		                $(this).css("background-color","purple");
		                $("#txt1").text(e.keyCode); //고유 키 코드 값을 출력
		            });
		            
		            $("#user_id").keypress(function(e){ //키보드 자판을 눌렀을 때
		                $("#txt2").text(e.keyCode); //고유 키 코드 값을 출력
		            });
		            
		            $("#user_id").keyup(function(){ //자판을 눌렀다 띄었을 때
		                $(this).css("background-color","yellow");
		            })
		        });
		    </script>
		    <style>
		        #user_id {ime-mode: disabled;}
		    </style>
		</head>
		<body>
		    <p>
		        <input type="text" name="user_id" id="user_id" />
		    </p>
		    <p id="txt1"></p>
		    <p id="txt2"></p>
		</body>
		</html>
	 */

}
