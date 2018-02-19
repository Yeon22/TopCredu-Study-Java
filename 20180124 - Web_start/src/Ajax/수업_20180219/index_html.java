package Ajax.수업_20180219;

public class index_html {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
		    <title>Document</title>
		    <script>
		        $(function(){
		            $("#d1").load("document_1.txt");
		            
		            $("#member").on("submit", function(){ //확인 버튼을 눌렀을 때
		                var d = $(this).serialize(); //폼 요소에 전송할 데이터를 재가공한다.
		                
		                $.ajax({
		                    url:"member.php", //데이터 전송 및 요청할 URL주소
		                    type:"post", //데이터 전송 방식
		                    data:d, //전송할 데이터
		                    success:function(result){ //전송 및 요청이 정상적으로 되었을 때
		                        $("#txt1").text(result);
		                    }
		                });
		                
		                return false;
		            });
		        });
		    </script>
		</head>
		<body>
		    <div id="d1">내용</div>
		    
		    <form action="member.php" method="post" name="member" id="member">
		        <fieldset>
		            <legend>회원가입</legend>
		            <p>
		                <label for="user_name">이름</label>
		                <input type="text" name="user_name" id="user_name" />
		            </p>
		            <p>
		                <input type="submit" value="확인" />
		            </p>
		        </fieldset>
		    </form>
		    <h1 id="txt1"></h1>
		</body>
		</html>
	 */

}
