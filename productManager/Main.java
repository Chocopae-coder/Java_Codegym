package productManager;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager manager = new ProductManager();
        manager.add(new Product(1, "iPhone 15", 25000000, 10));
        manager.add(new Product(2, "Samsung S23", 22000000, 15));
        manager.add(new Product(3, "Xiaomi Redmi Note 13", 7000000, 30));
        manager.add(new Product(4, "MacBook Air M2", 32000000, 5));
        manager.add(new Product(5, "Dell Inspiron", 18000000, 8));
        manager.add(new Product(6, "Asus Vivobook", 15000000, 12));
        manager.add(new Product(7, "AirPods Pro", 6000000, 25));
        manager.add(new Product(8, "Chuột Logitech", 800000, 50));
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm theo ID");
            System.out.println("6. Tìm theo tên gần đúng");
            System.out.println("7. Tìm theo khoảng giá");
            System.out.println("8. Tìm theo khoảng số lượng");
            System.out.println("9. Sản phẩm giá lớn nhất");
            System.out.println("10. Giá & số lượng nhỏ nhất");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    manager.add(new Product(id, name, price, qty));
                    break;

                case 2:
                    manager.showAll();
                    break;

                case 3:
                    System.out.print("ID cần sửa: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name mới: ");
                    name = sc.nextLine();
                    System.out.print("Price mới: ");
                    price = sc.nextDouble();
                    System.out.print("Quantity mới: ");
                    qty = sc.nextInt();
                    manager.update(id, name, price, qty);
                    break;

                case 4:
                    System.out.print("ID cần xóa: ");
                    id = sc.nextInt();
                    manager.delete(id);
                    break;

                case 5:
                    System.out.print("ID: ");
                    id = sc.nextInt();
                    Product p = manager.findById(id);
                    System.out.println(p == null ? "Không tìm thấy" : p);
                    break;

                case 6:
                    System.out.print("Từ khóa: ");
                    name = sc.nextLine();
                    manager.findByName(name);
                    break;

                case 7:
                    System.out.print("Min price: ");
                    double minP = sc.nextDouble();
                    System.out.print("Max price: ");
                    double maxP = sc.nextDouble();
                    manager.findByPriceRange(minP, maxP);
                    break;

                case 8:
                    System.out.print("Min quantity: ");
                    int minQ = sc.nextInt();
                    System.out.print("Max quantity: ");
                    int maxQ = sc.nextInt();
                    manager.findByQuantityRange(minQ, maxQ);
                    break;

                case 9:
                    System.out.println(manager.maxPrice());
                    break;

                case 10:
                    System.out.println(manager.minPriceAndQuantity());
                    break;

                case 0:
                    System.out.println("Bye 👋");
                    return;
            }
        }
    }
}
