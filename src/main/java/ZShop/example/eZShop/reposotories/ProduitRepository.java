package ZShop.example.eZShop.reposotories;

import ZShop.example.eZShop.entity.produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<produit,Integer> {
}
