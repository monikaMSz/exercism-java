class Acronym {

    String acronym = "";
    String phrase;

    public Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get()

    {

        String[] words = phrase.replaceAll("[\\p{Punct}\\s]+"," ").split(" ");


        for (String word : words) {
            acronym += word.toUpperCase().charAt(0);


        }
        return acronym;
    }

}
