package util;

import java.util.Random;

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
	public static String commonTextReason(String keyword,String businessName){
		Random random = new Random();
		String front [] ={
				businessName + "은 저도 지인을 통해서 들었었는데요~",
				businessName + "에서는 평소에도 사람들사이에서 좋다고 소문난곳이라 왜그런지 궁굼해하고있었는데요",
				businessName + "이 왜 인기가 있는지 평소에 많이 궁금해하던차에",
				businessName + "이 사람들한테 인기가 있는 이유에대해 궁금했었는데",
				businessName + ", 이곳이 인기있는 이유가 괜한것이 아니었어요~ ",
				businessName + ", 이곳을 많은분들이 칭찬하는데에는 그만한 이유가 있었던 것이었어요 ㅎ",
				businessName + ", 왜 유명한지 아시는분 계세요?",
				businessName + "의 인기는 괜한 헛소문이 아니라 진짜배기였어요",
		};
		
		String back [] ={
				CaramelWriterProperties.MARGIN_2+"저도 이번에 경험해보고 완전 마음에 들었어요^^",
				CaramelWriterProperties.MARGIN_2+"직접 보니 왜그런지 알겠더라구요",
				CaramelWriterProperties.MARGIN_2+"이번에 직접 경험해보니까 왜그런지 알겠더라구요",
				CaramelWriterProperties.MARGIN_2+"이젠 저도 완전히 이해가가요, 역시 소문난곳은 이유가있었어요~",
				CaramelWriterProperties.MARGIN_2+"사람들이 왜그렇게 칭찬하는지 직접보니 잘 알겠떠라구요~",
				CaramelWriterProperties.MARGIN_2+"저도이번에 직접 보면서 왜그런지 알게되었다니깐요~",
				CaramelWriterProperties.MARGIN_2+"소문난곳에는 역시 다 이유가 있었더랍니다~ 저도 이번에 제대로 알게되었어요~",
				CaramelWriterProperties.MARGIN_2+"제가 이번에 직접보면서 많은것을 느꼈어요 ㅋ",
		};
		
		return CaramelWriterProperties.TAG_P_START+ front[random.nextInt(front.length)]+back[random.nextInt(back.length)]+CaramelWriterProperties.TAG_P_END;
	}
	
	public static String commonTextSpecial(String keyword,String businessName){
		Random random = new Random();
		String front [] ={
				businessName + "의 특별한점은요 제가 생각하기에는 ",
				businessName + "의 특별한점을 말하자면요  ",
				businessName + "에서 제가 생각하는 특별한점은요~  ",
				businessName + "에서 사람들이 말하는 특별한점은요! ",
				businessName + "에는 특별한점이 되게많았어요!",
				businessName + "만의 특별한점을 제가 생각해보자면",
				businessName + "만의 독특하고 특별한점을 말해보자면",
				businessName + "만의 특별하고 좋은 점을 글로 써보자면",
				businessName + "가 동종업계에서 살아남을 수 있었던 특별한점을 생각해보자면",
				businessName + "가 특별한점을 글로 써보자면",
				businessName + "가 많은 사람들에게 사랑받는 그 특별한 점을 말해보자면",
				businessName + "가 많은 사람들에게 사랑받는 그 특별한 점을 글로써보자면",
				
		};
		
		String back [] ={
				CaramelWriterProperties.MARGIN_2+"다른곳에서는 경험 할 수 없는 "+businessName+"만의 특별한 무엇인가가 있어요",
				CaramelWriterProperties.MARGIN_2+businessName+"만의 특별한 무엇인가가 존재하고있었어요 ",
				CaramelWriterProperties.MARGIN_2+businessName+"만의, 다른곳에서는 구경할수없는 것들이 이곳에 있었어요. 많은분들이 칭찬하는 이유가있었다고나할까 ",
				CaramelWriterProperties.MARGIN_2+"어디에서도 흔히 볼수 없는 것들이  "+businessName+"에는 있었어요~",
				CaramelWriterProperties.MARGIN_2+businessName+"에는 여러가지의 특별한점이 있지만 그중에서도  제일 좋았던것들만 써볼게요~",
				CaramelWriterProperties.MARGIN_2+businessName+"에는 여러 특별한것들이 즐비해서 좋았지만, 그중에서도 제맘에 들었던 몇가지만 써볼게요",
				CaramelWriterProperties.MARGIN_2+businessName+"에는 많은 특별한것이 있어서 좋았지만요, 그중에서도 제일 제맘에들었던것들 몇가지가 있어요",
				CaramelWriterProperties.MARGIN_2+businessName+"에는 정말 셀수없을정도의 특별한점이 있었는데, 그중에 제맘에 들었던 몇가지만 말할게요",
				CaramelWriterProperties.MARGIN_2+businessName+"에서 느낀 특별한점은 정말 많았는데, 그중에서도 제일 제맘에들었던거 몇가지만 쓸게요~",
				
		};
		
		return CaramelWriterProperties.TAG_P_START+ front[random.nextInt(front.length)]+back[random.nextInt(back.length)]+CaramelWriterProperties.TAG_P_END;
	}
	
	public static String commonTextAdvantage(String keyword,String businessName){
		Random random = new Random();
		String front [] ={
				businessName + "의 좋은 이유는",
				businessName + "가 동종업계에서 으뜸인 이유는",
				businessName + "가 동종업계에서 사람들이 최고라고 칭찬하는 이유는",
				businessName + "가 사람들사이에서 최고라고 친찬받는 이유는",
				businessName + "가 좋은 어러가지이유중 몇가지는",
				businessName + "가 좋은 수없이 많은 이유중에 몇가지는",
				businessName + "가 제마음에 쏘옥 드는 이유는",
				businessName + "가 가진 여러가지 장점중에 몇가지는",
				businessName + "가 가지고있는 정말 많은 장점들중에 몇가지는",
				
				businessName + "에서 제가생각하는 이곳만의 큰장점들은",
				businessName + "에서 제가 마음에 들었던 이곳만의 장점들은",
				businessName + "에서 제가 생각해본 이곳만의 좋은 이유들은",
				businessName + "에서 사람들이 이곳을 칭찬하는 이유를 생각해봤을때 이유는",
				businessName + "가 이렇게 오랫동안 사랑받아온건 여러 장점들이있었기때문인데요 그 장점들은",
				
		};
		
		String back [] ={
				CaramelWriterProperties.MARGIN_2+"빠른서비스, 직원분들의 친절한 서비스 등 여러가지가 있었어지만 더 중요한것은~ ",
				CaramelWriterProperties.MARGIN_2+"정말 셀수없이많았지만, 몇가지만 말해볼게요 ",
				CaramelWriterProperties.MARGIN_2+"철두철미한 서비스정신을 예로들수있겠네요 ",
				CaramelWriterProperties.MARGIN_2+"이곳의  직원분들의 친절한 서비스뿐아니라~",
				CaramelWriterProperties.MARGIN_2+"이곳의 빠른 써비스 뿐아니라~",
				CaramelWriterProperties.MARGIN_2+"이곳의 고퀄리티 서비스 뿐아니라~",
				CaramelWriterProperties.MARGIN_2+"이곳의 정말 다양한 서비스 or 메뉴를 들수있겠네요!",
				CaramelWriterProperties.MARGIN_2+"저렴하고 퀄리티 높은 결과 or 음식 을 들수있겠네요!! ",
				
		};
		
		return CaramelWriterProperties.TAG_P_START+ front[random.nextInt(front.length)]+back[random.nextInt(back.length)]+CaramelWriterProperties.TAG_P_END;
	}
	
	
}
