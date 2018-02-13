package JQuery.수업_20180213;

public class rolling_slider_banner {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <title>Document</title>
		    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
		    <script>
        		$(function(){
            		var list = $("#banner"); //<ul id="banner">를 list 변수에 참조시킨다.
		            var show_num = 3; //프레임에 사진 노출될 개수
		            var num = 0; //이전, 다음 버튼 클릭할 때 증감되는 값
		            var total = $(">li",list).size(); //총 <li>의 개수 5가 저장됨.
		            var li_width = $("li:first",list).width(); //<li>의 너비 값을 저장
		            
		            //<li>태그 중 인덱스 값이 3보다 작은 <li>태그만 복제한다. 그러므로 0,1,2 인덱스에 해당하는 <li>태그가 복제되어
		            //<ul id="banner">에 추가한다.
		            var copyObj = $(">li:lt("+show_num+")",list).clone();
		            list.append(copyObj);
		            
		            //1. 다음 버튼을 클릭할 때 마다 이벤트 핸들러를 실행
		            $(".next").on("click", function(){
		                if(num == total){ //num값이 5일 경우 조건문 실행
		                    num = 0;
		                    list.css("margin-left", num);
		                }
		                
		                num++; //num에 값을 1씩 증가시킨다.
		                list.stop().animate({marginLeft:-li_width*num+"px"}, 500);
		                return false;
		            });
		            
		            //2. 이전 버튼을 클릭할 때 마다 이벤트 핸들러를 실행
		            $(".prev").on("click", function(){
		                if(num == 0){ //num값이 0일 경우 조건문 실행
		                    num = total;
		                    list.css("margin-left",-num*li_width+"px");
		                }
		                
		                num--; //num에 값을 1씩 감소시킨다.
		                list.stop().animate({marginLeft:-li_width*num+"px"}, 500);
		                return false;
		            });
        		});
    		</script>
		    <style>
		        *{margin: 0; padding: 0;}
		        img{border: none; vertical-align: top;}
		        li{list-style: none; float: left; width: 80px;}
		        h1{text-align: center;}
		        #banner_wrap{width: 260px; padding: 10px 20px; margin: 0 auto; border: 1px solid #aaa;}
		        #banner{width: 5000px;}
		        #frame{width: 232px; height: 54px; overflow: hidden; position: relative; margin: 10px auto;}
		    </style>
		</head>
		<body>
		    <h1>롤링 슬라이드 배너 만들기</h1>
		    <div id="banner_wrap">
		        <div id="frame">
		            <ul id="banner">
		                <li><a href="#"><img src="img/pic_t1.jpg" alt="사진1" /></a></li>
		                <li><a href="#"><img src="img/pic_t2.jpg" alt="사진2" /></a></li>
		                <li><a href="#"><img src="img/pic_t3.jpg" alt="사진3" /></a></li>
		                <li><a href="#"><img src="img/pic_t4.jpg" alt="사진4" /></a></li>
		                <li><a href="#"><img src="img/pic_t5.jpg" alt="사진5" /></a></li>
		            </ul>
		        </div>
		        <p>
		            <a href="#" class="prev">
		                <img src="img/prev_btn.png" alt="이전 버튼" />
		            </a>
		            <a href="#" class="next">
		                <img src="img/next_btn.png" alt="다음 버튼" />
		            </a>
		        </p>
		    </div>
		</body>
		</html>
	 */

}
