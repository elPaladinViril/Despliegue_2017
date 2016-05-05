import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class ImagenQueSeEstira extends JComponent {
	
	
	private Image _img;
	
	public ImagenQueSeEstira(Image img){
		
		_img=img;
		setOpaque (false);
		setVisible (true);
		
	}
	
	public ImagenQueSeEstira (String rutaRecurso) throws IOException{
		
		this (ImageIO.read(ImagenQueSeEstira.class.getResourceAsStream(rutaRecurso)));
		
	}

	public void paint (Graphics g){
		
		int w = getWidth();
		int h = getHeight();
		
		if (isOpaque()){
			
			g.setColor(getBackground());
			g.fillRect(0, 0, w, h);
			
		}
		
		int iw= _img.getWidth(null);
		int ih= _img.getHeight(null);
		g.drawImage(_img, 0, 0, w, h, 0, 0, iw, ih, null);
		
	}
	
	@Override
	public Dimension getPreferredSize(){
		
		int iw= _img.getWidth(null);
		int ih= _img.getHeight(null);
		
		return new Dimension (iw, ih);
		
	}
	
	public static void main(String[] args) throws IOException {
		
		ImagenQueSeEstira antorcha=new ImagenQueSeEstira ("C:/Users/José Manuel Samper/workspace/CEFPYM/src/Imagenes/Antorcha.png");
		
	}

}
