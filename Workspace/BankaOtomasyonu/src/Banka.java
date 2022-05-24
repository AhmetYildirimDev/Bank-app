import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import static javax.swing.JOptionPane.showMessageDialog;
public class Banka extends JFrame {

	private JPanel contentPane;
	private JTextField adi;
	private JTextField soyadi;
	private JTextField email;
	private JTextField tel;
	
	
	//Rastgele sayi üretme sýnýfýndan bir nesne üretelim
	Random rand = new Random();
	
	//rastgele bir ID üretelim
	int randomID = rand.nextInt(10);
	
	//rastgele musteri numarasi üretelim
	int randomMusteriNumarasi = rand.nextInt(10000);
	
	//rastgele kart numarasý üretelim
	int randomKartNumarasi = rand.nextInt(100000);
	
	//rastgele iban numarasi üretelim
	int randomIBAN = rand.nextInt(1000000);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Banka frame = new Banka();
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
	Musteri musteri;
	public Banka() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Müþteri Bilgileri");
		btnNewButton.setBounds(24, 176, 115, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Hesap Bilgileri");
		btnNewButton_1.setBounds(149, 176, 118, 32);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Kredi Bilgileri");
		btnNewButton_2.setBounds(278, 176, 118, 32);
		contentPane.add(btnNewButton_2);
		
		adi = new JTextField();
		adi.setBounds(149, 14, 118, 20);
		contentPane.add(adi);
		adi.setColumns(10);
		
		soyadi = new JTextField();
		soyadi.setBounds(149, 42, 118, 20);
		contentPane.add(soyadi);
		soyadi.setColumns(10);
		
		email = new JTextField();
		email.setBounds(149, 73, 118, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		tel = new JTextField();
		tel.setBounds(149, 104, 115, 20);
		contentPane.add(tel);
		tel.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Müþteri Ekle");
		btnNewButton_3.setBounds(149, 135, 118, 30);
		contentPane.add(btnNewButton_3);
		
		JLabel adiLabel = new JLabel("Adi:");
		adiLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		adiLabel.setBounds(24, 14, 71, 20);
		contentPane.add(adiLabel);
	
		JLabel soyadiLabel = new JLabel("Soyadi:");
		soyadiLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		soyadiLabel.setBounds(24, 45, 64, 17);
		contentPane.add(soyadiLabel);
		
		JLabel mailAdresiLabel = new JLabel("Mail Adresi:");
		mailAdresiLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mailAdresiLabel.setBounds(24, 76, 71, 14);
		contentPane.add(mailAdresiLabel);
		
		JLabel telLabel = new JLabel("Tel No:");
		telLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		telLabel.setBounds(24, 110, 46, 14);
		contentPane.add(telLabel);
		
		JLabel bosLabel1 = new JLabel("");
		bosLabel1.setBounds(149, 235, 215, 20);
		contentPane.add(bosLabel1);
		
		JLabel bosLabel2 = new JLabel("");
		bosLabel2.setBounds(149, 266, 215, 14);
		contentPane.add(bosLabel2);
		
		JLabel bosLabel3 = new JLabel("");
		bosLabel3.setBounds(149, 291, 215, 14);
		contentPane.add(bosLabel3);
		
		JLabel bosLabel4 = new JLabel("");
		bosLabel4.setBounds(149, 316, 201, 20);
		contentPane.add(bosLabel4);
		
		JLabel lblNewLabel = new JLabel("Ahmet");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(454, 291, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Yýldýrým");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(501, 291, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("20360859058");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(454, 322, 107, 14);
		contentPane.add(lblNewLabel_2);
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(adi.getText().isEmpty() && soyadi.getText().isEmpty() && email.getText().isEmpty() && tel.getText().isEmpty()){
				showMessageDialog(null, "Lutfen boþ alanlarý doldurun");
			}else {
				musteri= new Musteri(adi.getText(),soyadi.getText(),email.getText(),Integer.parseInt(tel.getText()));
				musteri.setMusteriNumarasi(randomMusteriNumarasi);
				musteri.HesapEkle("Vadesiz", 300,randomIBAN);
				musteri.KrediKartiEkle(500, 250,randomKartNumarasi);
			}
				
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(musteri != null) {
					bosLabel1.setText("Adi:"+" "+musteri.ad);
					bosLabel2.setText("Soyadi:"+" "+musteri.soyad);
					bosLabel3.setText("Email:"+" "+musteri.email);
					bosLabel4.setText("Tel:"+" "+String.valueOf(musteri.telefonNumarasi));
				}else {
					showMessageDialog(null, "Lutfen kullanici ekleyin");
				}
			
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(musteri != null) {
					bosLabel2.setText("Bakiye:"+" "+musteri.getHesaplar().get(0).bakiye);
					bosLabel1.setText("IBAN:"+" "+musteri.getHesaplar().get(0).iban);
					bosLabel3.setText("");
					bosLabel4.setText("");
				}else {
					showMessageDialog(null, "Lutfen kullanici ekleyin");
				}
			
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(musteri != null) {
					bosLabel2.setText("Borç:"+" "+musteri.getKrediKartlari().get(0).guncelBorc);
					bosLabel1.setText("Kart Numarasi:"+" "+musteri.getKrediKartlari().get(0).kartNumarasi);
					bosLabel3.setText("Limit:"+" "+musteri.getKrediKartlari().get(0).limit);
					bosLabel4.setText("Kalan Limit:"+" "+musteri.getKrediKartlari().get(0).kullanýlabilirLimit);
				}else {
					showMessageDialog(null, "Lutfen kullanici ekleyin");
				}
			}
		});
	}
}
