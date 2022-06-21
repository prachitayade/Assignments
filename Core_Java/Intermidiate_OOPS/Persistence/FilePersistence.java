package Core_Java.Intermidiate_OOPS.Persistence;

public class FilePersistence extends Persistence{

	@Override
	void persist() {
	System.out.println("Data is saved in file");	
	}

	public static void main(String[] args) {	
		//upcasting 	
		Persistence p1= new FilePersistence(); 
		p1.persist();
	}
}
