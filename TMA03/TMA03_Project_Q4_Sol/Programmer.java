/**
 * Class Programmer - Models a programmer
 *
 * @author Anastasios Iliadis
 * @version 26/04/18
 * 
 */
//c) i)//
public class Programmer implements Comparable<Programmer>
{
   //a) i)//
   private static int nextId = 1;
   
   private int id;      // programmer's id
   private String name; // programmer's name
   private int grade;   // Determines pay; 1, 2 or 3
   private int pay;     // total pay in gold coins
   private int hours;   // total hours worked

   /**
    * Constructor for objects of class programmer
    */
   public Programmer(String aName)
   {
      super();
      this.name = aName;
      
      //a) ii)//
      this.id = Programmer.nextId;
      Programmer.nextId = Programmer.nextId +1;

   }

   public int getId()
   {
      return this.id;
   }

   public String getName()
   {
      return name;
   }

   public int getGrade()
   {
      return grade;
   }

   public void setGrade(int aGrade)
   {
      if (aGrade >= 1 && aGrade <= 3)
      {
         this.grade = aGrade;
      }
      else
      {
         throw new IllegalArgumentException("The grade " + aGrade + " does not exist");
      }
   }

   public int getPay()
   {
      return pay;
   }

   public void setPay(int pay)
   {
      this.pay = pay;
   }

   public int getHours()
   {
      return hours;
   }

   public void setHours(int hours)
   {
      this.hours = hours;
   }
   
   //b) iv)//
   public String toString()
   {
      return (this.getName() + " (Grade " + this.getGrade() 
      + ", ID " + this.getId()+") Hours " + this.getHours()
      + " Pay " + this.getPay());
   }
 
   //c) i)//
   @Override
   public int compareTo(Programmer o)
   {
      return (this.getPay() - o.getPay());
   }
}
