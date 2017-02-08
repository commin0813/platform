package util;

import java.util.ArrayList;
import java.util.Random;

import model.Model2Caramel;
import page.CaramelWriterProperties;

public class Util2Hospital {
	public static Model2Caramel getContent(Model2Caramel model){
		StringBuffer result = new StringBuffer();
		
		result.append(create_title(model));
		
		for(String subject : create_subject(model)){
			result.append(subject);
		}
		
		if(!model.getLink().equals("")){
			result.append(create_link(model.getLink()));
		}
		
		if(!model.getPhone_num().equals("")){
			result.append(create_phone(model.getPhone_num()));
		}
		if(!model.getAddress().equals("")){
			result.append(create_address(model.getAddress()));
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
		return "<p><span style=\"font-size: 24pt; color: rgb(255, 0, 0);\">전화번호 : "+ phone_num +"</span></p>"+CaramelWriterProperties.MARGIN+"\n\n\n";
	}
	private static String create_address(String address){
		return "<p><span style=\"font-size: 24pt; color: rgb(255, 0, 0);\">주소 : "+ address +"</span></p>"+CaramelWriterProperties.MARGIN+"\n\n\n";
	}
	private static String create_phrases(){
		return CaramelWriterProperties.PHRASES;
	}
	
	private static ArrayList<String> create_content_speed(Model2Caramel model){
		boolean isSpeed = model.isSpeed();
		if(!isSpeed)
			return null;
		Random random = new Random();
		ArrayList<String> contents = new ArrayList<String>();
		String content1 [] = {
				CaramelWriterProperties.TAG_P_START+"오늘은 여러분들께 정말 중요한 것을 알려 드릴려고 합니다."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"오늘은 중요한 정보하나를 알려드리고자 이렇게 포스팅합니다."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"오늘은 정말 좋은 정보 하나 알려드리려고 해요~ 눈크게뜨시고 포스팅을 봐주세요"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"오늘 정말 특급 소식하나를 들어서 포스팅 하게되었어요!"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"혹시 요즘 얼굴이나 건강등에 걱정이 있으신가요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"혹시 요즘 건강이나 피부 등에 관시이 있으시진 않으신가요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"요즘 어떤 고민이 있으신가요? 저는 건강이나 피부등에 관심이 많아졌어요."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"건강은 젊었을때 챙겨야한다는 말 들어보신적 있으신가요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"나이가들어가면서 걱정거리도 같이 늘어가는거 모두 공감하시는 내용일텐데요. 그래서 좋은 정보 하나 가져왔습니다."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"여러분 , 혹시 "+model.getBusinessName()+"에 대해 들어보신 내용이 있으신가요?"+CaramelWriterProperties.TAG_P_END,
				
		};
		
		String content2 [] = {
				CaramelWriterProperties.TAG_P_START+"오늘은 여러분들께 정말 중요한 것을 알려 드릴려고 합니다.2"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"오늘은 중요한 정보하나를 알려드리고자 이렇게 포스팅합니다.2"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"오늘은 정말 좋은 정보 하나 알려드리려고 해요~ 눈크게뜨시고 포스팅을 봐주세요2"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"오늘 정말 특급 소식하나를 들어서 포스팅 하게되었어요!2"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"혹시 요즘 얼굴이나 건강등에 걱정이 있으신가요2"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"혹시 요즘 건강이나 피부 등에 관시이 있으시진 않으신가요?2"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"요즘 어떤 고민이 있으신가요? 저는 건강이나 피부등에 관심이 많아졌어요2."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"건강은 젊었을때 챙겨야한다는 말 들어보신적 있으신가요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"나이가들어가면서 걱정거리도 같이 늘어가는거 모두 공감하시는 내용일텐데요. 그래서 좋은 정보 하나 가져왔습니다."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"여러분 , 혹시 "+model.getBusinessName()+"에 대해 들어보신 내용이 있으신가요?"+CaramelWriterProperties.TAG_P_END,
				
		};
		
		String content3 [] = {
				CaramelWriterProperties.TAG_P_START+"오늘은 여러분들께 정말 중요한 것을 알려 드릴려고 합니다."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"오늘은 중요한 정보하나를 알려드리고자 이렇게 포스팅합니다."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"오늘은 정말 좋은 정보 하나 알려드리려고 해요~ 눈크게뜨시고 포스팅을 봐주세요"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"오늘 정말 특급 소식하나를 들어서 포스팅 하게되었어요!"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"혹시 요즘 얼굴이나 건강등에 걱정이 있으신가요?3"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"혹시 요즘 건강이나 피부 등에 관시이 있으시진 않으신가요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"요즘 어떤 고민이 있으신가요? 저는 건강이나 피부3등에 관심이 많아졌어요."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"건강은 젊었을때 챙겨야한다는 말 들어보신적 있으신가요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"나이가들어가면서 걱정거리도 같이 늘어가는거 모두 공3감하시는 내용일텐데요. 그래서 좋은 정보 하나 가져왔습니다."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"여러분 , 혹시 "+model.getBusinessName()+"에 대해 들어보신 내용이 있으신가요?"+CaramelWriterProperties.TAG_P_END,
				
		};
		String content4 [] = {
				CaramelWriterProperties.TAG_P_START+"오늘은 여러분들께 정말 중요한 것을 알려 드릴려고 합니다."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"오늘은 중요한 정보하나를 알려드리고자 이렇게 포스팅합니다."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"오늘은 정말 좋은 정보 하나 알려드리려고4 해요~ 눈크게뜨시고 포스팅을 봐주세요"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"오늘 정말 특급 소식하나를 들어서 포스팅 하게되었어요!"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"혹시 요즘 얼굴이나 건강등에 걱정이 있으45신가요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"혹시 요즘 건강이나 피부 등에 관시이 있으시진 않으신가요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"요즘 어떤 고민이 있으신가요? 저는 건44이나 피부등에 관심이 많아졌어요."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"건강은 젊었을때 챙겨야한다는 말 들어보신적 있으신4가요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"나이가들어가면서 걱정거리도 같이 늘어가4는거 모두 4공감하시는 내용일텐데요. 그래서 좋은 정보 하나 가져왔습니다."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"여러분 , 혹시 "+model.getBusinessName()+"에 대해 들어보신 내용이 있으신가요?"+CaramelWriterProperties.TAG_P_END,
				
		};
		contents.add(content1[random.nextInt(content1.length)]+CaramelWriterProperties.MARGIN+"\n\n\n");
		contents.add(content2[random.nextInt(content2.length)]+CaramelWriterProperties.MARGIN+"\n\n\n");
		contents.add(content3[random.nextInt(content3.length)]+CaramelWriterProperties.MARGIN+"\n\n\n");
		contents.add(content4[random.nextInt(content4.length)]+CaramelWriterProperties.MARGIN+"\n\n\n");
		
		return contents;
	}
	
	private static String create_title(Model2Caramel model){
		String businessName = model.getBusinessName();
		String keyword = model.getKeyword();
		Random random = new Random();
		String verb [] = {
			"치료하세요","진찰받아보세요","상담받아보시길","상담받으세요","다시 시작 된 장미 빛 인생","무료상담 고고","무료상담 해보세요","무료상담 해보시길","고치자!","완벽하게 고치자!","자신감 되찾기!"," 자신감 되찾자!","진찰 받아보시길","시술받으세요","시술 받으시길","진찰합니다."
		};
		
		String inn [] ={
				"에서 ","이곳에서 ","에 와서 ","와서 "
		};
		
		String noun[] = {
				"전국 최고","제일 잘 나가", "베스트 오브 베스트","굿 굿 !",", 여기 매우 유명","매우 저렴","전국 최저가","전국 최고의 기술","최첨단 장비 도입"
		};
		String title [] = {
				CaramelWriterProperties.TAG_P_START+""+businessName +"에서 하는 "+ keyword + " " +noun[random.nextInt(noun.length)] +CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+""+keyword+" "+ businessName + ""+inn[random.nextInt(inn.length)] +verb[random.nextInt(verb.length)]+CaramelWriterProperties.TAG_P_END,
		};
		
		return title[random.nextInt(title.length)]+CaramelWriterProperties.MARGIN+"\n\n\n";
	}
	
	private static ArrayList<String> create_subject(Model2Caramel model){
		String businessName = model.getBusinessName();
		String keyword = model.getKeyword();
		ArrayList<String> subject = new ArrayList<String>();
		
		Random random = new Random();
		
		ArrayList<String> contents = create_content_speed(model);
		
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
		
	
		subject.add(subject_reason[random.nextInt(subject_reason.length)] +CaramelWriterProperties.MARGIN+"\n\n\n");
		subject.add(subject_characteristic[random.nextInt(subject_characteristic.length)] +CaramelWriterProperties.MARGIN+"\n\n\n");
		subject.add(subject_advantages[random.nextInt(subject_advantages.length)] +CaramelWriterProperties.MARGIN+"\n\n\n");
		subject.add(subject_place[random.nextInt(subject_place.length)] +CaramelWriterProperties.MARGIN+"\n\n\n");
		
		return subject;
	}
	
}
