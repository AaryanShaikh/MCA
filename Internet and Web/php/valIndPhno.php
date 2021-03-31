<?php 
$string = "+91 744 752 1784";
$pattern = "/(\+91)\s\d{3}\s\d{3}\s\d{4}/";
if (preg_match($pattern,$string)) {
	echo 'number is Valid';
}else{
	echo 'number is not Valid';	
 }
?>