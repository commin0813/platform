package util;

import page.CaramelWriterProperties;

public class Util2Common {
	
	public static String create_link(String link){
		if(!link.startsWith("http")){
			StringBuffer htt = new StringBuffer("http://");
			htt.append(link);
			link = htt.toString();
		}
		return "<p align=\"left\" style=\"text-align: left;\"><span style=\"font-size: 24pt; color: rgb(255, 0, 0);\">"
				+ "<a href=\""+link+"\" target=\"_self\">홈페이지 바로가기</a>"
				+ "</span></p>"+CaramelWriterProperties.MARGIN+"\n\n\n";
	}
	
	public static String create_phone(String phone_num){
		return "<p><span style=\"font-size: 24pt; color: rgb(255, 0, 0);\">"+ phone_num +"</span></p>"+CaramelWriterProperties.MARGIN+"\n\n\n";
	}
	public static String create_address(String address){
		return "<p><span style=\"font-size: 24pt; color: rgb(255, 0, 0);\">"+ address +"</span></p>"+CaramelWriterProperties.MARGIN+"\n\n\n";
	}
}
