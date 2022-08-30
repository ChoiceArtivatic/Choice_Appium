package Genericutility;

import java.util.Date;
import java.util.Random;
/**
 * 
 * @author Artivatic
 *This class contains methods to generate random number and generate system date
 */
public class JavaUtility
{
   public int getRandomNum()
   {
	   Random ran=new Random();
	   return ran.nextInt(1000);
   }
   
   /**
    * 
    */
   public String getSystemData()
   {
	   Date date=new Date();
	   String d = date.toString();
	  // System.out.println(date);
	   return d;
   }
}
