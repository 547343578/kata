#!/bin/bash

cd src || exit 1
../venv/bin/python -m unittest discover
