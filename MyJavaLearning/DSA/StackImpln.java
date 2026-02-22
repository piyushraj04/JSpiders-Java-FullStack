class StackImpln {
    static int[] stack;
    static int top;

    static void createStack(int size) {
        stack = new int[size];
        top = -1;
        System.out.println("Stack had been created with size:" + size);
    }

    static void push(int ele) {
        if (top == stack.length -1) {
            System.out.println("Stack Overflow");
        } else {
           top++;
           stack[top] = ele;
           System.out.println("Element is inserted ");
        }
    }

        static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " had been deleted...!!");
            top--;
        }
    }

    static void display() {
        System.out.println("===Elements presents in the stack are:===>");
        if (top == -1) {
            System.out.println("Nothing in stack");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
        System.out.println("==--------------==");
    }


    static void isEmpty() {
        if (top == -1) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
    }

    static void isFull() {
        if (top == stack.length) {
            System.out.println("Satck is Full");
        } else {
            System.out.println("You can add more " + ((stack.length - 1) - top) + " elements in the stack...");
        }
    }

    public static void main(String[] args) {
        createStack(5);
        push(8);
        push(78);
        push(63);
        push(89);
        push(69);

        display();

        isEmpty();

        isFull();

        pop();
        pop();

        display();
        push(58);

        push(85);
        push(69);
        push(89);
        isFull();

    }
}
