public class StringCalculator {

    public static int add(final String numbers) {
        int returnValue = 0;

        String[] numbersArray = numbers.split(",|\n");

        for (String number : numbersArray)
        {
            if (!number.trim().isEmpty())
            {
                int value = Integer.parseInt(number.trim());

                //new functionalities: Exception for negative number, no number greater than 1000
                if (value < 0)
                    throw new IllegalArgumentException("negatives not allowed.");
                if (value > 1000)
                    continue;

                returnValue += value;
            }
        }
        return returnValue;
    }
}