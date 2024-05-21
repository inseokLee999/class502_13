package member;

import lombok.*;

import java.time.LocalDateTime;
/*@Getter @Setter @ToString*/
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor//기본생성자
public class Member {
    private String userId;
    private String userNm;
    private String email;
    private LocalDateTime regDt;
}
