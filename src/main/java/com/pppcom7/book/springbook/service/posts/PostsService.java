package com.pppcom7.book.springbook.service.posts;

import com.pppcom7.book.springbook.domain.posts.Posts;
import com.pppcom7.book.springbook.domain.posts.PostsRepository;
import com.pppcom7.book.springbook.web.dto.PostsResponseDto;
import com.pppcom7.book.springbook.web.dto.PostsSaveRequestsDto;
import com.pppcom7.book.springbook.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService{
    private final PostsRepository postsRepository;

    public Long save(PostsSaveRequestsDto requestsDto){
        return postsRepository.save(requestsDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("해당 게시글이 없습니다. id="+id));
        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById(Long id){
        Posts entity = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id="+id));
        return new PostsResponseDto(entity);
    }
}
