<?php 
$string = "aaryan.shaikh2020@vitbhopal.ac.in";
$pattern = "/^[\w\.]+[\d]{4}@vitbhopal\.ac\.in$/";
if (preg_match($pattern,$string)) {
	echo "Valid MCA Vit Bhopal Email";
}else {
	echo "Invalid MCA Vit Bhopal Email";	
}

 ?>