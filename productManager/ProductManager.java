package productManager;
import java.util.ArrayList;
public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    // CREATE
    public void add(Product p) {
        products.add(p);
    }

    // READ
    public void showAll() {
        if (products.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (Product p : products) {
            System.out.println(p);
        }
    }

    // UPDATE
    public void update(int id, String name, double price, int quantity) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(name);
                p.setPrice(price);
                p.setQuantity(quantity);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm!");
    }

    // DELETE
    public void delete(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    // Tìm theo ID
    public Product findById(int id) {
        for (Product p : products) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    // Tìm theo tên gần đúng
    public void findByName(String keyword) {
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

    // Tìm theo khoảng giá
    public void findByPriceRange(double min, double max) {
        for (Product p : products) {
            if (p.getPrice() >= min && p.getPrice() <= max) {
                System.out.println(p);
            }
        }
    }

    // Tìm theo khoảng số lượng
    public void findByQuantityRange(int min, int max) {
        for (Product p : products) {
            if (p.getQuantity() >= min && p.getQuantity() <= max) {
                System.out.println(p);
            }
        }
    }

    // Giá lớn nhất
    public Product maxPrice() {
        if (products.isEmpty()) return null;
        Product max = products.get(0);
        for (Product p : products) {
            if (p.getPrice() > max.getPrice()) {
                max = p;
            }
        }
        return max;
    }

    // Giá và số lượng nhỏ nhất
    public Product minPriceAndQuantity() {
        if (products.isEmpty()) return null;
        Product min = products.get(0);
        for (Product p : products) {
            if (p.getPrice() < min.getPrice()
                    && p.getQuantity() < min.getQuantity()) {
                min = p;
            }
        }
        return min;
    }
}
