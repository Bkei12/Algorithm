import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A와 B를 공백으로 구분하여 입력하세요: ");
        
        int a = scanner.nextInt(); // 첫 번째 정수를 입력 받음
        int b = scanner.nextInt(); // 두 번째 정수를 입력 받음

        System.out.println("입력받은 A: " + a);
        System.out.println("입력받은 B: " + b);
        
        scanner.close(); // Scanner 사용 종료 (선택적)
    }
}