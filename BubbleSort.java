public class BubbleSort {

    public static void main(String[] args) {
    }

    public void bubbleSort(int[] sortableItems){
        int n = sortableItems.length;
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (sortableItems[j] > sortableItems[j+1]) {
                    Swap(sortableItems[j],sortableItems[j+i]);
                }
            }

        }
    }
    
    
    private void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        }
    }

TESTINGGG
