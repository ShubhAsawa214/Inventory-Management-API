package com.InventoryManagement.API.Inventory.Management.API.productRepository;

import com.InventoryManagement.API.Inventory.Management.API.ProductEntity.PEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<PEntity,Long> {
}
