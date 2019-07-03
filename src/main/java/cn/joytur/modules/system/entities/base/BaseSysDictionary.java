package cn.joytur.modules.system.entities.base;

import com.jfinal.plugin.activerecord.IBean;

import cn.joytur.common.mvc.entities.DataModel;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysDictionary<M extends BaseSysDictionary<M>> extends DataModel<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public M setDictCode(java.lang.String dictCode) {
		set("dict_code", dictCode);
		return (M)this;
	}
	
	public java.lang.String getDictCode() {
		return getStr("dict_code");
	}

	public M setDictName(java.lang.String dictName) {
		set("dict_name", dictName);
		return (M)this;
	}
	
	public java.lang.String getDictName() {
		return getStr("dict_name");
	}

	public M setDictValue(java.lang.String dictValue) {
		set("dict_value", dictValue);
		return (M)this;
	}
	
	public java.lang.String getDictValue() {
		return getStr("dict_value");
	}

	public M setDescription(java.lang.String description) {
		set("description", description);
		return (M)this;
	}
	
	public java.lang.String getDescription() {
		return getStr("description");
	}

	public M setSort(java.lang.Long sort) {
		set("sort", sort);
		return (M)this;
	}
	
	public java.lang.Long getSort() {
		return getLong("sort");
	}
	
	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
