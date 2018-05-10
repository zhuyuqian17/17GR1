package com.TaoCan;

import jieinterface.Dadianhua;
import jieinterface.Duanxin;
import jieinterface.Liuliang;
import soso.Taocan;

public class superman extends Taocan implements Liuliang , Dadianhua , Duanxin{
  
	
	private int liuliang;
	
	private int message;
	
	private int taliTime;
	
	public superman() {
		this.liuliang = 1*1024;
		this.message = 50;
		this.taliTime = 200;
	}

	public int getLiuliang() {
		return liuliang;
	}

	public void setLiuliang(int liuliang) {
		this.liuliang = liuliang;
	}

	public int getMessage() {
		return message;
	}

	public void setMessage(int message) {
		this.message = message;
	}

	public int getTaliTime() {
		return taliTime;
	}

	public void setTaliTime(int taliTime) {
		this.taliTime = taliTime;
	}

	
	public void Dadianhua(int talkTime,String User){
		
	}
	public String taocanxinxi(){
		return"chaorentaocan###";
	}

	@Override
	public void DaDianHua(int talkTime, String User) {
	
		
	}

	@Override
	public String taoCanXinXi() {
	
		return null;
	}
	
	
}
