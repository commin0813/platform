package panel;

import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
		if(radio_group.isSelected(null)){
			new JOptionPane().showMessageDialog(null, "분류는 필수 입력값입니다.");
			return;
		}
		if(tv_businessName.getText().toString().equals("") || tv_businessName.getText().toString() == null){
			new JOptionPane().showMessageDialog(null, "상호명은 필수 입력값입니다.");
			return;
		}
		
		
		Enumeration<AbstractButton> enums = radio_group.getElements();
		String classification = "";
		
		while(enums.hasMoreElements()){
			AbstractButton ab = enums.nextElement();
			if(ab.isSelected()){
				classification = ab.getText().toString();
				break;
			}
		}
		
		ta_content.setText(CaramelWriterProperties.tag_p_start+classification+CaramelWriterProperties.tag_p_end);
		
	}
	
}
