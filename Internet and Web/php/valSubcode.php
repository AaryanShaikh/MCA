<?php 
$string = "MCA2001";
$pattern = "/^[(MCA|SST)\d+]{7}$/";
if (preg_match($pattern,$string)) {
	echo 'Valid Subject code';
}else{
	echo 'InValid Subject code';
 }
 ?>