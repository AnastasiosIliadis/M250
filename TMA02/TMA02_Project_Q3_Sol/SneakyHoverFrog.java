import ou.*;
/**
 * SneakyHoverFrog is a subclass of HoverFrog
 * 
 * @author Anastasios Iliadis 
 * @version 05/01/2018
 */
//a
public class SneakyHoverFrog extends HoverFrog
{
   private boolean isSneaking;
   /**
    * Constructor for objects of class SneakyHoverFrog
    */
   public SneakyHoverFrog()
   {
      //c
      super();
      isSneaking = false;
   }
   
   //b (Setter)
   private void setIsSneaking(boolean IsSneaking)
   {
      this.isSneaking = IsSneaking;
   }
   
   //getter
   public boolean getIsSneaking()
   {
      return this.isSneaking;
   }
   
   //d
   public void setColour(OUColour aColour)
   {
      if((getColour().equals(OUColour.WHITE)) && (this.isSneaking==true))
      {
      }
      else
      {
         super.setColour(aColour);
      }
   }

   //e i)
   public void startSneaking()
   {
      this.isSneaking = true;
      this.setColour(OUColour.WHITE);
   }
   
   //e ii)
   public void stopSneaking()
   {
      this.isSneaking = false;
      this.setColour(OUColour.GREEN);
   }
   
   //f
   public void panicIfCanBeSeen(Amphibian anAmphibian)
   {
      if ((anAmphibian.getPosition() == this.getPosition()) &&((this.getHeight() >= 0) && (this.getHeight()<=3))) 
      {
         super.setColour(OUColour.RED);
         for(int i=0; i<3; i++)
         {
            this.performAction("croak");
         }
         if(this.getHeight()>=0)
         {
            do
            {
               setHeight(getHeight()-1);
            } while (getHeight()>0);
            this.stopSneaking();
         }
      }
      else
      {   
      }
   }
}
