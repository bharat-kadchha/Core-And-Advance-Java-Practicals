package ioPackageExample;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipDemo extends ZipInputStream{
	
	public ZipDemo(InputStream in) {
		super(in);
	}

	static void insert() throws Exception
	{
		FileInputStream fis = new FileInputStream("src/iopck/myZip.zip"); 
        ZipInputStream jis = new ZipInputStream(fis); 
        PrintStream cout=System.out; 
  
        //reading the next ZIP file entry 
        ZipEntry ze = jis.getNextEntry(); 
  
        cout.println(ze.getName()); 
  
        //illustrating getComment() 
        ze.setComment("This is a comment"); 
        cout.println(ze.getComment()); 
  
        //illustrating setCompressedSize() and getCompressedSize() 
        ze.setCompressedSize(23l); 
        cout.println("CompressedSize of the entry = " + ze.getCompressedSize()); 
  
        //illustrating getSize() and setSize() 
        ze.setSize(53l); 
        cout.println("Size = " + ze.getSize()); 
  
        //illustrating getCrc() and setCrc() 
        ze.setCrc(01); 
        cout.println(ze.getCrc()); 
  
        //illustrating getMethod and setMethod 
        ze.setMethod(ZipEntry.STORED); 
        cout.println(ze.getMethod()); 
  
        //illustrating getCreation and setCreation() 
        ze.setCreationTime(FileTime.from(10000, TimeUnit.DAYS)); 
        cout.println(ze.getCreationTime()); 
  
        //illustrating getLastAccessTime and setLastAccessTime 
        ze.setLastAccessTime(FileTime.from(1000,TimeUnit.DAYS)); 
        cout.println(ze.getLastAccessTime()); 
  
        //illustrating clone() 
        ZipEntry zeclone = (ZipEntry) ze.clone(); 
        cout.println(zeclone.getName()); 
  
        //illustrating isDirectory 
        cout.println(ze.isDirectory()); 
  
        //illustrating hashcode() 
        cout.println("hashcode = " + ze.hashCode());
        
        jis.close();
	}

	
	
	public static void main(String[] args) {
		try {
		
			 
			FileInputStream fis = new FileInputStream("src/iopck/myZip.zip"); 
	        ZipInputStream jis = new ZipInputStream(fis); 
	        
	        while(jis.available()==1)
	        {
	        	System.out.println(jis.getNextEntry());   
	        	
	        }
	        jis.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
