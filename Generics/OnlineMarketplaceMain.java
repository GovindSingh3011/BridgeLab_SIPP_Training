abstract class Category {
    String name;
    public Category(String name) {
        this.name = name;
    }
}

class BookCategory extends Category {
    public BookCategory(String name) {
        super(name);
    }
}

class ClothingCategory extends Category {
    public ClothingCategory(String name) {
        super(name);
    }
}

class GadgetCategory extends Category {
    public GadgetCategory(String name) {
        super(name);
    }
}

class Product<T extends Category> {
    String productName;
    double price;
    T category;

    public Product(String productName, double price, T category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public void showProduct() {
        System.out.println(productName + " (" + category.name + ") - $" + price);
    }
}

class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price = product.price - (product.price * percentage / 100);
        System.out.println("Discount Applied: New price is $" + product.price);
    }
}

public class OnlineMarketplaceMain {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory("Books"));
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 300, new ClothingCategory("Clothing"));
        Product<GadgetCategory> phone = new Product<>("Smartphone", 15000, new GadgetCategory("Gadgets"));

        book.showProduct();
        Marketplace.applyDiscount(book, 10);

        shirt.showProduct();
        Marketplace.applyDiscount(shirt, 20);

        phone.showProduct();
        Marketplace.applyDiscount(phone, 15);
    }
}
