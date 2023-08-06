package ZShop.example.eZShop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class client {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String Nom;
    private String email;
    private String password;
    private String adresse;
    private String nuCart;
    private int phone ;



}
