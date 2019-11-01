FROM java:8
VOLUME /tmp
ADD gavintest-0.0.1.jar gavintest.jar
RUN sh -c 'touch /gavintest.jar'
ENTRYPOINT [ "sh", "-c", "java -jar /gavintest.jar" ]
