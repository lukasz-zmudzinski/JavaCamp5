package pl.java.jc5.lombok.synchronizedd;

import lombok.Synchronized;

public class Hashtable {

	/**
	 * The total number of entries in the hash table.
	 */
	private transient int count;

	public synchronized boolean isEmpty() {
		return count == 0;
	}

	@Synchronized
	public boolean isEmptyPlusPlus() {
		return count == 0;
	}

}
