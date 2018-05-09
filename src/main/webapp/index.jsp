<%--
  Created by IntelliJ IDEA.
  User: chang
  Date: 2018/5/8
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script type="text/javascript" src="js/jquery.min.js"></script>

<script type="text/javascript">
    $(function(){
        $.ajax({
            url:"<%=request.getContextPath()%>/getuserlist.do",
            type:"post",
            dataType:"json",
            success:function(data){
            },
            error:function(){
                alert("error")
            }
        })
    })

</script>

</body>
</html>
