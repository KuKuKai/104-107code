
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
        <!-- CSS-->
        <link rel="stylesheet" type="text/css" href="homepage.css">
		<!-- Bootstrap CSS -->
    <link rel="stylesheet" media="screen" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css">
	</head>
	<body>
	    <div class="header">
	    </div>
        <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2" id="navbar">
            <div class="navbar">
                <div class="nav_connect">
                    <font size="5" >台灣地區</font><hr>
                    <p class="nav_text">北部</p>
                    <p class="nav_text">中部</p>
                    <p class="nav_text">南部</p>
                    <p class="nav_text">東部</p>
                    <p class="nav_text">外島</p>
                    
                </div>
            </div>
        </div>
        
        <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10" id="area">
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 areabox" style="width: 32%">
                    <div class="north_title"><br>
                        <font size="6" color="#fbfbff">站名、氣溫</font>
                        <hr color="#00FF00" size="10" >
                    </div>
                    
                    <div class="north_con">
                       <!--
                        <?php
                            //$datas陣列變數,放要查詢的資料
                            $datas = array();
                            //將查詢語法當成字串,記錄在變數中(查詢位置請確認)
                            $sql = "SELECT * FROM `table 1` WHERE 站名 = '基隆';" ;
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
            </div>
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 areabox"  style="width: 32%">
				<div class="north_title"><br>
                        <font size="6" color="#fbfbff">風向、風力</font>
                        <hr color="#00FF00" size="10" >
                </div>
					<?php if(!empty($datas)):?>
                            <ul>
                                <?php foreach($datas as $key => $row):?>
                                <li>
                                    風向:<?php echo $row['風向']; ?>,風力:<?php echo $row['風力']; ?>
                                </li>
                                <?php endforeach; ?>
                            </ul>
                            <?php else: ?>
                            查無資料
                            <?php endif; ?>
			</div>    
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 areabox"  style="width: 32%">
							<div class="north_title"><br>
                        <font size="6" color="#fbfbff">濕氣、一天降雨</font>
                        <hr color="#00FF00" size="10" >
                </div>
					<?php if(!empty($datas)):?>
                            <ul>
                                <?php foreach($datas as $key => $row):?>
                                <li>
                                    濕氣:<?php echo $row['濕氣']; ?>,一天降雨:<?php echo $row['一天降雨']; ?>
                                </li>
                                <?php endforeach; ?>
                            </ul>
                            <?php else: ?>
                            查無資料
                            <?php endif; ?>
			</div>
        </div>
        <div class="col-xs-10 col-sm-10 col-md-10 col-lg-10" id="news">
            
        </div>
               


        
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js"></script>
    
    <?php
        //結束mysql連線
    ?>
    
	</body>
</html>
