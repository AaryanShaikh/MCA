<?php
 
//print_r($_POST);


 
if (isset($_POST["name"]))
{
$var1=$_POST['name'];
$var2 = $_POST['mail'];
$var3 = $_POST['age'];

$pattern2 = "/[A-Za-z]/";

if (preg_match($pattern2,$var1)) {
	echo 'name is Valid <br>';
}else{
	echo 'name is invalid <br>';
}

$pattern = "/[\w\.]@gmail\.(com|in)/";
if (preg_match($pattern,$var2)) {
	echo 'Email is Valid <br>';
}else{
	echo 'Email is invalid <br>';
}
}
 
?>
 
<html>
 
<body>
<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
 
<br>

<ul> Name </label> <input name = "name" type = "text">  </ul>
<ul> Mail <input name = "mail" type = "text"> </ul>
<ul> Age <input name = "age" type = "number"> </ul>
 
<ul> <input type ="submit"> </ul>
 
</form> 
 
</body> 
 
 
</html> -*