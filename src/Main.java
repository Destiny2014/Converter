import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите температуру в градусах Цельсия");
        Scanner sc = new Scanner(System.in);
        double TC = sc.nextDouble();
        System.out.println("Введите K - если нужно конвертировать в Кельвины или введите F - если нужна конвертация в Фаренгейты");
        char ch = sc.next().charAt(0);
        while (ch != 'K' && ch != 'F') {
            System.out.println("Введена неверная буква, введите K или F");
            ch = sc.next().charAt(0);
        }
        System.out.println(new BaseConverter().convert(TC, ch) + "" + ch);
    }
}