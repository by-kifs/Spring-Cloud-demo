package com.example.demo.service.impl;

import com.example.demo.mapper.HzsUserMapper;
import com.example.demo.service.IHzsUserTestService;
import com.example.demo.vo.HzsUBUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cys on 2017/9/7.
 */
@Service
public class HzsUserTestServiveImpl implements IHzsUserTestService{

    @Autowired
    private HzsUserMapper userMapper;

    public HzsUBUser getUser(Integer userId){
        HzsUBUser user = userMapper.findUser(userId);
        return user;
    }


//    @TargetDatasource(name = "sub")
    public Integer getJudgementStatisticsTotalTimeSubPlaylistPreview(Integer userId,Integer assessmentId){
        return userMapper.getJudgementStatisticsTotalTimeSubPlaylistPreview(userId,assessmentId);
    }
}
