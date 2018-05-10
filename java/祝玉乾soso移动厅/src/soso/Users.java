package soso;

public class Users {
  
	
	private String cardNum;
	private String name;
	private String password;
	
	private Taocan taocan;
	
	private int realTalkTime;
	private int realMsgCount;
	private int realLiuLiang;
	
	private double comsumMoney;
	private double money;
	public Users() {
	
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Taocan getTaocan() {
		return taocan;
	}
	public void setTaocan(Taocan taocan) {
		this.taocan = taocan;
	}
	public Users(String cardNum, String name, String password) {
		
		this.cardNum = cardNum;
		this.name = name;
		this.password = password;
	}
public Users(String cardNum, String name, String password,Taocan tc) {
		this.taocan = tc;
		this.cardNum = cardNum;
		this.name = name;
		this.password = password;
	}
	public int getRealTalkTime() {
		return realTalkTime;
	}
	public void setRealTalkTime(int realTalkTime) {
		this.realTalkTime = realTalkTime;
	}
	public int getRealMsgCount() {
		return realMsgCount;
	}
	public void setRealMsgCount(int realMsgCount) {
		this.realMsgCount = realMsgCount;
	}
	public int getRealLiuLiang() {
		return realLiuLiang;
	}
	public void setRealLiuLiang(int realLiuLiang) {
		this.realLiuLiang = realLiuLiang;
	}
	public double getComsumMoney() {
		return comsumMoney;
	}
	public void setComsumMoney(double comsumMoney) {
		this.comsumMoney = comsumMoney;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public void print() { 
		System.out.println("手机号：" + cardNum + ", 用户名：" + name + ", 密码：" + password + ", 套餐：" + taocan.taoCanXinXi()
				+ ",通话时长：" + realTalkTime + ", 短信：" + realMsgCount + ",流量：" + realLiuLiang
				+ ",总钱数：" + comsumMoney + ",余额：" + money + "]"
	);
		 
		
	}
	
}
