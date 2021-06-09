import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CoinTossScreen extends JFrame {

	private JPanel contentPane;
	private JButton btnTossCoin;
	private JComboBox cbCoinSelect;
	private JLabel lblCoinType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinTossScreen frame = new CoinTossScreen();
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
	public CoinTossScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		cbCoinSelect = new JComboBox();
		cbCoinSelect.setModel(new DefaultComboBoxModel(new String[] {"Dollarcoin", "Bitcoin", "Eurocoin\t"}));
		
		JLabel lblCoinHead = new JLabel("");
		lblCoinHead.setIcon(new ImageIcon(CoinTossScreen.class.getResource("/cointoss/image/coinimage128.png")));
		
		btnTossCoin = new JButton("toss coin");
		btnTossCoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   Coin coin = new Coin();
			 if (cbCoinSelect.getSelectedItem().toString().equals("Dollarcoin")) {
				if (coin.getStatus().equals("heads")){
					lblCoinHead.setIcon(new ImageIcon(CoinTossScreen.class.getResource("/cointoss/image/coinimage128.png")));
			    }
				if (coin.getStatus().equals("tails")) {
					lblCoinHead.setIcon(new ImageIcon(CoinTossScreen.class.getResource("/cointoss/image/coin-dollar128.png")));
				}
			 }
			 if (cbCoinSelect.getSelectedItem().toString().equals("Bitcoin")) {
					if (coin.getStatus().equals("heads")){
						lblCoinHead.setIcon(new ImageIcon(CoinTossScreen.class.getResource("/cointoss/image/bitcoin-128.png")));
				    }
					if (coin.getStatus().equals("tails")) {
						lblCoinHead.setIcon(new ImageIcon(CoinTossScreen.class.getResource("/cointoss/image/bit-coin-128.png")));
					}
			 }
			 if (cbCoinSelect.getSelectedItem().toString().equals("Eurocoin")) {
					if (coin.getStatus().equals("heads")){
						lblCoinHead.setIcon(new ImageIcon(CoinTossScreen.class.getResource("/cointoss/image/coineuro-128.png")));
				    }
					if (coin.getStatus().equals("tails")) {
						lblCoinHead.setIcon(new ImageIcon(CoinTossScreen.class.getResource("/cointoss/image/coin-euro-128.png")));
					}
			 }
			}
		});
		
		lblCoinType = new JLabel("COIN TYPE:");
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(134, Short.MAX_VALUE)
					.addComponent(lblCoinHead)
					.addGap(132))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(343, Short.MAX_VALUE)
					.addComponent(btnTossCoin)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(69)
					.addComponent(lblCoinType, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbCoinSelect, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(200, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCoinHead)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbCoinSelect, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCoinType))
					.addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
					.addComponent(btnTossCoin)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
