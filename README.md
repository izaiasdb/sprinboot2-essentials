Spring Boot Essentials 2
https://www.youtube.com/playlist?list=PL62G310vn6nFBIxp6ZwGnm8xMcGE3VA5H
Aula 22

Git
https://github.com/devdojobr/springboot2-essentials/branches/all?page=2

###################################################################################
BANCO  mysql
user: root
password: root

INSERT INTO anime.dev_dojo_user
(id, authorities, name, password, username)
VALUES(1, 'ROLE_ADMIN, ROLE_USER', 'izaias barreto 1', '{bcrypt}$2a$10$Hpu7jmM4RYS.M0AvWvvjFuu5bxow2FAV.pk6Xvsf25sUkxNB8SHru', 'izaias.barreto');
INSERT INTO anime.dev_dojo_user
(id, authorities, name, password, username)
VALUES(2, 'ROLE_ADMIN, ROLE_USER	izaias.barreto	{bcrypt}$2a$10$Hpu7jmM4RYS.M0AvWvvjFuu5bxow2FAV.pk6Xvsf25sUkxNB8SHru	izaias.barreto', 'izaias barreto 2', '{bcrypt}$2a$10$Hpu7jmM4RYS.M0AvWvvjFuu5bxow2FAV.pk6Xvsf25sUkxNB8SHru', 'izaiasdb');

################################################################################### DOCKER
cd /d/projetos/java/cursos/devdojo/sprinboot2-essentials
docker-compose up

################################################################################### MAPPER
erro: Cannot find implementation for academy.devdojo.springboot2.mapper.AnimeMapper
Deletar a pasta target
Dar um clean e um install pelo maven
Daí ele vai gerar os builders do mapper.

################################################################################### TERMINAL
mvn test
mvn test -Pintegration-tests

################################################################################### SECURITY
Basic Auth -> SecurityConfig
mostra a página de login do security, form login
localhost:8080/login
localhost:8080/logout


