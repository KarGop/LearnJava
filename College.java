package week3.day1;

public class College extends University{

	@Override
	public void ug() {
		System.out.println("UG from Runner class");
		
	}
	public static void main(String[] args) {
		College college = new College();
		college.ug();
		college.pg();

	}

}
