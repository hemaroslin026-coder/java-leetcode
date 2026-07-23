java class Chess {
    public boolean squareIsWhite(String coordinates) {

        char column = coordinates.charAt(0);
        char row = coordinates.charAt(1);

        // ASCII values
        int columnValue = (int) column;
        int rowValue = (int) row;

        // Check using modulus operator
        if ((columnValue + rowValue) % 2 == 0) {
            return false;   // Black square
        } else {
            return true;    // White square
        }
    }
}
