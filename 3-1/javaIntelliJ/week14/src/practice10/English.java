package practice10;

class English {
    private String word;
    private String mean;

    public English(String word, String mean){
        this.word = word;
        this.mean = mean;
    }

    @Override
    public String toString() {
        return mean;
    }
}
