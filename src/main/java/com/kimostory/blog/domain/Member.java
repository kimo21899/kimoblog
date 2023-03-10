package com.kimostory.blog.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member extends DatetimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberNo", unique = true, nullable = false)
    private Long memberNo;

    @Column(name="memberName",length = 20, nullable = false)
    private String memberName;

    @Column(name="memberId", unique = true, length = 50, nullable = false)
    private String memberId;

    @Column(name="memberPassword",length = 100, nullable = false)
    private String memberPassword;

    @Column(name="memberNickname", unique = true, length = 30, nullable = false)
    private String memberNickname;

    @Column(name="memberRoles", length = 10, nullable = false)
    private String memberRoles;

}
