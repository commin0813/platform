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
import util.Util2Hospital;
import util.Util2Rest;

public class Panel2CaramelWriter implements WriterIf {
	private static Panel2CaramelWriter instance;

	private Panel2CaramelWriter() {
	}

	public static Panel2CaramelWriter getInstance() {
		if (instance == null) {
			instance = new Panel2CaramelWriter();
		}
		return instance;
	}

	@Override
	public void create(Model2Caramel model, JTextArea ta_content) {

		String classification = model.getClassification();

		////////////// CREATE ///////////////////

		if (classification.equals(CaramelWriterProperties.CLASSIFICATION_FOOD)) {

		} else if (classification.equals(CaramelWriterProperties.CLASSIFICATION_HOSPITAL)) {
			model = Util2Hospital.getContent(model);
		} else if (classification.equals(CaramelWriterProperties.CLASSIFICATION_RESTAURANT)) {
			model = Util2Rest.getContent(model);
		}

		/////////////////////// RESULT ///////////////////
		ta_content.append(model.getResult());

	}

}
