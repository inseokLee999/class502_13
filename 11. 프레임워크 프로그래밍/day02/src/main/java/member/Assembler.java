package member;


import member.dao.MemberDao;
import member.services.JoinService;
import member.validators.JoinValidator;

public class Assembler {

    public MemberDao memberDao() {
        return new MemberDao();
    }

    public JoinValidator joinValidator() {
        JoinValidator validator = new JoinValidator();
        validator.setMemberDao(memberDao());
        return validator;
    }

    public JoinService joinService() {
        return new JoinService(joinValidator(), memberDao());
    }
}