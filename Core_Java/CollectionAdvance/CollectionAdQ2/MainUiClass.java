package CollectionAdQ2;

import java.util.List;
import java.util.Scanner;

public class MainUiClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i =0;
		PhoneBook phonebook = new PhoneBook();
		while(i==0) {
			System.out.println("1.Add Contact \n2.Display all contacts\n3.Search Contact By Phone\n4.Remove Contact\n5.Exit");
			System.out.println("Enter Your Choice: ");
			int n =Integer.parseInt(sc.nextLine());
			if(n==1) {
				Contact obj = new Contact();
				System.out.println("Add a Contact: ");
				System.out.println("Enter the First Name: ");
				obj.setFirstName(sc.nextLine());
				System.out.println("Enter the Last Name: ");
				obj.setLastName(sc.nextLine());
				System.out.println("Enter the Phone Number: ");
				obj.setPhoneNumber(Long.parseLong(sc.nextLine()));
				System.out.println("Enter the Email: ");
				obj.setEmailId(sc.nextLine());
				phonebook.addContact(obj);
			}
			if(n==2) {
				System.out.println("The Contact in the List Are: ");
				List<Contact>obj = phonebook.viewAllContact();
				for(Contact objq:obj) {
					System.out.println("First NAme: "+objq.getFirstName());
					System.out.println("Last Name: "+ objq.getLastName());
					System.out.println("Phone No: "+objq.getPhoneNumber());
					System.out.println("Email Id: "+objq.getEmailId());
					
				}
			}				
				if(n==3) {
					System.out.println("Enter the Phone Number to Search Contact");
					Long number = Long.parseLong(sc.nextLine());
					Contact obj1= phonebook.viewContactGivenPhoneNumber(number);
					System.out.println("The Contact Is :");
					System.out.println("First Name: "+obj1.getFirstName() );
					System.out.println("Last Name: "+obj1.getLastName());
					System.out.println("Phone Number: "+obj1.getPhoneNumber());
					System.out.println("Email Id: "+obj1.getEmailId());
					
				}
				if(n==4) {
					System.out.println("Enter the phone number to remove :");
					Long number=Long.parseLong(sc.nextLine());
					System.out.println("Do You Want remove The Contact(Yes/No)");
					String str=sc.nextLine();
					
					if(str.equals("Yes")) {
						boolean f1 = phonebook.removeContact(number);
						if(f1) {
							System.out.println("The Contact is Successfully Deleted.");
						}
						else {
								System.out.println("Contact is Not Found Please Enter Again.");
							}
						}
					if(str.equals("No")) {
						System.out.println("Ok......Thank You!!");
					}
					if(n==5) {
						System.exit(0);
					}
				}
			}
		}
		
		
	}
