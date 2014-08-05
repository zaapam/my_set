<?php

require_once("libs/simple_html_dom.php");	
	
$html = file_get_html("http://www.settrade.com/C04_01_stock_quote_p1.jsp?txtSymbol=BLAND");

print_r($html);

?>