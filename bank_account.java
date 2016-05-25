package test_9_1;

public class bank_account {
	private String ID;
	private double money=0;
	public void getMoney(double m){
		money=m;
	}
	public double setMoney(){
		return money;
	}
	public void getID(String s){
		ID=s;
	}
	public String setID(){
		return ID;
	}
	public void selectMoney(){
		System.out.printf("’Àªß£∫%10s   ”‡∂Ó£∫%.2f",ID,money);
	}
	public void jiaMoney(double m){
		money=money+m;
	}
	public void jianMoney(double m){
		try{
			if(money < m) throw new Beyond("”‡∂Ó≤ª◊„");
			else money=money-m;
		}catch (Beyond e){
			e.printStackTrace();
		}
	}
}
