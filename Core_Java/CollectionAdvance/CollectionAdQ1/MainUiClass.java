package CollectionAdQ1;
import java.util.List;
import java.util.Scanner;


public class MainUiClass {

	public static void main(String[] args) {
		
		Library library = new Library();
		
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		while(i==0) {
			System.out.println("1.Add Member \n2 .View All Members\n3.Search Member By Address\n4.Exit");
			System.out.println("Enter Your Choce");
			int n = Integer.parseInt(sc.nextLine());
			
			if(n==1) {
				Member obj = new Member();
				System.out.println("Enter the Id:");
				obj.setMemeberId(Integer.parseInt(sc.nextLine()));
				System.out.println("Enter the Name:");
				obj.setMemberName(sc.nextLine());
				System.out.println("Enter the Address:");
				obj.setAddress(sc.nextLine());
				library.addMember(obj);
			}
			if(n==2) {
				List<Member>obj1=library.viewAllMembers();
				for(Member o1:obj1) {
					System.out.println("Id:"+o1.getMemeberId());
					System.out.println("Name:"+o1.getMemberName());
					System.out.println("Address:"+o1.getAddress());
				}
			}
			
			if(n==3) {
				System.out.println("Enter the Address:");
				List<Member>obj = library.viewMemberByAddress(sc.nextLine());
				for(Member obj1:obj) {
					System.out.println("Id:"+obj1.getMemeberId());
					System.out.println("Name:"+obj1.getMemberName());
					System.out.println("Address:"+obj1.getAddress());
				}
			}
			if(n==4) {
				System.exit(0);
			}
		}
		

	}
}
