public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void selectionSortName(String[] names, int[] ages){

		for (int i = 0; i < names.length - 1; i++){
			int smallestIndex = i;
			for (int j = i + 1; j < names.length; j++){
				int comparassion = names[j].toLowerCase().compareTo(names[smallestIndex].toLowerCase());
				if (comparassion < 0){
					smallestIndex = j;
				}

				int temp = ages[smallestIndex];
				ages[smallestIndex] = ages[i];
				ages[i] = temp;

				String temp1 = names[smallestIndex];
				names[smallestIndex] = names[i];
				names[i] = temp1;
			}
		}	
	}

	public static void selectionSortAge(String[] names, int[] ages){

		for (int i = 0; i < ages.length - 1; i++){
			int smallestIndex = i;
			for (int j = i + 1; j < ages.length; j++){
				if (ages[j] < ages[smallestIndex]){
					smallestIndex = j;
				}
			}

			int temp = ages[smallestIndex];
			ages[smallestIndex] = ages[i];
			ages[i] = temp;

			String temp1 = names[smallestIndex];
			names[smallestIndex] = names[i];
			names[i] = temp1;
		}	
	}
}
