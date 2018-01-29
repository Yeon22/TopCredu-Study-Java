package Layout.수업_20180129;

public class layout {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <title>Document</title>
		    <link href="https://fonts.googleapis.com/css?family=Henny+Penny" rel="stylesheet">
		    <style>
		        *{margin: 0; padding: 0;}
		        body {font-family: 'Times New Roman', serif;}
		        li {list-style: none;}
		        a {text-decoration: none;}
		        img {border: 0;}
		        
		        #main_header{
		        	중앙 정렬
		            width: 960px; margin: 0 auto;
		        	절대 좌표
		            height: 160px;
		            position: relative;
		        }
		        
		        #main_header > #title{
		            position: absolute;
		            left: 20px; top: 30px;
		        }
		        
		        #main_header > #main_gnb{
		            position: absolute;
		            right: 0; top: 0;
		        }
		        
		        #main_header > #main_lnb{
		            position: absolute;
		            right: 0; bottom: 10px;
		        }
		        
		        #title{
		            font-family: 'Henny Penny', cursive;
		        }
		        
		        	메뉴 세팅
		        hidden -> li ul 태그를 넘어가면 가려져라
		        #main_gnb > ul {overflow: hidden;}
		        #main_gnb > ul > li {float: left;}
		        #main_gnb > ul > li > a {
		            display: block;  a태그가 박스처럼 자기 공간을 갖는다.
		            padding: 2px 10px;  상하 좌우 여백
		            border: 1px solid black;
		        }
		        
		        #main_gnb > ul > li > a:hover{
		            background: black;
		            color: white
		        }
		        
		        	왼쪽탑 오른쪽탑 오른쪽바텀 왼쪽바텀
		        #main_gnb > ul > li:first-child > a {border-radius: 10px 0 0 10px;}
		        #main_gnb > ul > li:last-child > a {border-radius: 0 10px 10px 0;}
		        
		        	메뉴 2번째 세팅
		        #main_lnb > ul {overflow: hidden;}
		        #main_lnb > ul > li {float: left;}
		        #main_lnb > ul > li > a{
		            display: block;
		            padding: 10px 20px;
		            border: 1px solid black;
		        }
		        
		        #main_lnb > ul > li > a:hover{
		            background: black;
		            color: white
		        }
		        
		        #main_lnb > ul > li:first-child > a {border-radius: 10px 0 0 10px;}
		        #main_lnb > ul > li:last-child > a {border-radius: 0 10px 10px 0;}
		        
		        	컨텐츠 세팅
		        #content{
		            width: 960px; margin: 0 auto;
		            overflow: hidden;
		        }
		        
		        #content > #main_section{
		            width: 750px;
		            float: left;
		        }
		        
		        #content > #main_aside{
		            width: 200px;
		            float: right;
		        }
		        
		        #main_section > article.main_article{
		            margin-bottom: 10px;
		            padding: 20px;
		            border: 1px solid black;
		        }
		        
		        	어사이드
		        	첫번째 탭
		        input:nth-of-type(1) {display: none;}
		        input:nth-of-type(1) ~ div:nth-of-type(1) {display: none;}
		        input:nth-of-type(1):checked ~ div:nth-of-type(1) {display: block;}
		        
		        	두번째 탭
		        input:nth-of-type(2) {display: none;}
		        input:nth-of-type(2) ~ div:nth-of-type(2) {display: none;}
		        input:nth-of-type(2):checked ~ div:nth-of-type(2) {display: block;}
		        
		        	탭 모양 구성
		        section.buttons {overflow: hidden;}
		        section.buttons > label{
		            	수평정열
		            display: block; float: left;
		            	크기 및 글자 위치 지정
		            width: 100px; height: 30px;
		            line-height: 30px;
		            text-align: center;
		            	테두리 지정
		            box-sizing: border-box;
		            border: 1px solid black;
		            	색상 지정하기
		            background: black;
		            color: white;
		        }
		        
		        input:nth-of-type(1):checked ~ section.buttons > label:nth-of-type(1){
		            background: white;
		            color: black;
		        }
		        input:nth-of-type(2):checked ~ section.buttons > label:nth-of-type(2){
		            background: white;
		            color: black;
		        }
		        
		        	목록
		        .item{
		            overflow: hidden;
		            padding: 10px;
		            border: 1px solid black;
		            border-top: none;
		        }
		        .thumbnail{
		            float: left;
		        }
		        .description{
		            float: left;
		            margin-left: 10px;
		        }
		        .description > strong{
		            display: block;
		            width: 120px;
		            white-space: nowrap;
		            overflow: hidden;
		            text-overflow: ellipsis;
		        }
		        
		        	푸터
		        #main_footer{
		            	중앙 정렬
		            width: 960px; margin: 0 auto;
		            margin-bottom: 10px;
		            	테두리
		            box-sizing: border-box;
		            padding: 10px;
		            border: 1px solid black;
		            	글자
		            text-align: center;
		        }
		        
		    </style>
		    
		</head>
		
		<body>
		    <header id="main_header">
		        <div id="title">
		            <h1>Byu Development</h1>
		            <h2>HTML5 + CSS3 Basic</h2>
		        </div>
		        <nav id="main_gnb">
		           <ul>
		                <li><a href="#">Web</a></li>
		                <li><a href="#">Mobile</a></li>
		                <li><a href="#">Game</a></li>
		                <li><a href="#">Simulation</a></li>
		                <li><a href="#">Data</a></li>
		            </ul>
		        </nav>
		        <nav id="main_lnb">
		            <ul>
		                <li><a href="#">HTML5</a></li>
		                <li><a href="#">CSS3</a></li>
		                <li><a href="#">JavaScript</a></li>
		                <li><a href="#">JQuery</a></li>
		                <li><a href="#">Node.js</a></li>
		            </ul>
		        </nav>
		    </header>
		    
		    <div id="content">
		       
		        <section id="main_section">
		           
		            <article class="main_article">
		                <h1>가상화폐, 위메프에서 쓴다… 주요 쇼핑몰 첫 사례</h1>
		                <p>현재 가상화폐는 실시간 가격 변동의 폭이 커 결제 수단으로 쓰기에 어려움이 적잖다. 이 때문에 양사는 이런 불확실성을 최소화하고자 '실시간 시세 반영' 기능을 유력하게 검토하고 있다. 
		
		빗썸 고객이 가상화폐로 구매를 결정하면 그 시점의 시세를 토대로 금액을 확정하고, 이 데이터를 위메프 원더페이가 즉각 수신한 뒤 결제를 진행해 시세 변동에 따른 혼동을 없애는 것이다.
		
		양사는 불법 우려를 없애고자 가상화폐로 위메프 내 상품권은 살 수 없도록 할 것으로 전해졌다.
		
		이번 계획과 관련해 위메프 관계자는 "고객들이 원더페이를 통해 더 편리하게 위메프 상품을 구매할 수 있도록 하는 방안의 하나로서 빗썸과 제휴를 검토하는 것은 맞다. 구체적 서비스 방식이나 시기 등은 논의하고 있다"고 말했다.
		
		가상화폐는 지금껏 국내에서 일부 소규모 인터넷 몰과 소수 매장을 제외하고는 결제 수단으로 정착된 사례가 거의 없었다. 
		
		반면 국외에서는 가상화폐를 재화로 활용하려는 시도가 활발하다. 
		</p>
		            </article>
		            
		            <article class="main_article">
		                <h1>'국민연금 늦춰서 더 받겠다'… 연기연금 신청자 증가</h1>
		                <p>2013년에 연기연금 신청자가 급감한 것은 2012년(1952년생 이전)까지만 해도 만 60세에 노령연금을 받았으나 2013년(1953년생부터)부터 만 61세로 수급연령이 늦춰진 영향 탓이 크다. 연금개혁으로 2013년부터 5년마다 단계적으로 수급연령이 1세씩 뒤로 밀려 최종적으로 만 65세부터 받는다.
		
		연기연금제도는 2007년 7월부터 도입됐다. 다른 연금선진국보다는 늦은 편이다.
		
		수급권자가 연금 수령 시기를 최대 5년까지 늦추면 연기 기간에 따라 연 7.2%(월 0.6%)씩 이자를 가산해 노령연금을 얹어준다.
		
		노령연금 수급권을 획득하고 최초 노령연금을 신청할 때나 연금을 받는 동안 희망하는 경우 1회만 신청할 수 있다.
		</p>
		            </article>
		            
		            <article class="main_article">
		                <h1>서울 은평구 아파트서 화재, 일가족 3명 사망…동파우려 소화전 잠궈놔?</h1>
		                <p>28일 밤 서울 은평구 불광동의 한 아파트에서 불이나 일가족 3명이 숨졌다.
		
		29일 경찰과 소방당국에 따르면 전날 오후 7시 10분께 불광동에 있는 15층짜리 아파트 14층에서 불이났다. 
		
		소방당국은 장비 31대와 인력 99명을 투입해 화재 발생 1시간 20여분 만에 완전 진화했다. 
		
		이 불로 연기를 들이마시고 병원으로 이송된 가족 3명 중 노모 김모 씨(91·여)가 화재 당일 숨진 데 이어 위독하던 구모 씨(64·남)와 아내 나모 씨(63·여)도 이날 새벽 끝내 숨을 거뒀다. 
		
		목격자와 소방서 관계자의 말에 따르면, 화재 직후 아파트 소방시설이 제대로 작동하지 않아 초기 진화에 어려움을 겪었다.</p>
		            </article>
		            
		        </section>
		        
		        <aside id="main_aside">
		            <input id="first" type="radio" name="tab" checked="checked" />
		            <input id="second" type="radio" name="tab" />
		            <section class="buttons">
		                <label for="first">First</label>
		                <label for="second">Second</label>
		            </section>
		            
		            <div class="tab_item">
		                <ul>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>HTML5 Canvas</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>HTML5 Audio</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>HTML5 Video</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>HTML5 Semantic Web</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                </ul>
		            </div>
		            <div class="tab_item">
		                <ul>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>CSS3 Transition</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>CSS3 Animation</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>CSS3 Border</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                    <li class="item">
		                        <a href="#">
		                            <div class="thumbnail">
		                                <img src="http://placehold.it/45x45" />
		                            </div>
		                            <div class="description">
		                                <strong>CSS3 Box</strong>
		                                <p>2012-02-15</p>
		                            </div>
		                        </a>
		                    </li>
		                </ul>
		            </div>
		        </aside>
		        
		    </div>
		    
		    <footer id="main_footer">
		        <h3>HTML5 + CSS3 Basic</h3>
		        <address>Website Layout Basic 탑크리에듀 구로동</address>
		    </footer>
		    
		</body>
		
		</html>
	 */

}
