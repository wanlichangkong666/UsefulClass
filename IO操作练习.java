import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class IO操作练习 {

	public static void main(String[] args) {
		File file=new File("d:/a.txt");
		/*InputStream in;
		in=new FileInputStream(file);*/
		OutputStream out=null;
		try {
			out = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		String str="sss";
		byte[] bs=str.getBytes();
		//int len=0;
		try {
			out.write(bs);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			out.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
