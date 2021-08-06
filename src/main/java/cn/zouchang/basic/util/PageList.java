package cn.zouchang.basic.util;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class PageList<T> {
    private Long totals=1L;
    private List<T> rows=new ArrayList<>();

    public PageList() {
    }

    public PageList(Long totals, List<T> rows) {
        this.totals = totals;
        this.rows = rows;
    }
}
