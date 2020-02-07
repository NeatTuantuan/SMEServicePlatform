package com.bdilib.smeserviceplatform.service.bank.demandcheck;
import com.bdilib.smeserviceplatform.vo.DemandCheckVO;

import java.util.List;

/*
   ** 金融机构用户可查看通过选择信息来查看企业发布的需求
   * * @param   loanLimit,lowerLimit,upperLimit,loanPeriod,guaranteeMode
   * * @return  EnterpriseReq, "meta"
   *
 */
public interface DemandCheckService {

   List<DemandCheckVO> demandcheck(Integer loanLimit, double rateLowerLimit, double rateUpperLimit, Integer loanPeriod, Integer guaranteeMode);
}
