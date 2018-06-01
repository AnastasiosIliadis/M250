
/**
 * I used objects from the real world in the class Book,
 * the attributes I used are: title,copies, first publish and ISBN of the first publish book.
 * An object of the Book class has - an object of the Writer class, 
 * which represents the writer who wrote that book.
 * Book has a method WritersAge() that calculate and return the age of the writer when publish the book.
 * 
 * @author (Anastasios Iliadis) 
 * @version (21/1/2018)
 */
public class Book
{
   // instance variables - replace the example below with your own
   private String title;
   private String copies;
   private int firstPublish;
   private String ISBN;
   private Writer writer;
  
   /**
    * If we know all the atributes 
    */
   public Book(String aTitle, Writer theWriter, int aFirstPublish, String aCopies, String aISBN)
   {
      // initialise instance variables
      this.title = aTitle;
      this.writer = theWriter;
      this.firstPublish = aFirstPublish;
      this.copies = aCopies;
      this.ISBN = aISBN;

   }

   /**
    * If we know only the title of the book
    */
   public Book(String aTitle)
   {
      // initialise instance variables
      this.title = aTitle;
      this.copies = null;
      this.firstPublish = 0;
      this.ISBN = null;
      this.writer = new Writer();
   }
   
   /**
    * Setter for a book's writer's name.
    * The name is an attribute of the component Writer object.
    */
    public void setWriterName(String aName)
    {
       this.writer.setName(aName);       
    }
   
   /**
    * Setter for a book's year written.
    */
   public void setTitle(String aTitle)
   {
      this.title = aTitle;
   }
    
   /**
    * Setter for a book's copies.
    */
   public void setCopies(String aCopies)
   {
      this.copies = aCopies;
   }

   /**
    * Setter for a book's first publish.
    */
   public void setFirstPublish(int aFirstPublish)
   {
      this.firstPublish = aFirstPublish;
   }

   /**
    * Setter for a book's ISBN code.
    */
   public void setISBN(String aISBN)
   {
      this.ISBN = aISBN;
   }

   /**
    * Setter for a book's copies.
    */
   public void setWriterYearOfBirth(int aYear)
   {
      this.writer.setYearOfBirth(aYear);
   }
   
   /**
    * Getter for a book's title.
    */
   public String getTitle()
   {
      return this.title;
   }

   /**
    * Getter for a book's copies.
    */
   public String getCopies()
   {
      return this.copies;
   }

   /**
    * Getter for a book's first publish.
    */
   public int getFirstPublish()
   {
      return this.firstPublish;
   }
      
   /**
    * Getter for a book's ISBN.
    */
   public String getISBN()
   {
      return this.ISBN;
   }

      /**
    * Getter for a book's writer's name.
    * This method returns "Unattributed" if the writer's name 
    * is not known (i.e. it has not been set) and otherwise
    * returns the writer's name. Similar code could have
    * been provided in the Artist class itself.
    */
   public String getWriterName()
   {
      //Does the component object exist?
      if (this.writer == null || this.writer.getName() == null) 
      {
         return " Unattributed"; 
      }
      return this.writer.getName();
   }
   
   public int getWriterYearOfBirth()
   {
      return this.writer.getYearOfBirth();
   }
   
   public int WritersAge()
   {
      return this.getFirstPublish() - this.getWriterYearOfBirth();
   }
      
   /**
    * Returns a string describing this object.
    */
   public String toString()
   {
      return "Title: " + this.title + "\n"+ "Writer's name: " + this.getWriterName()
      + "\n" + "First publish: " + this.firstPublish + "\n" + "Writers age at that time: " + WritersAge() 
      + "\n" + "Copies: " + this.copies + "\n" + "ISBN number: " + this.ISBN;                
   }  
}
