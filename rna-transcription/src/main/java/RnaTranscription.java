class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rna = "";

            for (Character character : dnaStrand.toCharArray()
                    ) {
                rna += changeFromDnaToRna(character);


        }
        return rna;


    }


    String changeFromDnaToRna(Character dnaStrand)  {
        switch (dnaStrand) {
            case 'G':
                return "C";
            case 'C':
                return "G";
            case 'T':
                return "A";
            case 'A':
                return "U";
            default:
                throw new IllegalArgumentException("Invalid input");
        }

    }
}