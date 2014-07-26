/**
 * Problem:
 * Write a method to shuffle a deck of cards. 
 * It must be a perfect shuffle -- in other words, each of the 52! permutations of the deck has to be equally likely. 
 * Assume that you are given a random number generator which is perfect.
 */
package cc150;

import java.util.Random;

public class _18_2_PerfectShuffle {

	public static int[] shuffleArrayRecursively(int[] cards, int i) {

		if (i == 0) {
			return cards;
		}

		shuffleArrayRecursively(cards, i - 1);
		int k = rand(0, i);

		int temp = cards[k];
		cards[k] = cards[i];
		cards[i] = temp;

		return cards;
	}

	public static int[] shuffleArrayIteratively(int[] cards) {

		for (int i = 0; i < cards.length; i++) {
			int k = rand(0, i);
			int temp = cards[k];
			cards[k] = cards[i];
			cards[i] = temp;
		}

		return cards;
	}

	private static int rand(int lower, int higher) {

		Random r = new Random();
		
		return lower + r.nextInt(higher - lower);
	}
}
