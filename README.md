# Product CRUD API

## Project Structure

```text
src/main/java/com/nexora/software/openapi
+-- ProductApplication.java          # Spring Boot entry point
+-- api/ProductService.java          # Product service contract
+-- config/MappingConfiguration.java # Jackson object mapper configuration
+-- resources/ProductResource.java   # REST controller implementing generated API
`-- service/ProductServiceImpl.java  # Product service implementation placeholder

src/main/resources
+-- application.properties           # Application name and server port
`-- open-api/product.yaml            # OpenAPI product API contract
```

Generated sources are written to `target/generated-sources` when Maven runs the OpenAPI generator.

## API Endpoints

| Method | Path | Description |
| --- | --- | --- |
| `GET` | `/api/v1/products` | Get all products |
| `POST` | `/api/v1/products` | Create a product |
| `GET` | `/api/v1/products/{productId}` | Get a product by UUID |
| `PUT` | `/api/v1/products/{productId}` | Replace a product |
| `PATCH` | `/api/v1/products/{productId}` | Partially update a product |
| `DELETE` | `/api/v1/products/{productId}` | Delete a product |

The product schema includes:

- `productId`
- `name`
- `description`
- `price`
- `quantity`
- `createdAt`
- `updatedAt`

## OpenAPI and Swagger UI

After starting the application, the generated API documentation is available at:

```text
http://localhost:8080/swagger-ui.html
```

The OpenAPI JSON endpoint is available at:

```text
http://localhost:8080/v3/api-docs
```
