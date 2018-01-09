package 파일입출력;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("C:\\Users\\student\\test.txt");
			while((c = in.read()) != -1) {
				fout.write(c);
			}
			in.close();
			fout.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
