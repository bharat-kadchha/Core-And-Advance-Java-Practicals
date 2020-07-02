package com;

import java.util.ListResourceBundle;

public class Demo extends ListResourceBundle {

	public Object[][] getContents() {
		return contents;
	}

	static final Object[][] contents = { { "vegetable.Potato", "Potato" },

	{ "vegetable.Tomato", "Tomato" }, { "vegetable.Carrot", "Carrot" }, };
}
