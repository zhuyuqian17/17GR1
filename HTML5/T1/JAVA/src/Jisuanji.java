
public class Jisuanji extends Jisuan implements CPU,EMS,HardDisk {

	@Override
	public void rongliang(String r) {
		System.out.println("Ӳ�������ǣ�"+r);
	}

	@Override
	public void ems(String h) {
		System.out.println("�ڴ������ǣ�"+h);
	}

	@Override
	public void cpu(String s, String f) {
		System.out.println("CPU��Ʒ���ǣ�"+s+","+"��Ƶ��"+f);
	}

	@Override
	public void cc() {
		System.out.println("���������Ϣ���£�");
	}

}
