package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
	
	public static void main(String[] args) {
		
		ByteStreams bytestreams = new ByteStreams();
		
		//bytestreams.readFromFile();
		bytestreams.writeIntoFile();
		
	}
	
	private void readFromFile() {
		File file = new File("D:/Hi.txt");
		FileInputStream fileInputStream=null;
		
		try {
			fileInputStream = new FileInputStream(file);
			
			int temp;
			while((temp=fileInputStream.read())!=-1) {
				System.out.print((char)temp);
			}
		} catch (Exception e) {
			
			System.out.println(e);
		}
		finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
	
	public void writeIntoFile() {
		
		File file = new File("D:/Hi.txt");
		File file2 = new File("D:/output.txt");
		FileInputStream fileInputStream=null;
		FileOutputStream fileOutputStream = null;
		
		try {
			fileInputStream = new FileInputStream(file);
			fileOutputStream = new FileOutputStream(file2);
			
			String data = "hardcode data..";// 
			fileOutputStream.write(data.getBytes());
			
			int temp;
			while((temp=fileInputStream.read())!=-1) {
				fileOutputStream.write(temp);
			}
		} catch (Exception e) {
			
			System.out.println(e);
		}
		finally {
			try {
				fileInputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

}
