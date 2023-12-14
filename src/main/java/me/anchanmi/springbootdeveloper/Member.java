package me.anchanmi.springbootdeveloper;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED) //기본 생성자 생성
@AllArgsConstructor
@Getter
@Entity //엔티티로 지정
public class Member {
    @Id //기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본기 생성 방식 결정. (자동으로 증가하도록 지정).
    @Column(name = "id", updatable = false) //데이터베이스의 컬럼과 필드를 매핑.
    private Long id; //DB 테이블의 'id' 컬럼과 매칭
    
    @Column(name = "name", nullable = false)
    private String name; //DB 테이블의 'name' 컬럼과 매칭
}
