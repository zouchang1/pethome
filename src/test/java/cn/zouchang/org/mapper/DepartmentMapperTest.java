package cn.zouchang.org.mapper;

import cn.zouchang.BasicTest;
import cn.zouchang.org.domain.Department;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class DepartmentMapperTest extends BasicTest {
    @Autowired
    private DepartmentMapper mapper;
    @Test
    public void loadById() {
        System.out.println(mapper.loadById(1L));;
    }

    @Test
    public void loadAll() {
        mapper.loadAll().forEach(p-> System.out.println(p) );
    }
}