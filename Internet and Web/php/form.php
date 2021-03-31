<html>
 
<body>
<form action = "form.php" method="POST">
<input name = "name"type = "text">
<input type ="submit">
</form>
</body>
</html>
<?php
 
echo "Hello \n";
if (isset($_POST["name"]))
{
$var1=$_POST['name'];
echo $var1;
}
?>