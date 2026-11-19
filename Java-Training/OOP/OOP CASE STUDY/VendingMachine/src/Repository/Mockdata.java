package Repository;

import Model.Product;

public class Mockdata {
    ProductRepository productRepository;
    public Mockdata(ProductRepository productRepository)
    {
        this.productRepository=productRepository;
        loadMockData();
    }
    public void loadMockData() {
        productRepository.addProduct("P101",
                new Product("P101", "Coke", 40, 10));

        productRepository.addProduct("P102",
                new Product("P102", "Pepsi", 40, 10));

        productRepository.addProduct("P103",
                new Product("P103", "ThumsUp", 45, 15));

        productRepository.addProduct("P104",
                new Product("P104", "Sprite", 40, 12));

        productRepository.addProduct("P105",
                new Product("P105", "Fanta", 35, 8));

        productRepository.addProduct("P106",
                new Product("P106", "Water", 20, 20));

        productRepository.addProduct("P107",
                new Product("P107", "Lays", 20, 10));

        productRepository.addProduct("P108",
                new Product("P108", "Oreo", 30, 7));

        productRepository.addProduct("P109",
                new Product("P109", "Dairy Milk", 50, 6));

        System.out.println("Mock Products Loaded Successfully!");
    }
}
