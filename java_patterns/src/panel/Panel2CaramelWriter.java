package panel;

import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Model2Caramel;
import page.CaramelWriterProperties;
import page.Page2CaramelWriter.WriterIf;

public class Panel2CaramelWriter implements WriterIf{
	private static Panel2CaramelWriter instance;
	private Panel2CaramelWriter (){}
	
	public static Panel2CaramelWriter getInstance() {
		if(instance == null){
			instance = new Panel2CaramelWriter();
		}
		return instance;
	}
	@Override
	public void create(ButtonGroup radio_group,JTextField tv_businessName,JTextField tv_keyword,JTextField tv_detail_keyword,JTextArea ta_content) {
		// TODO Auto-generated method stub
		/////////////////////CHECK//////////////////////
		if(radio_group.isSelected(null)){
			new JOptionPane().showMessageDialog(null, "분류는 필수 입력값입니다.");
			return;
		}
		if(tv_businessName.getText().toString().equals("") || tv_businessName.getText().toString() == null){
			new JOptionPane().showMessageDialog(null, "상호명은 필수 입력값입니다.");
			return;
		}
		
		////////////////////INIT ////////////////////////
		
		String businessName = tv_businessName.getText().toString();
		String keyword = tv_keyword.getText().toString();
		String detail_keyword = tv_detail_keyword.getText().toString();
		
		Enumeration<AbstractButton> enums = radio_group.getElements();
		String classification = "";
		
		while(enums.hasMoreElements()){
			AbstractButton ab = enums.nextElement();
			if(ab.isSelected()){
				classification = ab.getText().toString();
				break;
			}
		}
		
		////////////// CREATE ///////////////////
		
		Model2Caramel model =  new Model2Caramel();
		model.setBusinessName(businessName);
		model.setDetail_keyword(detail_keyword);
		model.setKeyword(detail_keyword);
		
		
		
		if(classification.equals(CaramelWriterProperties.CLASSIFICATION_FOOD)){
			
		}else if(classification.equals(CaramelWriterProperties.CLASSIFICATION_HOSPITAL)){
			
		}else if(classification.equals(CaramelWriterProperties.CLASSIFICATION_RESTAURANT)){
			
		}
		
		///////////////////////RESULT ///////////////////
		ta_content.append(CaramelWriterProperties.TAG_P_START+classification+CaramelWriterProperties.TAG_P_END+CaramelWriterProperties.MARGIN);
		
	}
	
}
