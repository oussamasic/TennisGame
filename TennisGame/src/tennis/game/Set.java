package tennis.game;


// pour simuler le set d'un match de tennis
public class Set {
	Match matchtenis = new Match();
	Tiebreak tiebreak = new Tiebreak();
	Game game = new Game();
	
   

   public void modifySetscore() {
		
		if(game.player1game >= 6 || game.player2game >= 6) {
			 if(game.player1game == game.player2game) {
				 System.out.println("tie break ");
				 tiebreak.setwinner();
			 }
			 else if((game.player1game-game.player2game >1)) {
				
				matchtenis.setplayer1set();
				 game.initgame();
				 
			 }
			 else if((game.player2game-game.player1game >1)) {
				 
				 matchtenis.setplayer2set();
				 game.initgame();
			 }
			
		
		
		}
	}
}
