<h1 >Проект по автоматизации тестирования сайта <a href="https://qa.guru ">QA.GURU</a></h1>

## Содержание

* <a href="#tools">Технологии и инструменты</a>
* <a href="#cases">Реализованные проверки</a>
* <a href="#console">Запуск тестов из терминала</a>
* <a href="#jenkins">Запуск тестов в Jenkins</a>
* <a href="#allure">Отчеты в Allure</a>
* <a href="#testops">Интеграция с Allure TestOps</a>
* <a href="#testops">Интеграция с Jira</a>
* <a href="#telegram">Уведомления в Telegram с использованием бота</a>
* <a href="#video">Пример прогона теста в Selenoid</a>

<a id="tools"></a>

## Технологии и инструменты

<div align="center">
<a href="https://www.jetbrains.com/idea/"><img alt="InteliJ IDEA" height="50" src="media/logo/IntelliJ_IDEA.png" width="50"/></a>
<a href="https://github.com/"><img alt="GitHub" height="50" src="media/logo/GitHub.png" width="50"/></a>  
<a href="https://www.java.com/"><img alt="Java" height="50" src="media/logo/Java_logo.png" width="50"/></a>
<a href="https://gradle.org/"><img alt="Gradle" height="50" src="media/logo/Gradle.png" width="50"/></a>  
<a href="https://junit.org/junit5/"><img alt="JUnit 5" height="50" src="media/logo/JUnit5.png" width="50"/></a>
<a href="https://selenide.org/"><img alt="Selenide" height="50" src="media/logo/Selenide.png" width="50"/></a>
<a href="https://aerokube.com/selenoid/"><img alt="Selenoid" height="50" src="media/logo/Selenoid.png" width="50"/></a>
<a href="https://www.jenkins.io/"><img alt="Jenkins" height="50" src="media/logo/Jenkins.png" width="50"/></a>
<a href="https://github.com/allure-framework/"><img alt="Allure Report" height="50" src="media/logo/AllureReports.png" width="50"/></a>
<a href="https://qameta.io/"><img alt="Allure TestOps" height="50" src="media/logo/AllureTestOps.svg" width="50"/></a>
<a href="https://www.atlassian.com/software/jira"><img alt="Jira" height="50" src="media/logo/Jira.png" width="50"/></a>  
<a href="https://telegram.org/"><img alt="Telegram" height="50" src="media/logo/Telegram.png" width="50"/></a>
</div>

Автотесты написаны на <code>Java</code> с использованием <code>JUnit 5</code> и <code>Gradle</code>.
Для UI-тестов использован фреймворк [Selenide](https://selenide.org/).
Запуск тестов можно осуществлять локально или с помощью [Selenoid](https://aerokube.com/selenoid/).
Также реализована сборка в <code>Jenkins</code> с формированием Allure-отчета и отправкой уведомления с результатами
в <code>Telegram</code> после завершения прогона.

Allure-отчет включает в себя:

* шаги выполнения тестов;
* скриншот страницы в браузере в момент окончания автотеста;
* Page source;
* логи браузерной консоли;
* видео выполнения автотеста.

<a id="cases"></a>

## Реализованные проверки

### Автоматизированные проверки

- ✓ Проверка цены "Курс Java"
- ✓ Проверка цены "Курс Python"
- ✓ Проерка заголовков занятий в учебном плане курса Java
- ✓ Проерка заголовков занятий в учебном плане курса Java Advance
- ✓ Проерка заголовков занятий в учебном плане курса Python
- ✓ Проерка логина без указания пароля
- ✓ Проерка логина без указания e-mail

<a id="console"></a>

## Запуск тестов из терминала

### Локальный запуск тестов

```
gradle clean test -Denv=local
```

Можно переопределить параметры запуска

```
test - запуск всех тестов
java_advance - только для курса Java Advance
java - только для курса Java
python - только для курса Python
login - только для страницы авторизации
```

### Удаленный запуск тестов

```
gradle clean test -Denv=remote
```

Можно переопределить параметры запуска

```
test - запуск всех тестов
java_advance - только для курса Java Advance
java - только для курса Java
python - только для курса Python
login - только для страницы авторизации
```

<a id="jenkins"></a>

## Запуск тестов в <a target="_blank" href="https://jenkins.autotests.cloud/job/017-k_zolotovskiy-UI_Project/"> Jenkins </a>

> Сборка с параметрами позволяет перед запуском указать параметры для сборки.

<p align="center">
<img src="media/screenshots/JenkinsJob.png"/>
</p>

<a id="allure"></a>

## Отчеты в <a target="_blank" href="https://jenkins.autotests.cloud/job/017-k_zolotovskiy-UI_Project/11/allure/"> Allure report </a>

### Основное окно

<p align="center">
<img src="media/screenshots/AllureOverview.png">
</p>

### Тесты

<p align="center">
<img src="media/screenshots/AllureBehaviors.png">
</p>

### Графики

<p align="center">
<img src="media/screenshots/AllureGraphs.png">
</p>

<a id="testops"></a>

## Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/2121/test-cases?treeId=0"> Allure TestOps </a>

### Доска

<p align="center">
<img src="media/screenshots/AllureTestOpsDashboard.png">
</p>

### Тест-кейсы

<p align="center">
<img src="media/screenshots/AllureTestCases.png">
</p>

<a id="jira"></a>

## Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-645"> Jira </a>

<p align="center">
<img src="media/screenshots/Jira.png">
</p>

<a id="telegram"></a>

## Уведомления в Telegram с использованием бота

<p>
<img src="media/screenshots/TelegramBot.png">
</p>

<a id="video"></a>

## Пример прогона теста в Selenoid

> К каждому тесту в отчете прилагается видео
<p align="center">
  <img src="media/video/Video.gif">
</p>
