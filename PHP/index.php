<?php
require_once("car.php");
require_once("uberx.ptp");
require_once("uberk.ptp");
require_once("user.ptp");
require_once("account.php");

$car = new car ("JSQET674", new Account("Diana
Rivera", "ATD12169", "diana@latzi.pe", "1232424"));
$car->printDatacar();
$uberX = new Uberx("ASHA1258", new Account ("Kevin
Villa", "PÑLOI3256", "Kevin@platzi.pe", "1251633"),
"Toyota", "Corolla");
$uberx->printDatauberX();
$user = new User ("William Lopez", "SER125369",
"william@platzi.pe", "4523399");
Suser->printDatauser();
?>