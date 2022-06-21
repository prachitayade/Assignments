package Core_Java.AdditionalAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Contact {
    private String empId, fName, lName, cellNo, emailId;

    public Contact(String empId, String fName, String lName, String cellNo, String emailId) {
        this.empId = empId;
        this.fName = fName;
        this.lName = lName;
        this.cellNo = cellNo;
        this.emailId = emailId;
    }

    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCellNo() {
        return cellNo;
    }
    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}

public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> a1 = new ArrayList<Contact>();

        String id = sc.nextLine();
        String fn = sc.nextLine();
        String ln = sc.nextLine();
        String cn = sc.nextLine();
        String em = sc.nextLine();

        String idl = sc.nextLine();
        String fn1 = sc.nextLine();
        String ln1 = sc.nextLine();
        String cn1 = sc.nextLine();
        String em1 = sc.nextLine();

        String id2 = sc.nextLine();
        String fn2 = sc.nextLine();
        String ln2 = sc.nextLine();
        String cn2 = sc.nextLine();
        String em2 = sc.nextLine();

        String id3 = sc.nextLine();
        String fn3 = sc.nextLine();
        String ln3 = sc.nextLine();
        String cn3 = sc.nextLine();
        String em3 = sc.nextLine();

        String id4 = sc.nextLine();
        String fn4 = sc.nextLine();
        String ln4 = sc.nextLine();
        String cn4 = sc.nextLine();
        String em4 = sc.nextLine();

        Contact c1 = new Contact(id, fn, ln, cn, em);
        Contact c2 = new Contact(idl, fn1, ln1, cn1, em1);
        Contact c3 = new Contact(id2, fn2, ln2, cn2, em2);
        Contact c4 = new Contact(id3, fn3, ln3, cn3, em3);
        Contact c5 = new Contact(id4, fn4, ln4, cn4, em4);

        a1.add(c1);
        a1.add(c2);
        a1.add(c3);
        a1.add(c4);
        a1.add(c5);

        Iterator<Contact> it = a1.iterator();

        while (it.hasNext()) {
            Contact c = (Contact) it.next();
            if (c.getlName().equals("Shub")) {
                System.out.println("Id:" + c.getEmailId());
                System.out.println("Name:" + c.getfName());
                System.out.println("Lastname: " + c.getlName());
                System.out.println("PhoneNumber: " + c.getCellNo());
                System.out.println("Email: " + c.getEmailId());
            }
        }
    }
}
