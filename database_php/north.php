<?php
//載入 db.php檔案並連結資料庫
require_once 'db.php';
?>

<!DOCTYPE html>
<html lang="">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Title Page</title>
        <script type="text/javascript">
        </script>
        <!-- CSS-->
        <link rel="stylesheet" type="text/css" href="north.css">
		<!-- Bootstrap CSS -->
    <link rel="stylesheet" media="screen" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css">
	</head>
	<body>
	    <div class="header">
	        <font id="title">北部數據</font>
	    </div>
        <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2" id="navbar">
            <div class="navbar">
                <div class="nav_connect">
                    <font size="5" >台灣地區</font><hr>
                    <a class="nav_text" href="north.php" style="color:white">北部</a>
                    <p class="nav_text">中部</p>
                    <p class="nav_text">南部</p>
                    <p class="nav_text">東部</p>
                    <p class="nav_text">外島</p>
                    
                </div>
            </div>
        </div>
        
        <div class="col-xs-8 col-sm-8 col-md-8 col-lg-8" id="area">
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 " id="taipei">
                <font size="5" color="white" >臺北</font><hr>
				                       <!--
                        <?php
                            //$datas陣列變數,放要查詢的資料
                            $datas = array();
                            //將查詢語法當成字串,記錄在變數中(查詢位置請確認)
                            $sql = "SELECT * FROM `table 1` WHERE 站名 = '臺北';" ;
                            //用方法取執行請求
                            $result = mysqli_query($link, $sql);
                            
                            //成功
                            if($result)
                            {
                                if(mysqli_num_rows($result)>0)
                                {
                                    while($row = mysqli_fetch_assoc($result))
                                    {
                                        $datas[]=$row;
                                    }
                                }
                                //釋放資料庫查詢到的記憶體
                            mysqli_free_result($result);
                            }
                            else
                            {
                                echo"{$sql} 語法執行失敗,錯誤訊息:" . mysqli_error($link);
                            }
                            
                            //是否為空值
                            if(!empty($datas))
                            {
                                // 如果不是空的,印出程式碼
                                print_r($datas);
                            }
                            else
                            {
                                echo"查無資料";
                            }
                        ?>
                        -->
                        <!--foreach列出查詢結果-->
                            <?php if(!empty($datas)):?>
                            <ul>
                                <?php foreach($datas as $key => $row):?>
                                <li>
                                    數據創建日期:<?php echo $row['數據創建日期']; ?>,站名:<?php echo $row['站名']; ?>,溫度:<?php echo $row['溫度']; ?>
                                </li>
                                <?php endforeach; ?>
                            </ul>
                            <?php else: ?>
                            查無資料
                            <?php endif; ?>
            </div>
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 "id="keelung">
                <font size="5" color="white">基隆</font><hr>
				        <!--
                        <?php
                            //$datas陣列變數,放要查詢的資料
                            $datas = array();
                            //將查詢語法當成字串,記錄在變數中(查詢位置請確認)
                            $sql1 = "SELECT * FROM `table 1` WHERE 站名 = '基隆';" ;
                            //用方法取執行請求
                            $result = mysqli_query($link, $sql1);
                            
                            //成功
                            if($result)
                            {
                                if(mysqli_num_rows($result)>0)
                                {
                                    while($row = mysqli_fetch_assoc($result))
                                    {
                                        $datas[]=$row;
                                    }
                                }
                                //釋放資料庫查詢到的記憶體
                            mysqli_free_result($result);
                            }
                            else
                            {
                                echo"{$sql1} 語法執行失敗,錯誤訊息:" . mysqli_error($link);
                            }
                            
                            //是否為空值
                            if(!empty($datas))
                            {
                                // 如果不是空的,印出程式碼
                                print_r($datas);
                            }
                            else
                            {
                                echo"查無資料";
                            }
                        ?>
                        -->
                        <!--foreach列出查詢結果-->
                            <?php if(!empty($datas)):?>
                            <ul>
                                <?php foreach($datas as $key => $row):?>
                                <li>
                                    數據創建日期:<?php echo $row['數據創建日期']; ?>,站名:<?php echo $row['站名']; ?>,溫度:<?php echo $row['溫度']; ?>
                                </li>
                                <?php endforeach; ?>
                            </ul>
                            <?php else: ?>
                            查無資料
                            <?php endif; ?>
            </div>
        </div>
        <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
            
        </div>
        <div class="col-xs-8 col-sm-8 col-md-8 col-lg-8" id="area">
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 "id="Taoyuan">
                <font size="5" color="white" >桃園</font><hr>
				                       <!--
                        <?php
                            //$datas陣列變數,放要查詢的資料
                            $datas = array();
                            //將查詢語法當成字串,記錄在變數中(查詢位置請確認)
                            $sql2 = "SELECT * FROM `table 1` WHERE 站名 = '桃園';" ;
                            //用方法取執行請求
                            $result = mysqli_query($link, $sql2);
                            
                            //成功
                            if($result)
                            {
                                if(mysqli_num_rows($result)>0)
                                {
                                    while($row = mysqli_fetch_assoc($result))
                                    {
                                        $datas[]=$row;
                                    }
                                }
                                //釋放資料庫查詢到的記憶體
                            mysqli_free_result($result);
                            }
                            else
                            {
                                echo"{$sql2} 語法執行失敗,錯誤訊息:" . mysqli_error($link);
                            }
                            
                            //是否為空值
                            if(!empty($datas))
                            {
                                // 如果不是空的,印出程式碼
                                print_r($datas);
                            }
                            else
                            {
                                echo"查無資料";
                            }
                        ?>
                        -->
                        <!--foreach列出查詢結果-->
                            <?php if(!empty($datas)):?>
                            <ul>
                                <?php foreach($datas as $key => $row):?>
                                <li>
                                    數據創建日期:<?php echo $row['數據創建日期']; ?>,站名:<?php echo $row['站名']; ?>,溫度:<?php echo $row['溫度']; ?>
                                </li>
                                <?php endforeach; ?>
                            </ul>
                            <?php else: ?>
                            查無資料
                            <?php endif; ?>
            </div>
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 "id="Xinbei">
                <font size="5" color="white">新北</font><hr>
				                       <!--
                        <?php
                            //$datas陣列變數,放要查詢的資料
                            $datas = array();
                            //將查詢語法當成字串,記錄在變數中(查詢位置請確認)
                            $sql3 = "SELECT * FROM `table 1` WHERE 站名 = '新北';" ;
                            //用方法取執行請求
                            $result = mysqli_query($link, $sql3);
                            
                            //成功
                            if($result)
                            {
                                if(mysqli_num_rows($result)>0)
                                {
                                    while($row = mysqli_fetch_assoc($result))
                                    {
                                        $datas[]=$row;
                                    }
                                }
                                //釋放資料庫查詢到的記憶體
                            mysqli_free_result($result);
                            }
                            else
                            {
                                echo"{$sql3} 語法執行失敗,錯誤訊息:" . mysqli_error($link);
                            }
                            
                            //是否為空值
                            if(!empty($datas))
                            {
                                // 如果不是空的,印出程式碼
                                print_r($datas);
                            }
                            else
                            {
                                echo"查無資料";
                            }
                        ?>
                        -->
                        <!--foreach列出查詢結果-->
                            <?php if(!empty($datas)):?>
                            <ul>
                                <?php foreach($datas as $key => $row):?>
                                <li>
                                    數據創建日期:<?php echo $row['數據創建日期']; ?>,站名:<?php echo $row['站名']; ?>,溫度:<?php echo $row['溫度']; ?>
                                </li>
                                <?php endforeach; ?>
                            </ul>
                            <?php else: ?>
                            查無資料
                            <?php endif; ?>
            </div>
        </div>
        <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
            
        </div>       


        
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
	</body>
</html>
