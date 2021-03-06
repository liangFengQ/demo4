create database if not exists demo4 charset utf8;
use demo4;
start transaction;
create table sys_user
(
  id         varchar(255) primary key,
  createDate date,
  updateDate date,
  createUser varchar(255),
  updateUser varchar(255),
  username   varchar(255),
  name       varchar(255),
  password   varchar(255),
  is_del     int
) comment '系统用户';
create table sys_role
(
  id         varchar(255) primary key,
  createDate date,
  updateDate date,
  createUser varchar(255),
  updateUser varchar(255),
  name       varchar(255)

) comment '系统角色';
create table sys_authority
(
  id         varchar(255) primary key,
  createDate date,
  updateDate date,
  createUser varchar(255),
  updateUser varchar(255),
  name       varchar(255)
) comment '系统权限';
create table sys_resource
(
  id         varchar(255) primary key,
  createDate date,
  updateDate date,
  createUser varchar(255),
  updateUser varchar(255),
  name       varchar(255),
  url        varchar(1000),
  icon       varchar(255),
  parent     varchar(255),
  level      varchar(255)
) comment '系统资源';
create table sys_user_role
(
  id         varchar(255) primary key,
  createDate date,
  updateDate date,
  createUser varchar(255),
  updateUser varchar(255),
  userId     varchar(255),
  roleId     varchar(255)
) comment '系统用户角色关联表';
create table sys_role_authorize
(
  id          varchar(255) primary key,
  createDate  date,
  updateDate  date,
  createUser  varchar(255),
  updateUser  varchar(255),
  authorizeId varchar(255),
  roleId      varchar(255)
) comment '系统角色权限关联表';
create table sys_authorize_resource
(
  id          varchar(255) primary key,
  createDate  date,
  updateDate  date,
  createUser  varchar(255),
  updateUser  varchar(255),
  authorizeId varchar(255),
  resourceId  varchar(255)
) comment '系统权限资源关联表';
create table sys_log
(
  id         varchar(255) primary key,
  createDate date,
  updateDate date,
  createUser varchar(255),
  updateUser varchar(255),
  content    varchar(255)
) comment '系统日志';
commit;