use
    javawebdemo;

-- 用户表

drop table if exists user;
create table user
(
    id          int unsigned primary key auto_increment comment 'ID',
    username    varchar(20)      not null unique comment '用户名',
    password    varchar(32) default '123456' comment '密码',
    name        varchar(10)      not null comment '姓名',
    gender      tinyint unsigned not null comment '性别, 说明: 1 男, 2 女',
    image       varchar(300) comment '图像',
    job         tinyint unsigned comment '工作岗位',
    create_time datetime         not null comment '创建时间',
    update_time datetime         not null comment '修改时间'
) comment '用户表';

-- 用户表插入数据5条
insert into user(username, name, gender, create_time, update_time)
values ('admin', '管理员', 1, now(), now()),
       ('user1', '用户1', 1, now(), now()),
       ('user2', '用户2', 2, now(), now()),
       ('user3', '用户3', 1, now(), now()),
       ('user4', '用户4', 2, now(), now());


-- 笔记表

drop table if exists demo;
create table demo
(
    id          int unsigned primary key auto_increment comment 'ID',
    name        varchar(20)      not null comment '名称',
    description varchar(200) comment '描述',
    category    tinyint unsigned not null comment '分类, 说明: 1 笔记, 2 日记, 3 随笔',
    content     text comment '内容',
    image       varchar(300) comment '图像',
    create_time datetime         not null comment '创建时间',
    update_time datetime         not null comment '修改时间'
) comment '笔记表';

-- 笔记表插入数据5条
insert into demo(name, description, category, content, image, create_time, update_time)
values ('笔记1', '描述1', 1, '内容1', 'https://picsum.photos/200/300', now(), now()),
       ('笔记2', '描述2', 2, '内容2', 'https://picsum.photos/200/300', now(), now()),
       ('笔记3', '描述3', 3, '内容3', 'https://picsum.photos/200/300', now(), now()),
       ('笔记4', '描述4', 1, '内容4', 'https://picsum.photos/200/300', now(), now()),
       ('笔记5', '描述5', 2, '内容5', 'https://picsum.photos/200/300', now(), now());