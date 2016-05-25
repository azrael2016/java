package test_9_1;

public class Test {

	public static void main(String[] args) {
		bank_account b = new bank_account();
		b.getID("azrael");
		b.jiaMoney(5000000);
		b.jianMoney(200000);
		b.jiaMoney(5000000);
		b.jianMoney(200000000);
		b.jiaMoney(5000000);
		b.jianMoney(2000000);
		b.jiaMoney(5000000);
		b.jianMoney(200000000);
		b.selectMoney();
	}

}
