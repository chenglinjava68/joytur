package cn.joytur.modules.system.entities.base;

import com.jfinal.plugin.activerecord.IBean;

import cn.joytur.common.mvc.entities.DataModel;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysConfig<M extends BaseSysConfig<M>> extends DataModel<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getValue() {
		return getStr("value");
	}
	
	public M setValue(java.lang.String value) {
		set("value", value);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
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
