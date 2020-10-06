package com.xuegao.orderseatademo.openfeign;

import com.xuegao.orderseatademo.constant.common.WrappedResponse;
import com.xuegao.orderseatademo.model.dto.RequestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <br/> @PackageName：com.xuegao.goodsseatademo.openfeign
 * <br/> @ClassName：FeignApi
 * <br/> @Description：
 * <br/> @author：xuegao
 * <br/> @date：2020/10/5 15:46
 */
@FeignClient(
        value = "order-seata-demo"
)
public interface FeignApi {

    // @FeignClient的value + @RequestMapping的value
    // 其实就是完成请求地址，"http://goods-seata-demo/thread/createGoods2" + requestDTO

    @RequestMapping("/thread/createOrder2")
    WrappedResponse<Long> seata3(@RequestBody RequestDTO requestDTO);
}