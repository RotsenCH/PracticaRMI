# Utiliza una imagen de python

FROM openjdk:latest

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /aplicacion

# Copiar todos los archivos dede el host al directorio
COPY . /aplicacion

# Instalar las dependencias requeridas
RUN javac *.java

# Exponer puerto del contenedor
EXPOSE 1099

# Comando para ejecutar aplicación
CMD [ "java","ServidorRMI" ]