package cn.joytur.modules.product.entities.base;

import com.jfinal.plugin.activerecord.IBean;

import cn.joytur.common.mvc.entities.DataModel;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseGoodsRule<M extends BaseGoodsRule<M>> extends DataModel<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public M setRuleName(java.lang.String ruleName) {
		set("rule_name", ruleName);
		return (M)this;
	}
	
	public java.lang.String getRuleName() {
		return getStr("rule_name");
	}

	public M setPlayedNum(java.lang.Long playedNum) {
		set("played_num", playedNum);
		return (M)this;
	}
	
	public java.lang.Long getPlayedNum() {
		return getLong("played_num");
	}

	public M setFailNum(java.lang.Long failNum) {
		set("fail_num", failNum);
		return (M)this;
	}
	
	public java.lang.Long getFailNum() {
		return getLong("fail_num");
	}
	
	public M setDiffValue(java.lang.String diffValue) {
		set("diff_value", diffValue);
		return (M)this;
	}
	
	public java.lang.String getDiffValue() {
		return getStr("diff_value");
	}
	
	public M setStatus(java.lang.Long status) {
		set("status", status);
		return (M)this;
	}
	
	public java.lang.Long getStatus() {
		return getLong("status");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public M setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
		return (M)this;
	}
	
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

}
