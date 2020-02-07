package com.bdilib.smeserviceplatform.service.government;

public interface CreditingRatingService {
    /**
     * 根据企业名称对企业登记进行判定
     * @param enterpriseName
     * @param creditRating
     */
    void creditingRating(String enterpriseName, Integer creditRating);
}
