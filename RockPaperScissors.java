/*Put check in for bad user guess
Things to talk about:
how random works
the array
checking for the length
checking for the bad user guess
comparing strings - string piece?
*/

import java.util.*;

class RockPaperScissors {
  String[] options = {"rock", "paper", "scissors"};
  Random random = new Random(System.currentTimeMillis());

  void run(String input){
    List<String> choices = Arrays.asList(options);
    if(!choices.contains(input)){
      System.out.println("Choose rock, paper or scissors!");
      return;
    }
    System.out.println(input);
    String computer = options[Math.abs(random.nextInt()%3)];
    System.out.println(computer);
    if(input.equals(computer)){
      System.out.println("It's a draw!");
    }
    else if(computer.equals("rock")){
      if(input.equals("paper")){
        System.out.println("You win!");
      }
      else{
        System.out.println("The computer wins!");
      }
    }
    else if(computer.equals("paper")){
      if(input.equals("scissors")){
        System.out.println("You win!");
      }
      else{
        System.out.println("The computer wins!");
      }
    }
    else{
      if(input.equals("rock")){
        System.out.println("You win!");
      }
      else{
        System.out.println("The computer wins!");
      }
    }
  }

  public static void main(String args[]){
    RockPaperScissors rps = new RockPaperScissors();
    if(args.length < 1){
      return;
    }
    rps.run(args[0].toLowerCase());
    return;
  }
}
