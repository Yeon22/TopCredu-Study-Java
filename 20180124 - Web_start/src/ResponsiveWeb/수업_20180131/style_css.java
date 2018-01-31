package ResponsiveWeb.수업_20180131;

public class style_css {
	
	/*
	 * @charset "utf-8"
		@import url('https://fonts.googleapis.com/css?family=Poiret+One');
		
			초기화
		* { margin: 0; padding: 0; }
		ol,ul { list-style: none; }
		a { outline: 0; text-decoration: none; color: #555; }
		img { border: 0; }
		body { font: 12px/1.6 'Poiret One'; color: #555; }
		
			레이아웃
		header { position: fixed; width: 15%; height: 100%; background: #fff; top: 0px; left: 0px; }
		nav { position: relative; width: 85%; height: 35px; background: #212121; margin-left: 15%; }
		section { width: 85%; position: relative; margin-left: 15%; }
		article { float: left; height: 260px; transition: all 0.5s; animation: scale 1s 1; }
		
		@keyframes scale {
		    0% { transform: scale(0); }
		    100% { transform: scale(1); }
		}
		
			header 컨텐츠
		header h1 { width: 180px; height: 136px; background: url(../img/logo1.png) no-repeat 0px 0px; 
		    background-size: contain; position: absolute; top: 70px; left: 50%; margin-left: -90px; text-indent: -99999px; }
		#gnb { position: absolute; top: 300px; right: 57px; }
		#gnb a { display: block; padding: 8px 30px; font-size: 17px; font-weight: bold; color: #555; 
		    text-align: left; line-height: 1.8; transition: all 0.5s; }
		#gnb a:hover { color: skyblue; }
		#gnb a i { margin-right: 13px; }
		.snsSet { width: 90px; height: 47px; position: absolute; bottom: 50px; right: 50%; margin-right: -45px; }
		.snsSet a { float: left; }
		
			각각 박스 크기 지정
		article:nth-child(1) { width: 60%; height: 520px; background: #ddd; }
		article:nth-child(2) { width: 40%; background: #ccc; }
		article:nth-child(3) { width: 20%; background: #bbb; }
		article:nth-child(4) { width: 20%; background: #aaa; }
		article:nth-child(5) { width: 20%; background: #999; }
		article:nth-child(6) { width: 40%; background: #888; }
		article:nth-child(7) { width: 20%; background: #777; }
		article:nth-child(8) { width: 20%; background: #666; }
		article:nth-child(9) { width: 40%; background: #555; }
		article:nth-child(10) { width: 20%; background: #444; }
		article:nth-child(11) { width: 20%; background: #333; }
		article:nth-child(12) { width: 20%; background: #222; }
		
		
		@media screen and (min-width:1280px) and (max-width:1599px) {
		    header { position: relative; width: 100%; height: 80px; }
		    nav { width: 100%; margin-left: 0%; }
		    section { width: 100%; margin-left: 0px; }
		}
		
		@media screen and (min-width:1204px) and (max-width:1279px) {
		    header { position: relative; width: 100%; height: 80px; }
		    nav { width: 100%; margin-left: 0%; }
		    section { width: 100%; margin-left: 0px; }
		    
		    article:nth-child(1) { width: 75%; }
		    article:nth-child(2) { width: 25%; }
		    article:nth-child(3) { width: 25%; }
		    article:nth-child(4) { width: 25%; }
		    article:nth-child(5) { width: 25%; }
		    article:nth-child(6) { width: 50%; }
		    article:nth-child(7) { width: 50%; }
		    article:nth-child(8) { width: 25%; }
		    article:nth-child(9) { width: 25%; }
		    article:nth-child(10) { width: 50%; }
		    article:nth-child(11) { width: 25%; }
		    article:nth-child(12) { width: 25%; }
		}
		
		@media screen and (min-width:780px) and (max-width:1203px) {
		    header { position: relative; width: 100%; height: 80px; }
		    nav { width: 100%; margin-left: 0%; }
		    section { width: 100%; margin-left: 0px; }
		    
		    article:nth-child(1) { width: 100%; height: 400px; }
		    article:nth-child(2) { width: 66.6666%; }
		    article:nth-child(3) { width: 33.3333%; }
		    article:nth-child(4) { width: 33.3333%; display: none; }
		    article:nth-child(5) { width: 33.3333%; }
		    article:nth-child(6) { width: 66.6666%; }
		    article:nth-child(7) { width: 66.6666%; display: none; }
		    article:nth-child(8) { width: 33.3333%; }
		    article:nth-child(9) { width: 33.3333%; }
		    article:nth-child(10) { width: 66.6666%; display: none; }
		    article:nth-child(11) { width: 33.3333%; }
		    article:nth-child(12) { width: 33.3333%; display: none; }
		}
		
		@media screen and (min-width:640px) and (max-width:779px) {
		    header { position: relative; width: 100%; height: 80px; }
		    nav { width: 100%; margin-left: 0%; }
		    section { width: 100%; margin-left: 0px; }
		    
		    article:nth-child(1) { width: 100%; height: 400px; }
		    article:nth-child(2) { width: 100%; }
		    article:nth-child(3) { width: 33.3333%; display: none; }
		    article:nth-child(4) { width: 100%; display: none; }
		    article:nth-child(5) { width: 50%; }
		    article:nth-child(6) { width: 50%; }
		    article:nth-child(7) { width: 66.6666%; display: none; }
		    article:nth-child(8) { width: 50%; }
		    article:nth-child(9) { width: 50%; }
		    article:nth-child(10) { width: 66.6666%; display: none; }
		    article:nth-child(11) { width: 50%; }
		    article:nth-child(12) { width: 50%; }
		}
		
		@media screen and (min-width:480px) and (max-width:639px) {
		    header { position: relative; width: 100%; height: 130px; }
		    nav { display: none; }
		    section { width: 100%; margin-left: 0px; }
		    article { height: 150px; }
		    
		    article:nth-child(1) { width: 100%; height: 300px; }
		    article:nth-child(2) { width: 100%; }
		    article:nth-child(3) { width: 33.3333%; display: none; }
		    article:nth-child(4) { width: 100%; display: none; }
		    article:nth-child(5) { width: 50%; }
		    article:nth-child(6) { width: 50%; }
		    article:nth-child(7) { width: 66.6666%; display: none; }
		    article:nth-child(8) { width: 50%; }
		    article:nth-child(9) { width: 50%; }
		    article:nth-child(10) { width: 66.6666%; display: none; }
		    article:nth-child(11) { width: 50%; }
		    article:nth-child(12) { width: 50%; }
		}
		
		@media screen and (max-width:479px) {
		    header { position: fixed; width: 100%; height: 40px; background-color: transparent; z-index: 5; }
		    nav { display: none; }
		    section { width: 100%; margin-left: 0px; z-index: 4; }
		    article { display: none; }
		    
		    article:nth-child(1) { display: block; position: fixed; width: 100%; height: 100%; }
		}

	 */

}
