package org.group4.member.repositories;


import org.group4.member.entities.Member;
import org.group4.member.entities.QMember;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long>, QuerydslPredicateExecutor<Member> {
    @EntityGraph(attributePaths = "authorities")//처음부터 조인(같이 로딩)
    Optional<Member> findByEmail(String email);

    default boolean exists(String email) {
        QMember member = QMember.member;

        return exists(member.email.eq(email));
    }
}
