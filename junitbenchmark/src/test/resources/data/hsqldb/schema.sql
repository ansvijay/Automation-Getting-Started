drop table Bug if exists;

create table Bug (
	id BIGINT GENERATED by default as IDENTITY(START with 1, INCREMENT by 1) not null, 
	
	title VARCHAR(100) ,
	summary VARCHAR(100) ,
	Description VARCHAR(100) ,
	AttachmentPath VARCHAR(500) ,
	exceptions VARCHAR(100) ,
	logs VARCHAR(100) ,
	foundDateTime VARCHAR(100) ,
	foundTags VARCHAR(100) ,
	
	primary key(id)
);