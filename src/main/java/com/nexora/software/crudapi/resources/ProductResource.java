package com.nexora.software.crudapi.resources;

import com.nexora.software.crudapi.api.ProductService;
import com.nexora.software.generated.v1.api.ProductApi;
import com.nexora.software.generated.v1.model.CreateProductRequest;
import com.nexora.software.generated.v1.model.PatchProductRequest;
import com.nexora.software.generated.v1.model.ProductResponse;
import com.nexora.software.generated.v1.model.UpdateProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
public class ProductResource implements ProductApi {
    private final ProductService productService;

    @Override
    public ResponseEntity<ProductResponse> createProduct(CreateProductRequest request) {
        var response = productService.createProduct(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @Override
    public ResponseEntity<Void> deleteProduct(UUID productId) {
        productService.deleteProduct(productId);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @Override
    public ResponseEntity<ProductResponse> getProductById(UUID productId) {
        return ResponseEntity.ok(productService.getProductById(productId));
    }

    @Override
    public ResponseEntity<ProductResponse> patchProduct(UUID productId, PatchProductRequest request) {
        return ResponseEntity.ok(productService.patchProduct(productId, request));
    }

    @Override
    public ResponseEntity<ProductResponse> updateProduct(UUID productId, UpdateProductRequest request) {
        return ResponseEntity.ok(productService.updateProduct(productId, request));
    }
}
