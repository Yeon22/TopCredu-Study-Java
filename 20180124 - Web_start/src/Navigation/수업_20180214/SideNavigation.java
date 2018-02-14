package Navigation.수업_20180214;

public class SideNavigation {
	
	/*
	 * <!--
	*    UI개발
	*    side navigation 제작
	*
	*    최종 수정일 : 2018-02-14
	-->
	
	
	<!DOCTYPE html>
	<html lang="en">
	<head>
	    <meta charset="UTF-8">
	    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	    <style>
	    // 사이드바 스타일 
	        .sidenav { 
	            height: 100%; 
	            width: 0;
	           
	           	고정(fixed)엘리먼트는 뷰포트에 상대적으로 위치가 지정되는데, 이는 페이지가 스크롤 되더라도 늘 같은 곳에 위치한다는 뜻.
	           	relative와 마찬가지로 top이나 right, bottom, left프로퍼티가 사용된다. 
	            position: fixed;
	            
	            // position 속성을 absolute 등으로 변경하면 태그들이 겹치게 될 수 있다.
	             * 일반적으로 더 나중에 선언한 태그가 위에 배치되나, style속성의 z-index를 이용하면 더 위에 배치시키거나 더 아래에 배치시킬 수 있다.
	             * z-index값이 높을수록 위, 작을수록 아래에 배치되며 정수 혹은 자연수 값을 사용한다. 
	            z-index: 1;
	            
	            top: 0;
	            left: 0;
	            background-color: rgb(0,154,200);
	            
	            // x축으로 범위를 넘어가면 보이지 않도록 처리. x축 스크롤바 나타나지 않음. 
	            overflow-x: hidden;
	            
	            // transition-duration은 변화가 몇초, 또는 몇 밀리세컨드(1/1000초)에 걸쳐 일어날지를 설정한다.
	               6s, 0.5s, 3s, 120ms 이라고 적혀 있다면, 이는 각각 6초, 0.5초, 0.3초, 120밀리세컨드라는 뜻이다.
	            transition: 0.5s ease-in-out;
	            
	            padding-top: 60px;
	        }
	        
	        .sidenav a {
	        	// 위 오른쪽 아래 왼족을 의미함 
	            padding: 8px 8px 8px 32px;
	            // a 링크 밑줄이 사라짐 
	            text-decoration: none;
	 			// 글자폰트 크기 25px 
	            font-size: 25px;
	 			// 컬러 화이트 
	            color: #fff;
	            
	               none : 보이지 않음
	               block : 블록 박스
	               inline : 인라인 박스
	               inline-block : block과 inline의 중간 형태
	            display: block;
	            
	            transition: 0.2s ease-in-out;
	        }
	        
	        .sidenav a:hover { color: #000; }
	        
	        .closebtn {
	            position: absolute;
	            top: 0;
	            right: 25px;
	            
	            // CSS는 나중에 설정한 값이 적용된다. 만약 나중에 설정한 값이 적용되지 않게 하려면 속성값 뒤에 !important를 붙이면 된다.
	            font-size: 36px !important;
	            
	            margin-left: 50px;
	        }
	        
	        .openmenu:hover {
	            color: rgb(0,154,200);
	            transition: 0.5s ease-in-out;
	        }
	        
	        .openmenu {
	            font-size: 25px;
	            
	            // cursor속성을 이용하면 마우스 커서의 형태를 지정 
	            cursor: pointer;
	            transition: 0.5s ease-in-out;
	        }
	        
	        .openmenu > i { font-size: 30px; }
	        
	        #main { transition: 0.5s ease-in-out; }
	        
	        // 미디어쿼리 적용
	        @media screen and (max-height:450px) {
	            .sidenav {
	                padding-top: 15px;
	            }
	            .sidenav a {
	                font-size: 18px;
	            }
	        }
	    </style>
	    <title>Document</title>
	</head>
	<body>
	    <div id="mysidenav" class="sidenav">
	        <a href="#" class="closebtn" onclick="closeNav()">x</a>
	        <a href="#">About</a>
	        <a href="#">Services</a>
	        <a href="#">Clients</a>
	        <a href="#">Contact</a>
	        <a href="#">Portfolio</a>
	    </div>
	    <div id="main">
        	<h2>side_navigation 제작</h2>
        	<p>아래 메뉴버튼을 클릭하면 사이드 네비게이션이 열립니다.</p>
    	/div>
	    <span class="openmenu" onclick="openNav()"><i class="fa fa-angle-double-left fa-5" aria-hidden="true"></i>open</span>
	    
	    <script>
	        function openNav(){
	            //푸쉬메뉴
	            //mysidenav 아이디의 스타일 너비값을 250px로 바꾼다.
	//            document.getElementById('mysidenav').style.width = '250px';
	//            document.getElementById('main').style.marginLeft = '250px';
	            
	            //풀사이드
	            document.getElementById('mysidenav').style.width = '100%';
	        }
	        
	        function closeNav(){
	            //푸쉬메뉴
	            //mysidenav 아이디의 스타일 너비값을 0px로 바꾼다.
	//            document.getElementById('mysidenav').style.width = '0px';
	//            document.getElementById('main').style.marginLeft = '0px';
	            
	            //풀사이드
	            document.getElementById('mysidenav').style.width = '0';
	        }
    	</script>
	</body>
	</html>
	 */

}
