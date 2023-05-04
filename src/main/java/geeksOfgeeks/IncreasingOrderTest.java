package geeksOfgeeks;

//Time Complexity: O(N)
//        Auxiliary Space: O(1)

public class IncreasingOrderTest {
    int counter = 1;
    static int N;

    public void printOddNumber() {
        synchronized (this) {
            while (counter < N) {
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(counter + " ");
                counter++;
                notify();
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {
            while (counter < N) {
                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(counter + " ");
                counter++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        N = 10;
        IncreasingOrderTest increasingOrderTest = new IncreasingOrderTest();
        Thread thread1 = new Thread(increasingOrderTest::printEvenNumber);
        Thread thread2 = new Thread(increasingOrderTest::printOddNumber);
        thread1.start();
        thread2.start();

    }

}
