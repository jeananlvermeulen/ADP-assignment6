public class ArrayList {
    switch (loadType) {
        case BULKY:
            shippingCosts += (defaultCost + 5);
            break;
        case LIGHTWEIGHT:
            shippingCosts += (defaultCost - 1);
            break;
        case STANDARD:
            shippingCosts += (defaultCost);
            break;
        default:
            throw new IllegalStateException("Unknown type: " + loadType);
    }
}
