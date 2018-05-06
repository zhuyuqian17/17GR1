package prin;

public class Dd extends Print implements InkBox , Paper {

	@Override
	public void zhi(String x) {
		System.out.println("在"+x+"纸张上打印");
	}

	@Override
	public void mohe(String z) {
		System.out.print("使用"+z+"墨盒");
	}

	@Override
	public void dayin() {
		System.out.println();
	}
		
}
