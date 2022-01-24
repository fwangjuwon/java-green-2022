package coffeeshop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MenuItem {
    public MenuItem(String string, int i) {
    }

    private String name;
    private int price;

    public Object getName() {
        return null;
    }
}
