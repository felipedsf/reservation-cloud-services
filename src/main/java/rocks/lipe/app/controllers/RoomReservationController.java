package rocks.lipe.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rocks.lipe.app.clients.RoomService;
import rocks.lipe.app.domains.Room;

import java.util.List;

@RestController
public class RoomReservationController {

    private RoomService roomService;

    public RoomReservationController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping(value = "/rooms")
    public List<Room> getAllRooms(){
        return roomService.findAll(null);
    }
}
