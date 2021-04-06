package site.xingchi.blog.servicebase.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *@author  xingchi -->> itcolors <<----
 *@date  2021/4/3 22:43
 *@version 1.0
 *@description 自定义异常
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class MyException extends RuntimeException {
    private int code;
    private String msg;
}
