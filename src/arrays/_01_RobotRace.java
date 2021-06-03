package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	
	//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
		int x = 50;
		for(int i = 0; i < 5; i++) {
			robots[i] = new Robot();
			robots[i].setX(x);
			robots[i].setY(550);
			x += 100;
		}
	//4. make each robot start at the bottom of the screen, side by side, facing up
		
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		int y = 550;
		while(x >= 550) {
			for(int i = 0; i < 5; i++) {
				Random ran = new Random();
				int r = ran.nextInt(550);
				robots[i].setSpeed(10);
				robots[i].move(r);
				y = y - r;
				if(y <= 10) {
					System.out.println("The winner is robot " + (i + 1));
					System.exit(5);
				}
			}
		}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
	//7. declare that robot the winner and throw it a party!
		
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.

	}
}