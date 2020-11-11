public class Boost <T extends Number> implements Mashina <T>{


    @Override
    public double delenie(T bmv, T audi) {
        return bmv.doubleValue() + audi.doubleValue();

    }
}
