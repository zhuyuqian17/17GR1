package handest;

public class Test {
		public static void main(String[] args) {
			CommonHandest ch = new CommonHandest();
			ch.info("G502c", "���ᰮ����");
			ch.play("��ѩ");
			ch.sendInfo();
			ch.call();
			
			System.out.println();
			
			AptitudeHandest ah = new AptitudeHandest();
			ah.info("I9100", "HTC");
			ah.networkConn();
			ah.play("��Сʱ����");
			ah.takePictures();
			ah.sendInfo();
			ah.call();
		}
}
