package com.demo.rabbitmq.dao;

import com.demo.rabbitmq.domain.UserModel;
import org.apache.ibatis.annotations.Mapper;
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
     * @return UserResp
     */
    UserModel findUser(Long id);
}
