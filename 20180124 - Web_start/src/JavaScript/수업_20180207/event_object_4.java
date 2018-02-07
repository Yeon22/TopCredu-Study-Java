package JavaScript.수업_20180207;

public class event_object_4 {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <title>Document</title>
		    <script>
		        window.onload = function(){
		            var form1 = document.f1;
		            var form2 = document.f2;
		            var eventObj;
		            
		            document.onmousemove = function(e){
		                eventObj = e?e:window.event;
		                var cx = eventObj.clientX;
		                var cy = eventObj.clientY;
		                form1.client_x.value = cx;
		                form1.client_y.value = cy;
		                
		                var px = eventObj.pageX;
		                var py = eventObj.pageY;
		                form1.pg_x.value = px;
		                form1.pg_y.value = py;
		            }
		            
		            form2.key.onkeydown = function(e){
		                eventObj = e?e:window.event;
		                form2.code.value = eventObj.keyCode;
		                
		                if(eventObj.ctrlKey == true && eventObj.keyCode == 71){
		                    alert("단축키 실행");
		                }
		            }
		        }
		    </script>
		</head>
		<body>
		    <div id="wrap">
		        <h1>마우스 이벤트 객체 속성</h1>
		        <form action="#" method="get" name="f1">
		            <fieldset>
		                <legend>커서 위치 추적</legend>
		                <p>
		                    <label for="client_x">cliencX : </label>
		                    <input type="text" name="client_x" id="client_x" />
		                </p>
		                <p>
		                    <label for="pg_x">pageX : </label>
		                    <input type="text" name="pg_x" id="pg_x" />
		                </p>
		                <p>
		                    <label for="client_y">clientY : </label>
		                    <input type="text" name="client_y" id="client_y" />
		                </p>
		                <p>
		                    <label for="pg_y">pageY : </label>
		                    <input type="text" name="pg_y" id="pg_y" />
		                </p>
		            </fieldset>
		        </form>
		        
		        <h1>키보드 이벤트 객체 속성</h1>
		        <form action="#" method="get" name="f2">
		            <fieldset>
		                <legend>키 코드값</legend>
		                <p>
		                    <label for="#">입력 키보드 : </label>
		                    <input type="text" name="key" id="key" />
		                    <label for="">유니코드값 : </label>
		                    <input type="text" name="code" id="code" />
		                </p>
		            </fieldset>
		        </form>
		    </div>
		</body>
		</html>
	 */

}
