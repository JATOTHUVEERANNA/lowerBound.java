import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int lowerBound(int arr[], int x, int n) {
        int low = 0;
        int high = n - 1;
        int ans = n;  // Initialize ans to n which will be returned if no valid index is found

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                ans = mid;  // Found a potential lower bound
                high = mid - 1;  // Look for a smaller index
            } else {
                low = mid + 1;  // Look for a larger index
            }
        }

        // Return -1 if ans is still n, meaning x is less than the smallest element
        return (ans < n && arr[ans] >= x) ? ans : -1;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        int n = 7, x = 0, arr[] = {1, 2, 8, 10, 11, 12, 19};
        System.out.println(lowerBound(arr, x, n));
    }
}
