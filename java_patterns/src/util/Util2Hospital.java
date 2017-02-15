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
		String verb [] = {
			"치료하세요","진찰받아보세요","상담받아보시길","상담받으세요","다시 시작 된 장미 빛 인생","무료상담 고고","무료상담 해보세요","무료상담 해보시길","고치자!","완벽하게 고치자!","자신감 되찾기!"," 자신감 되찾자!","진찰 받아보시길","시술받으세요","시술 받으시길","진찰합니다."
		};
		
		String inn [] ={
				"에서 ","이곳에서 ","에 와서 ","와서 "
		};
		
		String noun[] = {
				"전국 최고","제일 잘 나가","이제부터 여기 내 단골","마음에 쏘옥~","완전 마음에 들음","참말로 좋아부러~","참말로 좋아요~","진심 최고~!","여기에 맡기세요","진심 좋아요","지금 이벤트중~" ,"최고중에 최고" ,"베스트 오브 베스트","굿 굿 !",", 여기 매우 유명","매우 저렴","전국 최저가","전국 최고의 기술","최첨단 장비 도입"
		};
		String titles [] = {
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+businessName +"에서 하는 "+ keyword + " " +noun[random.nextInt(noun.length)] +CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START_TITLE+"@@"+keyword+" "+ businessName + ""+inn[random.nextInt(inn.length)] +verb[random.nextInt(verb.length)]+CaramelWriterProperties.TAG_P_END,
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
		
		String reason_front[]={
				"왜 "+businessName +"의 "+ keyword+"가 ",
				"어찌하여 "+businessName +"의 "+ keyword+"가 ",
				"어떻게하여 "+businessName +"의 "+ keyword+"가 ",
				"이곳 "+businessName +"의 "+ keyword+"가 ",
				"이곳이 왜 "+businessName +"의 "+ keyword+"가 ",
				"어떻게 "+businessName +"의 "+ keyword+"가 ",
				"왜 이렇게 "+businessName +"의 "+ keyword+"가 ",
		};
		String reason_back[]={
				"최고라는 소문이 자자 한 걸까요?",
				"최고라는 소문이 난 걸까요?",
				"전국 탑클래스라는 소문이 났는지 궁금하지 않으세요?",
				"왜 전국최고라는 소문이 낫는지 궁금하지 않으세요?",
				"어떻게 하길래 소문이 났을까요?",
				"얼마나 잘하길래 이렇게 좋은 소문이 났을까요?",
				"어떤게 좋아서 사람들이 이렇게 좋다고 말할까요?",
				"어떤것을 서비스하길래 이렇게 좋은 소문이 날까요?",
				"어떤것을 서비스하길래 사람들이 좋다고 말을 할까요?",
		};
		
		String subject_reason [] = {
				CaramelWriterProperties.TAG_P_START+reason_front[random.nextInt(reason_front.length)]+reason_back[random.nextInt(reason_back.length)]+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+reason_front[random.nextInt(reason_front.length)]+reason_back[random.nextInt(reason_back.length)]+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+reason_front[random.nextInt(reason_front.length)]+reason_back[random.nextInt(reason_back.length)]+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+reason_front[random.nextInt(reason_front.length)]+reason_back[random.nextInt(reason_back.length)]+CaramelWriterProperties.TAG_P_END,
				
				CaramelWriterProperties.TAG_P_START+"실력 좋기로 소문난 "+keyword +" "+ businessName + ", 평소에도 많이 들었었는데요. 지금부터 자세히 알아보도록 하겠습니다."+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"다들 아시죠 ? 전국 최고로 소문난 "+keyword +", "+ businessName + "에 대해 포스팅 하도록 할게요"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"예뻐지기 원하는 분들에게 유명한 곳! "+keyword +" "+ businessName + ", 이곳이 왜 유명한지 전격 해부했습니다. "+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"요즘 성형외과를 찾으시지는 않으세요? "+keyword +" "+ businessName + ", 이곳은 많은사람들이 추천하는곳이예요^^ "+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"요즘 성형외과를 찾으시지는 않으세요? "+keyword +" "+ businessName + ", 이곳은 사람들이 많이 추천하는 곳이랍니다~ "+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"요즘 성형외과를 찾으시지는 않으세요? "+keyword +" "+ businessName + ", 이곳이 바로 사람들이 그렇게도 추천하는 곳이랍니다. "+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"요즘 성형외과를 찾으시지는 않으세요? "+keyword +" "+ businessName + ", 이곳에서 고민상담 받아보시는게 어떠세요? "+CaramelWriterProperties.TAG_P_END,
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
				CaramelWriterProperties.TAG_P_START+"잘하기로 소문난 "+keyword +" "+ businessName + ", 어떻게 이벤트에 응모할수있을까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"최고의 실력을 가진 "+keyword +" "+ businessName + ", 어떻게 더 자세한 내용을 찾아볼수있을까요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"이곳은 정말 강추해요^^ "+keyword +" "+ businessName + ", 어떻게 더 자세히 알 수 있을지 궁금하시지 않으세요?"+CaramelWriterProperties.TAG_P_END,
				CaramelWriterProperties.TAG_P_START+"이쯤 되면 여기 "+keyword +" "+ businessName + ", 어떻게 더 자세히 알 수 있을지 궁금하시지 않으세요?"+CaramelWriterProperties.TAG_P_END,
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
