import java.util.*;
/**
 * Write a description of class Hotel here.
 * 
 * @author Anastasios Iliadis 
 * @version 06/05/2018
 */
public class Hotel
{
   //b) 1)//
   private Map<Integer, Set<String>> bookAroom;
 
   //b) 2)//
   /**
    * Constructor for objects of class Hotel
    */
   public Hotel()
   {
      this.bookAroom =new HashMap<Integer, Set<String>>();
   }

   //b) 3)//
   //populate the map//
   public void populate()
   {
      Set<String> name = new HashSet<String>();
      name.add("Jude Austin");
      name.add("Matthew Howard");
      name.add("Joel Byrne");
      bookAroom.put(56, name);
    
      name = new HashSet<>();
      name.add("Louie Burns");
      name.add("Elliot Foster");
      name.add("Ty Pacheco");
      bookAroom.put(344, name);
      
      name = new HashSet<>();
      name.add("Terrence Sullivan");
      name.add("Maxim Dunlap");
      bookAroom.put(289, name);
   } 
   
   //c) printMap//
   //print the map using System.out.println()//
   public void printMap()
   {
      for (Integer room_num : bookAroom.keySet()) 
      {
        System.out.print("Room: " + room_num + ", Tenants' names: ");
        for (String people : bookAroom.get(room_num)) {
            System.out.print("" + people + ", ");    
        }
        System.out.println();
      }
   } 

   //c) printMapValue//
   /*
    * If the argument is a key in the map, 
    * prints a meaningful textual representation of its associated value, 
    * otherwise prints an output line announcing that the key is not present.
    */
   public void printMapValue(int key)
   {
      if(bookAroom.containsKey(key))
      {
        System.out.print("Room: " + key + ", Tenants' names: ");
        for (String people : bookAroom.get(key)) 
        {
           System.out.print("" + people + ", ");    
        }
      }
      else
      {
         System.out.println ("The key " + key + " is not present.");
      }
   } 
   
   //c) addMapEntry//
   /*
    * Adds the key and value to the map. 
    * If the key is already present the existing value is overwritten
    */
   public void addMapEntry(Integer key,Set<String> name)
   {
     bookAroom.put(key, name);
   }
   
   //d) deleteEntry//
   /*
    * If the key given as the argument exists, 
    * deletes the key–value pair from the map, and returns true, 
    * otherwise returns false
    */
   public boolean deleteEntry(int key)
   {
      if(bookAroom.containsKey(key))
      {
         bookAroom.remove(key);
         return true;
      }
      else
      {
         return false;
      }
   }
   
   //d) addValue//
   /*
    * Adds a new element to the collection of elements for a particular key
    */
   public void addValue(int key, String name)
   {
     bookAroom.get(key).add(name);
   }
   
   //d) deleteValue//
   /*
    * Deletes a particular element from the collection of elements for a particular key
    */
   public void deleteValue(int key, String name)
   {
     bookAroom.get(key).remove(name);
   }
}
