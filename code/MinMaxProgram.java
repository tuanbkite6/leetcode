import java.util.Scanner;

public class MinMaxProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập giá trị ban đầu
        System.out.print("Enter a value: ");
        int num = scanner.nextInt();
        
        // Khởi tạo min và max với giá trị ban đầu
        int min = num;
        int max = num;
        
        // Lặp cho đến khi người dùng nhập 999
        while (num != 999) {
            // Kiểm tra giá trị min và max
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            
            // Nhập giá trị mới
            System.out.print("Enter a value: ");
            num = scanner.nextInt();
        }
        
        // Nếu giá trị min không phải là 999, hiển thị kết quả
        if (min != 999) {
            System.out.println("Min value is: " + min);
            System.out.println("Max value is: " + max);
        } else {
            System.out.println("No valid numbers were entered.");
        }
        
        scanner.close();
    }
}
