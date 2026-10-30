# QuizJar

A Kotlin Multiplatform quiz platform with a native Android shell, Compose + Material 3 Expressive UI, and a shared Vue/HTML/CSS/Canvas quiz experience.

## Architecture

- `app/` Android application shell and WebView host
- `shared/` KMP quiz rules, format validation, progression, storage, and localization
- `web/` player and Interactive Quiz Studio sources
- `libraries/jarrlyyuisdk/` reusable web UI SDK boundary
- `libraries/jarrlyyydsp/` DSP/native integration boundary
- `native/` optional C++/JNI implementations
- `.github/workflows/` CI and merged-master debug APK builds

Kotlin/shared code remains authoritative for scoring, validation, progression, rewards, and saves. The WebView is a presentation layer connected through a deliberately small bridge.

## Development

The initial foundation is intentionally small and buildable. Features can be added without turning the WebView into the source of truth.
