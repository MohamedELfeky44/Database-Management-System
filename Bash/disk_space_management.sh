#!/bin/bash

log_file="/D/case_study/Bash/log_disk.txt"

threshold=60

disk_space=$(df -h | awk 'NR==2 {print $6}' | sed 's/%//')
echo $disk_space

if [[ $disk_space -gt $threshold ]]; then
    echo "Warning: Disk Space Is Above $threshold%" >> /D/case_study/Bash/log_disk.txt
else
    echo "Disk Space Is Under $threshold%" >> /D/case_study/Bash/log_disk.txt
fi
