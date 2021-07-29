package org.perscholas.lectures.W3L4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class WeekThreeLectureFour {
    public static void main(String[] args) {
        referencing();
        System.out.println();
        cloningArrays();
        System.out.println();
        systemArrayCopy();
        System.out.println();
        playingWithReferences();
        System.out.println();
        manualDeepCopy();
        System.out.println();
        initializingTest(false);
        System.out.println();
        takingInput();

    }

    private static void takingInput() {
        System.out.println("Taking input");
        Scanner scn = new Scanner(System.in);
        int number = 3;
        String[] strings = new String[number];

        for (int i = 0; i < 3; i++) {
            System.out.println("Loop i: " + i);
            if (scn.hasNext()) {
                strings[i] = scn.nextLine();
            }
            else {
                break;

            }
            System.out.println(Arrays.toString(strings));
        }
        System.out.println("Loop done");
        System.out.println(Arrays.toString(strings));
    }

    private static void initializingTest(boolean use) {
        if (use) {
            int[] values = new int[5];
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < values.length; i++) {
                System.out.println("Please enter value #" + i + " : ");
                values[i] = input.nextInt();
            }
            System.out.println(Arrays.toString(values));
        }

    }

    private static void manualDeepCopy() {
        System.out.println("Manual Deep Copy");  // following code from Haseeb
        System.out.println("Define and perform manually deep copy");
        int[][] source = {{1, 2, 3}, {4, 5, 6}, {7,8,9}};
        int[][] destination = new int[source.length][];

        for (int i = 0; i < source.length; ++i) {
            // allocating space for each row of destination array
            destination[i] = new int[source[i].length];
            System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
        }
        System.out.println(Arrays.deepToString(source));
        System.out.println(Arrays.deepToString(destination));
        System.out.println("Make a change");
        source[1][0] = 100;
        System.out.println(Arrays.deepToString(source));
        System.out.println(Arrays.deepToString(destination));
    }

    private static void playingWithReferences() {
        System.out.println("Playing with references");
        System.out.println("Set values in `values`");
        int[][] values = {{1, 2, 3}, {4, 5, 6}, {7,8,9}};
        System.out.println("Preform clone to `clone`");
        int[][] clone = values.clone();
        System.out.println("Change contents of `values`");
        values[2][0] = 0;
        values[1] = new int[] {0, 0, 0};
        System.out.println("Print contents of `values");
        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.deepToString(values));
//        for (int[] value : values) {
//            System.out.println(Arrays.toString(value));
//        }
        System.out.println("Print contents of `clone`");
        System.out.println(Arrays.toString(clone));
        System.out.println(Arrays.deepToString(clone));
//        for (int[] ints : clone) {
//            System.out.println(Arrays.toString(ints));
//        }

        System.out.println("trying System.arraycopy");
        System.out.println("define `values2`");
        int[][] values2 = {{1, 2, 3}, {4, 5, 6}, {7,8,9,}};
        System.out.println("create and populate `sysArrayCopy`");
        int[][] sysArrayCopy = new int[3][3];
        System.arraycopy(values2, 0, sysArrayCopy, 0, values2.length);
        System.out.println("Look at the copies");
        System.out.println("values2 " + Arrays.toString(values2));
        System.out.println("values2 " + Arrays.deepToString(values2));
//        for (int[] value : values2) {
//            System.out.println(Arrays.toString(value));
//        }
        System.out.println("sysArrayCopy " + Arrays.toString(sysArrayCopy));
        System.out.println("sysArrayCopy " + Arrays.deepToString(sysArrayCopy));
//        for (int[] ints : sysArrayCopy) {
//            System.out.println(Arrays.toString(ints));
//        }
        System.out.println("Make changes");
        values2[0][1] = 0;
        values2[1] = new int[] {0, 0, 0};
        System.out.println("look at the copies");
        System.out.println("values2 " + Arrays.toString(values2));
        System.out.println("values2 " + Arrays.deepToString(values2));
//        for (int[] value : values2) {
//            System.out.println(Arrays.toString(value));
//        }
        System.out.println("sysArrayCopy " + Arrays.toString(sysArrayCopy));
        System.out.println("sysArrayCopy " + Arrays.deepToString(sysArrayCopy));
//        for (int[] ints : sysArrayCopy) {
//            System.out.println(Arrays.toString(ints));
//        }
    }

    private static void systemArrayCopy() {
        System.out.println("System dot array copy");
        int[] values = {1, 2, 3, 4, 5, 6};
        int[] copy = new int[values.length];
        System.arraycopy(values, 0, copy, 0, copy.length);
        // Sytstem.arraycopy(source, srcPos, dest, destPos, length);
        values[5] = 0;
        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(copy));
    }

    private static void cloningArrays() {
        System.out.println("Cloning Arrays");
        int[] values = {1, 2, 3, 4, 5, 6};
        int[] copy = values.clone(); // clone is inhereited from Object class
        values[5] = 100;
        copy[4] = 200;
        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(copy));
    }

    private static void referencing() {
        int[] arrayOne = {1, 2, 3, 4, 5, 6};
        int[] arrayTwo = arrayOne;
        arrayOne[5] = 0;
        arrayTwo[2] = 0;
        System.out.println("variable arrayOne and variable arrayTwo point to the same stuff");
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
    }
}


/* code from Haseeb for, basically, manually writing in deepcopy
System.out.println("====================");
		 int[][] source = {
	              {1, 2, 3, 4},
	              {5, 6},
	              {0, 2, 42, -4, 5}
	              };
	        int[][] destination = new int[source.length][];
	        for (int i = 0; i < source.length; ++i) {
	             // allocating space for each row of destination array
	             destination[i] = new int[source[i].length];
	             System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);
	        }
	        source[1][0] = 100;
	        System.out.println(Arrays.deepToString(source));

	        System.out.println(Arrays.deepToString(destination));

	}
 */

/*
Haseeb will only cover the important topics
 */