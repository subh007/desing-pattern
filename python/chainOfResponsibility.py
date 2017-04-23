class Filter:

    def __init__(self, filters):
        self._filters = list()
        if filters is not None:
            self._filters += filters

    def filter(self, content):


        for filter in self._filters:
            content = filter(content)
            print content

        return content

def offensive(content):
    print content
    modified  = content.replace("offensive 7892405360", "")
    return modified

content = "this is offensive content"
conent_filter = Filter([offensive])

print conent_filter.filter(content)