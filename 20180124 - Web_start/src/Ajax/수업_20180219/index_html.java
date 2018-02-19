package Ajax.수업_20180219;

public class index_html { //bitnami로 apm가 설치되어 있는 상태여야 한다. 웹서버가 실행되는 상태여야함.
	
	/*
	 * <!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
		    <title>Document</title>
		    <script>
		        $(function(){
		//            $.ajax({
		//                url:"rank.xml",
		//                dataType:"xml",
		//                success:function(result){
		//                    if($(result).find("rank").length>0){
		//                        $(result).find("rank").each(function(){
		//                            var name = $(this).find("k").text();
		//                            var result = "<li>"+name+"</li>";
		//                            $("#wrap ol").append(result);
		//                        });
		//                    }
		//                }
		//            });
		            
		            $.ajax({
		                url:"rank.json",
		                dataType:"json",
		                success:function(result){
		                    $.each(result.rank, function(i,d){
		                        $("#wrap ol").append("<li>"+d["k"]+"</li>");
		                    });
		                }
		            });
		        });
		    </script>
		</head>
		<body>
		    <h1>인기 검색어</h1>
		    <div id="wrap">
		        <ol></ol>
		    </div>
		</body>
		</html>
	 */

}
