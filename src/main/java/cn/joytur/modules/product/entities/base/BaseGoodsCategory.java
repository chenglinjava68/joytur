package cn.joytur.modules.product.entities.base;

import cn.joytur.common.mvc.entities.DataModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseGoodsCategory<M extends BaseGoodsCategory<M>> extends DataModel<M> implements IBean {

	public M setId(String id) {
		set("id", id);
		return (M)this;
	}

	public String getId() {
		return getStr("id");
	}

	public M setCategoryName(java.lang.String categoryName) {
		set("category_name", categoryName);
		return (M)this;
	}

	public java.lang.String getCategoryName() {
		return get("category_name");
	}

	public M setDescription(java.lang.String description) {
		set("description", description);
		return (M)this;
	}

	public java.lang.String getDescription() {
		return get("description");
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