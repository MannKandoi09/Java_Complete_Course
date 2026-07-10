package in.mkcoding.challange84;

public abstract class Bird implements flyable {
    private final String breed;

    protected Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
