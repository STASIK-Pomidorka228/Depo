create table mALDIVI(
 id BIGSERIAL primary key
);

create table user_personal_data(
	user_id BIGINT primary key,
	first_name VARCHAR(100) not null,
	last_NAME VARCHAR (100) not null,
	BIRTH_DATE DATE,

	constraint fk_personal_user
	foreign key (user_id)
	references users(id)
	on delete cascade

);

create table ROLES(
	ID SMALLSERIAL primary key,
	NAME VARCHAR (50) UNIQUE not NULL
);

create table USER_ROLES(
	USER_ID BIGINT not null
	ROLE_ID smallint not null
	primary key (user_id, role_id),
	foreign key (user_id) references user(id) on delete cascade,
	foreign key (role_id) references roles(id) on delete cascade

)