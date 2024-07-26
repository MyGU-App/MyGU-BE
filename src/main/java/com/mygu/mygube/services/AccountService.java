package com.mygu.mygube.services;

import com.mygu.mygube.dtos.response.AuthenDTO;
import com.mygu.mygube.dtos.response.UserDTO;
import com.mygu.mygube.entities.Account;
import com.mygu.mygube.enums.TokenType;
import com.mygu.mygube.repositories.IAccountRepository;
import com.mygu.mygube.services.interfaces.IAccountService;
import com.mygu.mygube.utils.JWTUtils;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AccountService implements IAccountService {
    private IAccountRepository accountRepository;
    private PasswordEncoder passwordEncoder;
    private JWTUtils jwtUtils;

    @Override
    public Optional<AuthenDTO> login(String username, String password) {
        // get account
        Optional<Account> account = accountRepository.findByUsername(username);

        if (account.isPresent()) {
            // verify password
            if (passwordEncoder.matches(password, account.get().getPassword())) {
                AuthenDTO authenDTO = new AuthenDTO();
                // generate tokens
                String AT = jwtUtils.generateToken(TokenType.ACCESS_TOKEN, account.get());
                String RT = jwtUtils.generateToken(TokenType.REFRESH_TOKEN, account.get());
                // create UserDTO
                UserDTO userDTO = new UserDTO().fromEntity(account.get().getUser());

                authenDTO.setUserInfo(userDTO);
                authenDTO.setRefreshToken(RT);
                authenDTO.setAccessToken(AT);

                return Optional.of(authenDTO);
            }
        }
        return Optional.empty();
    }
}
