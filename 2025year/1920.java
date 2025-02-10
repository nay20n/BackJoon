import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        // HashSet을 사용하여 빠른 탐색 가능
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(scn.nextInt());
        }

        int M = scn.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (set.contains(scn.nextInt())) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }

        // 한 번에 출력하여 입출력 성능 개선
        System.out.print(sb);
    }
}
