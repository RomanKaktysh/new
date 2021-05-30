import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Grafic {

	public static void main(String[] args) {

		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Window");
		frame.setAlwaysOnTop(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = frame.getContentPane();
		container.setLayout(new CardLayout());
		JPanel panel = new JPanel();
		JTextField textField = new JTextField(20);
		JButton button = new JButton("Click me!");
		JButton button_2 = new JButton("Click me!");
		JButton button_3 = new JButton("Click me!");
		JButton button_4 = new JButton("Click me!");
		ImageIcon icon = new ImageIcon(Grafic.class.getClassLoader().getResource("Koala.jpg"));
		JLabel label = new JLabel(icon);
		panel.add(label);
		frame.add(panel);

//		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
//		// panel.add(textField);
//		panel.add(button);
//		panel.add(button_2);
//		panel.add(button_3);
//		panel.add(button_4);
//		container.add(panel, "panel1");
//		JPanel panel2 = new JPanel();
//		JButton button1 = new JButton("Кнопка");
//		panel2.add(button1);
//		container.add(panel2, "panel2");
//		button.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				CardLayout layout = (CardLayout) container.getLayout();
//				layout.show(container, "panel2");
//
//			}
//		});
//
//		button1.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				CardLayout layout = (CardLayout) container.getLayout();
//				layout.show(container, "panel1");
//
//			}
//		});

		frame.setVisible(true);

	}

}
