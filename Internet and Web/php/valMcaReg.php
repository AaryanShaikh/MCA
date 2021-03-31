<?php 
$string = "20MCA10056";
$pattern = "/^[1-9][\d]MCA[1-9][\d]{4}$/";
if (preg_match($pattern,$string)) {
	echo "Valid MCA Registration number";
}else {
	echo "Invalid MCA Registration number";	
}
 ?>