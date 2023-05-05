package Entitie;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private int age;
    private String email;
};
