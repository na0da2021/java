public class Single_Execution_Loop {
    public static void main(String[] args) {
        int limit = 0;
        int i = 1;
        do {
            System.out.println("The loop ran at least once");
            i++;
        } while ( i < limit);
        System.out.println("we are outside the loop");
    }

}

