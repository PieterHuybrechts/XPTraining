package org.cegeka.petshop;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class ShopTest {

	private Shop shop;

	@Before
	public void setup() {
		shop = new Shop();
	}

	@Test
	public void addItem_whenItem_thenAddsItemToStock() {
		String item = "Doggy Gucci bag";

		shop.addItem(item);

		Set<String> items = shop.getItemsInStock();
		assertThat(items.contains(item)).isTrue();
	}
}
