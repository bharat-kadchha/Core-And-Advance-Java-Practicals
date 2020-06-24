package concurrentCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// we can't update list during other thread running

class ProblemWithCollection extends Thread {
	
	static HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

	// every traditional collection get this exception
	
	public void run() {
		try {

			Thread.sleep(1000);
			hashMap.put(104, "truck");
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws InterruptedException {

		hashMap.put(101, "bike");
		hashMap.put(102, "car");
		hashMap.put(103, "bicycle");

		ProblemWithCollection thread1 = new ProblemWithCollection();

		thread1.start();
		Set<Integer> set = hashMap.keySet();
		Iterator<Integer> itr = set.iterator();

		while (itr.hasNext()) {
			Integer i1 = (Integer) itr.next();

			System.out.println(i1 + "..." + hashMap.get(i1));
			Thread.sleep(1000);
		}
		
		System.out.println(hashMap);
	}

}
