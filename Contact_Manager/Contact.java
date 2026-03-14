package Contact_Manager;
public class Contact {
    private String phone;
    private String group;
    private String name;
    private String gender;
    private String address;
    private String birthday;
    private String email;

    public Contact(String phone, String group, String name,
                   String gender, String address,
                   String birthday, String email) {

        this.phone = phone;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toCSV() {
        return phone + "," + group + "," + name + "," +
                gender + "," + address + "," +
                birthday + "," + email;
    }

    public static Contact fromCSV(String line) {

        String[] data = line.split(",");

        return new Contact(
                data[0],
                data[1],
                data[2],
                data[3],
                data[4],
                data[5],
                data[6]
        );
    }

    @Override
    public String toString() {

        return phone + " | " + group + " | " + name +
                " | " + gender + " | " + address +
                " | " + birthday + " | " + email;
    }
}

