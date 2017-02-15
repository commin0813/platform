package util;

import java.util.ArrayList;
import java.util.Random;

import model.Model2Caramel;
import page.CaramelWriterProperties;

public class Util2Study {
	
	public static Model2Caramel getContent(Model2Caramel model){
		StringBuffer result = new StringBuffer();
		
		result.append(create_title(model));
		
		for(String subject : create_subject(model)){
			result.append(subject);
		}
		
		if(!model.getLink().equals("")){
			result.append(Util2Common.create_link(model.getLink()));
		}
		
		if(!model.getLink2().equals("")){
			result.append(Util2Common.create_link(model.getLink2()));
		}
		
		if(!model.getPhone_num().equals("")){
			result.append(Util2Common.create_phone(model.getPhone_num()));
		}
		if(!model.getPhone_num2().equals("")){
			result.append(Util2Common.create_phone(model.getPhone_num2()));
		}
		
		if(!model.getAddress().equals("")){
			result.append(Util2Common.create_address(model.getAddress()));
		}
		if(!model.getAddress2().equals("")){
			result.append(Util2Common.create_address(model.getAddress2()));
		}
		if(model.isIsph()){
			result.append(create_phrases());
		}
		
		model.setResult(result.toString());
		return model;
	}

	private static String create_phrases(){
		return CaramelWriterProperties.PHRASES;
	}
	
	
	private static String create_title(Model2Caramel model){
		String businessName = model.getBusinessName();
		String keyword = model.getKeyword();
		Random random = new Random();
		String titles[] = {
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+keyword +", 저렴한 "+ businessName + "에서 하세요"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+keyword +",  "+ businessName + "가 저렴해요"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+keyword +",  "+ businessName + "가 최저가격"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+keyword +",  "+ businessName + "가 쌉니다"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+keyword +" "+ businessName + "에서 다시 시작 된 장미 빛 인생"+CaramelWriterProperties.TAG_P_END,
				
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+keyword +"! "+ businessName + "에서 자신감 되찾기!"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+keyword +"! "+ businessName + "에서 자신감 되찾자!"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+keyword +"! "+ businessName + "에서 완벽하게 고치자!"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+keyword +"! "+ businessName + "에서 고치자!"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+keyword +" "+ businessName + ""+CaramelWriterProperties.TAG_P_END,
				
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+businessName +"에서 하는 "+ keyword + "이 최고"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+businessName +"에서 하는 "+ keyword + "이 저렴해요!"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+businessName +"에서 하는 "+ keyword + ", 실력최고 가격최저"+CaramelWriterProperties.TAG_P_END,
				
				
		};
		
		String detail_keyword = model.getDetail_keyword();
		String imsi = titles[random.nextInt(titles.length)]+CaramelWriterProperties.MARGIN+"\n\n\n";
		String title=imsi;
		if(!detail_keyword.equals("")){
			title = imsi.replace("@@", "[ "+detail_keyword+" ]");
		}else{
			title = imsi.replace("@@", "");
		}
		
		return title;
	}
	
	private static ArrayList<String> create_subject(Model2Caramel model){
		String businessName = model.getBusinessName();
		String keyword = model.getKeyword();
		ArrayList<String> subject = new ArrayList<String>();
		
		Random random = new Random();
		
		String reason_front[] ={
				
		};
		
		String reason_back[] ={
				
		};
		
		String subject_reason [] = {
				CaramelWriterProperties.TAG_P_START+"왜 "+businessName +"의 "+ keyword + "가 최고라는 소문이 자자 한 걸까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"어찌하여 "+businessName +"의 "+ keyword + "가 최고라는 소문이 난 걸까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"왜 "+businessName +"의 "+ keyword + "가 전국 탑클래스라는 소문이 났는지 궁금하지 않으세요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"이곳 "+businessName +"의 "+ keyword+ "가 왜 전국최고라는 소문이 낫는지 궁금하지 않으세요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"잘한다고 소문난 "+businessName +"의 "+ keyword + "어떻게 하길래 소문이 났을까요?"+CaramelWriterProperties.TAG_P_END,
				
				CaramelWriterProperties.TAG_P_START+"실력 좋기로 소문난 "+keyword +" "+ businessName + ", 평소에도 많이 들었었는데요. 지금부터 자세히 알아보도록 하겠습니다."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"다들 아시죠 ? 전국 최고로 소문난 "+keyword +", "+ businessName + "에 대해 포스팅 하도록 할게요"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"소문난 학원! "+keyword +" "+ businessName + ", 이곳이 왜 유명한지 전격 해부했습니다. "+CaramelWriterProperties.TAG_P_END,
		};
		
		
		String subject_characteristic [] = {
				CaramelWriterProperties.TAG_P_START+""+businessName +"의 "+ keyword + "이 특별한 이유는 무엇일까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+""+businessName +"의 "+ keyword + "만의 특별함은 무엇이 있을까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+""+businessName +"의 "+ keyword + "만의 특별한 무엇이 있기에 이렇게 유명할까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+""+businessName +"의 "+ keyword + "만의 특별한점은 어떤게 있을까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+""+keyword +" "+ businessName + "만의 특징은 어떤게 있을까요?"+CaramelWriterProperties.TAG_P_END,
				
				CaramelWriterProperties.TAG_P_START+"다른 곳과 비교되는 "+businessName +"의 "+ keyword + "만의 특징은  어떤게 있을까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"다른 곳과 비교 할 수 있는 "+keyword +" "+ businessName + "만의 특별함은 무엇이 있을까요?"+CaramelWriterProperties.TAG_P_END,
		};
		
		
		String subject_advantages [] = {
				CaramelWriterProperties.TAG_P_START+"그렇다면  "+keyword +" "+ businessName + "만의 장점은 무엇이 있을까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"그러면  "+keyword +" "+ businessName + "이 다른 곳보다 좋은 이유는 무엇일까요?."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"그렇다면  "+keyword +" "+ businessName + "의 장점은 무엇일까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"그렇다면  "+keyword +" "+ businessName + "의 장점으로는 무엇이 있을까요?"+CaramelWriterProperties.TAG_P_END,
		};
		
		
		String place_front[] = {
				"잘 가르치기로 소문난 "+keyword +" "+ businessName,
				"선생님들이 열정가득한걸로 소문난 "+keyword +" "+ businessName,
				"좋은학원 "+keyword +" "+ businessName,
				"좋기로 소문난 학원 "+keyword +" "+ businessName,
				"잘가르치기로 소문난 학원 "+keyword +" "+ businessName,
				"잘가르치는 선생님이 많은 "+keyword +" "+ businessName,
				"좋은 선생님들이 많은 "+keyword +" "+ businessName,
				"동종업계 최고의 학원 "+keyword +" "+ businessName,
				"꿈을 실현해주는 학원 "+keyword +" "+ businessName,
				"학생들의 꿈이 실현되는 학원 "+keyword +" "+ businessName,
				
				"잘 가르치는 배움터 "+keyword +" "+ businessName,
				"좋은 선생님들이 많은 배움터 "+keyword +" "+ businessName,
				"정말 좋은 배움터 "+keyword +" "+ businessName,
				"학생들의 꿈이 실현되는 배움터 "+keyword +" "+ businessName,
				"배움의 현장 "+keyword +" "+ businessName,
				"열정가득한 선생님들이 많은 배움터 "+keyword +" "+ businessName,
		};
		String place_back[] ={
				", 어디에 위치한지 아시나요~?",
				", 어디에 있는지 아시나요?",
				", 어디에 위치해 있을까요?",
				", 어디에 있는지 확인해보세요~",
				", 어떻게 찾으면될까요?",
				", 어디에 있는지 위치를 확인해보세요~",
		};
		
		String subject_place [] = {
				CaramelWriterProperties.TAG_P_START+place_front[random.nextInt(place_front.length)] +place_back[random.nextInt(place_back.length)] +CaramelWriterProperties.TAG_P_END,
		};
		
		subject.add(subject_reason[random.nextInt(subject_reason.length)] +CaramelWriterProperties.MARGIN_2+"\n\n\n");
		subject.add(Util2Common.commonTextReason(keyword, businessName)+CaramelWriterProperties.MARGIN+"\n\n\n");
		subject.add(subject_characteristic[random.nextInt(subject_characteristic.length)] +CaramelWriterProperties.MARGIN_2+"\n\n\n");
		subject.add(Util2Common.commonTextSpecial(keyword, businessName)+CaramelWriterProperties.MARGIN+"\n\n\n");
		subject.add(subject_advantages[random.nextInt(subject_advantages.length)] +CaramelWriterProperties.MARGIN_2+"\n\n\n");
		subject.add(Util2Common.commonTextAdvantage(keyword, businessName)+CaramelWriterProperties.MARGIN+"\n\n\n");
		subject.add(subject_place[random.nextInt(subject_place.length)] +CaramelWriterProperties.MARGIN_2+"\n\n\n");
		
		return subject;
	}
	
}
