package handest;

public class AptitudeHandest extends Handest implements TheakePictures,
Network, PlayWiring{

	@Override
	public void play(String xx) {
		System.out.println("��ʼ������Ƶ"+xx);
	}

	@Override
	public void networkConn() {
		System.out.println("�Ѿ������ƶ�����");
	}

	@Override
	public void takePictures() {
		System.out.println("����....���ճɹ�");
	}

	@Override
	public void call() {
		System.out.println("��ʼ��Ƶͨ��");
	}

	@Override
	public void sendInfo() {
		System.out.println("���ʹ�ͼƬ�����ֵ���Ϣ");
	}

}
