package pfc;
import pfc.strategy.Strategy;

/**
*A Game class to enable opponent play  to the game
*
* @author Jean Debout Gatari
* @version 1.0
*/

public class Game{

  private int nbRounds=0;
  private Player firstPlayer;
  private Player secondPlayer;
  private static int winPoints=2;
 /*
  * Game instance constructor  with 3 parameters
  *
  */
  public Game(Player one, Player two, int nbRounds){
    this.firstPlayer=one;
    this.secondPlayer=two;
    this.nbRounds=nbRounds;
  }
  /**
  *method to play one round
  *and print out all the traces
  */
  private void playOneRound(){
    Shape one=this.firstPlayer.play();
    Shape two=this.secondPlayer.play();
    int compOne =one.toCompare(two);
    int compTwo =two.toCompare(one);
    ;
    this.firstPlayer.addPoints(compOne);
    this.secondPlayer.addPoints(compTwo);
    //trace of information
    System.out.println(this.firstPlayer.getName().toString()+" has played "+one.toString()+" and "+this.secondPlayer.getName()+" has played "+two.toString()+"\n");
    //who won the first round
    if (compOne>compTwo){
      System.out.println(this.firstPlayer.getName().toString()+"win and made "+one+" points \n");
    }
    else if (compOne<compTwo){
      System.out.println(this.secondPlayer.getName().toString()+"win and made "+two+" points \n");
    }
    else{
      System.out.println("You Both got same shape an made "+one+" point");
    }
    System.out.println("the score is now: "+this.secondPlayer.getName().toString()+" = "+this.secondPlayer.getPoints()+" points -"+this.firstPlayer.getName().toString()+" = "+this.firstPlayer.getPoints()+" points\n" );
  }

  /**
  *method to play multiple rounds
  *and to reveal the winner
  *@param nbRounds
  *@return Player who won
  */

  public Player [] play(int nbRounds){
    while (nbRounds!=0){
      this.playOneRound();
    nbRounds-=1;

     }
    return this.win();
  }

  /**
  *method to reveal the winner and a test
  * in case of equality
  *
  *@return list containing a player who win
  */
  public Player[] win(){
    Player [] winner = new Player[2];
    if (this.firstPlayer.getPoints()>this.secondPlayer.getPoints()){
      System.out.println(this.firstPlayer.getName().toString()+" à gagné le jeu \n");
      winner[0]=this.firstPlayer;
    }
    else if (this.firstPlayer.getPoints()<this.secondPlayer.getPoints()) {
      System.out.println(this.secondPlayer.getName().toString()+" à gagné le jeu \n");
      winner [0]=this.secondPlayer;
    }
      else{
        System.out.println("l'egalité entre deux joueur: "+this.firstPlayer.getName()+" et "+this.secondPlayer.getName().toString());
        winner[0]=this.firstPlayer;
        winner[1]=this.secondPlayer;

      }
    return  winner;
  }
}
