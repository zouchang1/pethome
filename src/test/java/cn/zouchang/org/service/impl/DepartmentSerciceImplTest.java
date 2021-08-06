package cn.zouchang.org.service.impl;

import cn.zouchang.BasicTest;
import cn.zouchang.basic.util.PageList;
import cn.zouchang.org.domain.Department;
import cn.zouchang.org.query.DepartmentQuery;
import cn.zouchang.org.service.IDepartmentSercice;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class DepartmentSerciceImplTest extends BasicTest {
    @Autowired
    private IDepartmentSercice sercice;
    @Test
    public void save() {
        Department d = sercice.loadById(1L);
        d.setId(null);
        d.setName("哈哈哈");
        sercice.save(d);
    }

    @Test
    public void remove() {
        sercice.remove(46L);
    }

    @Test
    public void update() {
        Department d = sercice.loadById(40L);
        d.setName("哈哈哈");
        sercice.update(d);
    }

    @Test
    public void queryData() {

        PageList<Department> pagelist = sercice.queryData(new DepartmentQuery());


        pagelist.getRows().forEach(p-> System.out.println(p));
    }
}