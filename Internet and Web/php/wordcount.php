<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<form action="wordcount.php" method="post">
		Type your sentence : <br>
		<textarea rows="10" cols="25" name="text"></textarea><br>
		Enter the character you want to check: <br>
		<input type="text" name="alpha"><br>
		<input type="submit" value="Count!">
	</form>
</body>
</html>
<?php 
if ($_SERVER["REQUEST_METHOD"]=="POST"){
	$text = $_POST['text'];
	$alpha = $_POST['alpha'];
	echo "The alphabet ".$alpha." has occured ".check($text,$alpha)." times";
 }
 function check($t,$a){
 	$count=0;
 	for ($i = 0; $i < strlen($t); $i++) {
 		if ($t[$i]==$a) {
 			$count++;
 		}
 	}
 	return $count;
 }
?>
