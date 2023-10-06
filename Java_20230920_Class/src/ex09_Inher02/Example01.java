package ex09_Inher02;

public class Example01 {

	public static void main(String[] args) {
		BabyCat catobj = new BabyCat("샴고양이", "초콜릿색");
		
		catobj.eat();
		catobj.meow();
		System.out.println(catobj.color);
		System.out.println(catobj.breed);
	}

}
