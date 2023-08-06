package ZShop.example.eZShop.service;

import ZShop.example.eZShop.reposotories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class ProduitService {
    @Autowired private ProduitRepository produitRepository;

}
