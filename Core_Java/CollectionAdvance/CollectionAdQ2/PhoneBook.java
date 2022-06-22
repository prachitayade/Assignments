package CollectionAdQ2;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

	private List<Contact> phoneBook=new ArrayList<Contact>();
	
	public void setContactList (List<Contact> list) {
		phoneBook=list;
	}
	
	public List<Contact> getContactList(){
		return phoneBook;
	}
	
	public void addContact(Contact addContactobj) {
		phoneBook.add(addContactobj);
	}
	public List<Contact> viewAllContact(){
		return phoneBook;
	}
	
	public Contact viewContactGivenPhoneNumber(long phoneNumber) {
		
		Contact obj = new Contact();
		for(Contact obj1:phoneBook) {
			if(obj1.getPhoneNumber()==phoneNumber) {
				obj=obj1;
				
			}
		}
		return obj;
		
	}
	public boolean removeContact(long phoneNumber) {
		
		boolean f = false;
		
		for(Contact obj:phoneBook) {
			if(obj.getPhoneNumber()==phoneNumber) {
				f=true;
				phoneBook.remove(obj);
				break;
			}
		}
		return f;
	}
	
	
	
}
