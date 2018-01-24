class ArmstrongNumbers {


    boolean isArmstrongNumber(int numberToCheck) {
        int tempNumber;
        int lastDigit;
        int digitCount = 0;
        int sum = 0;

        tempNumber = numberToCheck;
        while (tempNumber != 0) {
           digitCount++;
            tempNumber /= 10;
        }
        tempNumber = numberToCheck;
        while (tempNumber != 0) {
            lastDigit = tempNumber % 10;
            sum += Math.pow(lastDigit, digitCount);
            tempNumber /= 10;
        }
        if(sum==numberToCheck){
            return true;
        }else{
            return false;
        }

    }

}
