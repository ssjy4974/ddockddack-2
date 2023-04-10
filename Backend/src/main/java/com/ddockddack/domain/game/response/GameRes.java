package com.ddockddack.domain.game.response;

import com.querydsl.core.annotations.QueryProjection;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class GameRes {
    private Long gameId;
    private String gameCategory;
    private String gameTitle;
    private String gameDesc;
    private Long memberId;
    private String creator;
    private int isStarred;
    private int starredCnt;
    private int popularity;
    private String thumbnail;

    @QueryProjection
    public GameRes(Long gameId, String gameCategory, String gameTitle, String gameDesc, Long memberId,String creator, int isStarred, int starredCnt, int popularity, String thumbnail) {
        this.gameId = gameId;
        this.gameCategory = gameCategory;
        this.gameTitle = gameTitle;
        this.gameDesc = gameDesc;
        this.memberId = memberId;
        this.creator = creator;
        this.isStarred = isStarred;
        this.starredCnt = starredCnt;
        this.popularity = popularity;
        this.thumbnail = thumbnail;
    }
}
