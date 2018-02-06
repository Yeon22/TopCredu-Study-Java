package JavaScript.수업_20180206;

public class dom_ob3 {
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <title>Document</title>
		</head>
		<body>
		    <div id="wrap">
		        <p>내용1</p>
		        <p>내용2</p>
		        <p>내용3</p>
		        <p>내용4</p>
		    </div>
		    
		    <script>
		//        Explorer용
		//        document.getElementById("wrap").firstChild.styleSheets.color="red";
		//        
		//        var p = document.getElementsByTagName("p")[1];
		//        p.nextSibling.style.backgroundColor="yellow";
		        
		        document.getElementById("wrap").children[0].style.color="red";
		        
		        var p = document.getElementsByTagName("p")[1];
		        var nextObj = p.nextSibling;
		        while(nextObj.nodeType !=1){
		            nextObj = nextObj.nextSibling;
		        }
		        nextObj.style.backgroundColor="yellow";
		    </script>
		</body>
		</html>
	 */

}
