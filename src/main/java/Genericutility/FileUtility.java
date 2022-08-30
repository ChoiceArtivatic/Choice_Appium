package Genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * 
 * @author Artivatic
 *This class contains methods to fetch data from propertyfile
 */
public class FileUtility 
{
       public String getdatafromproperty(String key) throws Throwable
       {
    	   FileInputStream fis=new FileInputStream(IConstants.PROPERTYFILE_PATH);
    	   Properties pobj=new Properties();
    	   pobj.load(fis);
    	   return pobj.getProperty(key);
       }
}
