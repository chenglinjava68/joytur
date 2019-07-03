package cn.joytur.modules.system.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.SqlPara;

import cn.joytur.common.annotation.TabMapping;
import cn.joytur.modules.system.entities.SysUser;
import cn.joytur.modules.system.entities.base.BaseSysUser;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
@TabMapping(tabName = "joy_sys_user")
public class SysUser extends BaseSysUser<SysUser> {
	public static final SysUser dao = new SysUser().dao();
	
	/**
	 * 根据角色查询用户列表
	 * @param roleId
	 * @return
	 */
	public List<SysUser> findByRoleId(String roleId){
		SqlPara sqlPara = getSqlPara("user.findByRoleId", roleId);
		return find(sqlPara);
	}
	
	/**
	 * 根据用户id查询权限列表
	 * @param roleId
	 * @return
	 */
	public List<String> findPermissionByUserId(String userId){
		SqlPara sqlPara = getSqlPara("user.findPermissionByUserId", userId);
		List<Record> rcList = Db.find(sqlPara);
		
		List<String> permList = null;
		if(rcList != null && rcList.size() > 0) {
			permList = rcList.stream().map(rc->rc.getStr("permission")).collect(Collectors.toList());
		}else {
			permList = new ArrayList<String>();
		}
		
		return permList;
	}
	
}
