public class PizzacraftItemIds {
    public static ResourceKey<Item> create(String name) {
        // Create the item key.
        return ResourceKey.create(Registries.ITEM, Pizzacraft.id(name));
    }
}

public class PizzacraftItems {
    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        // Create the item instance.
        Item item = itemFactory.apply(settings.setId(itemKey));

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

}

public static final Item CHEESE_PIZZA = register(
        PizzacraftItemIds.CHEESE_PIZZA,
        Item::new,
        new Item.Properties()
);