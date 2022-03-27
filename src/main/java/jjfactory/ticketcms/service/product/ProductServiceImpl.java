package jjfactory.ticketcms.service.product;

import jjfactory.ticketcms.domain.product.Product;
import jjfactory.ticketcms.repository.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    @Override
    public Product findById(Long id){
        return productRepository.findById(id).orElseThrow(() ->{
            throw new IllegalArgumentException("조회 실패");
        });
    }
    @Override
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @Transactional
    @Override
    public void save(Product product){
        productRepository.save(product);
    }

    @Transactional
    @Override
    public void deleteById(Long id){
        productRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void updateById(Long id,Product product){
        Product findProduct = productRepository.findById(id).orElseThrow(() -> {
            throw new IllegalArgumentException("조회 실패");
        });

        findProduct.changeProduct(product.getName(),product.getPrice());
    }
}
