package cn.tedu.sbm.service.impl;


import cn.tedu.sbm.entiry.TbUser;
import cn.tedu.sbm.mapper.DemoMapper;
import cn.tedu.sbm.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public List<TbUser> findObject() {

        TbUser tbUser = new TbUser();
        tbUser.setUsername("tony");
        Map<String, Object> map = new HashMap<>();
        map.put("user",tbUser);
        return  demoMapper.findTbUser(map);
    }
}
