#!/bin/bash
# ===========================================================
# Script Name: InstallChrome.sh
# Purpose: Install the latest stable Google Chrome on Ubuntu
# Author: Madhukar (QA Automation)
# ===========================================================

set -e  # Exit script if any command fails

echo "Installing Google Chrome Browser..."

# Step 1: Update all packages
sudo apt-get update -y

# Step 2: Install required dependencies
sudo apt-get install -y wget gnupg unzip xvfb

# Step 3: Download Google Chrome .deb package
wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb

# Step 4: Install Google Chrome
sudo dpkg -i google-chrome-stable_current_amd64.deb || sudo apt-get install -f -y

# Step 5: Verify installation
google-chrome --version

# Step 6: Clean up unnecessary files
rm -f google-chrome-stable_current_amd64.deb

echo "Google Chrome installed successfully!"
