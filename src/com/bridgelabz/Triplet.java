package com.bridgelabz;
public class Triplet {
    /**
     * finding the distinct triplets which adds upto Zero.
     * @param triplet
     * @param n
     */
    public static void findTriplets(int[] triplet, int n) {
        int triplets = 0;
        System.out.println("the distinct triplets are:");
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (triplet[i] + triplet[j] + triplet[k] == 0) {
                        triplets++;
                        System.out.print(triplet[i]);
                        System.out.print(" ");
                        System.out.print(triplet[j]);
                        System.out.print(" ");
                        System.out.print(triplet[k]);
                        System.out.print("\n");
                    }
                }
            }
        }
        System.out.println("number of distinct triplets are" + triplets);

    }
    /**
     * creating a static array and calling findTriplets method by passing parameters.
     * @param args
     */
    public static void main(String[] args) {
        int triplet[] = {2, 3, 4, -5, -4, 9};
        int n = triplet.length;
        findTriplets(triplet, n);

    }
}