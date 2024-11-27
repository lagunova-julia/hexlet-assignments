<form action="/users" method="post">
  <div>
    <label>
      First name
      <input type="text" name="first name" />
    </label>
  </div>
  <div>
    <label>
        Last name
        <input type="text" name="last name" />
    </label>
  </div>
  <div>
    <label>
      Email
      <input type="email" required name="email" />
    </label>
  </div>
  <div>
    <label>
      Password
      <input type="password" required name="password" />
    </label>
  </div>
  <input type="submit" value="Register" />
</form>