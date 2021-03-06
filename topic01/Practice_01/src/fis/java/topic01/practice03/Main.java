package fis.java.topic01.practice03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	public static void main(String[] args) throws IOException {
		String url1 = "D:\\fis-jfresher\\topic01\\Practice_01\\src\\fis\\java\\topic01\\practice03\\input.inp";
		String url2 ="D:\\fis-jfresher\\topic01\\Practice_01\\src\\fis\\java\\topic01\\practice03\\output.out";
        try(
        		FileInputStream fileInputStream = new FileInputStream(url1);
        		FileOutputStream fileOutputStream = new FileOutputStream(url2);
        ){
        	Scanner sc = new Scanner(fileInputStream);
            while (sc.hasNextLine()) {
                String xau=sc.nextLine();
                String[] tach=xau.split(" ");
                MaiAnTiem tiem =new MaiAnTiem(Integer.parseInt(tach[0]),Integer.parseInt(tach[1]),Integer.parseInt(tach[2]),tach[3]);
                String s = String.format("%.3g%n", tiem.survival());
                byte b[] = s.getBytes();
                fileOutputStream.write(b);
 
            }
        } 
	}
}
