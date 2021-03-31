<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<?php 
$arr = array ("arfa","shubam","ahmed");
echo 'names are:<br>';
echo $arr[0]."<br>";
echo $arr[1]."<br>";
echo $arr[2]."<br>";
// $rank = array("arfa"=>1,"shubam"=>2,"ahmed"=>3);
// echo "the rank of ".$arr[0]." is ".$rank[$arr[0]]."<br>";
// echo "the rank of ".$arr[1]." is ".$rank[$arr[1]]."<br>";
// echo "the rank of ".$arr[2]." is ".$rank[$arr[2]]."<br>";
$rank = array("arfa"=>"1", "shubam"=>"2", "ahmed"=>"3");
foreach($rank as $x => $val) {
  echo "The rank of $x is $val<br>";
}
 ?>
</body>
</html>