
public class Jisuanji extends Jisuan implements CPU,EMS,HardDisk {

	@Override
	public void rongliang(String r) {
		System.out.println("硬盘容量是："+r);
	}

	@Override
	public void ems(String h) {
		System.out.println("内存容量是："+h);
	}

	@Override
	public void cpu(String s, String f) {
		System.out.println("CPU的品牌是："+s+","+"主频是"+f);
	}

	@Override
	public void cc() {
		System.out.println("计算机的信息如下：");
	}

}
