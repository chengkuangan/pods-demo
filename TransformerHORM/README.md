# Transformer Using Panache Hibernate ORM

This is sample using Panache Hibernate ORM, performance is not as good as `camel-sql`. Suspect this could be due to Panache Hibernate ORM is using entity objects, I observed many updates operations on foreign tables even the actual are just all insert statements.