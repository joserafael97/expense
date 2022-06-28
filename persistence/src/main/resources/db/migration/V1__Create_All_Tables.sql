create table expense (
  id varchar(255) not null,
  name varchar(255),
  description varchar(255),
  amount decimal(16,6),
  date DATE NOT NULL DEFAULT CURRENT_DATE,
  PRIMARY KEY(id)
)
