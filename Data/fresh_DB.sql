create table phones (
        id binary(36) not null,
        created timestamp not null,
        deleted boolean,
        modified timestamp,
        city_code varchar(255),
        contry_code varchar(255),
        number varchar(255),
        user_id binary(36) not null,
        primary key (id)
    )

create table users (
        id binary(36) not null,
        created timestamp not null,
        deleted boolean,
        modified timestamp,
        email varchar(255) not null,
        is_active boolean,
        last_login timestamp not null,
        name varchar(255) not null,
        password varchar(255) not null,
        token varchar(255),
        primary key (id)
    )

create table users_phones (
        user_id binary(36) not null,
        phones_id binary(36) not null
    )

alter table users 
    drop constraint UK_6dotkott2kjsp8vw4d0m25fb7

alter table users 
    add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email)

alter table users_phones 
    drop constraint UK_8em9x6dvssprisqghwwe0dgee

alter table users_phones 
    add constraint UK_8em9x6dvssprisqghwwe0dgee unique (phones_id)

alter table phones 
    add constraint FKmg6d77tgqfen7n1g763nvsqe3 
    foreign key (user_id) 
    references users

alter table users_phones 
    add constraint FK2h8lrw8nchqt19wj7lqgdjfpo 
    foreign key (phones_id) 
    references phones

alter table users_phones 
    add constraint FK36dpkfhw8ehrymjanebpnkgml 
    foreign key (user_id) 
    references users