package cn.tedu.sbm.mapper;

import cn.tedu.sbm.entiry.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DemoMapper {
    //List<TbUser> findTbUser(@Param("user") TbUser user);
    List<TbUser> findTbUser(@Param("map") Map<String,Object> map);
}
