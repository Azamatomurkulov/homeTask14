public class Counter {

    private static int numOfCalls;

    public Counter(){

    }

    public Counter(int numOfCalls){
        this.numOfCalls = numOfCalls;
    }

    public static int getNumOfCalls(){
        return numOfCalls;
    }
    static void increment(){
        numOfCalls++;
    }
    void factorial(){
        int sum=1;
        for (int i = 1; i <=numOfCalls ; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
