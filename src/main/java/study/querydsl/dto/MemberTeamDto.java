package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;


/**
 * DTO 는 가급적 순수했으면 좋겠는데, QueryProjection 어노테이션을 사용하면<br/>
 * DTO 는 결국 QueryDsl 에 의존하게 되는 문제점이 있다.
 */
@Data
public class MemberTeamDto {

    private Long memberId;
    private String username;
    private int age;
    private Long teamId;
    private String teamName;

    @QueryProjection
    public MemberTeamDto(Long memberId, String username, int age, Long teamId, String teamName) {
        this.memberId = memberId;
        this.username = username;
        this.age = age;
        this.teamId = teamId;
        this.teamName = teamName;
    }
}
