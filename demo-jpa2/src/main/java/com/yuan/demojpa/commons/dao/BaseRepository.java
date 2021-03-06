package com.yuan.demojpa.commons.dao;

import com.yuan.demojpa.commons.dto.Query;
import org.jooq.DSLContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {

    DSLContext getDslContext();

    EntityManager getEntityManager();

    void insert(T t);

    void update(T t);

    @SuppressWarnings({"unchecked"})
    void delete(ID... ids);

    Optional<T> findOneByJPQL(String jpql, Object... objects);

    Optional<T> findOneByJPQL(String jpql, Collection collection);

    Optional<T> findOneByJPQL(String jpql, Map<String, Object> map);

    Optional<T> findOneByJPQLQuery(Query query);

    List<T> findAllByJPQL(String jpql, Object... objects);

    List<T> findAllByJPQL(String jpql, Collection collection);

    List<T> findAllByJPQL(String jpql, Map<String, Object> map);

    List<T> findAllByJPQLQuery(Query query);

    @SuppressWarnings("Duplicates")
    Page<T> findAllByJPQL(String jpql, Pageable pageable, Object... objects);

    Page<T> findAllByJPQL(String jpql, Pageable pageable, Collection collection);

    Page<T> findAllByJPQL(String jpql, Pageable pageable, Map<String, Object> map);

    Page<T> findAllByJPQLQuery(Query query, Pageable pageable);

    Optional<T> findOneBySQL(String sql, Object... objects);

    Optional<T> findOneBySQL(String sql, Collection collection);

    Optional<T> findOneBySQL(String sql, Map<String, Object> map);

    Optional<T> findOneByQuery(org.jooq.Query query);

    Optional<T> findOneBySQLQuery(Query query);

    List<T> findAllBySQL(String sql, Object... objects);

    List<T> findAllBySQL(String sql, Collection collection);

    List<T> findAllBySQL(String sql, Map<String, Object> map);

    List<T> findAllByQuery(org.jooq.Query query);

    List<T> findAllBySQLQuery(Query query);

    Page<T> findAllBySQL(String sql, Pageable pageable, Object... objects);

    Page<T> findAllBySQL(String sql, Pageable pageable, Collection collection);

    Page<T> findAllBySQL(String sql, Pageable pageable, Map<String, Object> map);

    Page<T> findAllByQuery(org.jooq.Query query, Pageable pageable);

    Page<T> findAllBySQLQuery(Query query, Pageable pageable);

    <R> Optional<R> findOneBySQL(String sql, Class<R> requireType, Object... objects);

    <R> Optional<R> findOneBySQL(String sql, Class<R> requireType, Collection collection);

    <R> Optional<R> findOneBySQL(String sql, Class<R> requireType, Map<String, Object> map);

    <R> Optional<R> findOneByQuery(org.jooq.Query query, Class<R> requireType);

    <R> Optional<R> findOneBySQLQuery(Query query, Class<R> requireType);

    <R> List<R> findAllBySQL(String sql, Class<R> requireType, Object... objects);

    <R> List<R> findAllBySQL(String sql, Class<R> requireType, Collection collection);

    <R> List<R> findAllBySQL(String sql, Class<R> requireType, Map<String, Object> map);

    <R> List<R> findAllByQuery(org.jooq.Query query, Class<R> requireType);

    <R> List<R> findAllBySQLQuery(Query query, Class<R> requireType);

    <R> Page<R> findAllBySQL(String sql, Pageable pageable, Class<R> requireType, Object... objects);

    <R> Page<R> findAllBySQL(String sql, Pageable pageable, Class<R> requireType, Collection collection);

    <R> Page<R> findAllBySQL(String sql, Pageable pageable, Class<R> requireType, Map<String, Object> map);

    <R> Page<R> findAllByQuery(org.jooq.Query query, Pageable pageable, Class<R> requireType);

    <R> Page<R> findAllBySQLQuery(Query query, Pageable pageable, Class<R> requireType);

    <R> Optional<R> findOneByJPQL(String jpql, Class<R> requireType, Object... objects);

    <R> Optional<R> findOneByJPQL(String jpql, Class<R> requireType, Collection collection);

    <R> Optional<R> findOneByJPQL(String jpql, Class<R> requireType, Map<String, Object> map);

    <R> Optional<R> findOneByJPQLQuery(Query query, Class<R> requireType);

    <R> List<R> findAllByJPQL(String jpql, Class<R> requireType, Object... objects);

    <R> List<R> findAllByJPQL(String jpql, Class<R> requireType, Collection collection);

    <R> List<R> findAllByJPQL(String jpql, Class<R> requireType, Map<String, Object> map);

    <R> List<R> findAllByJPQLQuery(Query query, Class<R> requireType);

    <R> Page<R> findAllByJPQL(String jpql, Pageable pageable, Class<R> requireType, Object... objects);

    <R> Page<R> findAllByJPQL(String jpql, Pageable pageable, Class<R> requireType, Collection collection);

    <R> Page<R> findAllByJPQL(String jpql, Pageable pageable, Class<R> requireType, Map<String, Object> map);

    <R> Page<R> findAllByJPQLQuery(Query query, Pageable pageable, Class<R> requireType);

    Optional<Map> findOneBySQLInMap(String sql, Object... objects);

    Optional<Map> findOneBySQLInMap(String sql, Collection collection);

    Optional<Map> findOneBySQLInMap(String sql, Map<String, Object> map);

    Optional<Map> findOneByQueryInMap(org.jooq.Query query);

    Optional<Map> findOneBySQLQueryInMap(Query query);

    List<Map> findAllBySQLInMap(String sql, Object... objects);

    List<Map> findAllBySQLInMap(String sql, Collection collection);

    List<Map> findAllBySQLInMap(String sql, Map<String, Object> map);

    List<Map> findAllByQueryInMap(org.jooq.Query query);

    List<Map> findAllBySQLQueryInMap(Query query);

    Page<Map> findAllBySQLInMap(String sql, Pageable pageable, Object... objects);

    Page<Map> findAllBySQLInMap(String sql, Pageable pageable, Collection collection);

    Page<Map> findAllBySQLInMap(String sql, Pageable pageable, Map<String, Object> map);

    Page<Map> findAllByQueryInMap(org.jooq.Query query, Pageable pageable);

    Page<Map> findAllBySQLQueryInMap(Query query, Pageable pageable);

    Optional<Map> findOneByJPQLInMap(String jpql, Object... objects);

    Optional<Map> findOneByJPQLInMap(String jpql, Collection collection);

    Optional<Map> findOneByJPQLInMap(String jpql, Map<String, Object> map);

    Optional<Map> findOneByJPQLQueryInMap(Query query);

    List<Map> findAllByJPQLInMap(String jpql, Object... objects);

    List<Map> findAllByJPQLInMap(String jpql, Collection collection);

    List<Map> findAllByJPQLInMap(String jpql, Map<String, Object> map);

    List<Map> findAllByJPQLQueryInMap(Query query);

    Page<Map> findAllByJPQLInMap(String jpql, Pageable pageable, Object... objects);

    Page<Map> findAllByJPQLInMap(String jpql, Pageable pageable, Collection collection);

    Page<Map> findAllByJPQLInMap(String jpql, Pageable pageable, Map<String, Object> map);

    Page<Map> findAllByJPQLQueryInMap(Query query, Pageable pageable);
}
