package imagens.teste;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;

public class Fontes2 {
	
	public static void main(String[] args) {
		try {
			registrarFontes();
		} catch (Exception err) {
			err.printStackTrace();
		}
	}
	
	public static void registrarFontes() throws Exception {
		File dir = new File("src/imagens/fontes");
		
		File[] arqs = dir.listFiles();
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		for(File file : arqs) {
			Font font = Font.createFont(Font.TRUETYPE_FONT, file);
			System.out.println(font.getFontName() + " - " + font.getName());
	        ge.registerFont(font);
		}
	}

}
