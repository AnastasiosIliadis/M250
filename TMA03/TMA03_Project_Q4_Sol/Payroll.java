import java.io.*;
import java.util.*;
import ou.*;
/**
 * Write a description of class Payroll here.
 * 
 * @author Anastasios Iliadis
 * @version 26/04/18
 */
public class Payroll
{
   //b) i) part one//
   ArrayList<Programmer> programmers;  
   /**
    * Constructor for objects of class Payroll
    */
   public Payroll()
   {
     //b) i) part two//
      this.programmers=new ArrayList<>();
   }

   //b) ii)//
   private int computePay(Programmer p)
   {
      return (p.getGrade()*p.getHours());
   }
   
   //b) iii)//
   public void readEmployeeData()
   {
        String pathname = OUFileChooser.getFilename();
        File aFile = new File(pathname);
        Scanner bufferedScanner = null;
        try
        {
            String name;        
            int grade;
            int hours;
            Scanner lineScanner;
            String currentLine;
            bufferedScanner = new Scanner(new BufferedReader(new FileReader(aFile)));
            while (bufferedScanner.hasNextLine())
            {
               currentLine = bufferedScanner.nextLine();
               lineScanner = new Scanner(currentLine);
               lineScanner.useDelimiter(",");
             
               name = lineScanner.next();
               grade = lineScanner.nextInt();
               hours = lineScanner.nextInt();

               for(int i=0; i<5; i++)
               {
                  hours = hours + lineScanner.nextInt();
               }
               Programmer p = new Programmer(name);
               p.setGrade(grade);
               p.setHours(hours);
               p.setPay(computePay(p));
               programmers.add(p);
            }
        }
        catch (Exception anException)
        {
            System.out.println("Error " + anException);
        }
        finally
        {
            try
            {
                bufferedScanner.close();
            }
            catch (Exception anException)
            {
                System.out.println("Error " + anException);
            }
        }
   }
   
   //b) v)//
   public void showPayroll()
   {
       for(int i=0; i<programmers.size(); i++)
       {
          System.out.println(programmers.get(i));
       }
   }
   
   //c) ii)//
   public void writePayroll()
   {
        BufferedWriter bw = null;
        try 
        {
           Collections.sort(programmers);
           File file = new File("C:/Users/Anastasios/Desktop/The open university 2017/M250 2017/TMA03/tma03 solutions/TMA03_Project_Q4_Sol/payrollResults.txt");
           if (!file.exists()) 
           {
              file.delete();
              file.createNewFile();
           }
           FileWriter fw = new FileWriter(file);
           bw = new BufferedWriter(fw);
           for(int i=0; i<programmers.size(); i++)
           {
              bw.write(""+programmers.get(i));
              bw.newLine();
           }
           System.out.println("File written Successfully");  
        } 
        catch (IOException ioe) 
        {
           ioe.printStackTrace();
        }
        finally
        { 
           try
           {
              if(bw!=null)
              bw.close();
           }
           catch(Exception ex)
           {
              System.out.println("Error in closing the BufferedWriter"+ex);
           }   
        }
   }
}
