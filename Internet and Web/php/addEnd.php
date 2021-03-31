<?php 
$pattern = "/^[A-K]/i";
$pattern2 = "/^[L-Z]/i";
$names = array("Alexis Ortega","Isabella Mccoy","Viola Curry","Lyod deshmuk");
for ($i = 0; $i < count($names) ; $i++) {
 	if (preg_match($pattern,$names[$i])) {
 		echo $names[$i]."ing <br>";
 	}else if(preg_match($pattern2,$names[$i])){
 		echo $names[$i]."eng <br>";
 	}else{
 		echo $names[$i]."<br>";
 	}
 } 

 ?>