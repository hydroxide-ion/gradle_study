package textloader;

import java.io.*;
import java.net.*;

public class TextLoader{
	private BufferedReader buff;
	
	public TextLoader(String arg) throws IOException{
		this.buff = this.Connect(arg);
	}
	
	private BufferedReader Connect(String path) throws IOException{
		BufferedReader result;
		URL url = TextLoader.class.getClassLoader().getResource(path);
		if (url == null){
			System.out.println("error: cannot open "+path);
			return null;
		}
		
		try{
			result = new BufferedReader(
				new InputStreamReader(url.openStream())
			);
			
			return result;
			
		}catch(FileNotFoundException e){
			System.out.println("File "+path+" is not found.");
			
			return null;
		}
	}
	
	public void Show() throws IOException{
		String entry;
		
		if (this.buff == null){
			return;
		}
		
		while( (entry=this.buff.readLine()) != null ){
			System.out.println(entry);
		}
	}
	
	public void Close() throws IOException{
		if (this.buff != null){
			this.buff.close();
		}
	}
}
