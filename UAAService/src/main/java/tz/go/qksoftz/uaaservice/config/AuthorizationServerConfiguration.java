//package tz.go.qksoftz.uaaservice.config;
//
//import org.springframework.context.annotation.Configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.oauth2.core.OAuth2TokenType;
//import org.springframework.security.oauth2.core.endpoint.OAuth2ParameterNames;
//import org.springframework.security.oauth2.core.oidc.OidcScopes;
//import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
//import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
//import org.springframework.security.oauth2.server.authorization.client.JdbcRegisteredClientRepository;
//import org.springframework.security.oauth2.server.authorization.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration;
//import org.springframework.security.oauth2.server.authorization.token.OAuth2TokenCustomizer;
//import org.springframework.security.oauth2.server.authorization.token.TokenSettings;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import javax.sql.DataSource;
//import java.time.Duration;
//import java.util.UUID;
//
//@Configuration
//public class AuthorizationServerConfiguration {
//
//    private final DataSource dataSource;
//    private final PasswordEncoder passwordEncoder;
//    private final AuthenticationManager authenticationManager;
//
//    public AuthorizationServerConfiguration(DataSource dataSource, PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager) {
//        this.dataSource = dataSource;
//        this.passwordEncoder = passwordEncoder;
//        this.authenticationManager = authenticationManager;
//    }
//
//    @Bean
//    public SecurityFilterChain authorizationServerSecurityFilterChain(HttpSecurity http) throws Exception {
//        OAuth2AuthorizationServerConfiguration.applyDefaultSecurity(http);
//        return http.formLogin().and().build();
//    }
//
//    @Bean
//    public RegisteredClientRepository registeredClientRepository() {
//        RegisteredClient registeredClient = RegisteredClient.withId(UUID.randomUUID().toString())
//                .clientId("client-id")
//                .clientSecret(passwordEncoder.encode("client-secret"))
//                .authorizationGrantType(OAuth2AuthorizationServerConfiguration.DEFAULT_AUTHORIZATION_GRANT_TYPE)
//                .scope(OidcScopes.OPENID)
//                .tokenSettings(TokenSettings.builder().accessTokenTimeToLive(Duration.ofHours(1)).build())
//                .build();
//
//        return new JdbcRegisteredClientRepository(dataSource).save(registeredClient);
//    }
//
//    @Bean
//    public OAuth2TokenCustomizer<OAuth2TokenType> tokenCustomizer() {
//        return tokenContext -> {
//            // Customize token claims or attributes here if needed
//        };
//    }
//
////    @Bean
////    public Slugify getSlugify() {
////        return new Slugify().withLowerCase(false);
////    }
//}
//
