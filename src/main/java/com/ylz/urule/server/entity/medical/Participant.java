package com.ylz.urule.server.entity.medical;

import com.bstek.urule.model.Label;

/**
 * 参保人
 * @author ZhouSeYi
 * @since 2019年9月20日
 */
public class Participant {
	public static final int INVALID_IDENtiFY_INDEX = -1;
	
	@Label("第一级别身份")
	FirstIdentify firstLevel;
	@Label("第二级别身份")
	SecondIdentify secondLevel;
	
	public int getFirstLevel() {
		return firstLevel == null ? INVALID_IDENtiFY_INDEX : firstLevel.getIndex();
	}

	public void setFirstLevel(int firstLevel) {
		this.firstLevel = FirstIdentify.fromIndex(firstLevel);
	}

	public int getSecondLevel() {
		return secondLevel == null ? INVALID_IDENtiFY_INDEX : secondLevel.getIndex();
	}

	public void setSecondLevel(int secondLevel) {
		this.secondLevel = SecondIdentify.fromIndex(secondLevel);
	}

	static public enum SecondIdentify {
		ONJOB(0), ONJOB_SERVANT(1), TEMP_WORKER(2), RETIRE(3), RETIRE_SERVANT(4), SOLIDER(5),                   // local
		MEDICAL_SMALL_THAN_6M(6), MEDICAL_6M_TO_2Y(7), MEDICAL_MORE_THAN_2Y(8),                        // other palce
		HOURSE_SMALL_5Y(9), HOURSE_MORE_THAN_5Y(10);
		
		private int index;
		private SecondIdentify(int index) {
			this.index = index;
		}
		
		public int getIndex() {
			return index;
		}
		
		public static SecondIdentify fromIndex(int index) {
			for(SecondIdentify value : SecondIdentify.values()) {
				if(index == value.getIndex()) {
					return value;
				}
			}
			return null;
		}
	}
	
	static public enum FirstIdentify {
		LOCAL(0), DIFFPLACE(1), RETIRE(2), TOWN(3), COUNTRYSIDE(4), COLLEAGE(5);
		
		private int index;
		private FirstIdentify(int index) {
			this.index = index;
		}
		
		public int getIndex() {
			return index;
		}
		
		public static FirstIdentify fromIndex(int index) {
			for(FirstIdentify value : FirstIdentify.values()) {
				if(index == value.getIndex()) {
					return value;
				}
			}
			return null;
		}
	}

}
