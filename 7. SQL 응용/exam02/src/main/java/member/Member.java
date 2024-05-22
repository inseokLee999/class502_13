package member;

import lombok.*;

import java.time.LocalDateTime;
/*@Getter @Setter @ToString @EqualsAndHashCode*/
@Data
//@NoArgsConstructor(access = AccessLevel.PRIVATE)//기본생성자
@NoArgsConstructor
@AllArgsConstructor//모든 매개 변수가 생성자로 들어감
@RequiredArgsConstructor
public class Member {
    @NonNull
    private String userId;

    @NonNull
    private String userNm;
    private String email;
    @ToString.Exclude
    private LocalDateTime regDt;
}
