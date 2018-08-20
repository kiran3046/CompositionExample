package composition;

import java.util.Arrays;

public  class Main {


    public static void main(String args[]){
        Dimension window_dimension=new Dimension(20,30,10);
        Window window=new Window(window_dimension,"white","plain");
        Dimension door_dimension=new Dimension(80,40,10);
        Door door=new Door(door_dimension,"pink","Double Lock");
        Furniture springBox=new Furniture("Spring box","IKEA",300);
        Furniture chair=new Furniture("Computer chair","IKEA",100);
        Furniture table=new Furniture("Study table","IKEA",100);
        Light light=new Light("bulb","Philips");
        Furniture[] furnitures={springBox,chair,table};

        Room room=new Room(window,door,light,furnitures);
        System.out.println("Entering room");
        System.out.println(room.getLight().toString());
        System.out.println(room.getDoor().toString());
        for ( Furniture furniture: furnitures) {
            System.out.println(furniture.toString());
        }

        System.out.println(room.getWindow().toString());

        room.getLight().switch_on();
        System.out.println("Exiting room");
        room.getLight().switch_off();


    }
}
