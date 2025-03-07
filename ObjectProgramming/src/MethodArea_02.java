import vo.Person;

public class MethodArea_02 {

	public static void main(String[] args) {
		Person person = new Person("최종선", 180.0F, 60.5F);
		
		Person person2 = new Person();
		person2.setName("김건우");
		String name = person2.getName();
		System.out.println(name);
//		person2.name = "김건우";
//		person2.height = 185.5F;
//		person2.weight = 80.3F;
		
	}

}
