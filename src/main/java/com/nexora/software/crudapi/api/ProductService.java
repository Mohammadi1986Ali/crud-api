package com.nexora.software.crudapi.api;

import com.nexora.software.generated.v1.model.CreateProductRequest;
import com.nexora.software.generated.v1.model.PatchProductRequest;
import com.nexora.software.generated.v1.model.ProductResponse;
import com.nexora.software.generated.v1.model.UpdateProductRequest;

import java.util.List;

public interface ProductService {

    ProductResponse createProduct(CreateProductRequest request);

    void deleteProduct(Integer productId);

    List<ProductResponse> getAllProducts();

    ProductResponse getProductById(Integer productId);

    ProductResponse patchProduct(Integer productId, PatchProductRequest request);

    ProductResponse updateProduct(Integer productId, UpdateProductRequest request);
}
