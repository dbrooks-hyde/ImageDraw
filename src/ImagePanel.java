import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class ImagePanel extends JPanel 
{

	protected BufferedImage image;
	
	public Dimension getPreferredSize()
	{
		return new Dimension(800, 800);
	}
	
	protected void init()
	{
		this.setLayout(null);	// make this a coordinate based panel...

		try
		{
			image = ImageIO.read(this.getClass().getResource("images/Doritos.png"));
		}
		catch (IOException e)
		{
			System.out.println("Failed to load the image from the resource.");
		}
	}
	
	public ImagePanel() 
	{
		init();
	}

	public ImagePanel(LayoutManager layout) 
	{
		super(layout);
		init();
	}

	public ImagePanel(boolean isDoubleBuffered) 
	{
		super(isDoubleBuffered);
		init();
	}

	public ImagePanel(LayoutManager layout, boolean isDoubleBuffered) 
	{
		super(layout, isDoubleBuffered);
		init();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(image, 10, 10, null);
	}
}
