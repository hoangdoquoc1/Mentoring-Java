import java.time.LocalDate;
import java.util.Scanner;

public class Main {// lớp Main 

	public static void main(String[] args)
    {
        // // Person là tên class
        // // khanh là tên biến
        // // new là cú pháp để khởi tạo đối tượng mới
        // // Person là hàm khởi tạo đối tượng
        // Person khanh = new Person("Khanh", 22, LocalDate.of(2003, 7, 21));
        // System.out.println(khanh.toString());
        // //hình cầu bằng thạch cao, 100 cm, màu vàng
        // System.out.println("Quản lý sản xuất tượng ");
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Hay nhap hinh dang: ");
        // String shape = sc.nextLine();

        // System.out.print("Hay nhap chat lieu: ");
        // String material = sc.nextLine();

        // System.out.print("Hay nhap mau sac: ");
        // String color = sc.nextLine();

        // System.out.print("Hay nhap chieu cao: ");
        // String height = sc.nextLine();
        // int heightInt = Integer.parseInt(height);
        // System.out.print("Hay nhap so luong san xuat: ");
        // String quantity = sc.nextLine();
        // int quantityInt = Integer.parseInt(quantity);

        // System.out.print("Nhap so luong cho tuong mac dinh: ");
        // String defaultQuantity = sc.nextLine();
        // int defaultQuantityInt = Integer.parseInt(defaultQuantity);

        // Statue tuong = new Statue(material, shape, color, heightInt, quantityInt);
        // Statue tuongRong = new Statue(defaultQuantityInt);
        // System.out.println("Nhung tuong can san xuat hom nay");
        // System.out.println(tuong);
        // System.out.println(tuongRong);
        // sc.close();
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.Run();

	}
}