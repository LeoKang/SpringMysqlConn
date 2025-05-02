package com.example.SpringMysqlConn.service;

import com.example.SpringMysqlConn.MemoRepository;
import com.example.SpringMysqlConn.dto.Memo;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemoService {

    private final MemoRepository memoRepository;

    public MemoService(MemoRepository memoRepository) {
        this.memoRepository = memoRepository;
    }

    public List<Memo> getMemo() {
        //return memoRepository.findAll();
        return memoRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }
}
