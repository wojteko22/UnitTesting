package pakiet;

/**
 * @author Wojciech Okoński
 *         created on 09.06.2016 r.
 */
class SimpleExample {
    int factorial(int number) {
        if (number == 0) return 1;
        else return factorial(number-1) * number;
    }
}
