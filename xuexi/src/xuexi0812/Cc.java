package xuexi0812;

public class Cc extends Ff {
	public void test() {
		System.out.println(66666);
	}
        public static void main(String[] args) {
        	
			Cc cc=(Cc) new Ff();
			cc.test();
			//int a[]= {,1,2,3,4,5};
		}
}
class Ff{
	public Ff() {
		test1();
		System.out.println(2);
	}
	public void test1() {
		System.out.println(1);
	}
}
