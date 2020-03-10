public class Main
{
   public static void main(String[] args)
   {
      int strategy1Count = 0;
      int strategy2Count = 0;
      final int NUMBER_OF_RUNS = 1000;

      // Simulate the game 1000 times
      for (int i = 0; i < NUMBER_OF_RUNS; i++)
      {
         int doorWithCar = (int) (Math.random() * 3);
         int playerDoorPick = (int) (Math.random() * 3);

         // Host must pick a door that's not the player's door and not the 
         // door with the car
         int hostPickDoor;
         if (playerDoorPick == doorWithCar)
         {
            // Player picked the car, just pick either of the other two doors
            hostPickDoor = ((int) (Math.random() * 2 + 1) + playerDoorPick) % 3;
         }
         else
         {
            /**
               Host has only one choice, the door that is left over. We can 
               do this in one step by adding the current player door with the 
               car door to yield a number between 1 and 3, if we subtract 3 
               from that, we get the leftover door
            */
            hostPickDoor = 3 - (playerDoorPick + doorWithCar);
         }

         // Same trick as the above else case
         int playerDoorSwitch = 3 - (hostPickDoor + playerDoorPick);

         if (playerDoorSwitch == doorWithCar)
         {
            strategy1Count++;
         }

         if (playerDoorPick == doorWithCar)
         {
            strategy2Count++;
         }
      }
      System.out.printf("After %d runs, strategy 1 yielded %d wins while "
         + "strategy 2 yielded %d.%n", NUMBER_OF_RUNS, strategy1Count,
         strategy2Count);
   }
}
