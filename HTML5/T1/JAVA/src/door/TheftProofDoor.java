package door;

public class TheftProofDoor extends Door implements Lock ,Photo {

	@Override
	public void lockUp() {
		System.out.println("���Կ�ף�������תԿ����Ȧ�������ˣ��γ�Կ��");
	}

	@Override
	public void openLock() {
		System.out.println("���Կ�ף�������תԿ����Ȧ�������ˣ��γ�Կ��");
	}

	@Override
	public void takePhoto() {
		System.out.println("����....���ճɹ�");
	}

}
