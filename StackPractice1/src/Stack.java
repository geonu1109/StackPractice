public class Stack {
    private int[] values;
    private int count;

    public Stack(int num) {
        values = new int[num];
        count = 0;
    }

    public void push(int value) {
        values[count++] = value;
    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        else {
            return values[--count];
        }
    }

    public int top() {
        return values[count - 1];
    }

    public boolean empty() {
        if (count == 0) return true;
        else return false;
    }

    public int size() {
        return count;
    }
}
