package com.ylz.urule.server.entity.medical;

import com.bstek.urule.model.Label;

/**
 * 医院
 * @author ZhouSeYi
 * @since 2019年9月20日
 */
public class Hospital {
	@Label("医院等级")
	private int level;
	
	@Label("名称")
	private String name;
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
