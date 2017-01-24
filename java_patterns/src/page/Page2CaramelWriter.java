package page;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import panel.Panel2CaramelWriter;

public class Page2CaramelWriter extends JFrame {

	private JPanel contentPane;
	private JTextField tv_businessName;
	private JTextField tv_keyword;
	private JTextField tv_detail_keyword;
	private JTextArea ta_content;
	private ButtonGroup group;
	private Panel2CaramelWriter panel_writer;
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
		
		JRadioButton radio_rest = new JRadioButton("식당");
		panel_1.add(radio_rest);
		
		JRadioButton radio_food = new JRadioButton("음식");
		panel_1.add(radio_food);
		
		JRadioButton radio_embul = new JRadioButton("병원");
		panel_1.add(radio_embul);
		
		JRadioButton radio_show = new JRadioButton("전시회");
		panel_1.add(radio_show);
		
		group.add(radio_rest);
		group.add(radio_food);
		group.add(radio_embul);
		group.add(radio_show);
		
		JPanel panel = new JPanel();
		panel_input.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{195, 0};
		gbl_panel.rowHeights = new int[]{353, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
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
		gbl_panel_3.columnWidths = new int[]{0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		tv_detail_keyword.setColumns(10);
		GridBagConstraints gbc_tv_detail_keyword = new GridBagConstraints();
		gbc_tv_detail_keyword.fill = GridBagConstraints.HORIZONTAL;
		gbc_tv_detail_keyword.gridx = 0;
		gbc_tv_detail_keyword.gridy = 5;
		panel_3.add(tv_detail_keyword, gbc_tv_detail_keyword);
		
		JPanel panel_2 = new JPanel();
		panel_input.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("생성");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				create();
			}
		});
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		panel_2.add(btnNewButton);
		
		JPanel panel_content = new JPanel();
		contentPane.add(panel_content, BorderLayout.CENTER);
		panel_content.setLayout(new BorderLayout(0, 0));
		
		ta_content = new JTextArea("",5,10);
		JScrollPane jp = new JScrollPane(ta_content);
		
		panel_content.add(jp);
		
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


	private void create(){
		panel_writer.create(group,tv_businessName,tv_keyword,tv_detail_keyword, ta_content);
	}
	
	public interface WriterIf{
		public void create(ButtonGroup radio_group,JTextField tv_businessName,JTextField tv_keyword,JTextField tv_detail_keyword,JTextArea ta_content);
	}
}
