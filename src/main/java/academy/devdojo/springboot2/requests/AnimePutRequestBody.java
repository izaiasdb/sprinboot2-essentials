package academy.devdojo.springboot2.requests;

import lombok.Builder;
import lombok.Data;

//Aula 20
@Data
@Builder
public class AnimePutRequestBody {
    private Long id;
    private String name;
}