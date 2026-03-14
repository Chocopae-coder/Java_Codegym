package Contact_Manager;
import java.util.*;
public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static ContactService service = new ContactService();

    public static void start() {

        while (true) {

            System.out.println("===== QUẢN LÝ DANH BẠ =====");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Lưu vào file");
            System.out.println("0. Thoát");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    show();
                    break;

                case 2:
                    add();
                    break;

                case 3:
                    update();
                    break;

                case 4:
                    delete();
                    break;

                case 5:
                    search();
                    break;

                case 6:
                    readFile();
                    break;

                case 7:
                    writeFile();
                    break;
            }
        }
    }
    private static void show() {

        List<Contact> list = service.getContacts();

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

            if ((i + 1) % 5 == 0) {
                System.out.println("Nhấn Enter để xem tiếp...");
                scanner.nextLine();
            }
        }
    }
    private static void add() {

        System.out.println("Phone:");
        String phone = scanner.nextLine();

        if (!ValidateUtil.isPhone(phone)) {
            System.out.println("Sai định dạng số điện thoại");
            return;
        }

        System.out.println("Group:");
        String group = scanner.nextLine();

        System.out.println("Name:");
        String name = scanner.nextLine();

        System.out.println("Gender:");
        String gender = scanner.nextLine();

        System.out.println("Address:");
        String address = scanner.nextLine();

        System.out.println("Birthday:");
        String birthday = scanner.nextLine();

        System.out.println("Email:");
        String email = scanner.nextLine();

        if (!ValidateUtil.isEmail(email)) {
            System.out.println("Sai email");
            return;
        }

        Contact c = new Contact(phone, group, name, gender, address, birthday, email);

        service.add(c);

        System.out.println("Thêm thành công");
    }
    private static void delete() {

        System.out.println("Nhập phone:");

        String phone = scanner.nextLine();

        Contact c = service.findByPhone(phone);

        if (c == null) {
            System.out.println("Không tìm thấy");
            return;
        }

        System.out.println("Bạn có chắc xóa? (Y/N)");

        String confirm = scanner.nextLine();

        if (confirm.equalsIgnoreCase("Y")) {

            service.delete(phone);

            System.out.println("Đã xóa");
        }
    }
    private static void search() {

        System.out.println("Nhập từ khóa:");

        String keyword = scanner.nextLine();

        for (Contact c : service.getContacts()) {

            if (c.toString().contains(keyword)) {
                System.out.println(c);
            }
        }
    }
    private static void readFile() {

        System.out.println("Xóa dữ liệu cũ? Y/N");

        String c = scanner.nextLine();

        if (c.equalsIgnoreCase("Y")) {

            List<Contact> list = CSVUtil.read("data/contacts.csv");

            service.getContacts().clear();
            service.getContacts().addAll(list);
        }
    }
    private static void writeFile() {

        System.out.println("Ghi đè file? Y/N");

        String c = scanner.nextLine();

        if (c.equalsIgnoreCase("Y")) {

        CSVUtil.write("data/contacts.csv", service.getContacts());
        }
    }
    private static void update() {

        System.out.println("Nhập số điện thoại cần sửa:");

        String phone = scanner.nextLine();

        Contact contact = service.findByPhone(phone);

        if (contact == null) {

            System.out.println("Không tìm được danh bạ với số điện thoại trên.");
            return;
        }

        System.out.println("Nhập nhóm mới:");
        String group = scanner.nextLine();

        System.out.println("Nhập họ tên mới:");
        String name = scanner.nextLine();

        System.out.println("Nhập giới tính:");
        String gender = scanner.nextLine();

        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();

        System.out.println("Nhập ngày sinh:");
        String birthday = scanner.nextLine();

        System.out.println("Nhập email:");

        String email = scanner.nextLine();

        if (!ValidateUtil.isEmail(email)) {
            System.out.println("Email không hợp lệ");
            return;
        }

        contact.setGroup(group);
        contact.setName(name);
        contact.setGender(gender);
        contact.setAddress(address);
        contact.setBirthday(birthday);
        contact.setEmail(email);

        System.out.println("Cập nhật thành công!");
    }
    public void setGroup(String group) {
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
