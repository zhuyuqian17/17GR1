package com.TaoCan;

import soso.Taocan;

public class Hualao extends Taocan{
   
	private int talkTime;
	private int messageCount;
	public int getTalkTime() {
		return talkTime;
	}
	public void setTalkTime(int talkTime) {
		this.talkTime = talkTime;
	}
	public int getMessageCount() {
		return messageCount;
	}
	public void setMessageCount(int messageCount) {
		this.messageCount = messageCount;
	}
	public String taocanxinxi(){
		return"hualaotaocan###";
	}

	@Override
	public String taoCanXinXi() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
