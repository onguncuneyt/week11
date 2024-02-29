package dev.patika.ecommerce.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CursorResponse<T> {
    private int pageNumber;
    private int pageSize;
    private long totalElements;
    private List<T> items;
}
