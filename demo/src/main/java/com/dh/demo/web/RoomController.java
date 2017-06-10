package com.dh.demo.web;

import com.dh.demo.domain.Room;
import com.dh.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ALVARO on 10/06/2017.
 */
@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Room> getAllRoom(){
        return roomService.getAllRoom();
    }
    public static class RoomRequestDTO{
        String code;
        int capacyti;

        public String getCode() {
            return code;
        }

        public int getCapacyti() {
            return capacyti;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void setCapacyti(int capacyti) {
            this.capacyti = capacyti;
        }
    }
}
