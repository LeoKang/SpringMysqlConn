package com.example.SpringMysqlConn;

import com.example.SpringMysqlConn.dto.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
