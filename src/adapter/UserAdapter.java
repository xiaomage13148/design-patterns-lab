package adapter;

public class UserAdapter {
    public static UserDto buildUserDto(UserEntity userEntity) {
        UserDto userDto = new UserDto();
        userDto.setNickname(userEntity.getUsername());
        userDto.setUserid(Long.parseLong(userEntity.getId()));
        return userDto;
    }
}
