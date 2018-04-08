public class Counter {
    private int count;

    public void reset()
    {
        count = 0;
    }
    public int current(){
        return count;
    }
    public void increment(){
        count += 1;
    }
    public void decrement(){
        count -= 1;
        if(count < 0)
        {
            this.increment();
        }
    }
    public String toString(){
        return "Count = "+ count;
    }
}
