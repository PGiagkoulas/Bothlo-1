import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Bothlo extends BasicGame {

	Image arrow;
    Image triangle;
	
	public Bothlo(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer arg0, Graphics g) throws SlickException {
		
		// draws the images at the specified positions
		g.drawImage(arrow,50,100);
		g.drawImage(triangle,100,200);
		 
		// draws the image, but with green
		g.drawImage(arrow, 150, 100, Color.green);
		 
		// To draw the image transparent
		// use white as the colour and set the alpha
		// the following draws the image at 50% transparency
		g.drawImage(arrow, 250, 100, new Color(1f,1f,1f,0.5f));
		 
		// draws a part of the image
		// a 50x60 snippet at 20,10 on the image
		// drawn at 300,200 on the screen
		g.drawImage(triangle,
		    300, 200, // where you want the top-left of the snippet to be
		    350, 260, // bottom-right "
		    20, 10, // top-left of the snippet relative to the image
		    70, 70); // bottom-right "
		 
		// draws the image at twice the size
		g.drawImage(arrow,
		    50, 350,
		    50+arrow.getWidth()*2,
		    350+arrow.getHeight()*2,
		    0, 0,
		    arrow.getWidth(),
		    arrow.getHeight());
		
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		 
		arrow = new Image("arrow.png");
		triangle = new Image("triangle.png");

	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 * @throws SlickException 
	 */
	public static void main(String[] args) {
		
		Bothlo game = new Bothlo("Slick Tutorial");
		try {
			AppGameContainer container = new AppGameContainer(game);
			container.start();
		} catch (SlickException e) {
			
			e.printStackTrace();
		}
		
	}

}
