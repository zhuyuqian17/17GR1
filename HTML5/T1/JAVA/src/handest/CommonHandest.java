package handest;

public class CommonHandest extends Handest implements PlayWiring{

	@Override
	public void play(String xx) {
		System.out.println("开始播放音乐"+xx);
	}

	@Override
	public void call() {
		System.out.println("开始语音通话");
	}

	@Override
	public void sendInfo() {
		System.out.println("发送文字信息");
	}

}
