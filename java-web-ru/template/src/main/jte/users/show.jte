    @import exercise.dto.users;
    @param UserPage page

    <html>
        <head>
            <meta charset="utf-8" />
                <title>Hello Hexlet!</title>
        </head>
        <body>
            <div class="mx-auto p-4 py-md-5">
                <main>
                    <h2>${page.getUser().getFirstName()} ${page.getUser().getLastName()}</h2>
                    <div>${page.getUser().getEmail()}</div>
                </main>
            </div>
        </body>
    </html>
