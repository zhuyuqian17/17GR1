package prin;

public class Dd extends Print implements InkBox , Paper {

	@Override
	public void zhi(String x) {
		System.out.println("��"+x+"ֽ���ϴ�ӡ");
	}

	@Override
	public void mohe(String z) {
		System.out.print("ʹ��"+z+"ī��");
	}

	@Override
	public void dayin() {
		System.out.println();
	}
		
}
