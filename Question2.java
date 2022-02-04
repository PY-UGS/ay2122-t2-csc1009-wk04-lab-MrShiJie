import java.util.Arrays;

class Stack
{
    private int stack[];
    int top = 0;

    public Stack()
    {
        this.stack = new int[16];
    }

    public Stack(int capacity)
    {
        this.stack = new int[capacity];
    }

    public void push(int value)
    {
        stack[top] = value;
        top++;
    }

    public int pop()
    {
        //Removes the integer at the top of the stack and returns it
        return stack[--top];
    }
    public Boolean empty()
    {
        return top == 0;
    }

    public int peak()
    {
        return stack[top - 1];
    }

    public int getSize()
    {
        return top;
    }

    public String print()
    {
        return Arrays.toString(this.stack);
    }
}

public class Question2
{
    public static void main(String[] args)
    {
        int capacity = 10;
        Stack stack = new Stack(capacity);

        for(int counter = 0; counter < capacity; counter++)
        {
            stack.push(counter);
        }

        System.out.print("Initial Stack: " + stack.print());

        Stack reverse = new Stack(capacity);

        for (int counter = 0; counter < capacity; counter++)
        {
            int value = stack.pop();
            reverse.push(value);
        }

        System.out.print("\nReversed Order Stack: " + reverse.print());
    }
}
