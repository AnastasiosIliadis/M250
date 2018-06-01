import ou.*;
/**
 * Class FrogDanceCoordinator
 * 
 * Objects of the FrogDanceCoordinator class allow showing
 * dance sequences involving Frog objects.
 * 
 * @author Anastasios Iliadis
 * @15/04/2018
 */
public class FrogDanceCoordinator
{
   /**
    * instance variables
    */
   private int numOfFrogsDancing;
   private int numOfDanceMoves;

   private Frog frog1;
   private Frog frog2;
   private Frog frog3;

   private String danceMove1;
   private String danceMove2;
   private String danceMove3;

   /**
    * Constructor for objects of class FrogDanceCoordinator.
    */
   public FrogDanceCoordinator (Frog aFrog1, Frog aFrog2, Frog aFrog3)
   {
      super();
      this.frog1 = aFrog1;
      this.frog2 = aFrog2;
      this.frog3 = aFrog3;
      this.numOfFrogsDancing = 0;
      this.numOfDanceMoves = 0;      
   }

   /* instance methods */    

   /**
    * Returns true if the argument is in the range 1 to 3 (inclusive),
    * otherwise false.
    */
   public boolean isValidNumOfMoves(int aNumber)
   {
      return ((aNumber >= 1) && (aNumber <= 3));
   }   

   /**
    * -- TO BE MODIFIED --
    * Prompts the user for a number of dance moves 
    * in the range 1 to 3 inclusive, and returns this number.
    */
   public int promptForNumOfMoves()
   {
        int moves;
        do{
            moves = Integer.parseInt(OUDialog.request
            ("Please enter the number of dance moves to be performed - between 1 and 3 (inclusive)"));
            try
            {
               if (this.isValidNumOfMoves(moves) == false)
               {
                  OUDialog.alert("Entered value is outside range (between 1 and 3 inclusive)");
               }
               else
               {
                  this.isValidNumOfMoves(moves);
               }
            }
            catch (NumberFormatException e)
            {
                OUDialog.alert("String could not be converted to an integer");
            }
         } while (this.isValidNumOfMoves(moves)==false);
        return moves;
      }  
     
   /**
    * Repeatedly prompts the user for a number of moves, until they enter 
    * a valid input representing a number in the range 1 to 3 inclusive, and 
    * then returns this number.
    */    
   public int getNumOfMoves()
   {
      int moves = this.promptForNumOfMoves();
      while (!this.isValidNumOfMoves(moves))
      {
         OUDialog.alert("That is not a valid number of dance moves");
         moves = this.promptForNumOfMoves();    
      }
      return moves; 
   }
   
   /**
    * Returns true if the argument is either "flip" or "slide",
    * otherwise false.
    */
   public boolean isValidMove(String aMoveType)
   {
      return ((aMoveType.equals("flip")) || (aMoveType.equals("slide")));
   }

   /**
    * Prompts the user to enter the the name of a dance move which must be either "flip" or "slide".
    */    
   public String promptForDanceMove()
   {
      String danceMove = OUDialog.request
         ("Please enter type of dance move - flip or slide");
      while (!this.isValidMove(danceMove))
      {
         OUDialog.alert("This is not a valid type of move");
         danceMove = OUDialog.request
         ("Please enter type of dance move - \"flip\" or \"slide\"");
      }
      return danceMove;
   }
 
   public void selectDancingFrogs()
   {
      this.numOfFrogsDancing = 0;
      this.frog1.setColour(OUColour.GREEN);
      this.frog2.setColour(OUColour.GREEN);
      this.frog3.setColour(OUColour.GREEN);
      Frog[] frog = {frog1,frog2,frog3};
      
      for (int i=0; i<frog.length; i++)
      {
         boolean dance;
         dance = OUDialog.confirm("Please confirm if you want Frog"+ i + " to dance"); 
         if (dance)
         {
            numOfFrogsDancing++;
            frog[i].setColour(OUColour.RED);
            frog[i].setPosition(1);
         }
      }
   }
  
   //c//
   public void createDance()
   {
      if (this.numOfFrogsDancing > 0)
      {
         this.numOfDanceMoves = this.promptForNumOfMoves();
         danceMove1 = promptForDanceMove();
         if(this.numOfDanceMoves > 1)
         {
             danceMove2 = promptForDanceMove();
         }
         if(this.numOfDanceMoves > 2)
         {
            danceMove3 = promptForDanceMove();
         }
      }
   }

   /**
    * 'Flip' a frog depending on its position
    */        
   private void flip(Frog aFrog)
   {
      aFrog.jump();
      if (aFrog.getPosition() == 1)
      {
         aFrog.setPosition(11);
      }
      else
      {
         aFrog.setPosition(1);
      }
      aFrog.jump();
   }    

   /**
    * 'Slide' a frog depending on its position
    */        
   private void slide(Frog aFrog)
   {
      if (aFrog.getPosition() == 1)
      {
         while (aFrog.getPosition() < 11)
         {
            aFrog.setPosition(aFrog.getPosition() + 1);
         }
         aFrog.jump();
      }
      else
      {
         while (aFrog.getPosition() > 1)
         {
            aFrog.setPosition(aFrog.getPosition() - 1);
         }
         aFrog.jump();
      }
   }    

   /**
    * 'Flip' all frogs that have been set for dancing
    */    
   private void flipDancingFrogs()
   {
      if (this.frog1.getColour().equals(OUColour.RED))
      {
         this.flip(this.frog1);
      }
      if (this.frog2.getColour().equals(OUColour.RED))
      {
         this.flip(this.frog2);
      }
      if (this.frog3.getColour().equals(OUColour.RED))
      {
         this.flip(this.frog3);
      }
   }    

   /**
    * 'Slide' all frogs that have been set for dancing
    */        
   private void slideDancingFrogs()
   {
      if (this.frog1.getColour().equals(OUColour.RED))
      {
         this.slide(this.frog1);
      }
      if (this.frog2.getColour().equals(OUColour.RED))
      {
         this.slide(this.frog2);
      }
      if (this.frog3.getColour().equals(OUColour.RED))
      {
         this.slide(this.frog3);
      }
   }
   
   ///d) i)///
   public void setUpDance()
   {
      this.selectDancingFrogs();
      this.createDance();
   }
   
   //d) ii)//
      public void performDance() 
   {
      if (numOfFrogsDancing > 0) 
      {
         if (danceMove1.equals("flip"))
         {
           flipDancingFrogs(); 
         }
         if (danceMove1.equals("slide"))
         {
           slideDancingFrogs();
         }

         if(numOfDanceMoves > 1)
         {
            if (danceMove2.equals("flip"))
            {
               flipDancingFrogs(); 
            }
            if (danceMove2.equals("slide"))
            {
               slideDancingFrogs();
            }
         }
         
         if(numOfDanceMoves > 2)
         {
            if (danceMove3.equals("flip"))
            {
               flipDancingFrogs(); 
            }
            if (danceMove3.equals("slide"))
            {
               slideDancingFrogs();
            }
         }
      }
      }
   }