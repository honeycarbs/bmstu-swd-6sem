# can-bun
## Краткое описание идеи проекта
can-bun - движок персональной канбан доски для остлеживания занятости. Преимущество канбан доски перед другими обычным списком дел - визуализация, возможность увидеть итоговый результат (сколько сделано за день), провести анализ.  
Пользователь может создавать доски и задачи, добавлять людей в совместные проекты и отслеживать прогресс задач. 

## Краткое описание предметной области
Предметная область включает в себя:  
* Пользователей — людей, которые используют приложение для отслеживания личных задач;
* Команд — групп людей, объединенных общей целью или областью ответственности;
* Задачи — определенные задачи, сообщаемые и назначенные пользователем определенным пользователем.

## Краткий анализ аналогичных решений
| Критерий\проект | can-bun | Jira | Trello | Redmine | Backlog |
| ---------------- | --------- | ---- | ------ | ------- | ------- |
| Открытый исходный код | Да | Нет | Trello | Да | Нет |
| Интегрируемый клиент | Да | Нет | Нет | Частично | Нет |
| Легковесный | Да | Нет | Да | Частично | Да | 

## Краткое обоснование целесообразности и актуальности проекта 
can-bun "отбрасывает лишнее" из процессов управления задачами, делая его одновременно пригодным для использования как в малых командах разработки, так и в личных и проектных целях.

**Диаграмма вариантов использования** 
![use-case diagram](./meta/diagrams/static/uc.drawio.png)  
**ER-диаграмма** 
![entity-relation diagram](./meta/diagrams/static/er.drawio.png)

## Архитектурные характеристики, важные для проекта
1. Ядро:
    1. **Java** 11 или выше
    2. **Spring Boot** _(Web, Security)_, 2.6.6
    3. **Hibernate & JPA** _(w/ Spring Data)_
    5. Прочее: 
        1. Mapstruct
        2. MySQL-коннектор & Postgres-коннектор или любой другой коннектор
        3. Lombok
        4. JUnit (Jupiter)
        5. Logback
2. Сборщик
    1. **Gradle**
3. Базы данных
    1. **MySQL**
    2. **PostgreSQL**
    3. **Oracle**  
    итд.
4. API
    1. **Postman collection** для тестирования API

### Описание типа приложения и выбранного технологического стека
Проект представляет собой SPA (одностраничное приложение), выполненное как WebApp.
Выделяется 3 независимых слоя и 4 независимых компонента:
* Компонент авторизации - отвечает за обработку запросов. связанных с авторизацией
* Слой(компонент) работы со входящими запросами (реализация UI);
* Сервисный слой(компонент), реализующий бизнес-логику;
* Репозиторий для работы с базой данных. 

## UML компонент доступа к данным и бизнес-логики
![Service-Repository layers](./meta/diagrams/static/Service-Repository.png)


## Транспортные сущности и модельные классы
![RDBMS Entities and DTOs](./meta/diagrams/static/Entity-Dto.png)

