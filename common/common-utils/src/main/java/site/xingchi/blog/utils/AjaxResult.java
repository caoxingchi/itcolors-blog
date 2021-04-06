package site.xingchi.blog.utils;

import org.springframework.util.StringUtils;

import java.util.HashMap;

/**
 * @Author: Ambition
 * @Description TODO 操作消息提醒
 * @Date: 2021/3/25 3:38 下午
 * @Version 1.0
 */
public class AjaxResult extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;
    /**
     * 状态码
     */
    public static final String CODE_TAG = "code";
    /**
     * 返回内容
     */
    public static final String MSG_TAG = "msg";
    /**
     * 数据对象
     */
    public static final String DATA_TAG = "data";
    /**
     * 返回成功状态
     */
    public static final String ISSUCCESS_TAG = "success";
    /**
     * 时间戳
     */
    public static final String TIME_STAMP = "timestamp";
    private long timestamp = System.currentTimeMillis();
    /**
     * 初始化⼀个新创建的 AjaxResult 对象，使其表示⼀个空消息。
     */
    public AjaxResult() {
    }
    /**
     * 初始化⼀个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg 返回内容
     * @param isSuccess 返回的转台吗
     */
    public AjaxResult(int code, String msg,boolean isSuccess) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
        super.put(ISSUCCESS_TAG,isSuccess);
        super.put(TIME_STAMP, this.timestamp);
    }
    /**
     * 初始化⼀个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg 返回内容
     * @param data 数据对象
     */
    public AjaxResult(int code, String msg,boolean isSuccess, Object data) {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
        super.put(ISSUCCESS_TAG,isSuccess);
        if (!StringUtils.isEmpty(data)) {
            super.put(DATA_TAG, data);
        }
        super.put(TIME_STAMP, this.timestamp);
    }
    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static AjaxResult success() {
        return AjaxResult.success("操作成功");
    }
    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static AjaxResult success(Object data) {
        return AjaxResult.success("操作成功", data);
    }
    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @return 成功消息
     */
    public static AjaxResult success(String msg) {
        return AjaxResult.success(msg, null);
    }
    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static AjaxResult success(String msg, Object data) {
        return new AjaxResult(HttpStatus.SUCCESS, msg,true, data);
    }
    /**
     * 返回错误消息
     *
     * @return 错误消息
     */
    public static AjaxResult error() {
        return AjaxResult.error("操作失败");
    }
    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static AjaxResult error(String msg) {
        return AjaxResult.error(msg, null);
    }
    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static AjaxResult error(String msg, Object data) {
        return new AjaxResult(HttpStatus.ERROR, msg,false, data);
    }
    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg 返回内容
     * @return 警告消息
     */
    public static AjaxResult error(int code, String msg) {
        return new AjaxResult(code, msg, false,null);
    }
    public long getTimestamp() {
        return this.timestamp;
    }
    public void setTimestamp(final long timestamp) {
        this.timestamp = timestamp;
    }
}