package cn.zouchang.org.controller;

import cn.zouchang.basic.util.AjaxResult;
import cn.zouchang.basic.util.PageList;
import cn.zouchang.org.domain.Department;
import cn.zouchang.org.query.DepartmentQuery;
import cn.zouchang.org.service.IDepartmentSercice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
@Api(tags = "部门接口",description = "部门接口详细描述")
public class DepartmentController {
    @Autowired
    private IDepartmentSercice departmentSercice;


    /*根据id查询单个*/
    @GetMapping("/{id}")
    public Department queryById(@PathVariable("id")Long id){
        return departmentSercice.loadById(id);
    }
    /*查询所有*/
    @GetMapping
    public List<Department> querAll()
    {
        return departmentSercice.loadAll();
    }
    /*删除*/
    @DeleteMapping("/{id}")
    public AjaxResult delete(@PathVariable("id")Long id)
    {
        try {
            departmentSercice.remove(id);
            return AjaxResult.me();
        } catch (Exception e) {

            return AjaxResult.me().setSuccess(false).setMes("操作失败");
        }
    }
    /*修改和添加*/
    @PutMapping
    @ApiOperation(value = "部门添加或修改",notes = "如果有id就是修改否则就是添加")
    public AjaxResult s(@RequestBody Department department)
    {
        try {
            if(department.getId()==null)
            {
                departmentSercice.save(department);
            }
            else {
                departmentSercice.update(department);
            }
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMes("操作失败");
        }

    }
    /*分页查询*/
    @PostMapping
    public PageList<Department> pageList(@RequestBody DepartmentQuery departmentQuery)
    {
        return departmentSercice.queryData(departmentQuery);
    }
}
