package page;

import java.awt.BorderLayout;
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
import javax.swing.ImageIcon;
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
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import model.Model2Caramel;
import panel.Panel2CaramelWriter;

public class Page2CaramelWriter extends JFrame {

	private JPanel contentPane;
	private JTextField tv_businessName;
	private JTextField tv_keyword;
	private JTextField tv_link;
	private JTextArea ta_content;
	private ButtonGroup group;
	private Panel2CaramelWriter panel_writer;
	private JTextField tv_phone_num;
	private JTextField tv_address;
	private JTextField textField;
	private JCheckBox chckbxExist;
	private JCheckBox chSpeed;
	private Page2CaramelTag page2CaramelTag;

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

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		ImageIcon img = new ImageIcon("camel_icon.png");
		this.setIconImage(img.getImage());

		setTitle("Caramel Writer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 680);

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

		JRadioButton radio_restaurant = new JRadioButton(CaramelWriterProperties.CLASSIFICATION_RESTAURANT);
		panel_1.add(radio_restaurant);

		JRadioButton radio_normal = new JRadioButton(CaramelWriterProperties.CLASSIFICATION_NORMAL);
		panel_1.add(radio_normal);

		JRadioButton radio_hospital = new JRadioButton("병원(성)");
		panel_1.add(radio_hospital);

		group.add(radio_restaurant);
		group.add(radio_normal);
		group.add(radio_hospital);

		JRadioButton radio_kp = new JRadioButton("카프");
		panel_1.add(radio_kp);

		JRadioButton radio_study = new JRadioButton("학원");
		panel_1.add(radio_study);

		JRadioButton radio_hospital2 = new JRadioButton("병원(일)");
		panel_1.add(radio_hospital2);

		group.add(radio_kp);
		group.add(radio_study);
		group.add(radio_hospital2);

		JPanel panel = new JPanel();
		panel_input.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 195, 0 };
		gbl_panel.rowHeights = new int[] { 353, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
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
		gbl_panel_3.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_3.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "\uC0C1\uD638\uBA85", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.insets = new Insets(0, 0, 5, 0);
		gbc_panel_8.gridx = 0;
		gbc_panel_8.gridy = 0;
		panel_3.add(panel_8, gbc_panel_8);
		panel_8.setLayout(new GridLayout(1, 0, 0, 0));

		tv_businessName = new JTextField();
		panel_8.add(tv_businessName);
		tv_businessName.setColumns(10);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(null, "\uD0A4\uC6CC\uB4DC", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.insets = new Insets(0, 0, 5, 0);
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 0;
		gbc_panel_9.gridy = 1;
		panel_3.add(panel_9, gbc_panel_9);
		panel_9.setLayout(new GridLayout(1, 0, 0, 0));

		tv_keyword = new JTextField();
		panel_9.add(tv_keyword);
		tv_keyword.setColumns(10);

		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(null, "\uC138\uBD80\uD0A4\uC6CC\uB4DC", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.insets = new Insets(0, 0, 5, 0);
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.gridx = 0;
		gbc_panel_12.gridy = 2;
		panel_3.add(panel_12, gbc_panel_12);
		panel_12.setLayout(new GridLayout(0, 1, 0, 0));

		tv_detail_keyword = new JTextField();
		tv_detail_keyword.setColumns(10);
		panel_12.add(tv_detail_keyword);

		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(null, "\uC8FC\uC18C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.insets = new Insets(0, 0, 5, 0);
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 0;
		gbc_panel_11.gridy = 3;
		panel_3.add(panel_11, gbc_panel_11);
		panel_11.setLayout(new GridLayout(2, 0, 0, 0));

		tv_address = new JTextField();
		tv_address.setToolTipText("주소 1");
		panel_11.add(tv_address);
		tv_address.setColumns(10);

		tv_address2 = new JTextField();
		tv_address2.setToolTipText("주소 2");
		panel_11.add(tv_address2);
		tv_address2.setColumns(10);

		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(null, "\uC804\uD654\uBC88\uD638", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.insets = new Insets(0, 0, 5, 0);
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.gridx = 0;
		gbc_panel_10.gridy = 4;
		panel_3.add(panel_10, gbc_panel_10);
		panel_10.setLayout(new GridLayout(2, 0, 0, 0));

		tv_phone_num = new JTextField();
		panel_10.add(tv_phone_num);
		tv_phone_num.setColumns(10);

		tv_phone_num2 = new JTextField();
		tv_phone_num2.setColumns(10);
		panel_10.add(tv_phone_num2);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "\uB9C1\uD06C\uC8FC\uC18C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.insets = new Insets(0, 0, 5, 0);
		gbc_panel_6.anchor = GridBagConstraints.WEST;
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 0;
		gbc_panel_6.gridy = 5;
		panel_3.add(panel_6, gbc_panel_6);
		panel_6.setLayout(new GridLayout(2, 0, 0, 0));

		tv_link = new JTextField();
		panel_6.add(tv_link);
		tv_link.setColumns(10);

		tv_link2 = new JTextField();
		tv_link2.setColumns(10);
		panel_6.add(tv_link2);

		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 6;
		panel_3.add(panel_4, gbc_panel_4);

		JLabel label_3 = new JLabel("대가성문구");
		panel_4.add(label_3);

		chckbxExist = new JCheckBox("");
		panel_4.add(chckbxExist);

		JLabel label_4 = new JLabel("스피드본문");
		panel_4.add(label_4);

		chSpeed = new JCheckBox("");
		panel_4.add(chSpeed);

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

		JPanel panel_7 = new JPanel();
		panel_2.add(panel_7);

		JLabel lblNewLabel_2 = new JLabel("글자 수 : ");
		panel_7.add(lblNewLabel_2);

		textField = new JTextField();
		panel_7.add(textField);
		textField.setText("0");
		textField.setEditable(false);
		textField.setColumns(10);

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

		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(0, 0, 10, 0));
		menuBar.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		contentPane.add(menuBar, BorderLayout.NORTH);

		JMenu mnInfo = new JMenu("OPEN");
		mnInfo.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		menuBar.add(mnInfo);

		JMenuItem mntmTagcreate = new JMenuItem("태그만들기");
		mntmTagcreate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (page2CaramelTag.isShowing()) {
					page2CaramelTag.dispose();
					page2CaramelTag = new Page2CaramelTag();
				}
				page2CaramelTag.show();
			}
		});

		page2CaramelTag = new Page2CaramelTag();

		mnInfo.add(mntmTagcreate);

		JSeparator separator = new JSeparator();
		mnInfo.add(separator);

		JMenu mnInfo_1 = new JMenu("INFO");
		mnInfo_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		menuBar.add(mnInfo_1);

		JMenuItem menuItem_1 = new JMenuItem("Help");
		mnInfo_1.add(menuItem_1);

		panel_writer = Panel2CaramelWriter.getInstance();

	}

	private String special_characters[] = { "[.]", "<span>", "<br >", "</p>", "<p>", "\r\n", "[?]", //
			"!", "\r", "\n", "%", "'", ",", "|", "ㅂ", "ㅈ", "ㄷ", "ㄱ", "ㅅ", "ㅛ", "ㅕ", "ㅑ", "ㅐ", //
			"ㅔ", "ㅁ", "ㄴ", "ㅇ", "ㄹ", "ㅎ", "ㅗ", "ㅓ", "ㅏ", "ㅣ", "ㅋ", "ㅌ", "ㅊ", "ㅍ", "ㅠ", "ㅜ", "ㅡ", //
			"ㅃ", "ㅉ", "ㄸ", "ㄲ", "ㅆ", "ㅒ", "ㅖ", "[+]", "[-]", "[_]", "[/]", "\\^", "\\[", "\\]", "\\{", "\\}"//
	};

	private JTextField tv_address2;
	private JTextField tv_link2;
	private JTextField tv_detail_keyword;
	private JTextField tv_phone_num2;

	private void count_text() {
		try {
			new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					String content = ta_content.getText().toString();

					content = content.replaceAll("\\p{Z}", "");

					content = content.replaceAll("(^\\p{Z}+|\\p{Z}+$)", "");
					for (String str : special_characters) {
						content = content.replaceAll(str, "");
					}

					content = content.trim();
					int cnt = 0;
					BreakIterator it = BreakIterator.getCharacterInstance();
					it.setText(content);

					while (it.next() != BreakIterator.DONE) {
						cnt++;
					}

					textField.setText("" + cnt);
				}
			}).start();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private void clear() {
		tv_businessName.setText("");
		tv_keyword.setText("");
		tv_link.setText("");
		ta_content.setText("");
		group.clearSelection();
		tv_address2.setText("");
		tv_link2.setText("");
		tv_detail_keyword.setText("");
		tv_phone_num2.setText("");

		tv_phone_num.setText("");
		tv_address.setText("");

		chckbxExist.setSelected(false);
		chSpeed.setSelected(false);
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

		model.setAddress(tv_address.getText().toString().trim());
		model.setAddress2(tv_address2.getText().toString().trim());
		model.setBusinessName(tv_businessName.getText().toString().trim());
		model.setLink(tv_link.getText().toString().trim());
		model.setLink2(tv_link2.getText().toString().trim());
		model.setIsph(chckbxExist.isSelected());
		model.setSpeed(chSpeed.isSelected());
		model.setKeyword(tv_keyword.getText().toString().trim());
		model.setDetail_keyword(tv_detail_keyword.getText().toString().trim());
		model.setPhone_num(tv_phone_num.getText().toString().trim());
		model.setPhone_num2(tv_phone_num2.getText().toString().trim());

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
