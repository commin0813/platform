package util;

import java.util.ArrayList;
import java.util.Random;

import model.Model2Caramel;
import page.CaramelWriterProperties;

public class Util2Rest {
	public static Model2Caramel getContent(Model2Caramel model){
		StringBuffer result = new StringBuffer();
		
		result.append(create_title(model));
		
		for(String subject : create_subject(model)){
			result.append(subject);
		}
		
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
	
	private static String create_link(String link){
		if(!link.startsWith("http")){
			StringBuffer htt = new StringBuffer("http://");
			htt.append(link);
			link = htt.toString();
		}
		return "<p align=\"left\" style=\"text-align: left;\"><span style=\"font-size: 24pt; color: rgb(255, 0, 0);\">"
				+ "<a href=\""+link+"\" target=\"_self\">홈페이지 바로가기</a>"
				+ "</span></p>"+CaramelWriterProperties.MARGIN+"\n\n\n";
	}
	
	private static String create_phone(String phone_num){
		return "<p><span style=\"font-size: 24pt; color: rgb(255, 0, 0);\">"+ phone_num +"</span></p>"+CaramelWriterProperties.MARGIN+"\n\n\n";
	}
	private static String create_address(String address){
		return "<p><span style=\"font-size: 24pt; color: rgb(255, 0, 0);\">"+ address +"</span></p>"+CaramelWriterProperties.MARGIN+"\n\n\n";
	}
	private static String create_phrases(){
		return CaramelWriterProperties.PHRASES;
	}
	
	
	private static String create_title(Model2Caramel model){
		String businessName = model.getBusinessName();
		String keyword = model.getKeyword();
		Random random = new Random();
		String title [] = {
				CaramelWriterProperties.TAG_P_START_TITLE+"놀러갔다가 "+keyword +" "+ businessName + ", 방문하다"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"놀러갔다가 "+keyword +" "+ businessName + "에서 밥 한끼!"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"놀러갔다가 "+keyword +" "+ businessName + "을 발견하다"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"여행갔다가 "+keyword +" "+ businessName + "과 운명적 만남"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"여행갔다가 "+keyword +" "+ businessName + "에서 냠냠"+CaramelWriterProperties.TAG_P_END,
				
				CaramelWriterProperties.TAG_P_START_TITLE+"오랜만에 놀러갔다가 "+keyword +" "+ businessName + "을 발견!!"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"우연히 놀러갔다가 "+keyword +" "+ businessName + "에서 식사를합시댜"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"맛집추천! "+keyword +" "+ businessName + ", 여긴 꼭 가야해"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"맛집추천! "+keyword +" "+ businessName + ""+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"맛집추천! "+keyword +" "+ businessName + ",어머 여긴 꼭 가야해"+CaramelWriterProperties.TAG_P_END,
				
				CaramelWriterProperties.TAG_P_START_TITLE+"맛집추천! "+keyword +" "+ businessName + " 정말 맛나요"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"맛집추천! "+keyword +" "+ businessName + " 정말 맛나네요^^"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"소문난 맛집! "+keyword +" "+ businessName + "이 대세"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"소문난 맛집! "+keyword +" "+ businessName + "이 인기"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"드디어 가다! "+keyword +" "+ businessName + ""+CaramelWriterProperties.TAG_P_END,
				
				CaramelWriterProperties.TAG_P_START_TITLE+"인생 맛집~ "+keyword +" "+ businessName + ""+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"인생 맛집~ "+keyword +" "+ businessName + ", 여긴 꼭 갑시다"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"대박 맛집~ "+keyword +" "+ businessName + ""+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"대박 맛집~ "+keyword +" "+ businessName + ", 꼭 가세요!"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"[대박 맛집] "+keyword +" "+ businessName + ", 꼭 먹어보세요!"+CaramelWriterProperties.TAG_P_END,
				
				CaramelWriterProperties.TAG_P_START_TITLE+keyword+"를 찾으신다면" +" "+ businessName + ", 강추드려요"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+keyword+"를 찾는다면" +" "+ businessName + ", 여기 뿐"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+keyword+"를 찾는다면" +" "+ businessName + "가 좋아요^^"+CaramelWriterProperties.TAG_P_END,
				
		};
		
		return title[random.nextInt(title.length)]+CaramelWriterProperties.MARGIN+"\n\n\n";
	}
	
	private static ArrayList<String> create_subject(Model2Caramel model){
		String businessName = model.getBusinessName();
		String keyword = model.getKeyword();
		ArrayList<String> subject = new ArrayList<String>();
		
		Random random = new Random();
		
		
		String subject_reason [] = {
				CaramelWriterProperties.TAG_P_START+"왜 "+keyword +" "+ businessName + "가 맛집이라고 소문이 자자 한 걸까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"어찌하여 "+keyword +" "+ businessName + "가 맛집이라고 소문이 난 걸까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"왜 "+keyword +" "+ businessName + "가 맛집이라고 소문이 났는지 궁금하지 않으세요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"이곳 "+keyword +" "+ businessName + "가 왜 맛집이라고 소문이 낫는지 궁금하지 않으세요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"맛집으로 소문난 "+keyword +" "+ businessName + "어떤 곳인지 궁금하시 않으신가요?"+CaramelWriterProperties.TAG_P_END,
				
				CaramelWriterProperties.TAG_P_START+"맛집으로 소문난 "+keyword +" "+ businessName + ", 평소에 너무 궁금했었는데요. 지금부터 자세히 알아보도록 하겠습니다."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"다들 아시죠 ? 맛집으로 소문난 "+keyword +" "+ businessName + "에 대해 포스팅 하도록 할게요"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"소문난 맛집! "+keyword +" "+ businessName + ", 이곳이 왜 유명한지 전격 해부했습니다. "+CaramelWriterProperties.TAG_P_END,
		};
		
		
		String subject_characteristic [] = {
				CaramelWriterProperties.TAG_P_START+""+keyword +" "+ businessName + "이 특별한 이유는 무엇일까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+""+keyword +" "+ businessName + "만의 특별함은 무엇이 있을까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+""+keyword +" "+ businessName + "만의 특별한 메뉴는 무엇일까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+""+keyword +" "+ businessName + "만의 특별한점은 어떤게 있을까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+""+keyword +" "+ businessName + "만의 특징은 어떤게 있을까요?"+CaramelWriterProperties.TAG_P_END,
				
				CaramelWriterProperties.TAG_P_START+"다른 식당과 비교되는 "+keyword +" "+ businessName + "만의 특징은  어떤게 있을까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"다른 식당과 비교 할 수 있는 "+keyword +" "+ businessName + "만의 특별함은 무엇이 있을까요?"+CaramelWriterProperties.TAG_P_END,
		};
		
		
		String subject_advantages [] = {
				CaramelWriterProperties.TAG_P_START+"그렇다면  "+keyword +" "+ businessName + "만의 장점은 무엇이 있을까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"그러면  "+keyword +" "+ businessName + "이 다른 식당보다 좋은 이유는 무엇일까요?."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"그렇다면  "+keyword +" "+ businessName + "의 장점은 무엇일까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"그렇다면  "+keyword +" "+ businessName + "의 장점으로는 무엇이 있을까요?"+CaramelWriterProperties.TAG_P_END,
		};
		
		
		String subject_place [] = {
				CaramelWriterProperties.TAG_P_START+"세상 제일 맛있는(적어도 저한테는) "+keyword +" "+ businessName + ", 어디에 위치해 있을까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"다음에 또 가고싶게 만드는 맛집~ "+keyword +" "+ businessName + ", 어디에있는지 아시나요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"이곳은 정말 강추해요^^ "+keyword +" "+ businessName + " 어디 있는지 확인하시고 찾아가보세요!"+CaramelWriterProperties.TAG_P_END,
		};
		
		subject.add(subject_reason[random.nextInt(subject_reason.length)] +CaramelWriterProperties.MARGIN+"\n\n\n");
		subject.add(subject_characteristic[random.nextInt(subject_characteristic.length)] +CaramelWriterProperties.MARGIN+"\n\n\n");
		subject.add(subject_advantages[random.nextInt(subject_advantages.length)] +CaramelWriterProperties.MARGIN+"\n\n\n");
		subject.add(subject_place[random.nextInt(subject_place.length)] +CaramelWriterProperties.MARGIN+"\n\n\n");
		
		return subject;
	}
	
}
