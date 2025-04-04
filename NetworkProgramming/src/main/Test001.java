package main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test001 {

	public static void main(String[] args) {
String file = "C://java/example.txt";
        
        // 파일에 쓰기
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "utf-8"))) {
            bw.write("안녕하세요!");
            bw.newLine();
            bw.write("UTF-8 인코딩으로 파일에 텍스트를 추가합니다.");
            bw.newLine();
            System.out.println("파일 쓰기 완료!");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
