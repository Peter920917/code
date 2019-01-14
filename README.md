##读取properties的配置文件
使用类ResourceBundle

`private static ResourceBundle bundle=ResourceBundle.getBundle("test");`

其中配置文件要放到工程目录的resources路径下，否则无法找到该配置文件
，如果是maven的项目可以通过修改pom.xml文件来修改路径
