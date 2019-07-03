package cn.joytur.modules.product.entities;

import java.util.List;

import com.jfinal.kit.Kv;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.SqlPara;

import cn.joytur.common.annotation.TabMapping;
import cn.joytur.common.mvc.constant.DictAttribute;
import cn.joytur.common.mvc.dto.Sort;
import cn.joytur.common.utils.JoyDictUtil;
import cn.joytur.modules.product.entities.base.BaseRechargeRuleQrCode;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
@TabMapping(tabName = "joy_recharge_rule_qrcode")
public class RechargeRuleQrCode extends BaseRechargeRuleQrCode<RechargeRuleQrCode> {
	public static final RechargeRuleQrCode dao = new RechargeRuleQrCode().dao();
	
	/**
	 * 分页查询
	 */
	public Page<RechargeRuleQrCode> paginate(int pageNumber, int pageSize, RechargeRuleQrCode query, Sort sort){
		SqlPara sqlPara = getSqlPara("rechargeRuleQrCode.findListPage", Kv.by("query", query));
		return paginate(pageNumber, pageSize, sqlPara);
	}
	
	/**
	 * 查询定额未锁定金额
	 * @param rechargeRuleId
	 * @return
	 */
	public List<RechargeRuleQrCode> findUnlockQrCodeListByTransAmt(Double minAmt, Double maxAmt){
		Long status = Long.valueOf(JoyDictUtil.getDictValue(DictAttribute.RECHARGE_ORDER_STATUS_UNPAY, DictAttribute.RECHARGE_ORDER_STATUS, "1"));
		
		Kv kv = Kv.by("status", status);
		kv.set("minAmt", minAmt);
		kv.set("maxAmt", maxAmt);
		
		SqlPara sqlPara = getSqlPara("rechargeRuleQrCode.findUnlockQrCodeListByRechargeRuleId", kv);
		return find(sqlPara);
	}
}