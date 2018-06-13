package com.yonyou.iuap.baseservice.bpm.model;

import com.yonyou.iuap.baseservice.model.DeleteModel;

/**
 * 说明：工作流Model接口
 * @author houlf
 * 2018年6月12日
 */
public interface BpmModel extends DeleteModel {

	public String getFlowState();
	
	public void setFlowState(String flowState);
	
}