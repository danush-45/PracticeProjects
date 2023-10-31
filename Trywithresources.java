package corejavaprogram;
import java.io.*;

class Trywithresources {

	public static void main(String[] args)
	{
		
		try (

			FileOutputStream fos
			= new FileOutputStream("textfile.txt")) {

			String text	= "Hi. This is my java program";
			byte arr[] = text.getBytes();
			fos.write(arr);
		}
		catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(	"Resource are closed and message write into textfile.txt");
	}
}

