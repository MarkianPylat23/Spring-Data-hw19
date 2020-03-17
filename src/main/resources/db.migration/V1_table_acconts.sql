CREATE TABLE accounts
(
   id integer not null constraint accounts_pkey primary key,
   first_name varchar(255),
   last_name  varchar(255),
   city       varchar(255),
   gender     varchar(255),
   username   varchar(255),
   profile_id integer not null
);