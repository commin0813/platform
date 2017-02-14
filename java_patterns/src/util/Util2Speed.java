package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Random;

import model.Model2Caramel;
import page.CaramelWriterProperties;

public class Util2Speed {
	public static Model2Caramel getContent(Model2Caramel model) {
		StringBuffer result = new StringBuffer();
		System.out.println("MOdel Speed!!!");

		result.append(create_speed(model));

		if(!model.getLink().equals("")){
			result.append(create_link(model.getLink()));
		}
		
		if(!model.getLink2().equals("")){
			result.append(create_link(model.getLink2()));
		}
		
		if(!model.getPhone_num().equals("")){
			result.append(create_phone(model.getPhone_num()));
		}
		if(!model.getPhone_num2().equals("")){
			result.append(create_phone(model.getPhone_num2()));
		}
		
		if(!model.getAddress().equals("")){
			result.append(create_address(model.getAddress()));
		}
		if(!model.getAddress2().equals("")){
			result.append(create_address(model.getAddress2()));
		}
		if(model.isIsph()){
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

	private static String create_phone(String phone_num){
		return "<p><span style=\"font-size: 24pt; color: rgb(255, 0, 0);\">"+ phone_num +"</span></p>"+CaramelWriterProperties.MARGIN+"\n\n\n";
	}
	private static String create_address(String address){
		return "<p><span style=\"font-size: 24pt; color: rgb(255, 0, 0);\">"+ address +"</span></p>"+CaramelWriterProperties.MARGIN+"\n\n\n";
	}

	private static String create_phrases() {
		return CaramelWriterProperties.PHRASES;
	}

	private static String create_speed(Model2Caramel model) {
		Random random = new Random();
		String hospital [] = {
				"hospital_1.txt","hospital_2.txt",
		};
		String normal [] = {
				"normal_1.txt","normal_2.txt",
		};
		String rest [] = {
				"rest_1.txt","rest_2.txt",
		};
		
		File file = new File(Util2Speed.class.getResource("").getPath() + "speed//"+hospital[random.nextInt(hospital.length)]);
		
		if(model.getClassification().equals(CaramelWriterProperties.CLASSIFICATION_HOSPITAL)){
			file = new File(Util2Speed.class.getResource("").getPath() + "speed//"+hospital[random.nextInt(hospital.length)]);
		}else if(model.getClassification().equals(CaramelWriterProperties.CLASSIFICATION_NORMAL)){
			file = new File(Util2Speed.class.getResource("").getPath() + "speed//"+normal[random.nextInt(normal.length)]);
		}else if(model.getClassification().equals(CaramelWriterProperties.CLASSIFICATION_RESTAURANT)){
			file = new File(Util2Speed.class.getResource("").getPath() + "speed//"+rest[random.nextInt(rest.length)]);
		}
		 
		String content = "";

		String line = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "EUC-KR"));
			while ((line = br.readLine()) != null) {
				line = line.replaceAll("@@", model.getKeyword());
				line = line.replaceAll("bb", model.getBusinessName());
				content += line + "\n";

			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		return content;
	}

}
