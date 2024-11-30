import java.util.*;

public class RosteringSimulation {

    public static int calculateDaysToReachRosteringValue(int N, int M, List<int[]> friendships, int K) {
        // Adjacency list to represent friendships
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (int[] edge : friendships) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        // Initial status of all employees (true means WFO)
        boolean[] currentStatus = new boolean[N];
        Arrays.fill(currentStatus, true);

        int cumulativeRosteringValue = N; // Initial rostering value (Day 1)
        int days = 1;

        while (cumulativeRosteringValue < K) {
            // Calculate next day's status
            boolean[] nextStatus = new boolean[N];
            for (int i = 0; i < N; i++) {
                int friendsWFOCount = 0;
                for (int friend : adjacencyList.get(i)) {
                    if (currentStatus[friend]) {
                        friendsWFOCount++;
                    }
                }
                // Apply rules for status on the next day
                if (currentStatus[i]) {
                    nextStatus[i] = (friendsWFOCount == 3);
                } else {
                    nextStatus[i] = (friendsWFOCount < 3);
                }
            }

            // Update cumulative rostering value
            int todaysRosteringValue = 0;
            for (boolean status : nextStatus) {
                if (status) {
                    todaysRosteringValue++;
                }
            }
            cumulativeRosteringValue += todaysRosteringValue;

            // Move to the next day
            currentStatus = nextStatus;
            days++;
        }

        return days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N (number of employees) and M (number of friendships)
        int N = sc.nextInt();
        int M = sc.nextInt();

        // Input friendships
        List<int[]> friendships = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            friendships.add(new int[]{a, b});
        }

        // Input K (rostering value to achieve)
        int K = sc.nextInt();

        // Calculate days to reach rostering value
        int result = calculateDaysToReachRosteringValue(N, M, friendships, K);
        System.out.println(result);

        sc.close();
    }
}
