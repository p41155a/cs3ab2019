package iducs.springboot.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import iducs.springboot.board.entity.AnswerEntity;

@Repository
public interface AnswerRepository 
	extends JpaRepository<AnswerEntity, Long> {
	//public interface 이름 extends JpaRepository <엔티티 ID 유형>
	//JpaRepository는 인터페이스이다. 인터페이스에 미리 검색 메소드를 정의 해 두는 것으로
	//메소드를 호출하는 것만으로 스마트한 데이터 검색을 할 수 있게 되는 것
	//ex) 기존의 findAll()
}

