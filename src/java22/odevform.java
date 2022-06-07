package java22;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class odevform extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					odevform frame = new odevform();
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
	public odevform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("");
		lbl.setEnabled(false);
		Image mavii = new ImageIcon(this.getClass().getResource("/mavi.png")).getImage();
		Image kirmizii = new ImageIcon(this.getClass().getResource("/kirmizi.png")).getImage();
		Image yesill = new ImageIcon(this.getClass().getResource("/yesil.png")).getImage();
		lbl.setIcon(new ImageIcon(mavii));
		lbl.setBounds(171, 125, 80, 88);
		contentPane.add(lbl);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setVerticalAlignment(SwingConstants.TOP);
		Image but1 = new ImageIcon(this.getClass().getResource("/bmavi.png")).getImage();
		Image yesil2 = new ImageIcon(this.getClass().getResource("/byesil.png")).getImage();
		lbl2.setBounds(110, 36, 314, 87);
		lbl2.setIcon(new ImageIcon(but1));
		contentPane.add(lbl2);
		
		JLabel lblNewLabel = new JLabel("Etkile\u015Fimli butona eri\u015Fmek i\u00E7in alttaki butona t\u0131klay\u0131n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(62, 11, 314, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lbl3 = new JLabel("Mouse ile buton \u00FCzerinde t\u0131klama gezdirme yaparak eri\u015Febilirsiniz.");
		lbl3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl3.setVisible(false);
		lbl3.setBounds(33, 224, 401, 26);
		contentPane.add(lbl3);
		
		lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl.setIcon(new ImageIcon(kirmizii));
				}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl.setIcon(new ImageIcon(mavii));
				}
			@Override
			public void mousePressed(MouseEvent e) {
				lbl.setIcon(new ImageIcon(yesill));
				}
			@Override
			public void mouseReleased(MouseEvent e) {
				lbl.setIcon(new ImageIcon(kirmizii));
				}
		}); 
		
		
		lbl2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl2.setIcon(new ImageIcon(yesil2));
				lbl.setEnabled(true);
				lbl3.setVisible(true);
				
			}
		});
	}

}
