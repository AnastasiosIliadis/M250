/**
 * Answer to TMA01 Question 1
 * @author (Anastasios Iliadis) 
 * @version (23/10/2017)
 */
public class M250Account
{
   //b) i)
   private String accountNum;
   
   //b) ii)
   public M250Account()
   {
      accountNum = "X00000";
   }

   //b) iii)
   public String getAccountNum()
   {
      return accountNum;
   }
   
   //c) i)
   public boolean isValidLength(String s)
   {
      if(s.length() == 6)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   //c) ii)
   public boolean isValidStart(String s)
   {
      if(Character.isUpperCase(s.charAt(0)))
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   //c) iii)
   public boolean hasValidDigits(String s)
   {
     //check if the first digit between A and Z is a character, then, check if the other 5 digits between 1 and 9 are numbers//
     if(s.matches("[A-Z]{1}[0-9]{5}")) 
     {
        return true;
     }
     else
     {
        return false;
     }
   }
   
   //c) iv)
   public boolean isValidAccountNum(String s)
   {
     if((isValidLength(s) == true) && (isValidStart(s) == true) && (hasValidDigits(s) == true))
     {
        return true;
     }
     else
     {   
        return false;
     }
   }
  
	//e)
   public void setAccountNum(String s)
   {
	  if(isValidAccountNum(s) == true)
	  {
		System.out.println("Value " + s + " is valid");
 		accountNum = s;
	  }
	  else
	  {
		System.out.println("Value " + s + " is not valid");
	  }
   } 
}
