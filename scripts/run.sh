#!/usr/bin/env bash
set -e
bash scripts/build.sh
java -cp out dev.sofipv.fundamentos.App
