package witek.marcin.projects.recipe;

public class Product {
    
    private String name;
    
    private String prize;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", prize='" + prize + '\'' +
                "}\n";
    }
}
