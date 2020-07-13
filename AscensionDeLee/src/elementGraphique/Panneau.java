package elementGraphique;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel{
	
	private String image;//La propriété image
	
	public Panneau(String image) {//Un constructeur qui nous permettra de récupérer nos images et de les passées en paramètre
		this.image =image;
	}
	
	
	public void paintComponent(Graphics g) 

	{
		try {
			
			BufferedImage img = ImageIO.read(new File(image));
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} 

}
