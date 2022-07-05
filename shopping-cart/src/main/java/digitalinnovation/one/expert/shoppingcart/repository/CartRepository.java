package digitalinnovation.one.expert.shoppingcart.repository;

import digitalinnovation.one.expert.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
    Cart findCustomerId(Integer customerId);
}
