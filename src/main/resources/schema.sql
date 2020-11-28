 CREATE SCHEMA IF NOT EXISTS DBKINGDOM;
 
     
    CREATE TABLE IF NOT EXISTS dbkingdom.t_animal (
       id_animal bigint generated by default as identity,
        birth_date timestamp,
        breeding boolean,
        city varchar(255),
        description varchar(255),
        dog_house boolean,
        id_owner_pet bigint,
        pedigree boolean,
        pedigree_details varchar(255),
        price decimal(19,2),
        private_owner boolean,
        province varchar(255),
        race varchar(255),
        region varchar(255),
        primary key (id_animal)
    );
 
    
   CREATE TABLE IF NOT EXISTS dbkingdom.t_announcement (
       id_announcement bigint generated by default as identity,
        announce_date timestamp,
        available_date timestamp,
        description varchar(255),
        id_animal bigint,
        id_announcement_type bigint,
        primary key (id_announcement)
    );
 
    
   CREATE TABLE IF NOT EXISTS dbkingdom.t_announcement_type (
       id_announcement_type bigint generated by default as identity,
        description_type varchar(255),
        primary key (id_announcement_type)
    );
 
    
   CREATE TABLE IF NOT EXISTS dbkingdom.t_attr_animal (
       id_animal_attributes bigint generated by default as identity,
        description varchar(255),
        id_animal bigint,
        name varchar(255),
        primary key (id_animal_attributes)
    );
 
    
   CREATE TABLE IF NOT EXISTS dbkingdom.t_owner_pet (
       id_owner_pet bigint generated by default as identity,
        email varchar(255),
        full_name varchar(255),
        phone varchar(255),
        primary key (id_owner_pet)
    );
 
    
    ALTER TABLE  dbkingdom.t_animal  DROP CONSTRAINT IF EXISTS t_animal_id_owner_pet;
    
    alter table dbkingdom.t_animal 
       add constraint  t_animal_id_owner_pet 
       foreign key (id_owner_pet) 
       references dbkingdom.t_owner_pet;
 
 
    
    ALTER TABLE  dbkingdom.t_announcement  DROP CONSTRAINT IF EXISTS t_announcement_id_announcement_type;
    
    alter table dbkingdom.t_announcement 
       add constraint    t_announcement_id_announcement_type
       foreign key (id_announcement_type) 
       references dbkingdom.t_announcement_type;
       
       
 
	ALTER TABLE  dbkingdom.t_attr_animal  DROP CONSTRAINT IF EXISTS t_attr_animal_id_animal;
    
    alter table dbkingdom.t_attr_animal 
       add constraint   t_attr_animal_id_animal
       foreign key (id_animal) 
       references dbkingdom.t_animal;