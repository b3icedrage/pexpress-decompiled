# PExpress Demo APK

A standalone Android paper-trading simulator inspired by the decompiled repository structure. It does not reuse PExpress proprietary backend code, connect to a broker, authenticate with Pocket Option, or place orders.

## Features
- $1,000 virtual balance
- Example-only market quotes
- BUY/SELL paper-trade tickets
- Virtual stake presets and expiry labels
- Manual WIN/LOSS settlement with illustrative 80% payout
- Local-only balance persistence

## Build
Requires JDK 17, Android SDK platform 35, and Gradle 8.9.

```sh
cd demo-apk
gradle assembleDebug
```

APK: `app/build/outputs/apk/debug/app-debug.apk`

The GitHub Actions workflow builds and uploads the debug APK as an artifact on pushes affecting this directory or when manually dispatched.
