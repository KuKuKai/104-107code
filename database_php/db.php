<?php
$host = 'localhost';
//帳號
$dbuser = 'root';
//密碼
$dbpw = '';
//要登入的資料庫
$dbname = 'csv_db';

//宣告變數，並連結
$link = mysqli_connect($host, $dbuser, $dbpw, $dbname);
mysqli_set_charset($link,'utf8');
if($link)
{
    //若回傳正值，就代表連線
    mysql_query($link,"SET NAMES utf8");
    echo "已連線";
}
else
{
    echo '無法連線資料庫 :<br/>' . mysqli_connect_error();
}
?>