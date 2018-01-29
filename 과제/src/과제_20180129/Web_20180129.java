package 과제_20180129;

public class Web_20180129 {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <title>탑크리에듀</title>
		    <style>
		        *{padding: 0; margin: 0;}
		        
		        #header{
		            width: 800px;
		            height: 150px;
		            background-color: black;
		            color: white;
		            position: relative;
		        }
		        
		        #nav{
		            width: 500px;
		            height: 50px;
		            background-color: gray;
		            position: absolute;
		            bottom: 0;
		            right: 0;
		        }
		        
		        #nav li{
		            float: left;
		            list-style: none;
		            padding: 10px;
		        }
		        
		        #content{
		            width: 800px;
		        }
		        
		        #aside{
		            width: 200px;
		            height: 800px;
		            background-color: darkgray;
		            float: left;
		        }
		        
		        #box1{
		            width: 200px;
		            height: 200px;
		        }
		        
		        #box1 img{
		            width: 200px;
		            height: 180px;
		        }
		        
		        #box2{
		            width: 200px;
		            height: 200px;
		        }
		        
		        #box2 img{
		            width: 200px;
		            height: 180px;
		        }
		        
		        #box3{
		            width: 200px;
		            height: 200px;
		        }
		        
		        #box3 img{
		            width: 200px;
		            height: 180px;
		        }
		        
		        #box4{
		            width: 200px;
		            height: 200px;
		        }
		        
		        #box4 img{
		            width: 200px;
		            height: 180px;
		        }
		        
		        #section{
		            height: 800px;
		            background-color: #dddddd;
		        }
		        
		        .box1-1{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 5px;
		        }
		        
		        .box1-1 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box1-2{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 5px;
		        }
		        
		        .box1-2 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box1-3{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 5px;
		        }
		        
		        .box1-3 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box1-4{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 5px;
		        }
		        
		        .box1-4 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box2-1{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 17px;
		        }
		        
		        .box2-1 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box2-2{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 17px;
		        }
		        
		        .box2-2 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box2-3{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 17px;
		        }
		        
		        .box2-3 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box2-4{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 17px;
		        }
		        
		        .box2-4 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box3-1{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 17px;
		        }
		        
		        .box3-1 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box3-2{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 17px;
		        }
		        
		        .box3-2 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box3-3{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 17px;
		        }
		        
		        .box3-3 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box3-4{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 17px;
		        }
		        
		        .box3-4 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box4-1{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 20px;
		        }
		        
		        .box4-1 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box4-2{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 20px;
		        }
		        
		        .box4-2 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box4-3{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 20px;
		        }
		        
		        .box4-3 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        .box4-4{
		            width: 140px;
		            height: 180px;
		            float: left;
		            padding-left: 5px;
		            padding-top: 20px;
		        }
		        
		        .box4-4 img{
		            width: 120px;
		            height: 175px;
		        }
		        
		        #footer{
		            width: 800px;
		            height: 100px;
		            background-color: black;
		            clear: both;  float 속성 해제 
		            
		        }
		        
		        #wrap{
		            width: 800px;
		            margin: auto;
		        }
		        
		    </style>
		</head>
		<body>
		    <div id="wrap">
		        <div id="header">
		            <h1>탑크리에듀 교육센터</h1>
		                <div id="nav">
		                    <ul>
		                        <li>교육원 소개</li>
		                        <li>교육원 연혁</li>
		                        <li>교육과정</li>
		                        <li>QA</li>
		                        <li>Contact</li>
		                        <li>오시는길</li>
		                    </ul>
		                </div>
		        </div>
		        <div id="content">
		            <div id="aside">
		                <div id="box1">
		                    <img src="img/Desert.jpg">
		                </div>
		                <div id="box2">
		                    <img src="img/car.png">
		                </div>
		                <div id="box3">
		                    <img src="img/coffee.jpg">
		                </div>
		                <div id="box4">
		                    <img src="img/hanbit.jpg">
		                </div>
		            </div>
		            <div id="section">
		                <div class="box1-1">
		                    <img src="img/Desert.jpg">
		                </div>
		                <div class="box1-2">
		                    <img src="img/Desert.jpg">
		                </div>
		                <div class="box1-3">
		                    <img src="img/Desert.jpg">
		                </div>
		                <div class="box1-4">
		                    <img src="img/Desert.jpg">
		                </div>
		                
		                <div class="box2-1">
		                    <img src="img/car.png">
		                </div>
		                <div class="box2-2">
		                    <img src="img/car.png">
		                </div>
		                <div class="box2-3">
		                    <img src="img/car.png">
		                </div>
		                <div class="box2-4">
		                    <img src="img/car.png">
		                </div>
		                
		                <div class="box3-1">
		                    <img src="img/coffee.jpg">
		                </div>
		                <div class="box3-2">
		                    <img src="img/coffee.jpg">
		                </div>
		                <div class="box3-3">
		                    <img src="img/coffee.jpg">
		                </div>
		                <div class="box3-4">
		                    <img src="img/coffee.jpg">
		                </div>
		                
		                <div class="box4-1">
		                    <img src="img/hanbit.jpg">
		                </div>
		                <div class="box4-2">
		                    <img src="img/hanbit.jpg">
		                </div>
		                <div class="box4-3">
		                    <img src="img/hanbit.jpg">
		                </div>
		                <div class="box4-4">
		                    <img src="img/hanbit.jpg">
		                </div>
		            </div>
		        </div>
		        
		        <div id="footer"></div>
		        
		    </div>
		</body>
		</html>
	 */

}
