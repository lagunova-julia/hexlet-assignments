<!-- src/main/jte/posts/edit.jte -->
<html>
<head>
    <title>Редактировать пост</title>
</head>
<body>
    <h1>Редактировать пост</h1>

    <!-- Проверяем, есть ли ошибки валидации -->
    <div>
        <!-- Если есть ошибки, выводим их -->
        <ul>
            @for(error : errors) {
                <li>${error}</li>
            }
        </ul>
    </div>

    <!-- Форма редактирования поста -->
    <form action="/posts/update/${post.id}" method="POST">
        <div>
            <label for="title">Заголовок:</label>
            <input type="text" id="title" name="title" value="${post.title}" required />
        </div>

        <div>
            <label for="content">Содержимое:</label>
            <textarea id="content" name="content" required>${post.content}</textarea>
        </div>

        <div>
            <button type="submit">Сохранить изменения</button>
        </div>
    </form>

    <div>
        <a href="/posts">Назад к списку постов</a>
    </div>
</body>
</html>