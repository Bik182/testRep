package changer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class changer {
	
	
	
	public static void main(String[] args) throws IOException {
		
		String verify, putData= "";
		

		  
		 
		  String search = "file:///G:/Doc/";
		  String replace = "file:///K:/Doc/";
		  
		  String search1 = "file:///E:/error%20%28DO%20NOT%20DELETE%29/";
		  String replace1 = "file:///G:/error%20%28DO%20NOT%20DELETE%29/";
		  
		  String search2 = "file:///I:/Doc/";
		  String replace2 = "file:///K:/Doc/";
		  
		  String search3 = "file:///D:/NAHAHAA/";
		  String replace3 = "file:///E:/NAHAHAA/";
		  
		  String search4 = "file:///E:/error%20(DO%20NOT%20DELETE)/";
		  String replace4 = "file:///G:/error%20%28DO%20NOT%20DELETE%29/";
		  

	
		
	
		File f = new File("G:\\");// your folder path

		//**Edit** It is array of Strings
		String[] fileList = f.list(); // It gives list of all files in the folder.
		 
		for(String str : fileList){
			
		    if(str.endsWith(".xspf")){
		    	
		    	File log= new File("G:\\"+str);
				  try{
				      FileReader fr = new FileReader(log);
				      String s;
				      String totalStr = "";
				      try (BufferedReader br = new BufferedReader(fr)) {

				          while ((s = br.readLine()) != null) {
				              totalStr += s;
				              
				          }
				          
				          totalStr = totalStr.replaceAll(search, replace);
				         
				          totalStr = totalStr.replaceAll(search1, replace1);
				          totalStr = totalStr.replaceAll(search2, replace2);
				          totalStr = totalStr.replaceAll(search3, replace3);
				          totalStr = totalStr.replaceAll(search4, replace4);
				          
				          FileWriter fw = new FileWriter(log);
				          
				      fw.write(totalStr);
				      fw.close();
				      
				      }
				  }catch(Exception e){
				      e.printStackTrace();
				  }
		   }
		  
		}
	
		
		
	}
	
}
