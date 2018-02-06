package JavaScript.수업_20180206;

public class dom_ob6 {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <title>DOM객체</title>
		    <style>
		        #terms {width: 400px; height: 50px; overflow: auto; border: 1px solid #bbb;}
		        form {width: 550px;}
		    </style>
		</head>
		<body>
		    <form action="#" method="get" name="f1">
		        <fieldset>
		            <legend>폼 요소 1</legend>
		            <p>
		                <label for="user_pw1">비밀번호</label>
		                <input type="password" name="user_pw1" id="user_pw1" />
		            </p>
		            <p>
		                <label for="user_pw2">비밀번호 확인</label>
		                <input type="text" name="user_pw2" id="user_pw2" />
		                <input type="submit" value="확인" />
		            </p>
		        </fieldset>
		    </form>
		    <form action="#" method="get" name="f2">
		        <fieldset>
		            <legend>폼 요소 2</legend>
		            <div id="terms">
		                회사는 범령이 정하는 바에 따라 "회원"의 개인정보를 보호하기 위해 노력합니다.
		                개인정보의 보호 및 사용에 대해서는 관련법 및 회사의 개인정보취급방침이 적용됩니다.
		            </div>
		            <p>
		                <input type="checkbox" name="accept" id="accept" />
		                <label for="accept">약관 동의합니다.</label>
		            </p>
		            <p>
		                <input type="checkbox" name="allChk" id="allChk" />
		                <label for="allChk">전체선택</label><br />
		                <input type="checkbox" name="subject1" id="subject1" />
		                <label for="subject1">과목1</label><br />
		                <input type="checkbox" name="subject2" id="subject2" />
		                <label for="subject2">과목2</label><br />
		                <input type="checkbox" name="subject3" id="subject3" />
		                <label for="subject3">과목3</label><br />
		            </p>
		            <p>
		                <input type="submit" value="등록 완료" />
		                <input type="reset" value="등록 취소" />
		            </p>
		        </fieldset>
		    </form>
		    
		    <script>
		        document.f1.onsubmit = function(e){
		            var pw1 = document.f1.user_pw1;
		            var pw2 = document.f1.user_pw2;
		            
		            pw2.value = pw1.value;
		            pw2.disabled = true;
		            
		            return false;
		        }
		    </script>
		</body>
		</html>
	 */

}
