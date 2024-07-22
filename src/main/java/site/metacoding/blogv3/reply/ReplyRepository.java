package site.metacoding.blogv3.reply;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Integer> {
    List<Reply> findByPostId(Integer postId);

    // 삭제하기
    void deleteByIdAndUserId(Integer replyId, Integer id);
}