package handest;

public class CommonHandest extends Handest implements PlayWiring{

	@Override
	public void play(String xx) {
		System.out.println("��ʼ��������"+xx);
	}

	@Override
	public void call() {
		System.out.println("��ʼ����ͨ��");
	}

	@Override
	public void sendInfo() {
		System.out.println("����������Ϣ");
	}

}
