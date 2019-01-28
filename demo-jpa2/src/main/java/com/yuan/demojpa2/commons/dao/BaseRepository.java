package com.yuan.demojpa2.commons.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {
    void insert(T t);

    void update(T t);

    @SuppressWarnings("unused")
    void delete(ID... ids);

    Optional<T> getOneByJPQL(String jpql, Object... objects);

    Optional<T> getOneByJPQL(String jpql, Collection collection);

    Optional<T> getOneByJPQL(String jpql, Map<String, Object> map);

    List<T> findAllByJPQL(String jpql, Object... objects);

    List<T> findAllByJPQL(String jpql, Collection collection);

    List<T> findAllByJPQL(String jpql, Map<String, Object> map);

    @SuppressWarnings("Duplicates")
    Page<T> findAllByJPQL(String jpql, Pageable pageable, Object... objects);

    Page<T> findAllByJPQL(String jpql, Pageable pageable, Collection collection);

    Page<T> findAllByJPQL(String jpql, Pageable pageable, Map<String, Object> map);

    Optional<T> getOneBySQL(String sql, Object... objects);

    Optional<T> getOneBySQL(String sql, Collection collection);

    Optional<T> getOneBySQL(String sql, Map<String, Object> map);


    List<T> findAllBySQL(String sql, Object... objects);

    List<T> findAllBySQL(String sql, Collection collection);

    List<T> findAllBySQL(String sql, Map<String, Object> map);


    Page<T> findAllBySQL(String sql, Pageable pageable, Object... objects);

    Page<T> findAllBySQL(String sql, Pageable pageable, Collection collection);

    Page<T> findAllBySQL(String sql, Pageable pageable, Map<String, Object> map);


    <R> Optional<R> getOneBySQL(String sql, Class<R> requireType, Object... objects);

    <R> Optional<R> getOneBySQL(String sql, Class<R> requireType, Collection collection);

    <R> Optional<R> getOneBySQL(String sql, Class<R> requireType, Map<String, Object> map);

    <R> List<R> findAllBySQL(String sql, Class<R> requireType, Object... objects);

    <R> List<R> findAllBySQL(String sql, Class<R> requireType, Collection collection);

    <R> List<R> findAllBySQL(String sql, Class<R> requireType, Map<String, Object> map);

    <R> Page<R> findAllBySQL(String sql, Pageable pageable, Class<R> requireType, Object... objects);

    <R> Page<R> findAllBySQL(String sql, Pageable pageable, Class<R> requireType, Collection collection);

    <R> Page<R> findAllBySQL(String sql, Pageable pageable, Class<R> requireType, Map<String, Object> map);

    <R> Optional<R> getOneByJPQL(String jpql, Class<R> requireType, Object... objects);

    <R> Optional<R> getOneByJPQL(String jpql, Class<R> requireType, Collection collection);

    <R> Optional<R> getOneByJPQL(String jpql, Class<R> requireType, Map<String, Object> map);

    <R> List<R> findAllByJPQL(String jpql, Class<R> requireType, Object... objects);

    <R> List<R> findAllByJPQL(String jpql, Class<R> requireType, Collection collection);

    <R> List<R> findAllByJPQL(String jpql, Class<R> requireType, Map<String, Object> map);

    <R> Page<R> findAllByJPQL(String jpql, Pageable pageable, Class<R> requireType, Object... objects);

    <R> Page<R> findAllByJPQL(String jpql, Pageable pageable, Class<R> requireType, Collection collection);

    <R> Page<R> findAllByJPQL(String jpql, Pageable pageable, Class<R> requireType, Map<String, Object> map);

    Optional<Map> getOneBySQLInMap(String sql, Object... objects);

    Optional<Map> getOneBySQLInMap(String sql, Collection collection);

    Optional<Map> getOneBySQLInMap(String sql, Map<String, Object> map);

    List<Map> findAllBySQLInMap(String sql, Object... objects);

    List<Map> findAllBySQLInMap(String sql, Collection collection);

    List<Map> findAllBySQLInMap(String sql, Map<String, Object> map);

    Page<Map> findAllBySQLInMap(String sql, Pageable pageable, Object... objects);

    Page<Map> findAllBySQLInMap(String sql, Pageable pageable, Collection collection);

    Page<Map> findAllBySQLInMap(String sql, Pageable pageable, Map<String, Object> map);

    Optional<Map> getOneByJPQLInMap(String jpql, Object... objects);

    Optional<Map> getOneByJPQLInMap(String jpql, Collection collection);

    Optional<Map> getOneByJPQLInMap(String jpql, Map<String, Object> map);

    List<Map> findAllByJPQLInMap(String jpql, Object... objects);

    List<Map> findAllByJPQLInMap(String jpql, Collection collection);

    List<Map> findAllByJPQLInMap(String jpql, Map<String, Object> map);

    Page<Map> findAllByJPQLInMap(String jpql, Pageable pageable, Object... objects);

    Page<Map> findAllByJPQLInMap(String jpql, Pageable pageable, Collection collection);

    Page<Map> findAllByJPQLInMap(String jpql, Pageable pageable, Map<String, Object> map);
}