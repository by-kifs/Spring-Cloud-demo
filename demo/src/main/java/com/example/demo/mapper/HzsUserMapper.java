package com.example.demo.mapper;


import com.example.demo.vo.HzsUBUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by cys on 2017/7/10.
 */
@Mapper
public interface HzsUserMapper {


    HzsUBUser findUser(@Param("userId") Integer userId);

    Map<String, Integer> getUserTotalExp(@Param("userId") Integer userId);

    Integer getUserTotalCoins(@Param("userId") Integer userId);

    Integer getJudgementStatisticsTotalTimeSubPlaylistPreview(@Param("userId") Integer userId, @Param("assessmentId") Integer assessmentId);



}
