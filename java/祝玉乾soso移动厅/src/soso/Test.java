package soso;
import java.util.Random;
import java.util.Scanner;

import com.TaoCan.superman;


public class Test {
	
	UserPlus uu=new UserPlus();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		System.out.println("欢迎使用嗖嗖移动大厅系统");
		Test t=new Test();
		t.mainLc();
	}
	public void init(){
		Users u1 = new Users("22","man","159",new superman());
		Users u2 = new Users("33","and","159",new superman());

		Users u3 = new Users("55","ant","159",new superman());
		uu.addUser(u1);
		uu.addUser(u2);

		uu.addUser(u3);

	}
	private void mainLc()throws Exception {
		while(true){
		System.out.println("1.用户登录 2.用户注册 3.查询用户 4.退出");
		String next=sc.next();
		if (next.equals("1")) {
			System.out.println("请登录");
			denglu();
		}else if(next.equals("2")){
			System.out.println("请注册");
			zhuce();
			
		}else if(next.equals("3")){
			
		}else{
			System.out.println("程序结束");
			break;
		}
	}
}
	private void zhuce() throws Exception {
		String[] numbers =new String[8];
		for (int j = 0; j < numbers.length; j++) {
			numbers[j]=huodehaoma();
			System.out.println("号码是"+(j+1)+"个"+numbers[j]);
		}
		System.out.println("请选号码编号");
		int sjhIndex=sc.nextInt();
		String sjh="";
		if (sjhIndex>=0&& sjhIndex<=8) {
			sjh=numbers[sjhIndex-1];
		} else {
			throw new Exception("输入编号不对，程序终止");
		}
	
	boolean isExit=uu.IsExit(sjh);
	if(!isExit){
		System.out.println("号码可用");
		System.out.println("请输入用户名：");
		String name=sc.next();
		System.out.println("请输入密码：");
		String ps=sc.next();
		Users u=new Users(sjh, name,ps);
		uu.addUser(u);
		System.out.println("恭喜你，注册成功！");
		Taocan xuanzetaocan = xuanzetaocan();
		u.setTaocan(xuanzetaocan);
		u.print();
		uu.addUser(u);
	}else{
		System.out.println("注册失败");
	}
}
	private String huodehaoma() {
		String prefix="187";
		String haoma="";
		Random r=new Random();
		while(true){
			int nextInt=r.nextInt(10000000);
			if(nextInt<10000000){
				haoma = prefix + nextInt;
				break;
			}
			System.out.println("xxxxxx");
		}
		return haoma;
	}
	private void denglu() {
		System.out.println("请输入手机号");
		String sjh=sc.next();
		System.out.println("请输入密码");
		String ps=sc.next();
		boolean isExit=uu.IsExit(sjh,ps);
		if(!isExit){
			System.out.println("登陆成功");
		}else{
			System.out.println("登陆失败");
		}
	}
	private Taocan xuanzetaocan() {
		Taocan tc = null;
		System.out.println(" 1.超人套餐2.网虫套餐3.话痨套餐 ");
		
		String next = sc.next();
		if(next.equals("1")){
			tc = new superman();
		} else if(next.equals("2")){
			tc = new superman();
		} else if(next.equals("3")){
			tc = new superman();
		} 

		return tc;
	}
	
}