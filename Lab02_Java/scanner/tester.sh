#!/bin/bash
ROOT=/home/pupabremenkamp/Compiladores/Lab02_Java
ANTLR_PATH=$ROOT/scanner/antlr-4.11.1-complete.jar
CLASS_PATH_OPTION="-cp .:$ANTLR_PATH"
GRAMMAR_NAME=scanner
GEN_PATH=lexer
DATA=$ROOT
IN=$DATA/in
OUT=$DATA/out02_java
cd $GEN_PATH
for infile in `ls $IN/*.ezl`; do
    base=$(basename $infile)
    outfile=$OUT/${base/.ezl/.out}
    echo Running $base
    java $CLASS_PATH_OPTION org.antlr.v4.gui.TestRig $GRAMMAR_NAME \
    program $infile 2>&1 | diff -w $outfile -

done