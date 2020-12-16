package cn.edu.xmu.goods.service;

import cn.edu.xmu.goods.model.dto.FlashSaleTimeSegmentDTO;

import java.util.List;

public interface TimeSegmentServiceInterface {
    List<Long> getCurrentFlashSaleTimeSegs();

    Boolean timeSegIsFlashSale(Long id);

    FlashSaleTimeSegmentDTO getFlashSaleTimeSegmentById(Long id);
}
