package com.codestates.srdemoref.order.mapper;

import com.codestates.srdemoref.order.dto.OrderPatchDto;
import com.codestates.srdemoref.order.entity.OrderEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-11T18:28:52+0800",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.15 (Azul Systems, Inc.)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderEntity orderPatchDtoToOrder(OrderPatchDto orderPatchDto) {
        if ( orderPatchDto == null ) {
            return null;
        }

        OrderEntity orderEntity = new OrderEntity();

        orderEntity.setOrderId( orderPatchDto.getOrderId() );
        orderEntity.setOrderStatus( orderPatchDto.getOrderStatus() );

        return orderEntity;
    }
}
