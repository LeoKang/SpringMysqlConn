package com.example.SpringMysqlConn;

import com.example.SpringMysqlConn.dto.Memo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
class SpringMysqlConnApplicationTests {

	@Autowired
	MemoRepository memoRepository;

	@Test
	public void InsertDummies() {
		IntStream.rangeClosed(1, 10).forEach(i -> {
			Memo memo = Memo.builder()
					.memoText("Sample..." + i)
					.build();

			memoRepository.save(memo);
		});
	}

	@Test
	void contextLoads() {
	}

}
