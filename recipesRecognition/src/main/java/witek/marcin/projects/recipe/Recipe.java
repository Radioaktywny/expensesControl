package witek.marcin.projects.recipe;

import java.util.List;

public class Recipe {
    
    private List<Product> products;
    
    private String prize;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "products=" + products +
                ", prize='" + prize + '\'' +
                "}\n";
    }
}
