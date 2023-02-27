package org.qingqiao.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.qingqiao.bean.People;
import org.qingqiao.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeoPleService implements PropleServices{


    @Autowired
    public PeopleMapper mapper;


    @Override
    public List<People> query() {

        return mapper.selectList(null);
    }

    @Override
    public int insert(People people) {
        int insert = mapper.insert(people);
        return insert;
    }

    @Override
    public People queryByid(int id) {
        return mapper.selectById(id);
    }

    @Override
    public int update(People people) {
        return mapper.updateById(people);
    }

    @Override
    public int delete(int id) {
        return mapper.deleteById(id);

    }
}
