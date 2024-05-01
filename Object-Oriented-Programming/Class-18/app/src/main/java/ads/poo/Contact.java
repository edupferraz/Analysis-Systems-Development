
package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Contact {
    private String name;
    private String lastName;
    private LocalDate birthday;
    private ArrayList<Phone> phones;
    private ArrayList<Email> emails;

    public Contact(String name, String lastName, LocalDate birthday, ArrayList<Phone> phones, ArrayList<Email> emails) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.phones = new ArrayList<Phone>();
        this.emails = new ArrayList<Email>();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", phones=" + phones +
                ", emails=" + emails +
                '}';
    }

    public boolean addPhone(String label, String name) {

        Phone phone = new Phone(label, name);

        if (phone.getValue().isEmpty()) {
            return false;
        }

        return phones.add(phone);
    }

    public boolean addEmail(String label, String name) {

        Email email = new Email(label, name);

        if (email.getValue().isEmpty()) {
            return false;
        }

        emails.add(email);

        return true;
    }

    public boolean removePhone(String label) {

        return phones.removeIf(phone -> phone.getLabel().equals(label));
    }

    public boolean removeEmail(String label) {

        return emails.removeIf(email -> email.getLabel().equals(label));
    }

    public boolean updatePhone(String label, String value) {
        for (Phone phone: phones) {
            if(phone.getLabel().equals(label)) {
                phone.setValue(value);
                return true;
            }
        }

        return false;
    }

    public boolean updateEmail(String label, String value) {
        for (Email email: emails) {
            if(email.getLabel().equals(label)) {
                email.setValue(value);
                return true;
            }
        }

        return false;
    }

}
