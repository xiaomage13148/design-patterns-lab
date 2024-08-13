package adapter;

public class UserDto {
    private Long userid;
    private String nickname;

    public UserDto() {
    }

    public UserDto(Long userid, String nickname) {
        this.userid = userid;
        this.nickname = nickname;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
