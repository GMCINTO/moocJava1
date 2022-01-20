
public class Statistics {

    private int count;
    private int sum;
    //private double average;

    public Statistics() {

    }

    public void addNumber(int number) {

        sum = sum + number;
        count++;
        // write code here
    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        // write code here
        return this.sum;
    }

    public double average() {
        // write code here
        //average = 1.0 * sum / count;
        if (sum == 0) {
            return 0;
        } else {

            return 1.0 * sum / count;
        }
    }

}
