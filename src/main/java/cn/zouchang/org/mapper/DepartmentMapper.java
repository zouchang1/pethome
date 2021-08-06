package cn.zouchang.org.mapper;

import cn.zouchang.org.domain.Department;
import cn.zouchang.org.query.DepartmentQuery;

import java.util.List;

public interface DepartmentMapper {
    void save(Department d);

    void remove(Long id);

    void update(Department d);

    Department loadById(Long id );

    List<Department> loadAll();

    /**
     * 分页查询
     *
     */
    //查询总条数
    Long queryCount(DepartmentQuery query);
    //查询当前的页数
    List<Department> queryData(DepartmentQuery query);

}
