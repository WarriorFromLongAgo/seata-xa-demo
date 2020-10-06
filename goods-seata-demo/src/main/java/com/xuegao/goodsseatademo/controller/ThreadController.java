package com.xuegao.goodsseatademo.controller;

import com.xuegao.goodsseatademo.constant.common.WrappedResponse;
import com.xuegao.goodsseatademo.model.dto.RequestDTO;
import com.xuegao.goodsseatademo.service.interfaces.IThreadService;
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

    @RequestMapping("/createGoods")
    public void seata1() {
        threadService.createGoods();
    }

    @RequestMapping("/createGoods2")
    public WrappedResponse<Long> seata2(@RequestBody RequestDTO requestDTO) {
        Long goodsId = Long.valueOf(requestDTO.getSource());
        Integer stock = Integer.valueOf(requestDTO.getTarget());

        Long id = threadService.createGoods2(goodsId, stock);

        return WrappedResponse.success(id);
    }
}