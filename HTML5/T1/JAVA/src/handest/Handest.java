package handest;

public abstract class Handest {
		String brand;
		String type;
		
		public void info(String type, String brand) {
				System.out.println("这是一款型号为"+type+"的"+brand+"手机");
		}
		public abstract void call() ;
			
		
		public abstract void sendInfo();

		
}
