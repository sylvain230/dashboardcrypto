package fr.perso.crypto.dashboardcrypto.token.repository;

import fr.perso.crypto.dashboardcrypto.entity.TokenEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends CrudRepository<Long, TokenEntity> {
    TokenEntity findByNom(String tokenId);
}
