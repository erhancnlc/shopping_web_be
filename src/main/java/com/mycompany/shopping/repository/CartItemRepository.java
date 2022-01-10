package com.mycompany.shopping.repository;

import com.mycompany.shopping.domain.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
