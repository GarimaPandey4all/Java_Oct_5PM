class CMD {
    public static void main(String[] args) {
        
        if(args.length == 2)
        {
            int firstNumber = Integer.parseInt(args[0]); // parsing / casting / conversion
            int secondNumber = Integer.parseInt(args[1]);

            int result = firstNumber + secondNumber;

            System.out.println("Sum is: "+result);
        }
        else 
        {
            System.out.println("Invalid Input");
        }

    }
}
