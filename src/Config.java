import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Config {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        File isEven = new File("src/IsEven.java");
        isEven.createNewFile();
        FileWriter evener = new FileWriter("src/IsEven.java");
        evener.write(
                "import java.util.Scanner;\r\n" + //
                "\r\n" + //
                "public class IsEven {\r\n" + //
                "\tpublic static void main(String[] args) throws Exception {\r\n" + //
                "\t\tboolean even = false;\r\n" + //
                "\t\tScanner input = new Scanner(System.in);\r\n" + //
                "\t\tSystem.out.println(\"What number?\");\r\n" +
                "\t\tint num = input.nextInt();\r\n");
        System.out.println("How many numbers?");
        int num = input.nextInt();
        boolean even = false;
        for(int i = 1; i <= num; i++){
            evener.write(
                    "\t\tif(" + i + " == num){\r\n" +
                    "\t\t\teven = " + even + ";\r\n" +
                    "\t\t}\r\n");
            even = !even;
        }
        evener.write(
                "\t\tinput.close();\r\n" +
                "\t\tSystem.out.println(num + \" is even: \" + even);\r\n" +
                "\t}\r\n" +
                "}");
        evener.close();
        input.close();
    }
}
