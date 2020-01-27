package imagens.teste;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TesteAlteracaoImagem {
	
	public static void main(String[] args) throws Exception {
		Fontes2.registrarFontes();
		
		BufferedImage imgPrincipal = ImageIO.read(new File("./img/principal.jpg"));
		BufferedImage imgVende = ImageIO.read(new File("./img/vende.jpg"));
		BufferedImage imgCasa = ImageIO.read(new File("./img/casa.png"));

		System.out.println("Size - principal: w = " + imgPrincipal.getWidth() + ", h = " + imgPrincipal.getHeight());
		System.out.println("Size - vende:     w = " + imgVende.getWidth() + ", h = " + imgVende.getHeight());
		System.out.println("Size - casa:      w = " + imgCasa.getWidth() + ", h = " + imgCasa.getHeight());
		
		//Obtém o Graphics2D da imagem 1 (fundo), para desenhar sobre ela.
		Graphics2D graphics = imgPrincipal.createGraphics();
		
		graphics.drawImage(imgVende, 220, 10, imgVende.getWidth(), imgVende.getHeight(), null); //339 , 76
		graphics.drawImage(imgCasa, 100, 90, imgCasa.getWidth(), imgCasa.getHeight(), null); //638 , 460
		
		graphics.setColor(Color.BLUE);
        graphics.setFont(new Font("Arial", Font.BOLD, 32));
        graphics.drawString("Teste Blue", 100, 600);
        
        graphics.setColor(Color.GREEN);
        graphics.setFont(new Font("Arial", Font.BOLD, 32));
        graphics.drawString("Teste Green", 100, 700);
        
        printCenterString(graphics, "Texto Centro", imgPrincipal.getWidth(), 0, 750);
        
        printRightString(graphics, "Texto direita", imgPrincipal.getWidth(), 0, 790);
		
		graphics.dispose(); //Libera os recursos ocupados pela "Caneta"
		 
		ImageIcon icon = new ImageIcon(imgPrincipal);
		mostrarImagem(icon, imgPrincipal.getWidth(), imgPrincipal.getHeight());
		
		
//		File f = new File ("./img/novo.jpg");
//		ImageIO.write(imgPrincipal, "jpg", f);
		
		System.out.println("ok");
	}
	
	private static void printCenterString(Graphics2D g2d, String s, int width, int XPos, int YPos){
        int stringLen = (int)g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();
        int start = width/2 - stringLen/2;
        g2d.drawString(s, start + XPos, YPos);
	}
	
	private static void printRightString(Graphics2D g2d, String s, int width, int XPos, int YPos) {
		int stringLen = (int)g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();
		g2d.drawString(s, width - (stringLen+2), YPos);		
	}
	
	private static void mostrarImagem(ImageIcon imagem, int w, int h) {
		JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(w+3, h+3));
        panel.setLayout(new BorderLayout());
        
        JLabel img = new JLabel();
        img.setIcon(imagem);
        panel.add(new JScrollPane(img));
        javax.swing.JOptionPane.showMessageDialog(null, panel, "Imagem", javax.swing.JOptionPane.PLAIN_MESSAGE);
	}

}
