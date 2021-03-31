<!DOCTYPE html>
<html>
    <head>
    <title> First Program</title>       
    </head>
    <style>
body {background-color: powderblue;}
h1   {color: blue;}
p    {color: blue;}
</style>  
<body>
<h1> This is HTML in a php file</h1>
    <p id="demo">Hi this is the wonderful thing.</p>   
    <p >Hi this is not wonderful    </p>      
    <script>  
     setTimeout(function(){document.getElementById("demo").style.color = "black"; }, 5000);    
    </script> 
<?php
echo "Hello World! 111";
    //Comment
?>   
</body>
</html>