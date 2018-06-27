package com.test.controller;

import com.test.mapper.aa.MemberInfoEntityMapper;
import com.test.mapper.bb.TaskInfoEntityMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hackerdom on 2018.6.27.<br>
 */
@Slf4j
@RestController
public class InfoController {

    @Autowired
    private MemberInfoEntityMapper memberInfoEntityMapper;
    @Autowired
    private TaskInfoEntityMapper taskInfoEntityMapper;

    @GetMapping(value = "/")
    public void getQRCode() {
        log.info("{}", memberInfoEntityMapper.selectAll());
        log.info("{}", taskInfoEntityMapper.selectAll());
    }
}
