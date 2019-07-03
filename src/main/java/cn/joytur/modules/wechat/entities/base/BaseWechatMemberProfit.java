package cn.joytur.modules.wechat.entities.base;

import com.jfinal.plugin.activerecord.IBean;

import cn.joytur.common.mvc.entities.DataModel;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseWechatMemberProfit<M extends BaseWechatMemberProfit<M>> extends DataModel<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public M setWechatMemberId(java.lang.String wechatMemberId) {
		set("wechat_member_id", wechatMemberId);
		return (M)this;
	}
	
	public java.lang.String getWechatMemberId() {
		return getStr("wechat_member_id");
	}

	public M setRecommendRuleId(java.lang.String recommendRuleId) {
		set("recommend_rule_id", recommendRuleId);
		return (M)this;
	}
	
	public java.lang.String getRecommendRuleId() {
		return getStr("recommend_rule_id");
	}
	
	public M setRecVal1(java.lang.Double recVal1) {
		set("rec_val1", recVal1);
		return (M)this;
	}
	
	public java.lang.Double getRecVal1() {
		return getDouble("rec_val1");
	}

	public M setRecVal2(java.lang.Double recVal2) {
		set("rec_val2", recVal2);
		return (M)this;
	}
	
	public java.lang.Double getRecVal2() {
		return getDouble("rec_val2");
	}

	public M setRecVal3(java.lang.Double recVal3) {
		set("rec_val3", recVal3);
		return (M)this;
	}
	
	public java.lang.Double getRecVal3() {
		return getDouble("rec_val3");
	}

	public M setLastMirror(java.lang.String lastMirror) {
		set("last_mirror", lastMirror);
		return (M)this;
	}
	
	public java.lang.String getLastMirror() {
		return getStr("last_mirror");
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