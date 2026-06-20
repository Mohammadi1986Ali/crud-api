package com.nexora.software.crudapi.api;

import com.nexora.software.generated.v1.model.CreateProductRequest;
import com.nexora.software.generated.v1.model.PatchProductRequest;
import com.nexora.software.generated.v1.model.ProductResponse;
import com.nexora.software.generated.v1.model.UpdateProductRequest;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    ProductResponse createProduct(CreateProductRequest request);

    void deleteProduct(UUID productId);

    List<ProductResponse> getAllProducts();

    ProductResponse getProductById(UUID productId);

    ProductResponse patchProduct(UUID productId, PatchProductRequest request);

    ProductResponse updateProduct(UUID productId, UpdateProductRequest request);
}
