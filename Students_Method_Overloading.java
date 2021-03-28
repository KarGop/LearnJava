package week3.day1;

public class Students_Method_Overloading {
    public void getStudentInfo(int id) {
    	System.out.println("Student1 ID: "+ id);
    }
    public void getStudentInfo(int id, String name) {
    	System.out.println("Student2 ID: "+ id);
    	System.out.println("Student2 Name: "+ name);
    	
    }
    public void getStudentInfo(String Email, String PhNo) {
    	System.out.println("Student3 Mail id : "+ Email);
    	System.out.println("Student3 Phone Number :"+ PhNo);
    }
	public static void main(String[] args) {
		Students_Method_Overloading overloading = new Students_Method_Overloading();
		overloading.getStudentInfo(105);
		overloading.getStudentInfo(100,"Ragav");
		overloading.getStudentInfo("hello@gmail.com","9876543210");
	}

}
