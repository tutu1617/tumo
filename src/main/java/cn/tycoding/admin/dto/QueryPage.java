package cn.tycoding.admin.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author tycoding
 * @date 2019-03-09
 */
@Data
@ToString
public class QueryPage implements Serializable {

    private int pageCode; //当前页
    private int pageSize; //每页显示的记录数
}
