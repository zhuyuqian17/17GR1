package soso;
import java.util.Random;
import java.util.Scanner;

import com.TaoCan.superman;


public class Test {
	
	UserPlus uu=new UserPlus();
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		System.out.println("��ӭʹ�����ƶ�����ϵͳ");
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
		System.out.println("1.�û���¼ 2.�û�ע�� 3.��ѯ�û� 4.�˳�");
		String next=sc.next();
		if (next.equals("1")) {
			System.out.println("���¼");
			denglu();
		}else if(next.equals("2")){
			System.out.println("��ע��");
			zhuce();
			
		}else if(next.equals("3")){
			
		}else{
			System.out.println("�������");
			break;
		}
	}
}
	private void zhuce() throws Exception {
		String[] numbers =new String[8];
		for (int j = 0; j < numbers.length; j++) {
			numbers[j]=huodehaoma();
			System.out.println("������"+(j+1)+"��"+numbers[j]);
		}
		System.out.println("��ѡ������");
		int sjhIndex=sc.nextInt();
		String sjh="";
		if (sjhIndex>=0&& sjhIndex<=8) {
			sjh=numbers[sjhIndex-1];
		} else {
			throw new Exception("�����Ų��ԣ�������ֹ");
		}
	
	boolean isExit=uu.IsExit(sjh);
	if(!isExit){
		System.out.println("�������");
		System.out.println("�������û�����");
		String name=sc.next();
		System.out.println("���������룺");
		String ps=sc.next();
		Users u=new Users(sjh, name,ps);
		uu.addUser(u);
		System.out.println("��ϲ�㣬ע��ɹ���");
		Taocan xuanzetaocan = xuanzetaocan();
		u.setTaocan(xuanzetaocan);
		u.print();
		uu.addUser(u);
	}else{
		System.out.println("ע��ʧ��");
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
		System.out.println("�������ֻ���");
		String sjh=sc.next();
		System.out.println("����������");
		String ps=sc.next();
		boolean isExit=uu.IsExit(sjh,ps);
		if(!isExit){
			System.out.println("��½�ɹ�");
		}else{
			System.out.println("��½ʧ��");
		}
	}
	private Taocan xuanzetaocan() {
		Taocan tc = null;
		System.out.println(" 1.�����ײ�2.�����ײ�3.�����ײ� ");
		
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