class VariableDatatype {
    public static void main(String[] args) {
        // variable is a container that holds the data.
        // each variable have unique name 
        /*  a variable name :
                must not begin with number.
                is case sensative.
                should not be any java keyword like static, void, public, for,...
                must not contain white sapce.
                can containt $, _, 0-9 digit
        */
        /*
            Datatype : type of data that we can store in variable
            there are 8 primitive datatypes in java
            1) byte - 1byte
            2) short - 2byte
            3) int - 4byte : holds only whole number
            4) long - 8byte
            5) float -8byte
            6) double - 12byte 
            7) boolean - 1 bytes : holds true or false
            8) char - 2 bytes : holds single character only
         */
        /*
         * Variable 
         * <datatype> <variable_name>;
         * <datatype> <variable_name> = <initial_value>;
         */
        int age = 19;
        boolean canVote = true;
        char gender = 'm';
        float pi = 3.14f;
    }
}