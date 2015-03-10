package easyjava;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;


public class SimpleTest14 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		
			File f = new File("C://CMS//9966010561//EB11//EB110309");
			BufferedInputStream in = new BufferedInputStream (new FileInputStream(f));
					
		    byte[] contents = new byte[1024];
		 
		    int bytesRead=0;
		    String strFileContents = ""; 
			while( (bytesRead = in.read(contents)) != -1){ 
			    strFileContents = new String(contents, 0, bytesRead);
			   // System.out.println(strFileContents);
			}
			
			Writer writer = new StringWriter();
			char[] buffer = new char[1024];
			
            try
            {
                //Reader reader = new BufferedReader(
                //        new InputStreamReader(new FileInputStream(f), "UTF-8"));
            	BufferedReader reader = new BufferedReader(
                        new InputStreamReader(new FileInputStream(f)));
                int n;
                while ((n = reader.read(buffer)) != -1) 
                {
                	strFileContents = new String(buffer, 0, n);
                	System.out.println(strFileContents);
     			   // System.out.println(strFileContents);
                	//writer.write(buffer, 0, n);
                    //System.out.println(writer.toString());
                }
            }catch(Exception e) {
    			e.printStackTrace();
    		}
            finally 
            {
             //
            }
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
