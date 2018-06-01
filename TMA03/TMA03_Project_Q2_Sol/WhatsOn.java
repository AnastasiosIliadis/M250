import java.util.*;
/**
 * Instances of class WhatsOn represent a collection of
 * activities that can be added to, removed, searched etc.
 * 
 * Inspired by Amazon's Echo Dot
 * 
 * @author Anastasios Iliadis
 * @version 24/04/18
 */
public class WhatsOn
{
   //a) i)//
   private static Map<Integer, Activity> activities;
  
   private static String today;
   private static int nextId;
   /**
    * Constructor for objects of class WhatsOn
    */
   public WhatsOn()
   {
      // initialise instance variables
      //a) ii)//
      this.activities=new HashMap<>();
      this.today= "010117";
      this.nextId = 1;
   }
   
   //a) iii)//
   public void addActivity(String aName, String aDate, String aTime)
   {
        Activity actToAdd = new Activity(aName, aDate, aTime); 
        activities.put(nextId, actToAdd);
        nextId++;
   }
   
   //b//
   public void whatsOnToday()
   {       
     for (Activity act : activities.values())
     { 
         if (this.today.equals(act.getDate()))
         {
          System.out.println("Today you have " + act.getName() 
          + " at " + act.getTime());
         } 
      }
   }
   
   //d//
   public String removeActivity(String thisName, String thisDate, String thisTime)
   {
      for (Activity act : activities.values()) 
      { 
         if ((thisName.equals(act.getName()))
         && (thisDate.equals(act.getDate())) 
         && (thisTime.equals(act.getTime()))) 
         {
            this.activities.remove(activities.size());
            return "Removed successfully";
         }
      }
      return "Failed to remove";
   }
   
   /*
    * updates the value of today  - provided
    */
   public void updateDate(String newDate)
   {
      today = newDate;
   }
}