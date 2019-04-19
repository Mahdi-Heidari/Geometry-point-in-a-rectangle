package pointinarectangle;

import java.util.Scanner;

public class PointInARectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double width, height, x1, y1, x2, y2;

        System.out.println("Enter the Starting point of the rectangle with two coordinates:");
        x1 = input.nextDouble();
        y1 = input.nextDouble();

        System.out.print("\nEnter the width of rectangle:\t");
        width = input.nextDouble();

        System.out.print("Enter the height of rectangle:\t");
        height = input.nextDouble();

        System.out.println("\nEnter your point with 2 coordinates to check whether it is in or out of the rectangle:");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        String accuracyMessage = String.format("\nPoint (%.3f, %.3f) is in the rectangle!\n\n", x2, y2);
        String inaccuracyMessage = String.format("\nPoint (%.3f, %.3f) is not in the rectangle!\n\n", x2, y2);

        // Following source will examine the point in the lower left corner of the coordinating system.
        if (x2 < 0 && y2 < 0) {

            if (x2 > x1 || y2 > y1 || x2 < x1 + width || y2 < y1 + height) {

                System.out.print(inaccuracyMessage);
            } else {

                System.out.print(accuracyMessage);
            }

        } // Following source will examine the point in the upper right corner of the coordinating system.
        else if (x2 > 0 && y2 > 0) {

            if (x2 < x1 || y2 < y1 || x2 > x1 + width || y2 > y1 + height) {

                System.out.print(inaccuracyMessage);
            } else {

                System.out.print(accuracyMessage);
            }

        } // Following source will examine the point in the upper left corner of the coordinating system.
        else if (x2 < 0) {

            if (x2 > x1 || y2 < y1 || x2 < x1 + width || y2 > y1 + height) {

                System.out.print(inaccuracyMessage);
            } else {

                System.out.print(accuracyMessage);
            }

        } // Following source will examine the point in the lower right corner of the coordinating system.
        else if (y2 < 0) {

            if (x2 < x1 || y2 > y1 || x2 > x1 + width || y2 < y1 + height) {

                System.out.print(inaccuracyMessage);
            } else {

                System.out.print(accuracyMessage);
            }

        }

    }
}
