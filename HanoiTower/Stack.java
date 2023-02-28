package HanoiTower;

import java.util.Arrays;

public class Stack {

    private int i=0;
    private int stack[];
    private int dim;

    

    public Stack(int i, int[] stack, int dim) {
        this.i = i;
        this.stack = stack;
        this.dim = dim;
    }

    public int pop() throws Exception{
        if(stack.length==0){
            throw new Exception("Vuota");
        }
        return stack[i--];
    }

    public int push(int n) throws Exception{
        if(stack.length==dim){
            throw new Exception("Vuota");
        }

        stack[++i] = n;
        return stack[i];
    }
    

    @Override
    public String toString() {
        return "Stack [i=" + i + ", stack=" + Arrays.toString(stack) + ", dim=" + dim + "]";
    }

    
}
