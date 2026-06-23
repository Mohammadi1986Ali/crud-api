package com.nexora.software.openapi.service;

import com.nexora.software.openapi.api.ProductService;
import com.nexora.software.generated.v1.model.CreateProductRequest;
import com.nexora.software.generated.v1.model.PatchProductRequest;
import com.nexora.software.generated.v1.model.ProductResponse;
import com.nexora.software.generated.v1.model.UpdateProductRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductResponse createProduct(CreateProductRequest request) {
        return null;
    }

    @Override
    public void deleteProduct(UUID productId) {

    }

    @Override
    public List<ProductResponse> getAllProducts() {
        return List.of();
    }

    @Override
    public ProductResponse getProductById(UUID productId) {
        return null;
    }

    @Override
    public ProductResponse patchProduct(UUID productId, PatchProductRequest request) {
        return null;
    }

    @Override
    public ProductResponse updateProduct(UUID productId, UpdateProductRequest request) {
        return null;
    }
}
