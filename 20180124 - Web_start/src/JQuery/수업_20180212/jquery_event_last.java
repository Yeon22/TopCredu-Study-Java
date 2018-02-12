package JQuery.수업_20180212;

public class jquery_event_last {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <title>Document</title>
		    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
		    <script>
		        $(function(){
		            var size = 12;
		            var body = $("body");
		            
		            $(".zoom button").on("click", function(){ //글자 크기의 버튼들을 클릭했을 때
		                //이벤트를 등록한 button요소 중 클릭한 버튼의 인덱스 값을 변수 btn_index에 할당한다.
		                var btn_index = $(".zoom button").index(this); 
		                
		                if(btn_index==0){ //[+]를 클릭했을 때
		                    size++;
		                    body.css("font-size",size+"px");
		                }else if(btn_index==2){ //[-]를 클릭했을 때
		                    size--;
		                    body.css("font-size",size+"px");
		                }else{ //[0]을 클릭했을 때
		                    body.css("font-size","12px"); //글자 크기의 속성을 12px로 변경된다.
		                    size = 12;
		                }
		            });
		            
		            $("#fs").on("change", function(){ //글자모양을 선택했을 때
		                body.css("font-family", $(this).val()); //글자 모양을 바꾼다.
		            });
		        });
		    </script>
		</head>
		<body>
		    <div id="f_wrap">
		        <dl>
		            <dt>글자크기</dt>
		            <dd class="zoom">
		                <button>+</button>
		                <button>0</button>
		                <button>-</button>
		            </dd>
		            <dt>글자모양</dt>
		            <dd class="f_style">
		                <select name="fs" id="fs">
		                    <option value="dotum, '돋움', sans-serif">돋움</option>
		                    <option value="gulim, '굴림', sans-serif">굴림</option>
		                    <option value="magun gothic, '맑은고딕', sans-serif">맑은고딕</option>
		                    <option value="magun gothic, '맑은고딕', serif">궁서</option>
		                </select>
		            </dd>
		        </dl>
		    </div>
		    <p id="txt_wrap">
		        키보드 접근성이란.....
		    </p>
		</body>
		</html>
	 */

}
