require: patterns.sc
theme: /

    state: /hello
        q!: * ($hello|привет|здравствуй|добрый день|hi|hello|start|старт) *
        a: Привет! Я твой помощник. Могу рассказать о погоде (/weather) или курсах валют (/currency). Что выберешь?
        go: /MainMenu

    state: /weather
        q!: * ($weather|погода|погоду|какая погода|weather|forecast) *
        a: Погода на сегодня: солнечно, +25°C. Хочешь узнать о валюте (/currency) или что-то еще?
        go: /MainMenu

    state: /currency
        q!: * ($currency|валюта|курс|валюты|доллар|евро|exchange|rate) *
        a: Текущие курсы: 1 USD = 90 RUB, 1 EUR = 95 RUB. Хочешь узнать погоду (/weather) или что-то еще?
        go: /MainMenu

    state: /NoMatch
        event!: noMatch
        a: Извини, не понял тебя. Я могу рассказать о погоде (/weather) или курсах валют (/currency). Что выберешь?
        go: /MainMenu

    state: /MainMenu
        a: Напиши, что интересует: погода (/weather) или валюта (/currency)?