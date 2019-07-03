package cn.joytur.modules.wechat.entities;

import cn.joytur.common.annotation.TabMapping;
import cn.joytur.modules.wechat.entities.WechatMemberRecommend;
import cn.joytur.modules.wechat.entities.base.BaseWechatMemberRecommend;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
@TabMapping(tabName = "joy_wechat_member_recommend")
public class WechatMemberRecommend extends BaseWechatMemberRecommend<WechatMemberRecommend> {
	public static final WechatMemberRecommend dao = new WechatMemberRecommend().dao();
}