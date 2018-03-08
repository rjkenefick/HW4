

    public class pyramid {
        public void draw ( double width) {
            for (double cout = 0; cout < width; cout++) { // This causes the amount of rows to be placed.
                String myString = "";
                for (double cout2 = 0; cout2 < cout; cout2++) // This nested for loop allows the increments for *.

                    myString = myString  + "* ";
                System.out.println(myString);
            }
        }
        public static void main(String[] args) { // This allows the change of the pyramid.
            pyramid P = new pyramid ();
            P.draw(5);
            // P.draw (slope);

        }
    }

