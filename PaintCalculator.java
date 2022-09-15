package edu.wctc;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PaintCalculator implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private List<Room> roomList = new ArrayList<>();

    public void addRoom (double width,double height,double length){
        Room room = new Room (width,height,length);
        roomList.add(room);
    }

    @Override
    public String toString() {
        if(roomList.isEmpty()){
            return "There are no rooms";
        }
        String string = "";
        for(Room room:roomList){
            string += room.toString();
    }
        return string;

}
}
