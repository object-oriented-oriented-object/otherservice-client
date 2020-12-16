package cn.edu.xmu.goods.service;

import java.util.List;

public interface TimeSegmentServiceInterface {
    List<Long> getCurrentFlashSaleTimeSegs();

    Boolean timeSegIsFlashSale(Long id);
}
