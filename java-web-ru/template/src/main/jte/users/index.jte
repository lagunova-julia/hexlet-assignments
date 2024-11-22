    @import exercise.dto.users;
    @param UsersPage page

    <html>
        <head>
            <title>Пользователи</title>
        </head>
        <body>
            <h1>Пользователи</h1>
            <table class="table table-striped">
                @for(var user : page.getUsers())
                    <tr>
                        <td>
                            ${user.getId()}
                        </td>
                        <td>
                            <a href="/users/${user.getId()}">${user.getFirstName()} ${user.getLastName()}</a>
                        </td>
                    </tr>
                @endfor
            </table>
        </body>
    </html>
