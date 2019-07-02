import java.util.Scanner;

public class GameApp {
	private static final int SECRET = 2;

    public static void main(String[] args) {
            System.out.println("Игра началась! У Вас есть 3 попытки. Введите число от 1 до 10");
            Scanner scan = new Scanner(System.in);
            int attempts = 3;
            while (attempts > 0) {
                    int num = scan.nextInt();
                    if (num != SECRET) {
                            attempts--;
                            System.out.println("Вы не угадали. Попыток осталось: " + attempts);
                    } else {
                            System.out.println("Вы выиграли приз!!! За призом обращаться к президенту 32-го мая!");
                            break;
                    }
            }
            scan.close();
    }
	
}
