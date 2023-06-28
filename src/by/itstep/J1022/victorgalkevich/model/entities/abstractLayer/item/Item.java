package by.itstep.J1022.victorgalkevich.model.entities.abstractLayer.item;

import java.io.Serializable;
import java.util.Objects;

public class Item implements Serializable {
    protected int price;

    protected Item() {
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return price == item.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }
}
