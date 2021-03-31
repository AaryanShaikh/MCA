<?php 
$string = "This Is just sOme random code!!";
$string = preg_replace("/[aeiou]+/i","",$string);
echo $string;
 ?>