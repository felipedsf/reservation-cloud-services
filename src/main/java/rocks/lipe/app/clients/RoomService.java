package rocks.lipe.app.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import rocks.lipe.app.domains.Room;

import java.util.List;

@FeignClient(value = "roomservices")
public interface RoomService {

    @GetMapping(value = {"/rooms"})
    List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber);

}
