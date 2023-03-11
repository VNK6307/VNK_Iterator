import java.util.Random;

public class Randoms implements Iterable<Integer> {
    int min;
    int max;
    protected Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @Override
    public Iterator iterator() {
        return new Iterator(min, max, random);
    }

    class Iterator implements java.util.Iterator {
        int min;
        int max;
        protected Random random;

        public Iterator(int min, int max, Random random) {
            this.min = min;
            this.max = max;
            this.random = random;
        }

        @Override
        public boolean hasNext() {
            return true;// todo
        }

        @Override
        public Integer next() {
            int diff = max - min;
            return min + random.nextInt(diff + 1);
        }
    }// Iterator

}// class

