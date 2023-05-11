CREATE TABLE if NOT EXISTS dashboardcrypto.token(
    pk_token_id serial PRIMARY KEY,
    nom VARCHAR ( 50 ) UNIQUE NOT NULL,
    token VARCHAR ( 50 ) UNIQUE NOT NULL,
    blockchain VARCHAR ( 50 ) UNIQUE NOT NULL,
    date TIMESTAMP NOT NULL,
    prix NUMERIC NOT NULL
);

CREATE TABLE IF NOT EXISTS dashboardcrypto.transaction(
    pk_transaction_id serial PRIMARY KEY,
    quantite NUMERIC NOT NULL,
    prix NUMERIC NOT NULL,
    achat BOOLEAN NOT NULL,
    frais NUMERIC,
    CONSTRAINT fk_transaction FOREIGN_KEY(fk_token_id) REFERENCES token(pk_token_id)
);

CREATE TABLE IF NOT EXISTS dashboardcrypto.staking(
    pk_staking_id serial PRIMARY KEY,
    date TIMESTAMP NOT NULL,
    quantite NOT NULL,
    CONSTRAINT fk_staking FOREIGN_KEY(fk_token_id) REFERENCES token(pk_token_id)
);

CREATE TABLE IF NOT EXISTS dashboardcrypto.actif(
    pk_actif_id serial PRIMARY KEY,
    quantite NOT NULL,
    prix_achat_moyen NUMERIC NOT NULL,
    pourcentage_profits NUMERIC NOT NULL
    CONSTRAINT fk_actif FOREIGN_KEY(fk_actif_id) REFERENCES token(pk_token_id)
);

