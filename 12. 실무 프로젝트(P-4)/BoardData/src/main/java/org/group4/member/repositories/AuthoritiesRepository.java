package org.group4.member.repositories;


import org.group4.member.entities.Authorities;
import org.group4.member.entities.AuthoritiesId;
import org.group4.member.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface AuthoritiesRepository extends JpaRepository<Authorities, AuthoritiesId>, QuerydslPredicateExecutor<Authorities> {
    List<Authorities> findByMember(Member member);
}
