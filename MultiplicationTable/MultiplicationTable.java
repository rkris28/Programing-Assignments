package MultiplicationTable;
class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            //this initializes i to 1 then continues to increase it by 1 until it gets to 12
            for (int j = 1; j <= 12; j++)
                // this  initializes j to 1 and continues to increase it by 1 until it gets to 12
                System.out.print(i * j + " ");
                // this will multiply i and j and print it with a space following
            System.out.println();
                // move to the next line after finishing one row
        }
    }
}

