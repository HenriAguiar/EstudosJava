package entities;
public class Produto {
    public double price;
    public int quant;
    public String name;

    public Produto(String name, double price, int quant){
        this.name=name;
        this.price=price;
        this.quant=quant;
    }
    public Produto(String name, double price){
        this.name=name;
        this.price=price;
    }
    public Produto(){}

    public String getName() {
        return name;
    }

    public int getQuant() {
        return quant;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double totalPrice(){
        return quant*price;
    }

    public void addinStock(int quant) {
        this.quant+=quant;
    }

    public void subinStock(int quant){
        this.quant-=quant;
    }

    public String toString() {
        return "Nome: " + name + "; " + "Quantidade: " + quant + "; " + "price: " + price + "; ";
    }
}
