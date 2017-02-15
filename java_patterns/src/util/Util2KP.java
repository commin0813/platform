package util;

import java.util.ArrayList;
import java.util.Random;

import model.Model2Caramel;
import page.CaramelWriterProperties;

public class Util2KP {
	
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
		String front [] ={
				keyword+"를 찾으신다구요? ",
				keyword+"는 업계 최고 ",
				keyword+"는 동일업종 최고 ",
				keyword+"는 같은 업종 최고 ",
				keyword+", 최고의 시스템을 가진 ",
				keyword+"를 알아보고 계시다면 ",
				keyword+"를 찾고있으시다면 ",
				keyword+"를 생각하고 있으시다면 ",
				keyword+"를 하고싶으시다면 ",
				keyword+"를 하고싶지는 않으세요? ",
				keyword+"를 생각하고 있지는 않으세요? ",
				keyword+"를 해보고싶으시지는 않으세요? ",
				keyword+"를 고려하고있지는 않으세요? ",
				keyword+"는 이곳에서 책입집니다. ",
				keyword+"는 이곳이 좋습니다. ",
				keyword+"는 여기가 최고예요. ",
				keyword+"는 이곳이짱이랍니다~ ",
				keyword+"는 제가 추천합니다~ ",
				"[ "+keyword+" ]"+"최고의 조건",
				"[ "+keyword+" ]"+"초기비용 100% 환급,",
				"[ "+keyword+" ]"+"포스팅량 최고치 갱신,",
				"[ "+keyword+" ]"+"새로운등급 런칭~!",
				
		};
		
		String back [] ={
				businessName+"를 한번 알아보세요~",
				businessName+"를 자세히 알아보세요",
				businessName+" 업계 최고 조건",
				businessName+"로 쉽게 시작하세요",
				businessName+"로 알차게 시작하세요",
				businessName+"로 쉽고 즐겁게 하세요~",
				businessName+"를 자세하게 알아보시면 좋아요~",
				businessName+"가 제일 좋은거 같아요~",
				businessName+"가 정말 좋아요~!",
				
				businessName+"가 믿음직하죠",
				businessName+"가 신뢰가 가는 곳입니다~",
				businessName+"가 정말 좋은 곳이랍니다~",
				businessName+"가 초보자도 할수 있는 곳이죠!",
		};
		
		
		
		String title [] = {
				CaramelWriterProperties.TAG_P_START_TITLE+""+front[random.nextInt(front.length)]+back[random.nextInt(back.length)]+CaramelWriterProperties.TAG_P_END,
		
				
		};
		
		return title[random.nextInt(title.length)]+CaramelWriterProperties.MARGIN+"\n\n\n";
	}
	
	private static ArrayList<String> create_subject(Model2Caramel model){
		String businessName = model.getBusinessName();
		String keyword = model.getKeyword();
		ArrayList<String> subject = new ArrayList<String>();
		
		Random random = new Random();
		
		
		String subject_reason [] = {
				CaramelWriterProperties.TAG_P_START+"왜 "+businessName +"의 "+ keyword + "가 최고라는 소문이 자자 한 걸까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"어찌하여 "+businessName +"의 "+ keyword + "가 최고라는 소문이 난 걸까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"왜 "+businessName +"의 "+ keyword + "가 전국 탑클래스라는 소문이 났는지 궁금하지 않으세요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"이곳 "+businessName +"의 "+ keyword+ "가 왜 전국최고라는 소문이 낫는지 궁금하지 않으세요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"잘한다고 소문난 "+businessName +"의 "+ keyword + "어떻게 하길래 소문이 났을까요?"+CaramelWriterProperties.TAG_P_END,
				
				CaramelWriterProperties.TAG_P_START+"실력 좋기로 소문난 "+keyword +" "+ businessName + ", 평소에도 많이 들었었는데요. 지금부터 자세히 알아보도록 하겠습니다."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"다들 아시죠 ? 전국 최고로 소문난 "+keyword +", "+ businessName + "에 대해 포스팅 하도록 할게요"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"소문난 병원! "+keyword +" "+ businessName + ", 이곳이 왜 유명한지 전격 해부했습니다. "+CaramelWriterProperties.TAG_P_END,
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
		
		
		String subject_place [] = {
				CaramelWriterProperties.TAG_P_START+"잘하기로 소문난 "+keyword +" "+ businessName + ", 어디에 위치해 있을까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"최고의 실력을 가진 "+keyword +" "+ businessName + ", 어디에있는지 아시나요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"이곳은 정말 강추해요^^ "+keyword +" "+ businessName + ", 어디에 있는지 확인해 보세요 !"+CaramelWriterProperties.TAG_P_END,
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
