package Contact_Manager;
import java.util.*;
public class ContactService {
    private List<Contact> contacts = new ArrayList<>();

    public List<Contact> getContacts() {
        return contacts;
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public Contact findByPhone(String phone) {

        for (Contact c : contacts) {
            if (c.getPhone().equals(phone)) {
                return c;
            }
        }
        return null;
    }

    public boolean delete(String phone) {

        Contact c = findByPhone(phone);

        if (c != null) {
            contacts.remove(c);
            return true;
        }

        return false;
    }

}

