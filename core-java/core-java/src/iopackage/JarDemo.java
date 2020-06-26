package iopackage;

import java.io.FileInputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class JarDemo {
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("E:\\...\\smtp-1.4.4.jar");
		JarInputStream jis = new JarInputStream(fis);
	

		
		
		  while(jis.available()==1) {
		  
			  JarEntry entry=new JarEntry(jis.getNextEntry());
				 
				System.out.println("\n"+entry);
				System.out.println("directory--"+entry.isDirectory());
				System.out.println("Crc--"+entry.getCrc());
				System.out.println("comment--"+entry.getComment());
				System.out.println("method=="+entry.getMethod());
				System.out.println("last access time--"+entry.getLastAccessTime());
				System.out.println("created time--"+entry.getCreationTime());
		  
		  
		  }
		
		  jis.close();
			
		
	}

}
