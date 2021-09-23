package com.greatlearning.utility;

public class MergeSort {

    public int i;
    public void sortArray(double array[], int l, int r, int selection) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sortArray(array, l, m, selection);
            sortArray(array, m + 1, r, selection);
            conquerArray(array, l, m, r, selection);
        }
    }
    public void conquerArray(double array[], int l, int m, int r, int selection) {
        int n1 = m - l + 1;
        int n2 = r - m;
        double L[] = new double[n1];
        double R[] = new double[n2];
        for (i = 0; i < n1; ++i) {
            L[i] = array[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[m + 1 + j];
        }
        i = 0;
        int k = l, j = 0;
        // case 1 for ascending and case 2 for descending order sorting
        switch(selection){
            case 1 :
                while (i < n1 && j < n2) {
                    if (L[i] <= R[j]) {
                    array[k] = L[i];
                    i++;
                    } else {
                    array[k] = R[j];
                    j++;
                    }
                    k++;
                }
                break;
            case 2 :
                while (i < n1 && j < n2) {
                    if (L[i] >= R[j]) {
                    array[k] = L[i];
                    i++;
                    } else {
                    array[k] = R[j];
                    j++;
                    }
                    k++;
                }
                break;
            }
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}