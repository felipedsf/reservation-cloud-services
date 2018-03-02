package rocks.lipe.app.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Room {

    private Long id;
    private String name;
    private String roomNumber;
    private String bedInfo;

}
