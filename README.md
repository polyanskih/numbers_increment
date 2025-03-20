стандартный 8080 порт, end-point ```/numbers/increment```


пример запроса
```
curl --location --request POST 'localhost:8080/numbers/increment' \
--header 'Content-Type: application/json' \
--data-raw '{
"numbers": [
-1,
1,
0
]
}'
```

также в /test добавлен пример тестов, запуск ```gradlew test```

даже генерится базовый отчет ```/build/reports/tests/index.html```
