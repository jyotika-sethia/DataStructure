package First_Attempt.First_Attempt;

public class HanoiReccursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n = 4; // Number of disks
		 towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
	}
	
	static void towerOfHanoi(int n, char from_rod,
            char to_rod, char aux_rod)
	{
		if (n == 0)
		{
			System.out.println("I am here now "+ n );
			return;
		}
		System.out.println("RJ "+ n );
		towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
		System.out.println("Move disk "+ n + " from rod " +
               from_rod +" to rod " + to_rod );
		towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
	}

}
