package com.example.demo.controller.resources;

import com.example.demo.repository.resources.LogTableEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@RequiredArgsConstructor
public class LogResponse {
    private final List<LogDetail> logList;

    @Getter
    @RequiredArgsConstructor
    public static class LogDetail {
        private final Integer id;
        private final String keyword;

        public static LogDetail of(LogTableEntity entity) {
            return new LogDetail(entity.getId(), entity.getKeyword());
        }
    }
    public static LogResponse of(List<LogTableEntity> entityList) {
        return new LogResponse(entityList.stream().map(LogDetail::of).collect(Collectors.toList()));
    }

}
