package concurrentCollection;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class SolveProblem extends Thread {
	static ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<Integer, String>();

	
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

		SolveProblem solve = new SolveProblem();

		solve.start();
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
