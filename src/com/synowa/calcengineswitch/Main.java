package com.synowa.calcengineswitch;

public class Main {

    public static void main(String[] args) {

        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length]; //this one and these three above we call parallel arrays


        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;//(it means result = if val2 non eqals zero than go ahead and devide val1/val2 otherwise (":") return zero)
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:
                    //System.out.println("Error - invalid opCode");
                    //result = 0.0d;
                    //if I leave it like here it's gonna print out 0.0m because without the brackets else only does the first line after itself, so with char opCode = 'd' instead of 2.0 we'll get 0.0
                    System.out.println("Error - invalid opCode");
                    results[i] = 0.0d;
                    break;
                }
            }
            for (double theResult : results) {
                System.out.println("result = ");
                System.out.println(theResult);
            }
	/* Switch examples

	        int iVal = 10;
        switch (iVal % 2){
            case 0:
                System.out.print(iVal);
                System.out.println(" is even");
                break; //if here's no brake it will print out 10 is even| 10 is odd and "oop...", because after it matched on a case 0 its just running all lines below
            case 1:
                System.out.print(iVal);
                System.out.println(" is odd");
                break;

            default:
                System.out.println("oops it broke");
                break; //here I don't need a brake, but it's just a good programming practice
        }

	 */

        }
    }
