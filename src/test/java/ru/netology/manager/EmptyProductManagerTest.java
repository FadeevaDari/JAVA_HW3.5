package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class EmptyProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager productManager = new ProductManager(repository);


    @BeforeEach
    public void setUp() {
    }


    @Test
    public void shouldSearchBookNameEmptyProductManager() {
        String text = "name1";

        Product[] expected = new Product[]{};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldSearchBookAuthorEmptyProductManager() {
        String text = "author1";

        Product[] expected = new Product[]{};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchSmartphoneNameEmptyProductManager() {
        String text = "name3";

        Product[] expected = new Product[]{};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchSmartphoneVendorEmptyProductManager() {
        String text = "vendor2";

        Product[] expected = new Product[]{};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldSearchEmptyFieldEmptyProductManager() {
        String text = "";

        Product[] expected = new Product[]{};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

}