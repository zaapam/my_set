<?php
include('simple_html_dom.php');

class OpenSET {

	public static var $API_URL = "http://www.settrade.com/C04_01_stock_quote_p1.jsp?selectPage=&txtSymbol=";

	function __construct() {
	
	}
	
	function load($symbol) {
		$html = file_get_html('http://www.google.com/');
	}
}
?>