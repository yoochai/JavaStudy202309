package ex09_Inher02;

public class Example01 {

	public static void main(String[] args) {
		BabyCat catObj = new BabyCat("샴고양이", "초콜릿색");
		
		catObj.eat();
		catObj.meow();
		System.out.println(catObj.breed);
	}

}
