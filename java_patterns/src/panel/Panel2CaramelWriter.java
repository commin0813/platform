package panel;

import javax.swing.JTextArea;

import model.Model2Caramel;
import page.CaramelWriterProperties;
import page.Page2CaramelWriter.WriterIf;
import util.Util2Hospital;
import util.Util2Hospital2;
import util.Util2KP;
import util.Util2Normal;
import util.Util2Rest;
import util.Util2Speed;
import util.Util2Study;

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
		if (model.isSpeed()) {
			model = Util2Speed.getContent(model);
		} else if (classification.equals(CaramelWriterProperties.CLASSIFICATION_NORMAL)) {
			model = Util2Normal.getContent(model);
		} else if (classification.equals(CaramelWriterProperties.CLASSIFICATION_HOSPITAL)) {
			model = Util2Hospital.getContent(model);
		} else if (classification.equals(CaramelWriterProperties.CLASSIFICATION_RESTAURANT)) {
			model = Util2Rest.getContent(model);
		} else if (classification.equals(CaramelWriterProperties.CLASSIFICATION_HOSPITAL2)) {
			model = Util2Hospital2.getContent(model);
		} else if (classification.equals(CaramelWriterProperties.CLASSIFICATION_STUDY)) {
			model = Util2Study.getContent(model);
		} else if (classification.equals(CaramelWriterProperties.CLASSIFICATION_KP)) {
			model = Util2KP.getContent(model);
		}

		/////////////////////// RESULT ///////////////////
		ta_content.append(model.getResult());

	}

}
