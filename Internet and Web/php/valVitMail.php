<?php 
$string = "allstudents2020@vitbhopal.ac.in";
$pattern = "/^[\w\.]+@vitbhopal\.ac\.in$/";
if (preg_match($pattern,$string)) {
	echo "Valid Vit Bhopal Email";
}else {
	echo "Invalid Vit Bhopal Email";	
}
 ?>