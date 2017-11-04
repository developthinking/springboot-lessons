package cn.wuti;

import org.springframework.web.bind.annotation.*;

/**
 * 添加全局的类 配置全局异常Handler
 * Created by Administrator on 2017/11/4.
 */
@ControllerAdvice(annotations = RestController.class)
@ResponseBody
public class RestExceptionHandler {

    /**
     * 默认统一异常处理方法
     * @param e 默认Exception异常对象
     * @return
     */
    @ExceptionHandler
    @ResponseStatus
    public ApiResult runtimeExceptionHandler(Exception e) {
        return ApiResultGenerator.errorResult(e.getMessage(), e);
    }
}
