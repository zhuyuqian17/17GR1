package handest;

public abstract class Handest {
		String brand;
		String type;
		
		public void info(String type, String brand) {
				System.out.println("����һ���ͺ�Ϊ"+type+"��"+brand+"�ֻ�");
		}
		public abstract void call() ;
			
		
		public abstract void sendInfo();

		
}
