import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Esimene{
	public static void main(String[] arg) throws Exception{
		BufferedImage pilt=new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
		Graphics g=pilt.createGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 100, 100);
		g.setColor(Color.RED);
		g.fillRect(50, 10, 20, 30); //x, y, laius, kأµrgus. y أ¼lalt alla
		g.fillRect(80, 10, 10, 30); 
		g.drawRect(10, 10, 30, 40);
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 30, 40);
		g.drawLine(10, 80, 90, 80);
		g.drawString("Tere", 40, 70);
		ImageIO.write(pilt, "png", new File("pilt1.png"));
	}
}