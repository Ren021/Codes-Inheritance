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
import javax.swing.SwingConstants;

public class WorksPage extends Portfolio {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public WorksPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 639);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Button for going back to the main page
		JButton MyWorksBackButtton = new JButton("Back");
		MyWorksBackButtton.setForeground(Color.LIGHT_GRAY);
		MyWorksBackButtton.setBackground(Color.BLACK);
		MyWorksBackButtton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MyWorksBackButtton.setBounds(628, 504, 164, 55);
		contentPane.add(MyWorksBackButtton);
		
		// Label for displaying the heading "My Works"
		JLabel MyWorksTextLabel = new JLabel("My Works");
		MyWorksTextLabel.setHorizontalAlignment(SwingConstants.CENTER);
		MyWorksTextLabel.setForeground(Color.WHITE);
		MyWorksTextLabel.setFont(new Font("Agency FB", Font.PLAIN, 50));
		MyWorksTextLabel.setBounds(308, 50, 225, 73);
		contentPane.add(MyWorksTextLabel);
		
		// Label for displaying the first work image
		JLabel MyWorks1PicLabel = new JLabel("");
		MyWorks1PicLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\346167413_3418813378437193_8873800403626654544_n (1).png"));
		MyWorks1PicLabel.setBounds(25, 157, 250, 180);
		contentPane.add(MyWorks1PicLabel);
		
		// Label for displaying the second work image
		JLabel MyWorks2PicLabel = new JLabel("");
		MyWorks2PicLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\346151959_550643250617416_9158106481836893717_n (1).png"));
		MyWorks2PicLabel.setBounds(296, 145, 250, 192);
		contentPane.add(MyWorks2PicLabel);
		
		// Label for displaying the third work image
		JLabel MyWorks3PicLabel = new JLabel("");
		MyWorks3PicLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\346163239_1388079775373484_2514388509550735881_n (1).png"));
		MyWorks3PicLabel.setBounds(568, 167, 250, 156);
		contentPane.add(MyWorks3PicLabel);
		
		// Label for displaying the fourth work image
		JLabel MyWorks4PicLabel = new JLabel("");
		MyWorks4PicLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\346148763_1668975086861677_8433099367459555392_n (1).png"));
		MyWorks4PicLabel.setBounds(25, 355, 250, 138);
		contentPane.add(MyWorks4PicLabel);
		
		// Label for displaying the fifth work image
		JLabel MyWorks5PicLabel = new JLabel("");
		MyWorks5PicLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\346158122_202992549317054_4182318952973213687_n (1).png"));
		MyWorks5PicLabel.setBounds(296, 333, 250, 180);
		contentPane.add(MyWorks5PicLabel);
		
		// Label for displaying the sixth work image
		JLabel MyWorks6PicLabel = new JLabel("");
		MyWorks6PicLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\346162328_788028812637693_9059216214846547099_n (1).png"));
		MyWorks6PicLabel.setBounds(568, 333, 250, 180);
		contentPane.add(MyWorks6PicLabel);
		
		// Label for decorative design in the upper part of the frame
		JLabel MyWorksDesignLabel = new JLabel("");
		MyWorksDesignLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\513c1e831d4ea3ee341799c05c18131f-removebg-preview (1).png"));
		MyWorksDesignLabel.setBounds(675, -15, 164, 227);
		contentPane.add(MyWorksDesignLabel);
		// ActionListener for the "Back" button
		MyWorksBackButtton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Create an instance of the MainPage class
				MainPage jf2 = new MainPage();
				jf2.show(); // Show the main page
				dispose(); // Close the current frame
			}
				
			
		});
	}

}
