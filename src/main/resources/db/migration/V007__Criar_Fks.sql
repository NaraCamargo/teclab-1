Alter Table Agendamento add CONSTRAINT FK_Cadastro_Agendamento foreign key(idusuario) references Cadastro(idusuario);
Alter Table Agendamento add CONSTRAINT FK_Laboratorios_Agendamento foreign key(idlaboratorio) references laboratorios(idlaboratorio);
Alter Table Agendamento add CONSTRAINT FK_Horarios_Agendamento foreign key(idhorario) references horarios(idhorario);

Insert into cadastro(nomeusuario, email, senha, idpermissoes) values ('Rogério Furlan', 'rogerio.furlan@etec.sp.gov.br', 'senha', 1);
Insert into permissoes(permissoes) values ('professor');
Insert into permissoes(permissoes) values ('coordenador');
Insert into laboratorios(nome_lab) values ('lab 1');
Insert into laboratorios(nome_lab) values ('lab 2');
Insert into laboratorios(nome_lab) values ('lab 3');
Insert into laboratorios(nome_lab) values ('lab 4');
Insert into laboratorios(nome_lab) values ('lab 5');
Insert into horarios(horario) values ('07:20:00');
Insert into horarios(horario) values ('08:10:00');
Insert into horarios(horario) values ('09:00:00');
Insert into horarios(horario) values ('09:50:00');
Insert into horarios(horario) values ('10:05:00');
Insert into horarios(horario) values ('10:55:00');
Insert into horarios(horario) values ('11:45:00');
Insert into horarios(horario) values ('12:35:00');
Insert into horarios(horario) values ('13:30:00');
Insert into horarios(horario) values ('14:20:00');
Insert into horarios(horario) values ('15:10:00');
Insert into Agendamento(idusuario, idlaboratorio, idhorario, data) values (1,3,1,'2023-06-27');
