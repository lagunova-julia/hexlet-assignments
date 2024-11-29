@import exercise.dto.articles.BuildArticlePage
@param BuildArticlePage page

  @if(page.getErrors() != null)
      <ul>
          @for(var validator : page.getErrors().values())
              @for(var error : validator)
                  <li>${error.getMessage()}</li>
              @endfor
          @endfor
      </ul>
  @endif

  <form action="/articles" method="post">
    <div>
      <label>
        Title
        <input type="text" name="title" value="${page.getTitle()}" />
      </label>
    </div>
    <div>
      <textarea>
        Content
        <input type="text" required name="content" value="${page.getContent()}" />
      </textarea>
    </div>
    <input type="submit" value="Create" />
  </form>