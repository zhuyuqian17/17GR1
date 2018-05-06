package handest;

public class AptitudeHandest extends Handest implements TheakePictures,
Network, PlayWiring{

	@Override
	public void play(String xx) {
		System.out.println("开始播放视频"+xx);
	}

	@Override
	public void networkConn() {
		System.out.println("已经启动移动网络");
	}

	@Override
	public void takePictures() {
		System.out.println("咔嚓....拍照成功");
	}

	@Override
	public void call() {
		System.out.println("开始视频通话");
	}

	@Override
	public void sendInfo() {
		System.out.println("发送带图片与文字的信息");
	}

}
