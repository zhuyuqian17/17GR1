package com.TaoCan;

import soso.Taocan;

public class  Wangchong extends Taocan{
   private int liuliang;

public int getLiuliang() {
	return liuliang;
}

public void setLiuliang(int liuliang) {
	this.liuliang = liuliang;
}


@Override
public String taoCanXinXi() {
	return"wangchongtaocan###";
}
}
