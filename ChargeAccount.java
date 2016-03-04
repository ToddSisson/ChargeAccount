package num5;

public class ChargeAccount {

	public static boolean checkAccounts(int[] accounts, int accountNumber){
		int startScan, index, minIndex, minValue;
		for (startScan = 0; startScan < (accounts.length - 1); startScan++){
			minIndex = startScan;
			minValue = accounts[startScan];
			for (index = startScan + 1; index < accounts.length; index++){
				if (accounts[index] < minValue){
					minValue = accounts[index];
					minIndex = index;
				}
			}
			accounts[minIndex] = accounts[startScan];
			accounts[startScan] = minValue;
		}
		
		
		boolean found = false;
		int first = 0;
		int last = accounts.length - 1;
		int middle;

		while(!found && first <= last){
			middle = (first + last) / 2;
			if (accounts[middle] == accountNumber)
			{
				found = true;
			}
			else if (accounts[middle] > accountNumber)
				last = middle - 1;
			else
				first = middle + 1;
		}

		return found;
	}
}


