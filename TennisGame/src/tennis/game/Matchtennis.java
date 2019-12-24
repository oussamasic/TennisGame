package tennis.game;

public class Matchtennis {
	Tennisgame game = new Tennisgame();
	int player1setgagne = 0;
	int player2setgagne = 0;
	
	public void setplayer1set() {
		
		player1setgagne ++;
	}
	
	public void setplayer2set() {
		
		player2setgagne++;
	}
	
	public void thewinner() {
	if(player1setgagne > 0) {
		System.out.println("Player 1 a gangé le match");
		System.out.println("SCORE : Player 1 : " +game.player1game+ " Player 2 :" +game.player2game );
		
	}
	
	if(player2setgagne > 0 ) {
		System.out.println("Player 2 a gangé le match");
		System.out.println("SCORE : Player 1 : " +game.player1game+ " Player 2 :" +game.player2game );
	}
	}

}
