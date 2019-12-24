package tennis.game;

public class Tiebreak {
	Tennisgame game = new Tennisgame();
	int player1score = 0;
	int player2score = 0;
	
	public void player1scored() {
		player1score ++;
	}
	public void player2scored() {
		player2score++;
	}
	public  void setwinner() {
		
		if(game.player1Point>=6 || game.player2Point >=6) {
			if(game.player1Point == game.player2Point) {
				System.out.println("Tiebreak égalité");
			}
			else if ((game.player1Point - game.player2Point >1)) {
				
				System.out.println("palyer 1 a gangé le set et le match");
				System.out.println("SCORE : Player 1 : " +game.player1game+ " Player 2 :" +game.player2game );
			}
	else if ((game.player2Point - game.player1Point >1)) {
				
				System.out.println("palyer 2 a gangé le set et le match");
				System.out.println("SCORE : Player 1 : " +game.player1game+ " Player 2 :" +game.player2game );
				
			}
			
			if((game.player1Point-game.player2Point) ==1) {
				
				System.out.println("TieBreak ADV : player 1");
			}
			
			if((game.player2Point-game.player1Point) ==1) {
				
				System.out.println("TieBreak ADV : player 2");
			}
		}
	}

}
