# # BlogPost
#
# - Create a `BlogPost` class that has
#   - an `authorName`
#   - a `title`
#   - a `text`
#   - a `publicationDate`
class BlogPost:
    def __init__(self, author_name, title, text, publication_date):
        self.author_name = author_name
        self.title = title
        self.text = text
        self.publication_date = publication_date


# - Create a few blog post objects:
#   - "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
#     - Lorem ipsum dolor sit amet.
post1_text = "Lorem ipsum dolor sit amet."
post1 = BlogPost("John Doe", "Lorem Ipsum", post1_text, "2000.05.04.")

#   - "Wait but why" titled by Tim Urban posted at "2010.10.10."
#     - A popular long-form, stick-figure-illustrated blog about almost
#       everything.
post2_text = "A popular long-form, stick-figure-illustrated blog about almost everything."
post2 = BlogPost("Tim Urban", "Wait but why", post2_text, "2010.10.10.")

#   - "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William
#     Turton at "2017.03.28."
#     - Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the
#       center of attention. When I asked to take his picture outside one of IBM’s
#       New York City offices, he told me that he wasn’t really into the whole
#       organizer profile thing.
post3_text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I " \
             "asked to take his picture outside one of IBM’sNew York City offices, he told me that he wasn’t really " \
             "into the wholeorganizer profile thing. "
post3 = BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", post3_text, "2017.03.28.")


