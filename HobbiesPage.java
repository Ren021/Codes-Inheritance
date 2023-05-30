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

public class HobbiesPage extends Portfolio {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public HobbiesPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 639);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Button for going back to the main page
		JButton HobbiesBackButton = new JButton("Back");
		HobbiesBackButton.setForeground(Color.LIGHT_GRAY);
		HobbiesBackButton.setBackground(Color.BLACK);
		HobbiesBackButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		HobbiesBackButton.setBounds(657, 486, 155, 52);
		contentPane.add(HobbiesBackButton);
		
		// Label for displaying the heading "My Hobbies"
		JLabel MyHobbiesTextLabel = new JLabel("My Hobbies");
		MyHobbiesTextLabel.setHorizontalAlignment(SwingConstants.CENTER);
		MyHobbiesTextLabel.setForeground(Color.WHITE);
		MyHobbiesTextLabel.setFont(new Font("Agency FB", Font.PLAIN, 40));
		MyHobbiesTextLabel.setBounds(295, 42, 246, 79);
		contentPane.add(MyHobbiesTextLabel);
		
		// Label for displaying the Basketball image
		JLabel BasketballPicLabel = new JLabel("");
		BasketballPicLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\343774157_983296506007412_3335698624479037120_n (1).jpg"));
		BasketballPicLabel.setBounds(316, 255, 200, 250);
		contentPane.add(BasketballPicLabel);
		
		// Label for displaying the text "Basketball"
		JLabel BasketballTextLabel = new JLabel("Basketball");
		BasketballTextLabel.setForeground(Color.WHITE);
		BasketballTextLabel.setFont(new Font("Agency FB", Font.PLAIN, 30));
		BasketballTextLabel.setBounds(369, 179, 161, 66);
		contentPane.add(BasketballTextLabel);
		
		// Label for decorative design for Basketball section
		JLabel BasketballDesignLabel = new JLabel("");
		BasketballDesignLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\images__1_-removebg-preview (1).png"));
		BasketballDesignLabel.setBounds(282, 183, 259, 79);
		contentPane.add(BasketballDesignLabel);
		
		// Label for displaying the Video Games image
		JLabel VideoGamesPicLabel = new JLabel("");
		VideoGamesPicLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\OneDrive\\Pictures\\download (1).jpg"));
		VideoGamesPicLabel.setBounds(10, 172, 275, 203);
		contentPane.add(VideoGamesPicLabel);
		
		// Label for displaying the text "Playing video games"
		JLabel VideoGamesTextLabel = new JLabel("Playing video games");
		VideoGamesTextLabel.setFont(new Font("Agency FB", Font.PLAIN, 28));
		VideoGamesTextLabel.setForeground(Color.WHITE);
		VideoGamesTextLabel.setBounds(62, 74, 229, 106);
		contentPane.add(VideoGamesTextLabel);
		
		// Label for decorative design for Video Games section
		JLabel VideoGamesDesignLabel = new JLabel("");
		VideoGamesDesignLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\images__1_-removebg-preview (2).png"));
		VideoGamesDesignLabel.setBounds(10, 82, 317, 106);
		contentPane.add(VideoGamesDesignLabel);
		
		// Label for displaying the Dance image
		JLabel DancePicLabel = new JLabel("New label");
		DancePicLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\OneDrive\\Pictures\\download (2).jpg"));
		DancePicLabel.setBounds(547, 183, 275, 203);
		contentPane.add(DancePicLabel);
		
		// Label for displaying the text "Dancing"
		JLabel DancingTextLabel = new JLabel("Dancing");
		DancingTextLabel.setFont(new Font("Agency FB", Font.PLAIN, 30));
		DancingTextLabel.setForeground(Color.WHITE);
		DancingTextLabel.setBounds(645, 93, 167, 66);
		contentPane.add(DancingTextLabel);
		
		// Label for decorative design for Dancing section
		JLabel DancingDesignLabel = new JLabel("");
		DancingDesignLabel.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\images__1_-removebg-preview (2).png"));
		DancingDesignLabel.setBounds(552, 94, 294, 79);
		contentPane.add(DancingDesignLabel);
		
		// Label for decorative design in the lower part of the frame
		JLabel MyHobbiesDesign1Label = new JLabel("");
		MyHobbiesDesign1Label.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\214-2145041_corner-designs-cliparts-simple-decorative-line-border-removebg-preview (1) (1).png"));
		MyHobbiesDesign1Label.setBounds(10, 380, 200, 177);
		contentPane.add(MyHobbiesDesign1Label);
		
		// Label for decorative design in the upper part of the frame
		JLabel MyHobbiesDesign2Label = new JLabel("");
		MyHobbiesDesign2Label.setIcon(new ImageIcon("C:\\Users\\isaia\\Downloads\\Line-clip-art-graphics-free-clipart-images-5-removebg-preview (2) (4).png"));
		MyHobbiesDesign2Label.setBounds(-23, 10, 859, 62);
		contentPane.add(MyHobbiesDesign2Label);
		// ActionListener for the "Back" button
		HobbiesBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Create an instance of the MainPage class
				MainPage jf2 = new MainPage();
				jf2.show(); // Show the main page
				dispose(); // Close the current frame
			}

		});
	}

}
