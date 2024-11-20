import java.util.Scanner;

class Room
  {
    private String description;
    private Room north, south, east, west;

    public Room(String description)
    {
      this.description = description;
    }

    public void setExit(String direction, Room room)
    {
      if(direction.equals("north"))
      {
        north = room;
      }
      else if(direction.equqls("south")){
        south = room;
      }
      else if(direction.equals("east")){
        east = room;
      }
      else if (direction.equals("west")) {
        west = room;
      }
    }

    public Room getExit(String direction)
    {
      if (direction.equals("north")){
        return north;
      }
      else if(direction.equals("south")){
        return south;
      }
      else if(direction.equals("east")){
        return east;
      }
      else if(direction.equals("west")){
        return west;
      }
      else{
        return null;
      }
    }

    public void describe()
    {
      System.out.println(description);
      System.out.print("Exits: ");
      if(north != null)
      {
        System.out.prin("north ");
      }
      if(south != null)
      {
        System.out.print("South ");
      }
      if(east != null)
      {
        System.out.println("east ");
      }
      if(west != null)
      {
        System.out.print("West ");
      }
      System.out.println();
    }
  }

public class AdventureGame
  {
    public static void main(String[] args)
    {
      // create rooms
      Room kitchen = new Room("You are in a kitchen");
      Room livingRoom = new Room("you are in a living room");
      Room bedroom = new Room("You are in a bedroom");

      // set exits
      kitchen.setExit("north", livingRoom);
      livingRoom.setExit("south", kitchen);
      livingRoom.setExit("east", bedroom);
      bedroom.setExit("west", livingRoom);

      // start game 
      Room currentRoom = kitchen;
      Scanner scanner = new Scanner(System.in);

      while (true) {
        currentRoom.describe();
        System.out.print("enter a direction (north, south, east west or quit");
        String direction = scanner.nextLine();

        if(direction.equals("quit")){
          break;
        }
        Room nextRoom = currentRoom.getExit(direction);
        if(nextRoom == null)
        {
          System.out.println("you can't go that way");
        }
        else{
          currentRoom = nextRoom;
        }
      }
      scanner.close();
    }
  }
