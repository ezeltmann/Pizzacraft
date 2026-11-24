public class PizzacraftItemIds {
    public static ResourceKey<Item> create(String name) {
        // Create the item key.
        return ResourceKey.create(Registries.ITEM, Pizzacraft.id(name));
    }
}