package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import model.Model2Caramel;
import page.CaramelWriterProperties;

public class Util2Speed {
	public static Model2Caramel getContent(Model2Caramel model) {
		StringBuffer result = new StringBuffer();
		System.out.println("MOdel Speed!!!");

		result.append(create_speed(model));

		if (!model.getLink().equals("")) {
			result.append(create_link(model.getLink()));
		}

		if (!model.getPhone_num().equals("")) {
			result.append(create_phone(model.getPhone_num()));
		}
		if (!model.getAddress().equals("")) {
			result.append(create_address(model.getAddress()));
		}
		if (model.isIsph()) {
			result.append(create_phrases());
		}

		model.setResult(result.toString());
		return model;
	}

	private static String create_link(String link) {
		if (!link.startsWith("http")) {
			StringBuffer htt = new StringBuffer("http://");
			htt.append(link);
			link = htt.toString();
		}
		return "<p align=\"left\" style=\"text-align: left;\"><span style=\"font-size: 24pt; color: rgb(255, 0, 0);\">" + "<a href=\"" + link + "\" target=\"_self\">홈페이지 바로가기</a>" + "</span></p>" + CaramelWriterProperties.MARGIN + "\n\n\n";
	}

	private static String create_phone(String phone_num) {
		return "<p><span style=\"font-size: 24pt; color: rgb(255, 0, 0);\">전화번호 : " + phone_num + "</span></p>" + CaramelWriterProperties.MARGIN + "\n\n\n";
	}

	private static String create_address(String address) {
		return "<p><span style=\"font-size: 24pt; color: rgb(255, 0, 0);\">주소 : " + address + "</span></p>" + CaramelWriterProperties.MARGIN + "\n\n\n";
	}

	private static String create_phrases() {
		return CaramelWriterProperties.PHRASES;
	}

	private static String create_speed(Model2Caramel model) {

		File file = new File(Util2Speed.class.getResource("").getPath() + "speed//hospital_1.txt");
		String content = "";

		String line = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "EUC-KR"));
			while ((line = br.readLine()) != null) {
				line.replaceAll("@@", model.getKeyword());
				line.replaceAll("bb", model.getBusinessName());
				content += line + "\n";

			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		String str = "aabbbbbcccc";
		str.replace("a", "H");
		System.out.println(str);

		return content;
	}

}
