package mappers.member;

import member.entities.Member;
import org.apache.ibatis.annotations.Select;

public interface MemberMapper {
    @Select("SELECT COUNT(*) FROM MEMBER")
    long getTotal();
    //회원 등록
    int register(Member member);

    Member get(String email);

    int exists(String email);
}
