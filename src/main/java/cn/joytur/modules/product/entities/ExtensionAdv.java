package cn.joytur.modules.product.entities;

import com.jfinal.plugin.activerecord.Db;

import cn.joytur.common.annotation.TabMapping;
import cn.joytur.modules.product.entities.base.BaseExtensionAdv;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
@TabMapping(tabName = "joy_extension_adv")
public class ExtensionAdv extends BaseExtensionAdv<ExtensionAdv> {
	public static final ExtensionAdv dao = new ExtensionAdv().dao();
	
	/**
	 * 根据广告类型查询广告位
	 * @param advType
	 * @return
	 */
	public String findExtensionAdvImage(Integer advType){
		return Db.queryStr(getSqlPara("extensionAdv.findExtensionAdvImage").getSql(), advType); 
	}
	
}
