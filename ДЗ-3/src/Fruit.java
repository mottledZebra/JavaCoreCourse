public abstract class Fruit<T> {
    protected float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getFruitWeight() {
        return this.weight;
    }
}
