class DifferenceOfSquaresCalculator {

    static int computeSquareOfSumTo(int input) {
        int sum = 0;
        for (int i = 0; i <=input; i++) {

            sum += i;

        }
        return sum*sum;
    }

    static int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum += i*i;
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        int result = this.computeSquareOfSumTo(input) -
                this.computeSumOfSquaresTo(input);

        return result;
    }


}
