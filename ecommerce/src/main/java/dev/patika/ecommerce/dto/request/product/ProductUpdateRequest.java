package dev.patika.ecommerce.dto.request.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductUpdateRequest {
    @Positive(message = "id değeri pozitif olmak zorunda")
    private int id;
    @NotNull(message = "Ürün adı boş veya null olamaz")
    private String name;
    private double prc;
    private int stock;
    private int supplierId;
    private int categoryId;
}
