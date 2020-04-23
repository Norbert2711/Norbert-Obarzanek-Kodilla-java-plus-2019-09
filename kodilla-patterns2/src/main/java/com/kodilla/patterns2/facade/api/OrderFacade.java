package java.com.kodilla.patterns2.facade.api;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.com.kodilla.patterns2.facade.ShopService;


@Service
public class OrderFacade {

    @Autowired
    private ShopService shopService;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);

    public void processOrder(final OrderDto order, final Long userId)
        throws OrderProcessingException{
        boolean wasError = false;
        long orderId = shopService.openOrder(userId);
        LOGGER.error("Registering new order, ID: " +orderId);
        if(orderId <0) {
            LOGGER.error(OrderProcessingException.ERR_NOT_AUTHORISED);
            wasError = true;
            throw new OrderProcessingException(OrderProcessingException.ERR_NOT_AUTHORISED);
        }
        try{
            for (ItemDto orderItem: order.getItems()){
                LOGGER.error("Adding item" + orderItem.getProductsId(),
                        orderItem.getQuantity());
            }
        }
    }
}
