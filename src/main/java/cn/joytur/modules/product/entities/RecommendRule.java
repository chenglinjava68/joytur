package cn.joytur.modules.product.entities;

import cn.joytur.common.annotation.TabMapping;
import cn.joytur.modules.product.entities.base.BaseRecommendRule;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
@TabMapping(tabName = "joy_recommend_rule")
public class RecommendRule extends BaseRecommendRule<RecommendRule> {
	public static final RecommendRule dao = new RecommendRule().dao();
}
