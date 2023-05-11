package fr.perso.crypto.dashboardcrypto.token.service;

import fr.perso.crypto.dashboardcrypto.entity.TokenEntity;
import fr.perso.crypto.dashboardcrypto.model.Token;
import fr.perso.crypto.dashboardcrypto.token.repository.TokenRepository;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    private TokenRepository tokenRepository;

    public TokenService(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    public Token getInformationsToken(String tokenId) {
        TokenEntity token = this.tokenRepository.findByNom(tokenId);
        if(token == null) {
            // On fait un appel Rest vers CoinGecko et on stocke la valeur

            // On sauvegarde en base
        }
    }
}
