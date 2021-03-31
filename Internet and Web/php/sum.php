<!DOCTYPE html>
<html>
<head>
	<title>Sum of the elements</title>
</head>
<body>
<?php 
$arr = array(1,2,3);
$sum = 0;
for ($i = 0; $i < count($arr); $i++) {
	$sum+=$arr[$i];
}
echo "$sum";
 ?>
</body>
</html>