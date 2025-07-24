package com.InventoryManagement.API.Inventory.Management.API.Contoller;

import com.InventoryManagement.API.Inventory.Management.API.ProductEntity.PEntity;
import com.InventoryManagement.API.Inventory.Management.API.productRepository.Repository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {
    private Repository repository;

    @GetMapping
    public List<PEntity> getallproduct(){
        return repository.findAll();
    }
    @PostMapping
    public PEntity addproduct(@RequestBody PEntity entity){
        return repository.save(entity);
    }
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        repository.deleteById(id);
    }
    @PutMapping("/{id}")
    public PEntity updateProduct(@PathVariable Long id, @RequestBody PEntity entity){
        PEntity entitys=repository.findById(id).orElseThrow();
        entitys.setName(entity.getName());
        entitys.setPrice(entity.getPrice());
        entitys.setStock(entity.getStock());
        return repository.save(entitys);
    }
}