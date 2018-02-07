package JavaScript.수업_20180207;

public class function_gallery {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <title>사진 갤러리</title>
		    <style>
		        * {margin: 0; padding: 0;}
		        li {list-style: none;}
		        a {text-decoration-style: none; color: #000;}
		        #gallery {width: 350px; margin: 30px auto; border: 1px solid #999; box-shadow: 0 5px 5px rgba(0,0,0,0.3);}
		        #gallery h1 {text-align: center;}
		        #gallery img {border: 1px solid #666;}
		        #photo {text-align: center;}
		        #gallery ul {width: 800px; margin: 0 auto; overflow: hidden;}
		        #photo_list ul li {width: 100px; float: left; text-align: center;}
		        #photo_list {width: 300px; margin: 10px auto; overflow: hidden;}
		        .btn_wrap {text-align: center;}
		        .btn_wrap a {font-weight: bold;}
		    </style>
		    
		    <script>
		        //window객체, body가 실행한 후 onload함수가 자동으로 동작하기 때문에 body위에 script에서 작성해도 된다.
		        window.onload = function(){
		            //클릭 이벤트를 등록하기 위해서 포토 목록에 8개의 <a>를 모두 선택한다.
		            var list_zone = document.getElementById("inner_list");
		            var list_a = list_zone.getElementsByTagName("a");
		            
		            //포토리스트의 모든 <a>에 클릭 이벤트를 등록하기 위해서 반복문을 이용하여 8개의 <a>에 모든 이벤트를 등록
		            for(var i=0; i<list_a.length; i++){
		                list_a[i].onclick = function(){
		                    var ph = document.getElementById("photo").children[0];
		                    ph.src = this.href;
		                    return false; //<a>를 클릭했을 때 링크가 되지 않도록 한다.
		                }
		            }
		            
		            //이전, 다음 버튼을 클릭할 때마다 <ul>이 100px만큼 증가 또는 감소되어 왼쪽, 오른쪽으로 이동된다.
		            
		            //다음 버튼을 클릭할 때마다 <ul>이 100px만큼 왼쪽으로 이동해야 한다.
		            var b_btn = document.getElementById("next_btn");
		            var m_num = 0;
		            b_btn.onclick = function(){
		                if(m_num>=list_a.length-3) return false;
		                m_num++;
		                list_zone.style.marginLeft = -100*m_num+"px";
		                return false;
		            }
		            
		            //이전 버튼을 클릭할 때마다 <ul>이 100px만큼 오른쪽으로 이동해야 한다.
		            var n_btn = document.getElementById("before_btn");
		            n_btn.onclick = function(){
		                if(m_num<=0) return false;
		                m_num--;
		                list_zone.style.marginLeft = -100*m_num+"px";
		                return false;
		            }
		            
		        }
		    </script>
		</head>
		<body>
		    <div id="gallery">
		        <h1>동해안 갤러리</h1>
		        <p id="photo">
		            <img src="img/pic_1.jpg" width="320" alt="" />
		        </p>
		        <div id="photo_list">
		            <ul id="inner_list">
		                <li>
		                    <a href="img/pic_1.jpg">
		                        <img src="img/pic_t1.jpg" alt="사진1" />
		                    </a>
		                </li>
		                <li>
		                    <a href="img/pic_2.jpg">
		                        <img src="img/pic_t2.jpg" alt="사진2" />
		                    </a>
		                </li>
		                <li>
		                    <a href="img/pic_3.jpg">
		                        <img src="img/pic_t3.jpg" alt="사진3" />
		                    </a>
		                </li>
		                <li>
		                    <a href="img/pic_4.jpg">
		                        <img src="img/pic_t4.jpg" alt="사진4" />
		                    </a>
		                </li>
		                <li>
		                    <a href="img/pic_5.jpg">
		                        <img src="img/pic_t5.jpg" alt="사진5" />
		                    </a>
		                </li>
		                <li>
		                    <a href="img/pic_6.jpg">
		                        <img src="img/pic_t6.jpg" alt="사진6" />
		                    </a>
		                </li>
		                <li>
		                    <a href="img/pic_7.jpg">
		                        <img src="img/pic_t7.jpg" alt="사진7" />
		                    </a>
		                </li>
		                <li>
		                    <a href="img/pic_8.jpg">
		                        <img src="img/pic_t8.jpg" alt="사진8" />
		                    </a>
		                </li>
		            </ul>
		        </div>
		        <p class="btn_wrap">
		            <a href="#" id="before_btn">&lt;</a>
		            <a href="#" id="next_btn">&gt;</a>
		        </p>
		    </div>
		</body>
		</html>
	 */

}
