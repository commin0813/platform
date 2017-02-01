package page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.StringTokenizer;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import javax.swing.border.TitledBorder;

import panel.Panel2CaramelWriter;

import javax.swing.JButton;
import javax.swing.JScrollBar;

public class Page2CaramelTag extends JFrame {
	private JPanel contentPane;
	private JTextArea ta_tag_before;
	private JTextArea ta_tag_after;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page2CaramelTag frame = new Page2CaramelTag();
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
	public Page2CaramelTag() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 505, 299);
		setResizable(false);
		setTitle("Caramel Tag 만들기");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\uBCC0\uACBD\uD560 \uD0DC\uADF8\uB4E4\uC744 \uC785\uB825\uD558\uC138\uC694(ex \uB2E8\uC5B41, \uB2E8\uC5B42  ....)", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		ta_tag_before = new JTextArea();
		ta_tag_before.setText("");
		ta_tag_before.setLineWrap(true);
		ta_tag_before.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if(ta_tag_before.getText().toString().equals("")){
					return;
				}
				createTag();
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
		panel.add(ta_tag_before);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\uBCC0\uACBD \uD6C4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		ta_tag_after = new JTextArea();
		ta_tag_after.setText("");
		ta_tag_after.setLineWrap(true);
		ta_tag_after.setEditable(false);
		panel_1.add(ta_tag_after, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("복사");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				String copyString = ta_tag_after.getText().toString();
				if (copyString != null) {
					StringSelection contents = new StringSelection(copyString);
					clipboard.setContents(contents, null);
				}
			}
		});
		
		panel_1.add(btnNewButton, BorderLayout.SOUTH);
	}
	
	private void createTag(){
		String tag_text = ta_tag_before.getText().toString();
		
		StringTokenizer st = new StringTokenizer(tag_text, ",");
		
		StringBuffer sb = new StringBuffer();
		
		while(st.hasMoreTokens()){
			sb.append("#"+st.nextToken()+" ,");
		}
		ta_tag_after.setText(sb.toString());
	}

}
