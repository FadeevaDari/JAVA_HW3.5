package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class OneProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager productManager = new ProductManager(repository);
    private Smartphone first = new Smartphone(1, "name1", 30, "vendor1");


    @BeforeEach
    public void setUp() {
        productManager.add(first);
    }

    @Test
    public void shouldSearchSmartphoneNameOneProduct() {
        String text = "name1";

        Product[] expected = new Product[]{first};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchSmartphoneVendorOneProduct() {
        String text = "vendor1";

        Product[] expected = new Product[]{first};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindBookNameOneProduct() {
        String text = "name2";

        Product[] expected = new Product[]{};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindBookAuthorOneProduct() {
        String text = "author1";

        Product[] expected = new Product[]{};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldNotFindSmartphoneNameOneProduct() {
        String text = "name3";

        Product[] expected = new Product[]{};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldNotFindSmartphoneVendorOneProduct() {
        String text = "vendor5";

        Product[] expected = new Product[]{};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchEmptyFieldOneProduct() {
        String text = "";

        Product[] expected = new Product[]{};
        Product[] actual = productManager.searchBy(text);
        assertArrayEquals(expected, actual);
    }
}