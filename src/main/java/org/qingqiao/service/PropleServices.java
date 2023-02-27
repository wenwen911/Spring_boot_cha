package org.qingqiao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.qingqiao.bean.People;

import java.util.List;

public interface PropleServices  {

    List<People> query();

    int insert(People people);

    People queryByid(int id);

    int update(People people);

    int delete(int id);
}
