package com.re100io.agileplatform.service;

import com.re100io.agileplatform.dao.BacklogHistoryMapper;
import com.re100io.agileplatform.entity.BacklogHistory;
import com.re100io.agileplatform.entity.BacklogHistoryExample;
import com.re100io.agileplatform.entity.BacklogHistoryWithBLOBs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BacklogHistoryService {
    @Autowired
    private BacklogHistoryMapper backlogHistoryMapper;

    // 根据条件查询
    public List<BacklogHistory> getBacklogHistoryList(String keyword, Date startTime, Date endTime) {
        BacklogHistoryExample example = new BacklogHistoryExample();
        BacklogHistoryExample.Criteria criteria = example.createCriteria();
        // 设置排序
        example.setOrderByClause("create_time DESC");
        return backlogHistoryMapper.selectByExample(example);
    }

    // 根据ID查询
    public BacklogHistory getBacklogHistoryById(Long id) {
        return backlogHistoryMapper.selectByPrimaryKey(id);
    }

    // 新增记录
    public int addBacklogHistory(BacklogHistoryWithBLOBs backlogHistory) {
        return backlogHistoryMapper.insertSelective(backlogHistory);
    }

    // 更新记录
    public int updateBacklogHistory(BacklogHistoryWithBLOBs backlogHistory) {
        return backlogHistoryMapper.updateByPrimaryKeySelective(backlogHistory);
    }

    // 删除记录
    public int deleteBacklogHistory(Long id) {
        return backlogHistoryMapper.deleteByPrimaryKey(id);
    }

    // 批量删除
    public int batchDeleteBacklogHistory(List<Long> ids) {
        BacklogHistoryExample example = new BacklogHistoryExample();
        example.createCriteria().andIdIn(ids);
        return backlogHistoryMapper.deleteByExample(example);
    }
}
