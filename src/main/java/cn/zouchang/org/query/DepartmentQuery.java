package cn.zouchang.org.query;

import lombok.Data;

@Data
public class DepartmentQuery {
    private Integer currentPage=1;
    private Integer pageSize=5;
    public Integer getBegin()
    {
        return (this.currentPage-1)*this.pageSize;
    }
}
