import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;



//YPARXOUN KAPOIES METHODOI OI OPOIES DEN YLOPOIITHIKAN GIATI THA YLOPOIITHOUN STO MELLON SE KAPOIO TYXON EXPANSION
//APO TIS APAITISEIS DEN YLOPOIITHIKAN:
	// TO PLITHOS TWN IRWWN (ANTI GIA 4 EINAI 1) GIATI EIXAME PROVLIMA ME TIS PAGIDES KAI TIN EPITHESI
	// TO INVENTORY 
	// TA POTION KAI TA RUNES 
	//KAI TIN VASI DEDOMENWN DATA GIATI DEN XREIASTIKE SE AYTI TIN VERSION TOU PROJECT
	//KAI EPISIS DEN KATAFERAME NA DIMIOURGISOUME Runnable .jar arxeio 


public class Game extends StateBasedGame {

	public static final String gamename = "Bothlo - The Volcano Demon";
	public static final int menu = 0;
	public static final int play = 1;
	
	public Game(String gamename)throws Exception{
		super(gamename);
		try{		
			this.addState(new MenuGUI(menu));
		//creating hero when game starts
			Hero.createHeroInstance("warrior", 1, 120, 3, 1,
				10, 8, 0, 0, 1, 
				3, "Shout", 5, 120,
				3, -1, 0.5, 
				0.2);
		
			this.addState(new GameState(play));
			}catch(Exception e){
				e.printStackTrace();
			}
		
	}
	
	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		try{
			this.getState(menu).init(gc, this);		
			this.getState(play).init(gc, this);
			this.enterState(menu);
		}catch(SlickException e){
			e.printStackTrace();
		}
		
	}
	
	

	
	//First Screen
	public static void main(String[] args) throws Exception{
		AppGameContainer appgc;
		try{
			appgc = new AppGameContainer(new Game(gamename));
			appgc.setDisplayMode(900, 384, false);
			appgc.start();
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}


}
