#!/usr/bin/env bash
set -e
mkdir -p out
find src -name "*.java" > sources.txt
javac -encoding UTF-8 -d out @sources.txt
rm sources.txt
echo "Compilación terminada."
