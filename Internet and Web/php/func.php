<?php 
function add($x){
	$sum = 0;
	for ($i = 0; $i < count($x); $i++) {
		$sum+=$x[$i];
	}
	return $sum;
 }
 $arr = array(1,2,3);
 echo add($arr);
?>