#Makefile temporaire pour l'ihm du projet
SOURCEPATH=./src
CLASSPATH=./class
BIN=bin

all : 
	java -cp ${CLASSPATH} Calculatrice

compile :
	javac -s ${SOURCEPATH} -d ${CLASSPATH} -cp ${CLASSPATH} ${SOURCEPATH}/Read*.java ${SOURCEPATH}/Write*.java ${SOURCEPATH}/Modele*.java ${SOURCEPATH}/Affichage.java ${SOURCEPATH}/CalcEvent*.java ${SOURCEPATH}/Calculatrice*.java
	javac -s ${SOURCEPATH} -d ${CLASSPATH} -cp ${CLASSPATH} ${SOURCEPATH}/Calculatrice.java

jar-create :
	cd ${CLASSPATH} && jar cfe ../${BIN}/Calculatrice.jar Calculatrice * && cd .. 

jar-exec :
	java -jar ${BIN}/Calculatrice.jar

clean : 
	rm -r ${CLASSPATH}/*
	rm -r ${BIN}/*
