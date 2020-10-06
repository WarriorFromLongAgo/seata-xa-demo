package com.xuegao.goodsseatademo.openfeign;

import com.xuegao.goodsseatademo.constant.common.WrappedResponse;
import com.xuegao.goodsseatademo.model.dto.RequestDTO;
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
        value = "goods-seata-demo"
)
public interface FeignApi {

    // @FeignClient的value + @RequestMapping的value
    // 其实就是完成请求地址，"http://goods-seata-demo/thread/createGoods2" + requestDTO

    @RequestMapping("/thread/createGoods2")
    WrappedResponse<Long> seata2(@RequestBody RequestDTO requestDTO);
}