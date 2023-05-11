package fr.perso.crypto.dashboardcrypto.token.controller;

import fr.perso.crypto.dashboardcrypto.token.repository.TokenRepository;
import fr.perso.crypto.dashboardcrypto.token.resource.TokenResource;
import fr.perso.crypto.dashboardcrypto.token.service.TokenService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {
    private TokenRepository tokenRepository;

    private TokenService tokenService;

    public TokenController(TokenRepository tokenRepository, TokenService tokenService) {
        this.tokenRepository = tokenRepository;
        this.tokenService = tokenService;
    }

    public TokenResource getToken(String token) {

        return null;
    }
}
