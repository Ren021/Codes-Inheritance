import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class SkillsPage extends Portfolio {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public SkillsPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 639);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Button for going back to the main page
		JButton SkillsPageBackButtom = new JButton("Back");
		SkillsPageBackButtom.setForeground(Color.LIGHT_GRAY);
		SkillsPageBackButtom.setBackground(Color.BLACK);
		SkillsPageBackButtom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		SkillsPageBackButtom.setBounds(651, 481, 143, 58);
		contentPane.add(SkillsPageBackButtom);
		
		// Label for displaying the heading "My Skills"
		JLabel MySkillTextLabel = new JLabel("My Skills");
		MySkillTextLabel.setForeground(Color.WHITE);
		MySkillTextLabel.setFont(new Font("Agency FB", Font.PLAIN, 40));
		MySkillTextLabel.setBounds(51, 52, 220, 73);
		contentPane.add(MySkillTextLabel);
		
		// Label for decorative design
		JLabel Design1Label = new JLabel("");
		Design1Label.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\Line-clip-art-graphics-free-clipart-images-5-removebg-preview (2) (4).png"));
		Design1Label.setBounds(-20, 10, 857, 73);
		contentPane.add(Design1Label);
		
		// Label for displaying the HTML logo/image
		JLabel HtmlPicLabel = new JLabel("");
		HtmlPicLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\insert-image-html (1).jpg"));
		HtmlPicLabel.setBounds(83, 192, 250, 241);
		contentPane.add(HtmlPicLabel);
		
		// Label for displaying the Java logo/image
		JLabel JavaPicLabel = new JLabel("");
		JavaPicLabel.setForeground(Color.WHITE);
		JavaPicLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\code-coder-coding-270348 (2).jpg"));
		JavaPicLabel.setBounds(489, 218, 275, 198);
		contentPane.add(JavaPicLabel);
		
		// Label for displaying the text "HTML"
		JLabel HtmlTextLabel = new JLabel("HTML");
		HtmlTextLabel.setForeground(Color.WHITE);
		HtmlTextLabel.setFont(new Font("Agency FB", Font.PLAIN, 30));
		HtmlTextLabel.setBounds(186, 135, 102, 51);
		contentPane.add(HtmlTextLabel);
		
		// Label for displaying the text "JAVA"
		JLabel JavaTextLabel = new JLabel("JAVA");
		JavaTextLabel.setForeground(Color.WHITE);
		JavaTextLabel.setFont(new Font("Agency FB", Font.PLAIN, 30));
		JavaTextLabel.setBounds(598, 110, 143, 110);
		contentPane.add(JavaTextLabel);
		
		// Label for decorative design for Java section
		JLabel JavaDesignLabel = new JLabel("");
		JavaDesignLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\images__1_-removebg-preview (1).png"));
		JavaDesignLabel.setBounds(490, 145, 304, 61);
		contentPane.add(JavaDesignLabel);
		
		// Label for decorative design for HTML section
		JLabel HtmlDesignLabel = new JLabel("");
		HtmlDesignLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\images__1_-removebg-preview (1).png"));
		HtmlDesignLabel.setBounds(73, 124, 283, 96);
		contentPane.add(HtmlDesignLabel);
		// ActionListener for the "Back" button
		SkillsPageBackButtom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Create an instance of the MainPage class
				MainPage jf2 = new MainPage();
				jf2.show(); // Show the main page
				dispose(); // Close the current frame
			}

		});
	}

}
