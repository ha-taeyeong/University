package test;

class English {
    private String word;
    private String mean;

    public English(String word, String mean) {
        this.word = word;
        this.mean = mean;
    }

    public String toString(){
        return word + "=" + mean;
    }
}
