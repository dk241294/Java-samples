public class Match{
   public  static  int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
        if(gameOver){
          int finalScore=score+(levelCompleted*bonus);
		return finalScore;
		}
		  else return -1;
    }   
     public static void main(String[]args){
	     int highScore=calculateScore(true,800,5,100);
	     System.out.println(highScore);
		  highScore=calculateScore(false,800,5,100);
	     System.out.print(highScore);
		 
		 int highScorePosition=calculateHighScorePosition(1500);
		 displayHighScorePosition("deepak",highScorePosition);
		 
		 highScorePosition=calculateHighScorePosition(900);
		displayHighScorePosition("dinkar",highScorePosition); 
		
		highScorePosition=calculateHighScorePosition(400);
		displayHighScorePosition("dinesh",highScorePosition);

		 highScorePosition=calculateHighScorePosition(50);
		 displayHighScorePosition("rahul",highScorePosition);
		 
	    
	   
	   }
     public static void  displayHighScorePosition(String playerName,int highScorePosition){
	    System.out.println( playerName   +  "  managed to get into position" + highScorePosition + " on the high score table ");
		
       }
	   public static int calculateHighScorePosition(int playerscore){
		   if(playerscore>=1000)
		   {   return 1;
		   }
		   else if ((playerscore)>=500&&(playerscore<1000)){
			   return 2;
			   
		   }
		   else if ((playerscore)>=100&&(playerscore<500)){
			   return 3;
		   }else return 4;
	   }
 }
 