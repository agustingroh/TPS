package analizer.Criteria;
class Palabra implements Comparable<Palabra> {

    private String word;
    private int counter;

    public Palabra(String word) {
        this.word = word;
        this.counter = 0;
    }

    @Override    
    public boolean equals(Object obj) {
        Palabra aux = (Palabra)obj;
        return this.getWord().equals(aux.getWord());   
    }

    @Override
    public int compareTo(Palabra p){
        return this.getWord().compareTo(p.getWord());
    }

    public String getWord() {
        return this.word;
    }

    public void setCounter(int value){
        this.counter = value;
    }

    public int getCounter() {
        return this.counter;
    }
    

    public String toString(){
        return "Palabra: " + this.getWord() + "|" +" Contador: " + this.getCounter() + "\n";
    }


}