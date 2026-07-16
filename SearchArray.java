import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        // 1. กำหนดรายชื่อนักศึกษา 5 คนไว้ใน Array
        String[] names = {"Somchai", "Somsri", "Somsak", "Somying", "Somporn"};
        boolean found = false;
        
        Scanner scanner = new Scanner(System.in);
        
        // 2. รับชื่อที่ต้องการค้นหาจากผู้ใช้
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine();
        
        // 3. ตรวจสอบว่าชื่อนั้นมีอยู่ใน Array หรือไม่
        for (int i = 0; i < names.length; i++) {
            // ใช้ .equals() หรือ .equalsIgnoreCase() ในการเปรียบเทียบค่า String                       
            if (names[i].equalsIgnoreCase(searchName)) {
                found = true;
                break; // เมื่อพบชื่อที่ต้องการแล้วให้ออกจากลูปทันที
            }
        }
        
        // 4. และ 5. แสดงผลการค้นหาตามเงื่อนไข
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        
        scanner.close();
    }
}
