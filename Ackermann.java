import java.util.Stack;

/**
 *
 * @author Boubakr
 */
public class Ackermann {

    public static int RecursiveAckerman(int m, int n) {
        if (m == 0) {
            return (n + 1);
        } else if (m > 0 && n == 0) {
            return RecursiveAckerman(m - 1, 1);
        } else {
            return RecursiveAckerman(m - 1, RecursiveAckerman(m, n - 1));
        }
    }

    public static int NonRecursiveAckerman(int m, int n) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(m);
        while (!stack.isEmpty()) {
            m = stack.pop();
            if (m == 0 || n == 0) {
                n += m + 1;
            } else {
                stack.add(--m);
                stack.add(++m);
                n--;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println("RecursiveAckerman(3, 3)   : " + RecursiveAckerman(3, 3));
        System.out.println("NonRecursiveAckerman(3, 3): " + NonRecursiveAckerman(3, 3));
    }
}