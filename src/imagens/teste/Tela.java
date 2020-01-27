package imagens.teste;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Tela extends JDialog {
	private JTextField txtFundoPrincipal;
	private JTextField txtImagem1;
	private JTextField txtPosicaoXImagem1;
	private JTextField txtPosicaoYImagem1;
	private JTextField txtLarguraImagem1;
	private JTextField txtAlturaImagem1;
	private JTextField txtImagem2;
	private JTextField txtAlturaImagem2;
	private JTextField txtLarguraImagem2;
	private JTextField txtPosicaoYImagem2;
	private JTextField txtPosicaoXImagem2;
	private JTextField txtPosicaoXImagem3;
	private JTextField txtImagem3;
	private JTextField txtPosicaoYImagem3;
	private JTextField txtLarguraImagem3;
	private JTextField txtAlturaImagem3;
	private JTextField txtTexto1;
	private JTextField txtTamanhoTexto1;
	private JTextField txtTexto2;
	private JTextField txtTamanhoTexto2;
	private JTextField txtTexto3;
	private JTextField txtTamanhoTexto3;
	private JTextField txtPosicaoXTexto1;
	private JTextField txtPosicaoYTexto1;
	private JTextField txtPosicaoXTexto2;
	private JTextField txtPosicaoYTexto2;
	private JTextField txtPosicaoXTexto3;
	private JTextField txtPosicaoYTexto3;
	
	private JComboBox cmbFonteTexto1;
	private JComboBox cmbFonteTexto2;
	private JComboBox cmbFonteTexto3;
	
	private JComboBox cmbCorTexto1;
	private JComboBox cmbCorTexto2;
	private JComboBox cmbCorTexto3;
	
	private JComboBox cmbTipoTexto1;
	private JComboBox cmbTipoTexto2;
	private JComboBox cmbTipoTexto3;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Tela dialog = new Tela();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Tela() {
		setTitle("Teste");
		setBounds(100, 100, 572, 608);
		getContentPane().setLayout(null);
		
		setModal(true);
		setResizable(false);
		setLocationRelativeTo(null);
		
		JLabel lblFundoPrincipal = new JLabel("Principal");
		lblFundoPrincipal.setBounds(10, 11, 68, 14);
		getContentPane().add(lblFundoPrincipal);
		
		txtFundoPrincipal = new JTextField();
		txtFundoPrincipal.setBounds(75, 8, 421, 20);
		getContentPane().add(txtFundoPrincipal);
		txtFundoPrincipal.setColumns(10);
		
		JButton btnImagemFundoPrincipal = new JButton("Img");
		btnImagemFundoPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obterArquivoImagem(txtFundoPrincipal);
			}
		});
		btnImagemFundoPrincipal.setBounds(502, 7, 55, 23);
		getContentPane().add(btnImagemFundoPrincipal);
		
		JLabel lblImagem = new JLabel("Imagem 1");
		lblImagem.setBounds(10, 48, 68, 14);
		getContentPane().add(lblImagem);
		
		txtImagem1 = new JTextField();
		txtImagem1.setColumns(10);
		txtImagem1.setBounds(75, 45, 421, 20);
		getContentPane().add(txtImagem1);
		
		JButton btnImagem1 = new JButton("Img");
		btnImagem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obterArquivoImagem(txtImagem1);
			}
		});
		btnImagem1.setBounds(502, 44, 55, 23);
		getContentPane().add(btnImagem1);
		
		JLabel lblX = new JLabel("Posi\u00E7\u00E3o X");
		lblX.setBounds(10, 76, 63, 16);
		getContentPane().add(lblX);
		
		txtPosicaoXImagem1 = new JTextField();
		txtPosicaoXImagem1.setBounds(75, 74, 55, 20);
		getContentPane().add(txtPosicaoXImagem1);
		txtPosicaoXImagem1.setColumns(10);
		
		JLabel lblPosioY = new JLabel("Posi\u00E7\u00E3o Y");
		lblPosioY.setBounds(135, 77, 63, 16);
		getContentPane().add(lblPosioY);
		
		txtPosicaoYImagem1 = new JTextField();
		txtPosicaoYImagem1.setColumns(10);
		txtPosicaoYImagem1.setBounds(201, 74, 55, 20);
		getContentPane().add(txtPosicaoYImagem1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 37, 552, 2);
		getContentPane().add(separator);
		
		JLabel lblLargura = new JLabel("Largura");
		lblLargura.setBounds(269, 76, 55, 16);
		getContentPane().add(lblLargura);
		
		txtLarguraImagem1 = new JTextField();
		txtLarguraImagem1.setBounds(325, 74, 55, 20);
		getContentPane().add(txtLarguraImagem1);
		txtLarguraImagem1.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(398, 76, 44, 16);
		getContentPane().add(lblAltura);
		
		txtAlturaImagem1 = new JTextField();
		txtAlturaImagem1.setBounds(443, 74, 53, 20);
		getContentPane().add(txtAlturaImagem1);
		txtAlturaImagem1.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 104, 552, 2);
		getContentPane().add(separator_1);
		
		JLabel lblImagem_1 = new JLabel("Imagem 2");
		lblImagem_1.setBounds(10, 117, 68, 14);
		getContentPane().add(lblImagem_1);
		
		txtImagem2 = new JTextField();
		txtImagem2.setColumns(10);
		txtImagem2.setBounds(75, 114, 421, 20);
		getContentPane().add(txtImagem2);
		
		JButton btnImagem2 = new JButton("Img");
		btnImagem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obterArquivoImagem(txtImagem2);
			}
		});
		btnImagem2.setBounds(502, 113, 55, 23);
		getContentPane().add(btnImagem2);
		
		txtAlturaImagem2 = new JTextField();
		txtAlturaImagem2.setColumns(10);
		txtAlturaImagem2.setBounds(443, 143, 53, 20);
		getContentPane().add(txtAlturaImagem2);
		
		JLabel label_1 = new JLabel("Altura");
		label_1.setBounds(398, 145, 44, 16);
		getContentPane().add(label_1);
		
		txtLarguraImagem2 = new JTextField();
		txtLarguraImagem2.setColumns(10);
		txtLarguraImagem2.setBounds(325, 143, 55, 20);
		getContentPane().add(txtLarguraImagem2);
		
		JLabel label_2 = new JLabel("Largura");
		label_2.setBounds(269, 145, 55, 16);
		getContentPane().add(label_2);
		
		txtPosicaoYImagem2 = new JTextField();
		txtPosicaoYImagem2.setColumns(10);
		txtPosicaoYImagem2.setBounds(201, 143, 55, 20);
		getContentPane().add(txtPosicaoYImagem2);
		
		JLabel label_3 = new JLabel("Posi\u00E7\u00E3o Y");
		label_3.setBounds(135, 146, 63, 16);
		getContentPane().add(label_3);
		
		txtPosicaoXImagem2 = new JTextField();
		txtPosicaoXImagem2.setColumns(10);
		txtPosicaoXImagem2.setBounds(75, 143, 55, 20);
		getContentPane().add(txtPosicaoXImagem2);
		
		JLabel label_4 = new JLabel("Posi\u00E7\u00E3o X");
		label_4.setBounds(10, 145, 63, 16);
		getContentPane().add(label_4);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 173, 552, 2);
		getContentPane().add(separator_2);
		
		JLabel lblImagem3 = new JLabel("Imagem 3");
		lblImagem3.setBounds(10, 188, 68, 14);
		getContentPane().add(lblImagem3);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 244, 552, 2);
		getContentPane().add(separator_3);
		
		JLabel label_5 = new JLabel("Posi\u00E7\u00E3o X");
		label_5.setBounds(10, 216, 63, 16);
		getContentPane().add(label_5);
		
		txtPosicaoXImagem3 = new JTextField();
		txtPosicaoXImagem3.setColumns(10);
		txtPosicaoXImagem3.setBounds(75, 214, 55, 20);
		getContentPane().add(txtPosicaoXImagem3);
		
		txtImagem3 = new JTextField();
		txtImagem3.setColumns(10);
		txtImagem3.setBounds(75, 185, 421, 20);
		getContentPane().add(txtImagem3);
		
		JLabel label_6 = new JLabel("Posi\u00E7\u00E3o Y");
		label_6.setBounds(135, 217, 63, 16);
		getContentPane().add(label_6);
		
		txtPosicaoYImagem3 = new JTextField();
		txtPosicaoYImagem3.setColumns(10);
		txtPosicaoYImagem3.setBounds(201, 214, 55, 20);
		getContentPane().add(txtPosicaoYImagem3);
		
		JLabel label_7 = new JLabel("Largura");
		label_7.setBounds(269, 216, 55, 16);
		getContentPane().add(label_7);
		
		txtLarguraImagem3 = new JTextField();
		txtLarguraImagem3.setColumns(10);
		txtLarguraImagem3.setBounds(325, 214, 55, 20);
		getContentPane().add(txtLarguraImagem3);
		
		JLabel label_8 = new JLabel("Altura");
		label_8.setBounds(398, 216, 44, 16);
		getContentPane().add(label_8);
		
		txtAlturaImagem3 = new JTextField();
		txtAlturaImagem3.setColumns(10);
		txtAlturaImagem3.setBounds(443, 214, 53, 20);
		getContentPane().add(txtAlturaImagem3);
		
		JButton btnImagem3 = new JButton("Img");
		btnImagem3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obterArquivoImagem(txtImagem3);
			}
		});
		btnImagem3.setBounds(502, 184, 55, 23);
		getContentPane().add(btnImagem3);
		
		JLabel lblTexto = new JLabel("Texto 1");
		lblTexto.setBounds(10, 257, 55, 16);
		getContentPane().add(lblTexto);
		
		txtTexto1 = new JTextField();
		txtTexto1.setColumns(10);
		txtTexto1.setBounds(75, 255, 421, 20);
		getContentPane().add(txtTexto1);
		
		JLabel lblNewLabel = new JLabel("Fonte");
		lblNewLabel.setBounds(10, 285, 55, 16);
		getContentPane().add(lblNewLabel);
		
		cmbFonteTexto1 = new JComboBox();
		cmbFonteTexto1.setModel(new DefaultComboBoxModel(new String[] {"Arial", "Tahoma", "Times New Roman"}));
		cmbFonteTexto1.setBounds(75, 281, 134, 25);
		getContentPane().add(cmbFonteTexto1);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(221, 285, 36, 16);
		getContentPane().add(lblTipo);
		
		cmbTipoTexto1 = new JComboBox();
		cmbTipoTexto1.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Negrito", "It\u00E1lico"}));
		cmbTipoTexto1.setBounds(252, 281, 69, 25);
		getContentPane().add(cmbTipoTexto1);
		
		JLabel lblTamanho = new JLabel("Tamanho");
		lblTamanho.setBounds(335, 287, 55, 16);
		getContentPane().add(lblTamanho);
		
		txtTamanhoTexto1 = new JTextField();
		txtTamanhoTexto1.setBounds(398, 283, 27, 20);
		getContentPane().add(txtTamanhoTexto1);
		txtTamanhoTexto1.setColumns(10);
		
		JLabel lblCor = new JLabel("Cor");
		lblCor.setBounds(437, 285, 27, 16);
		getContentPane().add(lblCor);
		
		cmbCorTexto1 = new JComboBox();
		cmbCorTexto1.setModel(new DefaultComboBoxModel(new String[] {"Azul", "Amarelo", "Vermelho", "Verde", "Laranja", "Branco", "Preto"}));
		cmbCorTexto1.setBounds(469, 281, 88, 25);
		getContentPane().add(cmbCorTexto1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 338, 552, 2);
		getContentPane().add(separator_4);
		
		JLabel lblTexto_1 = new JLabel("Texto 2");
		lblTexto_1.setBounds(10, 350, 55, 16);
		getContentPane().add(lblTexto_1);
		
		txtTexto2 = new JTextField();
		txtTexto2.setColumns(10);
		txtTexto2.setBounds(75, 348, 421, 20);
		getContentPane().add(txtTexto2);
		
		JLabel label_9 = new JLabel("Fonte");
		label_9.setBounds(10, 378, 55, 16);
		getContentPane().add(label_9);
		
		cmbFonteTexto2 = new JComboBox();
		cmbFonteTexto2.setModel(new DefaultComboBoxModel(new String[] {"Arial", "Tahoma", "Times New Roman"}));
		cmbFonteTexto2.setBounds(75, 374, 134, 25);
		getContentPane().add(cmbFonteTexto2);
		
		JLabel label_10 = new JLabel("Tipo");
		label_10.setBounds(221, 378, 36, 16);
		getContentPane().add(label_10);
		
		cmbTipoTexto2 = new JComboBox();
		cmbTipoTexto2.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Negrito", "It\u00E1lico"}));
		cmbTipoTexto2.setBounds(252, 374, 69, 25);
		getContentPane().add(cmbTipoTexto2);
		
		JLabel label_11 = new JLabel("Tamanho");
		label_11.setBounds(335, 380, 55, 16);
		getContentPane().add(label_11);
		
		txtTamanhoTexto2 = new JTextField();
		txtTamanhoTexto2.setColumns(10);
		txtTamanhoTexto2.setBounds(398, 376, 27, 20);
		getContentPane().add(txtTamanhoTexto2);
		
		JLabel label_12 = new JLabel("Cor");
		label_12.setBounds(437, 378, 27, 16);
		getContentPane().add(label_12);
		
		cmbCorTexto2 = new JComboBox();
		cmbCorTexto2.setModel(new DefaultComboBoxModel(new String[] {"Azul", "Amarelo", "Vermelho", "Verde", "Laranja", "Branco", "Preto"}));
		cmbCorTexto2.setBounds(469, 374, 88, 25);
		getContentPane().add(cmbCorTexto2);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(10, 436, 552, 2);
		getContentPane().add(separator_5);
		
		JLabel lblTexto_2 = new JLabel("Texto 3");
		lblTexto_2.setBounds(10, 449, 55, 16);
		getContentPane().add(lblTexto_2);
		
		JLabel label_13 = new JLabel("Fonte");
		label_13.setBounds(10, 477, 55, 16);
		getContentPane().add(label_13);
		
		cmbFonteTexto3 = new JComboBox();
		cmbFonteTexto3.setModel(new DefaultComboBoxModel(new String[] {"Arial", "Tahoma", "Times New Roman"}));
		cmbFonteTexto3.setBounds(75, 473, 134, 25);
		getContentPane().add(cmbFonteTexto3);
		
		txtTexto3 = new JTextField();
		txtTexto3.setColumns(10);
		txtTexto3.setBounds(75, 447, 421, 20);
		getContentPane().add(txtTexto3);
		
		JLabel label_14 = new JLabel("Tipo");
		label_14.setBounds(221, 477, 36, 16);
		getContentPane().add(label_14);
		
		cmbTipoTexto3 = new JComboBox();
		cmbTipoTexto3.setModel(new DefaultComboBoxModel(new String[] {"Normal", "Negrito", "It\u00E1lico"}));
		cmbTipoTexto3.setBounds(252, 473, 69, 25);
		getContentPane().add(cmbTipoTexto3);
		
		JLabel label_15 = new JLabel("Tamanho");
		label_15.setBounds(335, 479, 55, 16);
		getContentPane().add(label_15);
		
		txtTamanhoTexto3 = new JTextField();
		txtTamanhoTexto3.setColumns(10);
		txtTamanhoTexto3.setBounds(398, 475, 27, 20);
		getContentPane().add(txtTamanhoTexto3);
		
		JLabel label_16 = new JLabel("Cor");
		label_16.setBounds(437, 477, 27, 16);
		getContentPane().add(label_16);
		
		cmbCorTexto3 = new JComboBox();
		cmbCorTexto3.setModel(new DefaultComboBoxModel(new String[] {"Azul", "Amarelo", "Vermelho", "Verde", "Laranja", "Branco", "Preto"}));
		cmbCorTexto3.setBounds(469, 473, 88, 25);
		getContentPane().add(cmbCorTexto3);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(10, 535, 552, 2);
		getContentPane().add(separator_6);
		
		JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					visualizar();
				}catch (RuntimeException err) {
					javax.swing.JOptionPane.showMessageDialog(null, err.getMessage(), "Validação", javax.swing.JOptionPane.WARNING_MESSAGE);
				}catch (Exception err) {
					javax.swing.JOptionPane.showMessageDialog(null, err.getMessage(), "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnVisualizar.setBounds(454, 541, 98, 26);
		getContentPane().add(btnVisualizar);
		
		JLabel label = new JLabel("Posi\u00E7\u00E3o X");
		label.setBounds(10, 315, 63, 16);
		getContentPane().add(label);
		
		txtPosicaoXTexto1 = new JTextField();
		txtPosicaoXTexto1.setColumns(10);
		txtPosicaoXTexto1.setBounds(75, 313, 55, 20);
		getContentPane().add(txtPosicaoXTexto1);
		
		JLabel label_17 = new JLabel("Posi\u00E7\u00E3o Y");
		label_17.setBounds(135, 316, 63, 16);
		getContentPane().add(label_17);
		
		txtPosicaoYTexto1 = new JTextField();
		txtPosicaoYTexto1.setColumns(10);
		txtPosicaoYTexto1.setBounds(201, 313, 55, 20);
		getContentPane().add(txtPosicaoYTexto1);
		
		JLabel label_18 = new JLabel("Posi\u00E7\u00E3o X");
		label_18.setBounds(10, 408, 63, 16);
		getContentPane().add(label_18);
		
		txtPosicaoXTexto2 = new JTextField();
		txtPosicaoXTexto2.setColumns(10);
		txtPosicaoXTexto2.setBounds(75, 406, 55, 20);
		getContentPane().add(txtPosicaoXTexto2);
		
		JLabel label_19 = new JLabel("Posi\u00E7\u00E3o Y");
		label_19.setBounds(135, 409, 63, 16);
		getContentPane().add(label_19);
		
		txtPosicaoYTexto2 = new JTextField();
		txtPosicaoYTexto2.setColumns(10);
		txtPosicaoYTexto2.setBounds(201, 406, 55, 20);
		getContentPane().add(txtPosicaoYTexto2);
		
		JLabel label_20 = new JLabel("Posi\u00E7\u00E3o X");
		label_20.setBounds(10, 507, 63, 16);
		getContentPane().add(label_20);
		
		txtPosicaoXTexto3 = new JTextField();
		txtPosicaoXTexto3.setColumns(10);
		txtPosicaoXTexto3.setBounds(75, 505, 55, 20);
		getContentPane().add(txtPosicaoXTexto3);
		
		JLabel label_21 = new JLabel("Posi\u00E7\u00E3o Y");
		label_21.setBounds(135, 508, 63, 16);
		getContentPane().add(label_21);
		
		txtPosicaoYTexto3 = new JTextField();
		txtPosicaoYTexto3.setColumns(10);
		txtPosicaoYTexto3.setBounds(201, 505, 55, 20);
		getContentPane().add(txtPosicaoYTexto3);
	}
	
	private void obterArquivoImagem(JTextField txt) {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(Tela.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            txt.setText(file.getAbsolutePath());
        } 
	}
	
	private void visualizar() throws Exception {
		
		if(txtFundoPrincipal.getText() == null || txtFundoPrincipal.getText().length() == 0) {
			throw new RuntimeException("Necessário informar o fundo principal.");
		}
		
		BufferedImage imgPrincipal = ImageIO.read(new File(txtFundoPrincipal.getText()));
		
		Graphics2D graphics = imgPrincipal.createGraphics();
		
		adicionarImagem(graphics, txtImagem1.getText(), txtPosicaoXImagem1.getText(), txtPosicaoYImagem1.getText(), txtLarguraImagem1.getText(), txtAlturaImagem1.getText());
		
		adicionarImagem(graphics, txtImagem2.getText(), txtPosicaoXImagem2.getText(), txtPosicaoYImagem2.getText(), txtLarguraImagem2.getText(), txtAlturaImagem2.getText());
		
		adicionarImagem(graphics, txtImagem3.getText(), txtPosicaoXImagem3.getText(), txtPosicaoYImagem3.getText(), txtLarguraImagem3.getText(), txtAlturaImagem3.getText());
		
		adicionarTexto(graphics, txtTexto1.getText(), cmbFonteTexto1.getSelectedItem().toString(), cmbTipoTexto1.getSelectedItem().toString(), txtTamanhoTexto1.getText(), 
				cmbCorTexto1.getSelectedItem().toString(), txtPosicaoXTexto1.getText(), txtPosicaoYTexto1.getText());
		
		adicionarTexto(graphics, txtTexto2.getText(), cmbFonteTexto2.getSelectedItem().toString(), cmbTipoTexto2.getSelectedItem().toString(), txtTamanhoTexto2.getText(), 
				cmbCorTexto2.getSelectedItem().toString(), txtPosicaoXTexto2.getText(), txtPosicaoYTexto2.getText());
		
		adicionarTexto(graphics, txtTexto3.getText(), cmbFonteTexto3.getSelectedItem().toString(), cmbTipoTexto3.getSelectedItem().toString(), txtTamanhoTexto3.getText(), 
				cmbCorTexto3.getSelectedItem().toString(), txtPosicaoXTexto3.getText(), txtPosicaoYTexto3.getText());
		
		graphics.dispose();
		
		ImageIcon icon = new ImageIcon(imgPrincipal);
		mostrarImagem(icon, imgPrincipal.getWidth(), imgPrincipal.getHeight());	
	}
	
	private void mostrarImagem(ImageIcon imagem, int w, int h) {
		JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(w+3, h+3));
        panel.setLayout(new BorderLayout());
        
        JLabel img = new JLabel();
        img.setIcon(imagem);
        panel.add(new JScrollPane(img));
        javax.swing.JOptionPane.showMessageDialog(null, panel, "Imagem", javax.swing.JOptionPane.PLAIN_MESSAGE);
	}
	
	private void adicionarImagem(Graphics2D graphics, String strPathImagem, String posX, String posY, String largura, String altura) throws Exception {
		try {
			if(strPathImagem == null || strPathImagem.length() == 0) return;
			
			if(posX == null || posX.length() == 0) return;
			
			if(posY == null || posY.length() == 0) return;
			
			if(largura == null || largura.length() == 0) return;
			
			if(altura == null || altura.length() == 0) return;
			
			BufferedImage img = ImageIO.read(new File(strPathImagem));
			
			graphics.drawImage(img, Integer.parseInt(posX), Integer.parseInt(posY), Integer.parseInt(largura), Integer.parseInt(altura), null);
			
		}catch (Exception err) {
			throw new RuntimeException("Erro ao adicionar imagem.", err);
		}
	}
	
	private void adicionarTexto(Graphics2D graphics, String texto, String fonte, String tipo, String tamanho, String cor, String posX, String posY) throws Exception {
		try {
			if(texto == null || texto.length() == 0) return;
			
			if(fonte == null || fonte.length() == 0) return;
			
			if(tipo == null || tipo.length() == 0) return;
			
			if(tamanho == null || tamanho.length() == 0) return;
			
			if(cor == null || cor.length() == 0) return;
			
			if(posX == null || posX.length() == 0) return;
			
			if(posY == null || posY.length() == 0) return;
			
			graphics.setColor(obterColor(cor));
	        graphics.setFont(new Font(fonte, obterTipoFonte(tipo), Integer.parseInt(tamanho)));
	        graphics.drawString(texto, Integer.parseInt(posX), Integer.parseInt(posY));
			
		}catch (Exception err) {
			throw new RuntimeException("Erro ao adicionar texto.", err);
		}
	}
	
	private Color obterColor(String cor) {
		switch (cor) {
		case "Azul":
			return Color.BLUE;
			
		case "Amarelo":
			return Color.YELLOW;
			
		case "Verde":
			return Color.GREEN;
			
		case "Vermelho":
			return Color.RED;
			
		case "Laranja":
			return Color.ORANGE;
			
		case "Branco":
			return Color.WHITE;
			
		case "Preto":
			return Color.BLACK;

		default:
			return Color.BLACK;
		}
	}
	
	private int obterTipoFonte(String tipo) {
		switch (tipo) {
		case "Normal":
			return Font.PLAIN;
			
		case "Negrito":
			return Font.BOLD;
			
		case "Itálico":
			return Font.ITALIC;

		default:
			return Font.PLAIN;
		}
	}
	
}
