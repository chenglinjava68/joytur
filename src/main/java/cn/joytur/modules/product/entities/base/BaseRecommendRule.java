package cn.joytur.modules.product.entities.base;

import com.jfinal.plugin.activerecord.IBean;

import cn.joytur.common.mvc.entities.DataModel;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRecommendRule<M extends BaseRecommendRule<M>> extends DataModel<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public M setRecType(java.lang.Long recType) {
		set("rec_type", recType);
		return (M)this;
	}
	
	public java.lang.Long getRecType() {
		return getLong("rec_type");
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
	
	public M setRecAmount(java.lang.Double recAmount) {
		set("rec_amount", recAmount);
		return (M)this;
	}

	public java.lang.Double getRecAmount() {
		return getDouble("rec_amount");
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