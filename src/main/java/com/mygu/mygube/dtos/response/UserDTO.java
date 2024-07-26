package com.mygu.mygube.dtos.response;

import com.mygu.mygube.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserDTO implements EntityDTO<User, UserDTO> {
    private String lastName;
    private String firstName;
    private String address;
    private String gender;

    @Override
    public UserDTO fromEntity(User entity) {
        return new UserDTO(entity.getLastName(), entity.getFirstName(), entity.getAddress(), entity.getGender().getName());
    }
}
