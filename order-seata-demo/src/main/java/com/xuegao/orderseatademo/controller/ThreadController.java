package com.xuegao.orderseatademo.controller;

import com.xuegao.orderseatademo.constant.common.WrappedResponse;
import com.xuegao.orderseatademo.model.dto.RequestDTO;
import com.xuegao.orderseatademo.service.interfaces.IThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br/> @PackageName：com.xuegao.springboot_tool.controller
 * <br/> @ClassName：ThreadController
 * <br/> @Description：
 * <br/> @author：xuegao
 * <br/> @date：2020/9/11 16:59
 */
@RestController
@RequestMapping(path = "/thread")
public class ThreadController<T> {

    private final IThreadService threadService;

    @Autowired
    public ThreadController(IThreadService threadService) {
        this.threadService = threadService;
    }

    @RequestMapping("/createOrder")
    public void seata2() {
        threadService.createOrder();
    }

    @RequestMapping("/createOrder2")
    public WrappedResponse<Long> seata3(@RequestBody RequestDTO requestDTO) {
        Long orderId = Long.valueOf(requestDTO.getSource());
        String target = requestDTO.getTarget();

        Long id = threadService.createOrder2(orderId, target);

        return WrappedResponse.success(id);
    }

}