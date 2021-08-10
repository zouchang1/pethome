package cn.zouchang.basic.util;

import lombok.Data;

@Data
public class AjaxResult {
    private Boolean success=true;
    private String mes="操作成功";
    public static AjaxResult me()
    {
        return new AjaxResult();
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public AjaxResult setMes(String mes) {
        this.mes = mes;
        return this;
    }
}
