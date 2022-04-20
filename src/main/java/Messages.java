public enum Messages {


INVALID ("INVALID");


    private String message;

    Messages(String message) {
        this.message = message;
    }

    public String toString() {
        return this.message;
    }
}
