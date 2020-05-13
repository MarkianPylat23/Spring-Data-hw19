CREATE TABLE profiles
(
    id integer NOT NULL,
    company varchar(255) COLLATE pg_catalog."default",
    department varchar(255) COLLATE pg_catalog."default",
    job_title varchar(255) COLLATE pg_catalog."default",
    skill varchar(255) COLLATE pg_catalog."default",
    username varchar(255) COLLATE pg_catalog."default",
    CONSTRAINT profiles_pkey1 PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.profiles
    OWNER to postgres;