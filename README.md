# Автоматизированное тестирование главной страницы Luxoft

## :cherry_blossom:	Содержание
                         
> ➠ [Покрытый функционал](#earth_africa-покрытый-функционал)
>
> ➠ [Технологический стек](#classical_building-технологический-стек)
>
> ➠ [Запуск тестов из терминала](#запуск-тестов-из-терминала)
>
> ➠ [Запуск тестов в Jenkins](#robot-удаленный-запуск-тестов)
>
> ➠ [Отчет о результатах тестирования в Allure Report](#skier-главная-страница-allure-отчета)
>
> ➠ [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
>
> ➠ [Пример запуска теста в Selenoid](#-пример-запуска-теста-в-selenoid)


## :earth_africa: Покрытый функционал

> Разработаны автотесты на <code>UI</code>.
### UI

- [x] Проверка поиска по сайту
- [x] Отсутствие ошибок в журнале консоли страницы
- [x] Проверка наличия ссылок в хэддере
- [x] Проверка открытия бокового меню
- [x] Проверка текста в тайтле

## :classical_building: Технологический стек

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/icons/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/icons/Java.svg">
<img width="6%" title="Selenide" src="images/icons/Selenide.svg">
<img width="6%" title="Selenoid" src="images/icons/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/icons/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/icons/Gradle.svg">
<img width="6%" title="JUnit5" src="images/icons/JUnit5.svg">
<img width="6%" title="GitHub" src="images/icons/GitHub.svg">
<img width="6%" title="Jenkins" src="images/icons/Jenkins.svg">
<img width="6%" title="Telegram" src="images/icons/Telegram.svg">
</p>

 В данном проекте автотесты написаны на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.
>
> <code>Selenoid</code> выполняет запуск браузеров в контейнерах <code>Docker</code>.
>
> <code>Allure Report</code> формирует отчет о запуске тестов.
>
> Для автоматизированной сборки проекта используется <code>Gradle</code>.
>
> В качестве библиотеки для модульного тестирования используется <code>JUnit 5</code>.
>
> <code>Jenkins</code> выполняет запуск тестов.
> После завершения прогона отправляются уведомления с помощью бота в <code>Telegram</code>.


## Запуск тестов из терминала

### :robot: Локальный запуск тестов

```
gradle clean test
```

### :robot: Удаленный запуск тестов 

```
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://user1:1234@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```

### :robot: Параметры сборки

> <code>REMOTE_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.
>
> <code>BROWSER</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты (_по умолчанию - <code>91.0</code>_).
>
> <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1920x1080</code>_).



### :skier: Главная страница Allure-отчета

<p align="center">
<img title="Allure Overview" src="images/screenshots/Allure.png">
</p>

### :eye_speech_bubble: Группировка тестов по проверяемому функционалу

<p align="center">
<img title="Allure Behaviors" src="images/screenshots/AllureTests.png">
</p>


### :frog: Основной дашборд

<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/Dashboard.png">
</p>


## <img width="4%" title="Telegram" src="images/icons/Telegram.svg"> Уведомления в Telegram с использованием бота

> После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне.

<p align="center">
<img title="Telegram Notifications" src="images/screenshots/telegramReport.png">
</p>

## <img width="4%" title="Selenoid" src="images/icons/Selenoid.svg"> Пример запуска теста в Selenoid

> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
> 
https://user-images.githubusercontent.com/24212728/165641869-fc5c9321-c22e-4ccc-9ca9-8d3b81becc70.mp4

