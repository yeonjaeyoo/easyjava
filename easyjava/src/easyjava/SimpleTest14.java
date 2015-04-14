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
			long nFileSize = 102403;
			long nLastBlockSize = nFileSize % (1024 * 100);
			long nLastBlock = nFileSize / (1024 * 100);
			nLastBlock = (nLastBlockSize == 0)?nLastBlock:nLastBlock+1;
			
			long nLastSeqNo = nLastBlockSize / 1024;
			if(nLastBlockSize == 0) {
				nLastSeqNo = 100;
			} else {
				nLastSeqNo = (nLastBlockSize % 1024 ==0)?nLastSeqNo:nLastSeqNo+1;
			}
						
			System.out.println("nFileSize="+nFileSize);
			System.out.println("nLastBlockSize="+nLastBlockSize);
			System.out.println("nLastBlock="+nLastBlock);
			System.out.println("nLastSeqNo="+nLastSeqNo);
			
			File f = new File("C://CMS//9966010561//EB21//EB210311");
			int a;
			System.out.println("f.length()="+f.length());
			a =  (int)(f.length() / 1024);
			System.out.println("A="+a);
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
            	BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
            	//BufferedReader reader = new BufferedReader(
                //        new InputStreamReader(new FileInputStream(f)));
                int n;
                while ((n = reader.read(buffer)) != -1) 
                { 
                	strFileContents = new String(buffer, 0, n);
                	strFileContents = new String(strFileContents.getBytes("8859_1"),"KSC5601"); 

                	//System.out.println(strFileContents);
     			    //System.out.println(strFileContents);
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
