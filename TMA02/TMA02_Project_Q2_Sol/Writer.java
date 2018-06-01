
/**
 * Writer represents an writer such as Lewis Carroll.
 * I used name, year of birth and nationality.
 * In the context of the Book, this is the component class.
 * 
 * @author (Anastasios Iliadis) 
 * @version (21/1/2018)
 */
public class Writer
{
   // instance variables - replace the example below with your own
   private String name;
   private int yearOfBirth;
   private String nationality;

   /**
    * zero-argument constructor: if we don’t know the Writer's attributes.  
    */
   public Writer()
   {
      // initialise instance variables
      this.name = null;
      this.yearOfBirth = 0;
      this.nationality = null;
   }
   
   /**
    * A constructor for objects of class Writer if we know their name
    * but not their year of birth and their nationality.
    */
   public Writer (String aName)
   {
      this.name = aName;
      this.yearOfBirth = 0;
      this.nationality = null;
   }
      
   /**
    * A constructor for objects of class Writer if we know their year of birth
    * but not their name and their nationality.
    */
   public Writer (int aYear)
   {
      this.name = null;
      this.yearOfBirth = aYear;
      this.nationality = null;
   }
   
      /**
    * A constructor for objects of class Writer if we know their nationality
    * and their name but not their year of birth.
    */
   public Writer (String aName, String aNationality)
   {
      this.name = aName;
      this.yearOfBirth = 0;
      this.nationality = aNationality;
   }
   
      /**
    * A constructor for objects of class Writer if we know all the atributes

    */
   public Writer (String aName, int aYear, String aNationality)
   {
      this.name = aName;
      this.yearOfBirth = aYear;
      this.nationality = aNationality;
   }
   
   /**
    * Setter for an writer's name.
    */
   public void setName(String aName)
   {
      this.name = aName;
   }

   /**
    * Setter for an writers's year of birth.
    */
   public void setYearOfBirth(int aYear)
   {
      this.yearOfBirth = aYear;
   }
   
   /**
    * Setter for an writer's nationality.
    */
   public void setNationality(String aNationality)
   {
      this.nationality = aNationality;
   }
   
   /**
    * Getter for an artist's name. It could
    * return a string such as "unattributed" 
    * if the writers's name is not known, 
    * but we have chosen to keep it simple here.
    */
   public String getName()
   {
      return this.name;
   }

   /**
    * Getter for an writer's year of birth. 
    * Keeping it simple, as in getName().
    */
   public int getYearOfBirth()
   {
      return this.yearOfBirth;
   }  

   /**
    * Getter for an writer's nationality. 
    * Keeping it simple, as in getName().
    */
   public String getNationality()
   {
      return this.nationality;
   }  

   /**
    * Returns a description of this object as a string.
    */
    public String toString()
    {
       return "Name: " + this.name + ", Born: " + this.yearOfBirth 
       + ", Nationality: " + this.nationality;
    }
}
