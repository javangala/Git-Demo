package array;

public class Unique_elements_from_2Arrays {
	
	public static void main(String[] args) {
		
		
		        int[] arr1 = {1, 2, 3, 4, 5};
		        int[] arr2 = {1, 2, 3, 4, 7};

		        System.out.println("Elements unique to arr1:");
		        printUniqueElements(arr1, arr2);

		        System.out.println("\nElements unique to arr2:");
		        printUniqueElements(arr2, arr1);
		    }

		    public static void printUniqueElements(int[] array1, int[] array2) {
		        for (int i = 0; i < array1.length; i++) {
		            boolean isUnique = true;
		            for (int j = 0; j < array2.length; j++) {
		                if (array1[i] == array2[j]) {
		                    isUnique = false;
		                    break;
		                }
		            }
		            if (isUnique) {
		                System.out.print(array1[i] + " ");
		            }
		        }
		    }
		}
