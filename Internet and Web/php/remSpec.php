<?php 
$string = "Th!$ !$ ju\$t s()m# r@nd*m! !ex!";
$pattern = "/[!@#$%^&*()]/";
echo $string."<br>";
if (preg_match($pattern,$string)) {
	echo 'The string has special characters in it. Removing it....<br>';
	$string = preg_replace($pattern,"",$string);
	echo $string;
}
 ?>