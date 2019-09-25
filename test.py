
def key_from_url(url):
    key = (
        url
        .replace("s3a://", "")
        .replace("s3://", "")
        .replace("*", "")
    ) if 's3' in url else url.replace('*', "") in (if url else url)

    return (
        key[1:]
        if isinstance(key, basestring) and key.startswith("/") else key
    )


print(key_from_url(None))
print(key_from_url('s3'))
