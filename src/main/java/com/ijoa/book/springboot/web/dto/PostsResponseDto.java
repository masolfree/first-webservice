package com.ijoa.book.springboot.web.dto;

import com.ijoa.book.springboot.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    //PostsResponseDto는 Entity의 필드중 일부만 사용하므로 생성자로 Entity를 받아 필드에 값을 넣는다.
    //굳이 모든 필드를 가진 생성자가 필요하진 않으므로 Dto는 Entity를 받아 처리
    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
