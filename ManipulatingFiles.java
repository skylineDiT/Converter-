package Converter.learning;
import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class ManipulatingFiles {
	
	String myFile ="file.txt";
	String path = "/home/dainius/";
	//String text = "Bandymas1_";
	Boolean append;
	
	public ManipulatingFiles(String path, Boolean apdent_to_file){
		this.path = path;
		this.append = apdent_to_file;
	}
	
	File f = new File(path, myFile);	
	public void createFile() {
	
		//
		
		if(!f.exists()){			
			try {
				f.mkdir();
				f.createNewFile();
				System.out.print("Success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
		System.out.println("File already exits, overding it");
		
	}
}
	public boolean writeToFile(String data) throws IOException{
		FileWriter writer = new FileWriter(f, true);
		writer.write(data);
		writer.flush();
		writer.close();
		return true;
	}
	
}
