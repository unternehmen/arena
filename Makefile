JAVA  := /home/cam/Downloads/jdk1.8.0_111/bin/java
JAVAC := /home/cam/Downloads/jdk1.8.0_111/bin/javac

SRC := arena/Arena.java arena/ArenaController.java
OBJ := $(patsubst %.java,%.class,$(SRC))
MAIN := arena.Arena

all: $(OBJ)

$(OBJ): $(SRC)
	$(JAVAC) $^

run:
	$(JAVA) $(MAIN)

clean:
	rm -f $(OBJ)

.PHONY: all clean run
