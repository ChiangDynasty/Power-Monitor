package com.lanternsoftware.util.dao;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public interface IDaoProxy {
    void shutdown();
    DaoProxyType getType();
    <T> List<T> queryAll(Class<T> _class);
    <T> T queryOne(Class<T> _class, DaoQuery _query);
    <T> T queryOne(Class<T> _class, DaoQuery _query, DaoSort _sort);
    <T> T queryOne(Class<T> _class, DaoQuery _query, Collection<String> _fields);
    <T> T queryOne(Class<T> _class, DaoQuery _query, Collection<String> _fields, DaoSort _sort);
    <T> Future<T> queryOneAsync(Class<T> _class, DaoQuery _query);
    <T> Future<T> queryOneAsync(Class<T> _class, DaoQuery _query, DaoSort _sort);
    <T> Future<T> queryOneAsync(Class<T> _class, DaoQuery _query, Collection<String> _fields);
    <T> Future<T> queryOneAsync(Class<T> _class, DaoQuery _query, Collection<String> _fields, DaoSort _sort);
    <T> List<T> query(Class<T> _class, DaoQuery _query);
    <T> List<T> query(Class<T> _class, DaoQuery _query, DaoSort _sort);
    <T> List<T> query(Class<T> _class, DaoQuery _query, Collection<String> _fields);
    <T> List<T> query(Class<T> _class, DaoQuery _query, Collection<String> _fields, DaoSort _sort);
    <T> Future<List<T>> queryAsync(Class<T> _class, DaoQuery _query);
    <T> Future<List<T>> queryAsync(Class<T> _class, DaoQuery _query, DaoSort _sort);
    <T> Future<List<T>> queryAsync(Class<T> _class, DaoQuery _query, Collection<String> _fields);
    <T> Future<List<T>> queryAsync(Class<T> _class, DaoQuery _query, Collection<String> _fields, DaoSort _sort);
    <T, V> Future<List<V>> queryWithFinalizer(Class<T> _class, DaoQuery _query, Collection<String> _fields, DaoSort _sort, QueryFinalizer<T, V> _finalizer);
    <T> List<T> query(Class<T> _class, DaoQuery _query, Collection<String> _fields, DaoSort _sort, int _offset, int _count);
    <T> DaoPage<T> queryPage(Class<T> _class, DaoQuery _query, Collection<String> _fields, DaoSort _sort, int _offset, int _count);
    <T> List<T> queryImportant(Class<T> _class, DaoQuery _query);
    <T> List<T> queryImportant(Class<T> _class, DaoQuery _query, DaoSort _sort);
    <T> Future<List<T>> queryImportantAsync(Class<T> _class, DaoQuery _query);
    <T> Future<List<T>> queryImportantAsync(Class<T> _class, DaoQuery _query, DaoSort _sort);
    <T> List<T> queryImportant(Class<T> _class, DaoQuery _query, DaoSort _sort, int _offset, int _count);
    <T> DaoPage<T> queryImportantPage(Class<T> _class, DaoQuery _query, DaoSort _sort, int _offset, int _count);
    <T> DaoEntity queryForEntity(Class<T> _class, DaoQuery _query);
    <T> DaoEntity queryForEntity(Class<T> _class, DaoQuery _query, DaoSort _sort);
    <T> DaoEntity queryForEntity(Class<T> _class, DaoQuery _query, Collection<String> _fields);
    <T> DaoEntity queryForEntity(Class<T> _class, DaoQuery _query, Collection<String> _fields, DaoSort _sort);
    DaoEntity queryForEntity(String _tableName, DaoQuery _query);
    DaoEntity queryForEntity(String _tableName, DaoQuery _query, DaoSort _sort);
    DaoEntity queryForEntity(String _tableName, DaoQuery _query, Collection<String> _fields);
    DaoEntity queryForEntity(String _tableName, DaoQuery _query, Collection<String> _fields, DaoSort _sort);
    DaoPage<DaoEntity> queryForEntitiesPage(String _tableName, DaoQuery _query, Collection<String> _fields, DaoSort _sort, int _offset, int _count);
    List<DaoEntity> queryForEntities(String _tableName, DaoQuery _query);
    List<DaoEntity> queryForEntities(String _tableName, DaoQuery _query, DaoSort _sort);
    List<DaoEntity> queryForEntities(String _tableName, DaoQuery _query, Collection<String> _fields);
    List<DaoEntity> queryForEntities(String _tableName, DaoQuery _query, Collection<String> _fields, DaoSort _sort);
    List<DaoEntity> queryForEntities(String _tableName, DaoQuery _query, Collection<String> _fields, DaoSort _sort, int _offset, int _count);
    String queryForOneField(Class<?> _class, DaoQuery _query, String _field);
    List<String> queryForField(Class<?> _class, DaoQuery _query, String _field);
    List<String> queryForField(Class<?> _class, DaoQuery _query, String _field, DaoSort _sort);
    List<String> queryForField(String _tableName, DaoQuery _query, String _field);
    String save(Object _object);
    <T> Map<String, T> save(Collection<T> _objects);
    Map<String, DaoEntity> save(Class<?> _class, Collection<DaoEntity> _entities);
    void update(Class<?> _class, DaoQuery _query, DaoEntity _changes);
    <T> T updateOne(Class<T> _class, DaoQuery _query, DaoEntity _changes);
    String saveEntity(Class<?> _class, DaoEntity _entity);
    String saveEntity(String _collection, DaoEntity _entity);
    boolean delete(Class<?> _class, DaoQuery _query);
    boolean delete(String _tableName, DaoQuery _query);
    int count(Class<?> _class, DaoQuery _query);
    int count(String _tableName, DaoQuery _query);
    boolean exists(Class<?> _class, DaoQuery _query);
    boolean exists(String _tableName, DaoQuery _query);
    void setExecutor(ExecutorService _executor);
}
