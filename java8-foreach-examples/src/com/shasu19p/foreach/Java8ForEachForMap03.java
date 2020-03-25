package com.shasu19p.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Java8ForEachForMap03 {

	public static void main(String[] args) {

		// create map
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		System.out.println("====== Anonymous style =====");
		BiConsumer<? super String, ? super Integer> action = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String key, Integer value) {
				System.out.println("key:" + key + ",value:" + value);
			}
		};
		items.forEach(action);

		System.out.println("==== Lambda style ======");
		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		// conditional print
		System.out.println("==== print only E ====");
		items.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("E".equals(k)) {
				System.out.println("Hello E");
			}
		});

	}

}
