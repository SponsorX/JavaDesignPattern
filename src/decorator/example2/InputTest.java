package decorator.example2;

import java.io.*;

public class InputTest {

	public static void main(String[] args) throws FileNotFoundException {
		int c;
		try {
			String path = InputTest.class.getResource("").getPath(); //현재 클래스의 절대 경로를 가져온다.
			System.out.println(path); //절대 경로
			//자바의 상대 경로의 기준은 우리가 생각하는 것처럼 해당 클래스 파일이 있는 위치가 아니라, 클래스 파일이 포함되어 있는 프로젝트 폴더이다.
			
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(path+"test.txt")));
			while((c=in.read()) >= 0){
				System.out.print((char)c);
			}
			in.close();	
		}
		catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
