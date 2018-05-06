package handest;

public class Test {
		public static void main(String[] args) {
			CommonHandest ch = new CommonHandest();
			ch.info("G502c", "索尼爱立信");
			ch.play("热雪");
			ch.sendInfo();
			ch.call();
			
			System.out.println();
			
			AptitudeHandest ah = new AptitudeHandest();
			ah.info("I9100", "HTC");
			ah.networkConn();
			ah.play("《小时代》");
			ah.takePictures();
			ah.sendInfo();
			ah.call();
		}
}
