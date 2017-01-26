package page;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.BreakIterator;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import model.Model2Caramel;
import panel.Panel2CaramelWriter;

public class Page2CaramelWriter extends JFrame {

	private JPanel contentPane;
	private JTextField tv_businessName;
	private JTextField tv_keyword;
	private JTextField tv_detail_keyword;
	private JTextArea ta_content;
	private ButtonGroup group;
	private Panel2CaramelWriter panel_writer;
	private JTextField tv_phone_num;
	private JTextField tv_address;

	private JCheckBox chckbxExist;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page2CaramelWriter frame = new Page2CaramelWriter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Page2CaramelWriter() {
		setTitle("Caramel Writer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 527);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		group = new ButtonGroup();
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel_input = new JPanel();
		contentPane.add(panel_input, BorderLayout.WEST);
		panel_input.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\uBD84\uB958", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_input.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));

		JRadioButton radio_restaurant = new JRadioButton("식당");
		panel_1.add(radio_restaurant);

		JRadioButton radio_normal = new JRadioButton("일반");
		panel_1.add(radio_normal);

		JRadioButton radio_hospital = new JRadioButton("병원");
		panel_1.add(radio_hospital);

		group.add(radio_restaurant);
		group.add(radio_normal);
		group.add(radio_hospital);

		JPanel panel = new JPanel();
		panel_input.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 195, 0 };
		gbl_panel.rowHeights = new int[] { 353, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.anchor = GridBagConstraints.NORTH;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 0;
		panel.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 0, 0 };
		gbl_panel_3.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_3.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		JLabel lblNewLabel_1 = new JLabel("상호명");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_3.add(lblNewLabel_1, gbc_lblNewLabel_1);

		tv_businessName = new JTextField();
		tv_businessName.setColumns(10);
		GridBagConstraints gbc_tv_businessName = new GridBagConstraints();
		gbc_tv_businessName.insets = new Insets(0, 0, 5, 0);
		gbc_tv_businessName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tv_businessName.gridx = 0;
		gbc_tv_businessName.gridy = 1;
		panel_3.add(tv_businessName, gbc_tv_businessName);

		JLabel lblNewLabel = new JLabel("키워드");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		panel_3.add(lblNewLabel, gbc_lblNewLabel);

		tv_keyword = new JTextField();
		tv_keyword.setColumns(10);
		GridBagConstraints gbc_tv_keyword = new GridBagConstraints();
		gbc_tv_keyword.insets = new Insets(0, 0, 5, 0);
		gbc_tv_keyword.fill = GridBagConstraints.HORIZONTAL;
		gbc_tv_keyword.gridx = 0;
		gbc_tv_keyword.gridy = 3;
		panel_3.add(tv_keyword, gbc_tv_keyword);

		JLabel label = new JLabel("세부키워드");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 4;
		panel_3.add(label, gbc_label);

		tv_detail_keyword = new JTextField();
		tv_detail_keyword.setEnabled(false);
		tv_detail_keyword.setEditable(false);
		tv_detail_keyword.setColumns(10);
		GridBagConstraints gbc_tv_detail_keyword = new GridBagConstraints();
		gbc_tv_detail_keyword.insets = new Insets(0, 0, 5, 0);
		gbc_tv_detail_keyword.fill = GridBagConstraints.HORIZONTAL;
		gbc_tv_detail_keyword.gridx = 0;
		gbc_tv_detail_keyword.gridy = 5;
		panel_3.add(tv_detail_keyword, gbc_tv_detail_keyword);

		JLabel label_1 = new JLabel("전화번호");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 6;
		panel_3.add(label_1, gbc_label_1);

		tv_phone_num = new JTextField();
		tv_phone_num.setColumns(10);
		GridBagConstraints gbc_tv_phone_num = new GridBagConstraints();
		gbc_tv_phone_num.insets = new Insets(0, 0, 5, 0);
		gbc_tv_phone_num.fill = GridBagConstraints.HORIZONTAL;
		gbc_tv_phone_num.gridx = 0;
		gbc_tv_phone_num.gridy = 7;
		panel_3.add(tv_phone_num, gbc_tv_phone_num);

		JLabel label_2 = new JLabel("주소");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.WEST;
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 8;
		panel_3.add(label_2, gbc_label_2);

		tv_address = new JTextField();
		tv_address.setColumns(10);
		GridBagConstraints gbc_tv_address = new GridBagConstraints();
		gbc_tv_address.insets = new Insets(0, 0, 5, 0);
		gbc_tv_address.fill = GridBagConstraints.HORIZONTAL;
		gbc_tv_address.gridx = 0;
		gbc_tv_address.gridy = 9;
		panel_3.add(tv_address, gbc_tv_address);

		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.anchor = GridBagConstraints.WEST;
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.fill = GridBagConstraints.VERTICAL;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 10;
		panel_3.add(panel_4, gbc_panel_4);

		JLabel label_3 = new JLabel("대가성문구");
		panel_4.add(label_3);

		chckbxExist = new JCheckBox("");
		panel_4.add(chckbxExist);

		JPanel panel_2 = new JPanel();
		panel_input.add(panel_2, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("생성");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta_content.setText("");
				create();
				count_text();
			}
		});
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));

		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clear();
			}
		});
		panel_5.add(btnClear);

		JButton btnCopy = new JButton("copy");
		panel_5.add(btnCopy);
		btnCopy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				String copyString = ta_content.getText().toString();
				if (copyString != null) {
					StringSelection contents = new StringSelection(copyString);
					clipboard.setContents(contents, null);
				}
			}
		});
		panel_2.add(btnNewButton);

		JPanel panel_content = new JPanel();
		contentPane.add(panel_content, BorderLayout.CENTER);
		panel_content.setLayout(new BorderLayout(0, 0));

		ta_content = new JTextArea("", 5, 10);
		ta_content.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				count_text();
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
		JScrollPane jp = new JScrollPane(ta_content);

		panel_content.add(jp);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBackground(Color.ORANGE);
		panel_content.add(panel_6, BorderLayout.SOUTH);

		JLabel lblNewLabel_2 = new JLabel("글자 수 : ");
		panel_6.add(lblNewLabel_2);

		textField = new JTextField();
		textField.setText("0");
		textField.setEditable(false);
		panel_6.add(textField);
		textField.setColumns(10);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(0, 0, 10, 0));
		menuBar.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		contentPane.add(menuBar, BorderLayout.NORTH);

		JMenu mnInfo = new JMenu("Info");
		mnInfo.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		menuBar.add(mnInfo);

		JMenuItem mntmHelp = new JMenuItem("Help");
		mnInfo.add(mntmHelp);

		panel_writer = Panel2CaramelWriter.getInstance();

	}

	private void count_text() {
		String content = ta_content.getText().toString();

		content = content.replaceAll("\\p{Z}", "");
		
		content = content.replaceAll("(^\\p{Z}+|\\p{Z}+$)", "");
		content = content.replaceAll("%", "");
		content = content.replaceAll("'", ""); // &#39;
		content = content.replaceAll("\"", ""); // &quot;
		content = content.replaceAll(",", ""); // &#44;
		content = content.replaceAll("|", "");
		content = content.replaceAll("\n", "");
		content = content.replaceAll("\r", "");
		content = content.replaceAll("\r\n", "");
		
		content = content.replaceAll("<p>", "");
		content = content.replaceAll("</p>", "");
		content = content.replaceAll("<br >", "");
		content = content.replaceAll("<span>", "");
		
		content = content.trim();
		int cnt = 0;
		BreakIterator it = BreakIterator.getCharacterInstance();
		it.setText(content);

		while (it.next() != BreakIterator.DONE) {
			cnt++;
		}

		textField.setText("" + cnt);
	}
	
	private void clear(){
		  tv_businessName.setText("");
		  tv_keyword.setText("");
		  tv_detail_keyword.setText("");
		  ta_content.setText("");
		  group.clearSelection();
		  
		  tv_phone_num.setText("");
		  tv_address.setText("");

		  chckbxExist.setSelected(false);
		  textField.setText("0");
	}

	private void create() {
		///////////////////// CHECK//////////////////////
		if (group.isSelected(null)) {
			new JOptionPane().showMessageDialog(null, "분류는 필수 입력값입니다.");
			return;
		}
		if (tv_businessName.getText().toString().equals("") || tv_businessName.getText().toString() == null) {
			new JOptionPane().showMessageDialog(null, "상호명은 필수 입력값입니다.");
			return;
		}

		Model2Caramel model = new Model2Caramel();

		model.setAddress(tv_address.getText().toString());
		model.setBusinessName(tv_businessName.getText().toString());
		model.setDetail_keyword(tv_detail_keyword.getText().toString());
		model.setIsph(chckbxExist.isSelected());
		model.setKeyword(tv_keyword.getText().toString());
		model.setPhone_num(tv_phone_num.getText().toString());

		Enumeration<AbstractButton> enums = group.getElements();
		String classification = "";

		while (enums.hasMoreElements()) {
			AbstractButton ab = enums.nextElement();
			if (ab.isSelected()) {
				classification = ab.getText().toString();
				break;
			}
		}
		model.setClassification(classification);

		panel_writer.create(model, ta_content);
	}

	public interface WriterIf {
		public void create(Model2Caramel model, JTextArea ta_content);
	}
}
