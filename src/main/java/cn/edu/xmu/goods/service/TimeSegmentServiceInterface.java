package cn.edu.xmu.goods.service;

import cn.edu.xmu.goods.model.dto.FlashSaleTimeSegmentDTO;

import java.util.List;

public interface TimeSegmentServiceInterface {
    String getCurrentFlashSaleTimeSegs();

    Boolean timeSegIsFlashSale(Long id);

    FlashSaleTimeSegmentDTO getFlashSaleTimeSegmentById(Long id);
}
