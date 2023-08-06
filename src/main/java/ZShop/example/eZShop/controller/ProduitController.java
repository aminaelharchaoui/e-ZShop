package ZShop.example.eZShop.controller;

import ZShop.example.eZShop.entity.produit;
import ZShop.example.eZShop.reposotories.ProduitRepository;
import ZShop.example.eZShop.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/produit")
@CrossOrigin(origins="*")
public class ProduitController {
    @Autowired
private ProduitRepository produitRepository;
@GetMapping("/products")
    public List<produit> getAllproducts(){
    return produitRepository.findAll();
}
@PostMapping("/createproduct")
    public produit createproduct(produit product) {
   return  produitRepository.save(product);
}

}
