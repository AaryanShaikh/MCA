<?php 
$string = "Welcome to VIT Bhopal!";
$string = strtolower($string);
$pattern = "/[eaiou]/";
echo preg_match($pattern,$string); 
if (preg_match($pattern,$string)) {
	echo 'The String contains vowels and <br>';
	if (preg_match("/a/",$string)) {
		echo "a is repeated ".preg_match_all("/a/",$string)." times <br>";
	}
	if (preg_match("/e/",$string)) {
		echo "e is repeated ".preg_match_all("/e/",$string)." times <br>";
	}
	if (preg_match("/i/",$string)) {
		echo "i is repeated ".preg_match_all("/i/",$string)." times <br>";
	}
	if (preg_match("/o/",$string)) {
		echo "o is repeated ".preg_match_all("/o/",$string)." times <br>";
	}
	if (preg_match("/u/",$string)) {
		echo "u is repeated ".preg_match_all("/u/",$string)." times <br>";
	}
}else{
	echo 'The String does not contain any vowels!!';
 }
 ?>
