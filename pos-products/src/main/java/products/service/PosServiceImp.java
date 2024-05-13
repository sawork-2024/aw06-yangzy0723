package products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import products.db.PosDB;
import products.model.Product;

import java.util.List;

@Service
public class PosServiceImp implements ProductService {

    private PosDB posDB;

    @Autowired
    public void setPosDB(PosDB posDB) {
        this.posDB = posDB;
    }

    @Override
    public List<Product> products() {
        return posDB.getProducts();
    }

    @Override
    public Product getProduct(String productId) {
        return posDB.getProduct(productId);
    }

    @Override
    public Product setProductQuantity(String productId, int quantity) {
        return posDB.setProductQuantity(productId, quantity);
    }
}
