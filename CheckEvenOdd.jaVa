import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        // 1. รับค่าตัวเลขจากผู้ใช้
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        
        // 2. ตรวจสอบเงื่อนไขหารด้วย 2 ลงตัวหรือไม่
        if (number % 2 == 0) {
            // ถ้าหารด้วย 2 ลงตัว ให้แสดงคำว่า Even number
            System.out.println("Even number");
        } else {
            // ถ้าหารด้วย 2 ไม่ลงตัว ให้แสดงคำว่า Odd number
            System.out.println("Odd number");
        }
        
        scanner.close();
    }
}
