package coffeeshop;

import java.util.ArrayList;

import lombok.Data;

@Data

public class Menu {
    private ArrayList<MenuItem> menuItems;

    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem 메뉴선택(String menuName) {
        for (MenuItem menuItem : menuItems) {
            if (menuItem.getName().equals(menuName)) {
                return menuItem;
            }
        }

        return null;

    }
}
