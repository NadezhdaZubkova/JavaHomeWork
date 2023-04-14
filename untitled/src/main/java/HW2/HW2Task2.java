package HW2;

import java.io.FileNotFoundException;
import java.io.PipedWriter;
import java.io.PrintWriter;

//Напишите метод, который составит строку,состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.
public class HW2Task2 {
    public static void main(String[] args){
       StringBuilder result =getHundredTest();
       writerFile(result);
    }

    private static void writerFile(StringBuilder text) {
                    try (PrintWriter pw = new PrintWriter("/C://Users//zhdan//Desktop//JavaHomeWork//untitled//src//main//resources/'file.txt''")) {
                pw.print(text);
            }
            catch(FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }


    private static StringBuilder getHundredTest() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 101; i++) {
            sb.append("TEST");
        }
        return sb;
    }

}
