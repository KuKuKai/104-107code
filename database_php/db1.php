<?php
$serverName = "輸入伺服器名稱"; //serverName\instanceName
$connectionInfo = array( "Database"=>"weather", "UID"=>"sa", "PWD"=>"密碼", "CharacterSet" => "UTF-8");
$conn = sqlsrv_connect( $serverName, $connectionInfo);
$result = sqlsrv_query($conn, "SELECT * FROM 工作表3$");   //select 工作表3$資料表
if( $conn ) {
     echo "連線成功<br />";
}else{
     echo "連線失敗<br />";
     die( print_r( sqlsrv_errors(), true));
}

if($result === false) {
    die( print_r( sqlsrv_errors(), true) );
}
else{
    while( $row = sqlsrv_fetch_array($result, SQLSRV_FETCH_ASSOC) ) {
      echo $row['stationname'],$row['temperature'],"<br />";  //echo資料欄stationname與temperature列
    }
}

// Close the connection.
sqlsrv_close($conn);
?>
