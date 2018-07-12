package com.xbongbong.paas.dao;

import com.xbongbong.paas.domain.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

/**
 * @author: wufeng
 * @date: 2018/7/12 14:02
 * @desrcption:
 */
@Repository
@Mapper
public interface UserDaoMapper {
    /**
     * 查询用户
     * @author wufeng
     * @date 2018/7/12 15:08
     * @param id
     * @descption
     * @return com.xbongbong.paas.dto.resp.UserResp
     */
    UserModel findUser(Long id);
}
