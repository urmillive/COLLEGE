<?php
// concat 2 lines of code
$txt = "hello world";
$txt2 = "1234";
echo $txt." ".$txt2;


// get and set types 

$undecided = 3.432;
print gettype($undecided);
settype($undecided,boolean);
print gettype($undecided);

// get first later

$mystr = "jello world";
$mystr{0} = "H";
$mystr{12} = "!";
print $mystr;

?>
