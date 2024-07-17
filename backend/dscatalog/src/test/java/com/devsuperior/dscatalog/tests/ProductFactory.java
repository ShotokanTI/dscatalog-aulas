package com.devsuperior.dscatalog.tests;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

import java.time.Instant;

public class ProductFactory {
    public static Product createProduct() {
        Instant date = Instant.now();
        String imgUrl = "https://example.com/image.jpg";
        Double price = 99.99;
        String description = "A sample product description";
        String name = "Sample Product";
        Long id = 1L;

        Product product = new Product(date, imgUrl, price, description, name, id);

        product.getCategories().add(createCategory());

        return product;
    }

    public static Category createCategory(){
        return new Category(1L, "Eletronicos");
    }

    public static ProductDTO createProductDTO(){
        Product product = createProduct();
        return new ProductDTO(product,product.getCategories());
    }
}
