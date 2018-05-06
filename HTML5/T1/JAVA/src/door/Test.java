package door;

public class Test {
		public static void main(String[] args) {
			TheftProofDoor td = new TheftProofDoor();
			td.close();
			td.lockUp();
			td.takePhoto();
			td.openLock();
			td.open();
		}
}
