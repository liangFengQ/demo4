package com.yuan.demojpa.system.service.impl;

import com.yuan.demojpa.commons.service.impl.BaseServiceImpl;
import com.yuan.demojpa.commons.utils.DateUtils;
import com.yuan.demojpa.commons.utils.SQLUtils;
import com.yuan.demojpa.system.dto.ResourceDto;
import com.yuan.demojpa.system.pojo.Resource;
import com.yuan.demojpa.system.repository.ResourceRepository;
import com.yuan.demojpa.system.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("ALL")
@Service
public class ResourceServiceImpl extends BaseServiceImpl<Resource, String, ResourceRepository> implements ResourceService {
    private final ResourceRepository resourceRepository;

    @Autowired
    public ResourceServiceImpl(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    @Override
    public ResourceRepository getBaseRepository() {
        return resourceRepository;
    }

    @Override
    public Page<Resource> data(ResourceDto dto) {
        return getBaseRepository().findAll(dto, PageRequest.of(dto.getPage(), dto.getSize(), Sort.by(Sort.Order.desc("createDate"))));
    }

    @Override
    public Page<Resource> data2(ResourceDto dto) {
        String jpql = "select r from Resource r ";
        List<String> conditions = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        if (!StringUtils.isEmpty(dto.getId())) {
            conditions.add("r.id in (:id)");
            map.put("id", dto.getId().split(","));
        }
        if (!StringUtils.isEmpty(dto.getCreateDateStart())) {
            conditions.add("r.createDate >= :createDateStart");
            map.put("createDateStart", DateUtils.removeTime(dto.getCreateDateStart()));
        }
        if (!StringUtils.isEmpty(dto.getCreateDateEnd())) {
            conditions.add("r.createDate <= :createDateEnd");
            map.put("createDateEnd", DateUtils.setDayFinalTime(dto.getCreateDateEnd()));
        }
        if (!StringUtils.isEmpty(dto.getUpdateDateStart())) {
            conditions.add("r.updateDate >= :updateDateStart");
            map.put("updateDateStart", DateUtils.removeTime(dto.getUpdateDateStart()));
        }
        if (!StringUtils.isEmpty(dto.getUpdateDateEnd())) {
            conditions.add("r.updateDate <= :updateDateEnd");
            map.put("updateDateEnd", DateUtils.setDayFinalTime(dto.getUpdateDateEnd()));
        }
        if (!StringUtils.isEmpty(dto.getName())) {
            conditions.add("r.name like :name");
            map.put("name", dto.getName() + "%");
        }
        jpql = SQLUtils.createSQL(jpql, conditions);
        jpql += " order by r.createDate desc";
        return getBaseRepository().findAllByJPQL(jpql, PageRequest.of(dto.getPage(), dto.getSize()), map);
    }

    @Override
    public Page<Resource> data3(ResourceDto dto) {
        String sql = "select * from resource ";
        List<String> conditions = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        if (!StringUtils.isEmpty(dto.getId())) {
            conditions.add("id in (:id)");
            map.put("id", dto.getId().split(","));
        }

        if (!StringUtils.isEmpty(dto.getCreateDateStart())) {
            conditions.add("createDate >= :createDateStart");
            map.put("createDateStart", DateUtils.removeTime(dto.getCreateDateStart()));
        }
        if (!StringUtils.isEmpty(dto.getCreateDateEnd())) {
            conditions.add("createDate <= :createDateEnd");
            map.put("createDateEnd", DateUtils.setDayFinalTime(dto.getCreateDateEnd()));
        }

        if (!StringUtils.isEmpty(dto.getUpdateDateStart())) {
            conditions.add("updateDate >= :updateDateStart");
            map.put("updateDateStart", DateUtils.removeTime(dto.getUpdateDateStart()));
        }
        if (!StringUtils.isEmpty(dto.getUpdateDateEnd())) {
            conditions.add("updateDate >= :updateDateEnd");
            map.put("updateDateEnd", DateUtils.setDayFinalTime(dto.getUpdateDateEnd()));
        }
        if (!StringUtils.isEmpty(dto.getName())) {
            conditions.add("name like :name");
            map.put("name", dto.getName() + "%");
        }
        sql = SQLUtils.createSQL(sql, conditions);
        sql += " order by createDate desc";
        return getBaseRepository().findAllBySQL(sql, PageRequest.of(dto.getPage(), dto.getSize()), map);
    }

    @Override
    public List<Resource> list(ResourceDto dto) {
        return getBaseRepository().findAll(dto, Sort.by(Sort.Order.desc("createDate")));
    }

    @Override
    public List<Resource> list2(ResourceDto dto) {
        String jpql = "select r from Resource r ";
        List<String> conditions = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        if (!StringUtils.isEmpty(dto.getId())) {
            conditions.add("r.id in (:id)");
            map.put("id", dto.getId().split(","));
        }
        if (!StringUtils.isEmpty(dto.getCreateDateStart())) {
            conditions.add("r.createDate >= :createDateStart");
            map.put("createDateStart", DateUtils.removeTime(dto.getCreateDateStart()));
        }
        if (!StringUtils.isEmpty(dto.getCreateDateEnd())) {
            conditions.add("r.createDate <= :createDateEnd");
            map.put("createDateEnd", DateUtils.setDayFinalTime(dto.getCreateDateEnd()));
        }
        if (!StringUtils.isEmpty(dto.getUpdateDateStart())) {
            conditions.add("r.updateDate >= :updateDateStart");
            map.put("updateDateStart", DateUtils.removeTime(dto.getUpdateDateStart()));
        }
        if (!StringUtils.isEmpty(dto.getUpdateDateEnd())) {
            conditions.add("r.updateDate <= :updateDateEnd");
            map.put("updateDateEnd", DateUtils.setDayFinalTime(dto.getUpdateDateEnd()));
        }
        if (!StringUtils.isEmpty(dto.getName())) {
            conditions.add("r.name like :name");
            map.put("name", dto.getName() + "%");
        }
        jpql = SQLUtils.createSQL(jpql, conditions);
        jpql += " order by r.createDate desc";
        return getBaseRepository().findAllByJPQL(jpql, map);
    }

    @Override
    public List<Resource> list3(ResourceDto dto) {
        String sql = "select * from resource ";
        List<String> conditions = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        if (!StringUtils.isEmpty(dto.getId())) {
            conditions.add("id in (:id)");
            map.put("id", dto.getId().split(","));
        }

        if (!StringUtils.isEmpty(dto.getCreateDateStart())) {
            conditions.add("createDate >= :createDateStart");
            map.put("createDateStart", DateUtils.removeTime(dto.getCreateDateStart()));
        }
        if (!StringUtils.isEmpty(dto.getCreateDateEnd())) {
            conditions.add("createDate <= :createDateEnd");
            map.put("createDateEnd", DateUtils.setDayFinalTime(dto.getCreateDateEnd()));
        }

        if (!StringUtils.isEmpty(dto.getUpdateDateStart())) {
            conditions.add("updateDate >= :updateDateStart");
            map.put("updateDateStart", DateUtils.removeTime(dto.getUpdateDateStart()));
        }
        if (!StringUtils.isEmpty(dto.getUpdateDateEnd())) {
            conditions.add("updateDate >= :updateDateEnd");
            map.put("updateDateEnd", DateUtils.setDayFinalTime(dto.getUpdateDateEnd()));
        }
        if (!StringUtils.isEmpty(dto.getName())) {
            conditions.add("name like :name");
            map.put("name", dto.getName() + "%");
        }
        sql = SQLUtils.createSQL(sql, conditions);
        sql += " order by createDate desc";
        return getBaseRepository().findAllBySQL(sql, map);
    }
}
