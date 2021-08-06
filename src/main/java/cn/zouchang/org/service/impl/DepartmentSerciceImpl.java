package cn.zouchang.org.service.impl;

import cn.zouchang.basic.util.PageList;
import cn.zouchang.org.domain.Department;
import cn.zouchang.org.mapper.DepartmentMapper;
import cn.zouchang.org.query.DepartmentQuery;
import cn.zouchang.org.service.IDepartmentSercice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class DepartmentSerciceImpl implements IDepartmentSercice {
    @Autowired
    private DepartmentMapper mapper;
    @Override
    @Transactional
    public void save(Department d) {
        mapper.save(d);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        mapper.remove(id);
    }

    @Override
    @Transactional
    public void update(Department d) {
        mapper.update(d);
    }

    @Override
    public Department loadById(Long id) {
        return mapper.loadById(id);
    }

    @Override
    public List<Department> loadAll() {
        return mapper.loadAll();
    }

    @Override
    public PageList<Department> queryData(DepartmentQuery query) {
        Long totals = mapper.queryCount(query);
        List<Department> list = mapper.queryData(query);
        return new PageList<>(totals,list);
    }
}
