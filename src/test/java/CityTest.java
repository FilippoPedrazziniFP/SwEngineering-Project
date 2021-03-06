import java.awt.Color;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import it.polimi.ingsw.cg30.model.Balcony;
import it.polimi.ingsw.cg30.model.City;
import it.polimi.ingsw.cg30.model.Game;
import it.polimi.ingsw.cg30.model.Player;
import it.polimi.ingsw.cg30.model.StartGame;
import it.polimi.ingsw.cg30.model.actions.Action;

public class CityTest {


	Player player,player2;
	Game game;
	Action action;
	StartGame startGame;
	City c= new City();
	
	@Before
	public void setUp() {

		game = new Game();
		startGame = new StartGame(game);
		startGame.run();
		player = new Player(1, "black", game, null);
		player2 = new Player(2, "black", game, null);
		player.init();
	
		game.addPlayer(player);
	

	}
	
	@Test(expected= NullPointerException.class)
	
	public void testNullPlayerGiveReward(){
		c.giveRewardToPlayer(null,null);
		
	}
	
	@Test
	public void getNumber(){
		c.getNumber();
	}
	
	@Test
	public void getLinkCities(){
		c.getLinkedCities();
	}
	

	@Test(expected= NullPointerException.class)
	
	public void BuildNullEmporium(){
		c.buildEmporium(null);
	}
	

	@Test(expected= NullPointerException.class)
	
	public void CanBuildNull(){
		c.canBuildEmporium(null);
	}
	
	
	
	
	
	
}
