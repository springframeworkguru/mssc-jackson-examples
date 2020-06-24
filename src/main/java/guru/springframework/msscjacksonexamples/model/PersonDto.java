package guru.springframework.msscjacksonexamples.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDto {

    @Null
    private UUID id;

    @NotBlank
    private String name;

    @NotBlank
    private int age;

}
