[![Latest Version(latest version)](https://img.shields.io/github/v/release/REM-Codes/Recurse?include_prereleases&label=latest%20release&style=for-the-badge)](https://github.com/REM-Codes/Recurse/releases)
[![GitHub repo size](https://img.shields.io/github/repo-size/REM-Codes/Recurse?style=for-the-badge)](https://github.com/REM-Codes/Recurse)
[![GitHub](https://img.shields.io/github/license/REM-Codes/Recurse?style=for-the-badge)](https://github.com/REM-Codes/Recurse/blob/main/LICENSE)

# **Recurse**
An ultra-lightweight and simplistic text editor

Currently, Recurse is only usable on Windows computers, since the GUI is made with Windows Forms.

## Installation
To install the program, navigate to [https://github.com/REM-Codes/Recurse/releases/latest](https://github.com/REM-Codes/Recurse/releases/latest) and download the appropriate file, depending on your computer architecture (see chart  below).

|Architecture|Executable|
|---|---|
|32-bit|`Recurse-x86.exe`|
|64-bit|`Recurse-x64.exe`|

To download all release architectures, download `Recurse-[version].zip`

**Your browser or operating system might give you a warning about downloading things off of the web. You can review the source code if you don't trust the software. Once you do so, please press `continue` or whatever similar button you see.** 

### If you downloaded a zip
Extract the `.zip` file to your desktop or another directory.
Launch the appropriate release by double clicking the `.exe` file.

### If you downloaded an exe
Once the `.exe` is downloaded, double click it to launch Recurse.

## Usage
Currently (as of 07-16-2022), the keyboard shortcuts are as follows:

|Key|Function|
|---|---|
|`Ctrl`+`S`|Save|
|`Ctrl`+`O`|Open|
|`Ctrl`+`Q`|Quit|
|`Ctrl`+`Shift`+`S`|Save As|
|`Ctrl`+`H`|Show About Box|
|`Ctrl`+`Shift`+`X`|Close File|

## Changelog
### v1.3.1 (Latest Version):
Minor updates & bug fixes

### v1.3.0:
Ease of use updates
    
    COMPLETED:
        - Add shortcut to close a file (without closing the app)
        - Add a close confirmation when closing a file or the app
        - Removed bugs:
            - [#1](https://github.com/REM-Codes/Recurse/issues/1)
    TODO:
        - Testing

### v1.2.0:
Additional minor updates

    COMPLETED:
        - Save functionality no longer asks where to save if the file has already been saved once
        - Allow user to use `Ctrl`+`Shift`+`S` to save a file under a different name
        - Added about box with license details, contact information, and credit
    TODO:
        - Testing
        - Print feature (?)

### v1.1.0:
Small updates

    COMPLETED:
        - Add scrollbars
        - Add indicator to signify if the text has been updated since it was saved last
    TODO:
        - Testing
        - Print feature (?)

### v1.0.0:
Completely re-written from scratch!

    COMPLETED:
        - Setup [more simplistic] UI
        - Save and load
        - Close confirmation
        - Keyboard shortcut controls!
        - Rename from "Recursive" to "Recurse" - this goes with the simplistic approach
        - Migrate to C#!
        - Remove excess UI
        - Dark mode now available - we are supreme!
    TODO:
        - Testing
        - Print feature (?)
        - Add indicator to signify if the text has been updated since it was saved last

### v0.1.0:
This is the first full release of the software!

    COMPLETED:
        - Update UI scaling
        - Introduce save and load functions
        - Added scrollbars
    TODO:
        - Handle potential problems with loading the UI
        - General Testing
        - Center file select above main window
        - New file  confirmation dialog?

### v0.0.1-alpha:
Initial release

    COMPLETED:
        - Introduce UI
        - New, Print, Cut, Copy, and Paste have been introduced but remain untested
        - Close confirmation
    TODO:
        - Save and Open functionality need to be developed
        - Handle potential problems with loading the UI
        - General Testing
        - Add Scrollbars for overflow
        - Center close confirmation and file select on window
        - Create executable
