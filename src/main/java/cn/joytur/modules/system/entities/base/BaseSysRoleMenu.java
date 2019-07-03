package cn.joytur.modules.system.entities.base;

import com.jfinal.plugin.activerecord.IBean;

import cn.joytur.common.mvc.entities.DataModel;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysRoleMenu<M extends BaseSysRoleMenu<M>> extends DataModel<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public M setRoleId(java.lang.String roleId) {
		set("role_id", roleId);
		return (M)this;
	}
	
	public java.lang.String getRoleId() {
		return getStr("role_id");
	}
	
	public M setMenuId(java.lang.String menuId) {
		set("menu_id", menuId);
		return (M)this;
	}
	
	public java.lang.String getMenuId() {
		return getStr("menu_id");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
