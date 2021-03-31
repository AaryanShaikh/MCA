<!DOCTYPE html>
<html>
<head>
	<title>Calculator using php</title>
</head>
<body>
	<form action="calculator.php" method="post">
		First Number:<input type="number" name="first"><br>
		Second Number:<input type="number" name="sec"><br>
		Choose option:<select name="opt">
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="x">x</option>
			<option value="/">/</option>
		</select><br>
		<input type="submit" value="Calculate">
	</form>
</body>
</html>
<?php 
if ($_SERVER["REQUEST_METHOD"] == "POST") {
	$first = $_POST['first'];
	$sec = $_POST['sec'];
	$opt = $_POST['opt'];
	switch ($opt) {
		case "+":
			echo $first+$sec;
			break;
		case "-":
			echo $first-$sec;
			break;
		case "x":
			echo $first*$sec;
			break;
		case "/":
			echo $first/$sec;
	}
}
?>