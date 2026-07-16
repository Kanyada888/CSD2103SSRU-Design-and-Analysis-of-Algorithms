import java.util.Scanner;

public class ScoreCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. รับคะแนนกลางภาค
        System.out.print("Enter midterm score: ");
        int midterm = scanner.nextInt();
        
        // 2. รับคะแนนปลายภาค
        System.out.print("Enter final score: ");
        int finalScore = scanner.nextInt();
        
        // 3. คำนวณคะแนนรวม
        int total = midterm + finalScore;
        System.out.println("Total score = " + total);
        
        // 4. และ 5. ตรวจสอบเงื่อนไขการตัดเกรดผ่าน/ไม่ผ่าน
        if (total >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
        scanner.close();
    }
}

