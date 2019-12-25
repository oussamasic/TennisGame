package tennis.game;


// pour simuler un game d'un set
public class Game {
	

	
	// score {0,15,30,40,deuce, avg}
	int player1Score =0;
	int player2Score=0;
	//point : s'il y une égalité 
	int player1Point=0;
	int player2Point=0;
	// le score de chaque game
	int player1game=0;
	int player2game=0;

	public void initgame() {
		 player1game=0;
		 player2game=0;
		
	}

	public void setplayer1game() 
	{
		player1game ++;
	}
	
	public void setplayer2game() 
	{
		player2game ++;
		}
	
	public void newgame () {
		player1Score =0;
		player2Score=0;
		player1Point =0;
		player2Point =0;
	}
	public void Score() {
		System.out.println("Score du Game");
		System.out.println("Player1 : "+player1game+ " Player 2 : " +player2game);
		
		System.out.println("Score du SET");
		System.out.println("Player1 : "+player1Score+ " Player 2 : " +player2Score);
	}
	public void player1scored() {
		if(player1Score%30 == 0 && player1Score != 0 && player1Score<=40) 
		{player1Score=player1Score+10;
		}
		else 
		{player1Score=player1Score+15;
		}
		player1Point++;
	}
	public void player2scored() {
		if(player2Score%30 == 0 && player2Score != 0 && player2Score<=40) 
		{player2Score=player2Score+10;
		}
		else 
		{player2Score=player2Score+15;
		}
		player2Point++;
	}
	public void afficherScore() {
		
		Score();
		if(player1Point> 3 || player2Point>3) {
			
			if(player1Point==player2Point) {
				System.out.println("Deuce");
				}
			
			else if((player1Point - player2Point)>1) { 
				System.out.println("Player1 gange");
				setplayer1game();
				newgame();
               Score();
			}
			
			else if((player2Point - player1Point)>1) { 
				System.out.println("Player 2 gagne");
				newgame();
				setplayer2game();
	               Score();
			}
			if((player1Point - player2Point) == 1) {
				
				System.out.println("ADV for player 1");
			}
			
if((player2Point - player1Point)==1) {
				
	System.out.println("ADV for player 2");
			}
			
		}
		
		
		
	}

}
