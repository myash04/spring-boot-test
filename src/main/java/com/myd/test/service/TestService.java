package com.myd.test.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.myd.test.models.TestModel;

@Service
public class TestService {

    public List<TestModel> getlist() {

        List<TestModel> lstModels = new ArrayList<>();

        lstModels.add(new TestModel("Yash", 22, LocalDate.now()));
        lstModels.add(new TestModel("Ashish", 26, LocalDate.now()));

        return lstModels;

    }

}
