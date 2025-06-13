package in.shreyansh.FoodOrder.service;
import in.shreyansh.FoodOrder.io.CartRequest;
import in.shreyansh.FoodOrder.io.CartResponse;
public interface CartService {
    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();
    CartResponse removeFromCart(CartRequest cartRequest);
}
