
public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize
			int m = (int) Math.pow(2, 5);
			int[] key = {'D', 'I', 'S', 'C', 'R', 'E', 'T', 'E','D', 'I', 'S', 'C', 'R', 'E', 'T', 'E',
					'D', 'I', 'S', 'C', 'R', 'E', 'T', 'E','D', 'I', 'S', 'C', 'R', 'E', 'T', 'E' };
			
			//char[] state = {'X', 'N', 'V', '@', 'H'};
			int[]state = new int[m];
			for(int i = 0; i < m; i++) {
				state[i] = i;
			}
			
			int j = 0;
			
			for(int i = 0; i < key.length; i++) {
				System.out.print(key[i]);
				System.out.print(" ");
			}
			System.out.print(" : Length of key = " + key.length);
			
			System.out.println();
			
			for(int i = 0; i < state.length; i++) {
				System.out.print(state[i]);
				System.out.print(" ");
			}
			System.out.print(" : Length of state = " + state.length);
			
			System.out.println();
			
			//Mix
			for(int i = 0; i < m; i++) {
				j = (j + state[i] + key[i]) % m;
				//swap state[i] and state[j]
				int temp = state[j];
				state[j] = state[i];
				state[i] = temp;
			}
			
			for(int i = 0; i < state.length; i++) {
				System.out.print(state[i]);
				System.out.print(" ");
			}
			System.out.print(" : After mixing ");
			System.out.println();
			
			//Encipher
			int eI = 0;
			int eJ = 0;
			int counter = 0;
			while(counter < m) {
				eI =(eI + 1) % m;
				eJ = (eJ + state[eI]) % m;
				//swap state[eI] and state[eJ]
				int temp = state[eJ];
				state[eJ] = state[eI];
				state[eI] = temp;
				System.out.print(state[(state[eI] + state[eJ]) % m]);
				System.out.print(" ");
				counter++;
			}
			
			System.out.println();
			//System.out.println("Counter = " + counter);
			
		/*	If we want to use these "random" numbers for encryption or decryption,
			we treat them as XOR masks.
			In other words, in binary, C=P XOR M and P=C XOR M, where P is plaintext, C is ciphertext and M is the mask.
			Ciphertext = XNV@H
		*/		
		
		//decrypt
		System.out.print((char) ('X' ^ 10));
		System.out.print((char) ('N' ^ 1));
		System.out.print((char) ('V' ^ 21));
		System.out.print((char) ('@' ^ 11));
		System.out.print((char) ('H' ^ 27));
		
			
	}

}
