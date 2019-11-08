package 内存流;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class Demo {
	public static void main(String[] args) throws IOException {
		String str="Hello World";
		InputStream is=new ByteArrayInputStream(str.getBytes());
		OutputStream os=new ByteArrayOutputStream();
		int len=0;
		while((len=is.read())!=-1) {
			os.write((char)Character.toUpperCase(len));
		}
		System.out.println(os.toString());
	}

}
