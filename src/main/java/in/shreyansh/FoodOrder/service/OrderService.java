package in.shreyansh.FoodOrder.service;

import com.razorpay.RazorpayException;
import in.shreyansh.FoodOrder.io.OrderRequest;
import in.shreyansh.FoodOrder.io.OrderResponse;

import java.util.List;
import java.util.Map;

public interface OrderService {
    OrderResponse createOrderWithPayment(OrderRequest request) throws RazorpayException;

    void verifyPayment(Map<String,String> paymentData,String status);


    List<OrderResponse> getUserOrers();


    void removeOrder(String orderId);

    List<OrderResponse >getOrdersOfAllUsers();

  void   updateOrderStatus(String orderId, String status);



}
