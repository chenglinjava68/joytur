package cn.joytur.modules.wechat.entities;

import cn.joytur.common.annotation.TabMapping;
import cn.joytur.modules.wechat.entities.WechatMemberAddr;
import cn.joytur.modules.wechat.entities.base.BaseWechatMemberAddr;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
@TabMapping(tabName = "joy_wechat_member_addr")
public class WechatMemberAddr extends BaseWechatMemberAddr<WechatMemberAddr> {
	public static final WechatMemberAddr dao = new WechatMemberAddr().dao();
}
