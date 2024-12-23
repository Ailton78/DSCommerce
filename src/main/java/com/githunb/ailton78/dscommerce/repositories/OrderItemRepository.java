package com.githunb.ailton78.dscommerce.repositories;

import com.githunb.ailton78.dscommerce.entities.OrderItem;
import com.githunb.ailton78.dscommerce.entities.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
