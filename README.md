# ОПРЕДЕЛИТЕЛЬ ЧАСТОТЫ ИСПОЛЬЗОВАНИЯ СИМВОЛА В ТЕКСТЕ

Перед Вами программа, которая умеет определять самый часто используемый и менее используемый символ в тексте, не включая пробелы. 

## Принцип работы программы

- Программа в качестве текста по умолчанию использует классический текст:
```
Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
```
- Далее программа автоматически разделяет его на символы, убирая пробелы, и исчисляет частотность использования каждого символа.
- Затем программа находит самый частотный и наименее частотный в данном тексте символ. 
- В конце программа выводит следующее сообщение:

```
В данном тексте буква h используется реже всего. Она встретилась нам 1 раз.
В данном тексте буква i используется чаще всего. Она встретилась нам 42 раз.
```

- При использовании другого текста результат будет иным. 