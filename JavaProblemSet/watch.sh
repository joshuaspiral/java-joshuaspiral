#!/usr/bin/env bash

FILE="$1"
CMD="$2"

if [ "$FILE" = "" ] || [ "$CMD" = "" ]; then
  echo "Usage: watch.sh [FILE] [COMMAND]"
  exit 1
fi

LAST=`ls -l "$FILE"`

while true; do
  sleep 1
  NEW=`ls -l "$FILE"`
  if [ "$NEW" != "$LAST" ]; then
    "$CMD" "$FILE"
    LAST="$NEW"
  fi
done
