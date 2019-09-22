<html>
<head>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
</head>
<body>

<h2>Hello World!</h2>
    <script>
        $.ajax({
            url:"/shop/queryRole.do",
            dataType:"test",
            success:function (data) {
                alert(data)
            }
        })
    </script>



</body>
</html>
