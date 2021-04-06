import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Teine{
	public static void main(String[] arg) throws Exception{
		BufferedImage pilt=new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
		Graphics g=pilt.createGraphics();
		g.setColor(Color.RED);
		g.fillRect(35, 50, 30, 40);
		g.drawLine(35, 50, 50, 30);
		g.drawLine(50, 30, 65, 50);
		ImageIO.write(pilt, "png", new File("pilt2.png"));
	}
}