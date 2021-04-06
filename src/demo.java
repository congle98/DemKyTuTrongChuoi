import java.util.Scanner;

public class demo {
    static String str(Scanner scanner){
        System.out.println("Mời nhập chuỗi");
        String string=scanner.nextLine();
        return string;
    }
    static char art(Scanner scanner){
        System.out.println("Mời nhập ký tự cần tìm");
        char art=scanner.nextLine().charAt(0);
        return art;
    }
    static void countChar(String str,char art){
        int count =0;
        for (int i=0; i<str.length();i++ ){
            if(art==(str.charAt(i))){
                count++;
            }
        }
        if(count==0){
            System.out.println("Không tìm thấy ký tự trong chuỗi");
        }
        else {
            System.out.println("ký tự "+art+" xuất hiện trong chuỗi "+count+" lần!!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = str(scanner);
        char art = art(scanner);
        countChar(str,art);

    }
}
