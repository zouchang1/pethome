package cn.zouchang.org.service;

import cn.zouchang.basic.util.PageList;
import cn.zouchang.org.domain.Department;
import cn.zouchang.org.query.DepartmentQuery;

import java.util.List;

public interface IDepartmentSercice {
    void save(Department d);

    void remove(Long id);

    void update(Department d);

    Department loadById(Long id );

    List<Department> loadAll();

    PageList<Department> queryData(DepartmentQuery query);

}
