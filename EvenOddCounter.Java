import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. สร้าง Array ขนาด 10 เพื่อเก็บตัวเลขจำนวนเต็ม
        int[] numbers = new int[10];
        int evenCount = 0;
        int oddCount = 0;
        
        // รับค่าข้อมูล 10 จำนวนจากผู้ใช้
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // 2. ตรวจสอบเงื่อนไขการเป็นเลขคู่และเลขคี่ใน Array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++; // เพิ่มจำนวนเลขคู่
            } else {
                oddCount++;  // เพิ่มจำนวนเลขคี่
            }
        }
        
        // 3. แสดงผลลัพธ์ Output ตามที่โจทย์ต้องการ
        System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);
        
        scanner.close();
    }
}
