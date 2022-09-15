package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Room  {
    private List<Wall> wallList = new ArrayList<>();

    public Room(double width,double height,double length) {
        Wall wall1 = new Wall(width, height);
        Wall wall2 = new Wall(width, height);
        Wall wall3 = new Wall(height, length);
        Wall wall4 = new Wall(height, length);
    }
                public double getArea() {
                    return getArea();
                }

    public String ToString()
    {
        return "Area:";
        }
    }



