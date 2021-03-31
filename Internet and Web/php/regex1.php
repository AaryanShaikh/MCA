<?php 
$string = "Aab";
$pattern2 = "/[A-Z]/";
$pattern = "/^[^(\d)(!@#$%^&*())]{3,}$/";
if (preg_match($pattern2,$string) && preg_match($pattern,$string)) {
	echo "Valid variable";
}else{
	echo "not Valid variable";
}

 ?>