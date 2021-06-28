Título: API do Aplicativo HelpDesk

Nomes: Christian, Diogo Costa e Giovani

Christian(TADS 2017), Giovani e Diogo(TADS 2018)

Back-End do Aplicativo HelpDesk utilizando Java com Spring Boot, o SGBD escolhido foi o MySQL. O Aplicativo consome e envia dados para a API, fazendo com que os dados fiquem centralizados.

Tecnologias necessárias pra rodar:

- XAMMP ou WAMMP
- Java 8
- IDE que execute projetos Java para executar o código(Visual Studio Code, Eclipse, idea, etc..)

application.properties

Neste arquivo há a maior parte da configuração do banco de dados, como login e senha do mysql e o nome do banco de dados(Colocar o login/senha de seu mysql e criar um banco de dados com nome "help".
Mudar a linha spring.jpa.hibernate.ddl-auto=update por spring.jpa.hibernate.ddl-auto=create para criar tabelas. Após criar, troque de novo para update.
Está rodando na porta 8080 como default.

PessoaController.java

No método enviarFoto arrume a linha Path path = Paths.get("C:\\Users\\Samsung\\APIHelpdesk\\src\\main\\resources\\templates\\" + url); pelo caminho da pasta templates em seu computador. NÃO se esqueça das \\ caso esteja no Windows.
Ex: Path path = Paths.get("C:\\teu\\caminho\\até\\a\\pasta\\dos\\templates\\" + url);
É aí onde ficarão as fotos

Banco de Dados

Após criar o banco, insira os seguintes dados:

INSERT INTO tipopessoa(nome_tipo_pessoa) VALUES('Cliente');
INSERT INTO tipopessoa(nome_tipo_pessoa) VALUES('Técnico');
INSERT INTO situacao(nome_situacao) VALUES ('Criado');
INSERT INTO situacao(nome_situacao) VALUES ('Em andamento');
INSERT INTO situacao(nome_situacao) VALUES ('Resolvido');
INSERT INTO local(local) VALUES ('Sala 1');
INSERT INTO local(local) VALUES ('Sala 2');
INSERT INTO local(local) VALUES ('Sala 3');

O nome dos locais pode ser qualquer um.
