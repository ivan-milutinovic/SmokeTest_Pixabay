Izvinjavam se, u pravu ste. Sekcija o strukturi projekta je ključna i trebalo je da bude uključena.

Evo kompletne, ispravljene engleske verzije za SmokeTest_Pixabay, sa dodatkom sekcije o strukturi:

Markdown

# SmokeTest_Pixabay

[![Playwright Logo](https://img.shields.io/badge/Playwright-E2E%20Testing-brightgreen?logo=playwright&style=for-the-badge)](https://playwright.dev/)
[![Language](https://img.shields.io/badge/Language-TypeScript-blue?logo=typescript&style=for-the-badge)]()
[![Target Website](https://img.shields.io/badge/Target-Pixabay.com-informational?style=for-the-badge)](https://pixabay.com/)
[![Status](https://img.shields.io/badge/Scope-Smoke%20Testing-yellowgreen?style=for-the-badge)]()

## Project Overview

This repository features a concise and efficient test automation suite dedicated to performing fundamental **Smoke Tests** on the well-known media platform **[Pixabay](https://pixabay.com/)**.

The project ensures that the most critical, user-facing functionalities are operational and stable before any further testing or deployment. The test cases focus on core workflows such as:

* Successful site loading and availability.
* Functionality of the main search feature.
* Basic navigation between key sections.

The tests are written using the **Playwright** framework in **TypeScript** for robust performance and type safety.

---

## Technology Stack

* **Playwright** - Used for reliable and fast cross-browser automation.
* **TypeScript** - The programming language used to develop robust and scalable tests.
* **Node.js & npm** - The environment and package manager for project setup.

---

## Prerequisites

To run this test suite locally, you will need:

* **Node.js** (version 16 or newer recommended)
* **npm** or **Yarn** (for dependency management)
* **Git**

---

## Installation and Execution

Follow these steps for a quick setup and test execution.

### 1. Clone the Repository

```bash
git clone [https://github.com/ivan-milutinovic/SmokeTest_Pixabay.git](https://github.com/ivan-milutinovic/SmokeTest_Pixabay.git)
cd SmokeTest_Pixabay

2. Install Dependencies
Install all required packages and the Playwright browser drivers:
Bash
npm install
npx playwright install

3. Running the Smoke Tests
Execute the entire test suite:
Bash
npx playwright test

Viewing in UI Mode (for Interactive Debugging):
Bash
npx playwright test --ui

4. Viewing the Test Report
Access the detailed HTML report after test completion:
Bash
npx playwright show-report

Project Structure
The project structure is organized to support scalable test development:

.
├── tests/                  # All smoke test files (.spec.ts)
├── pages/                  # (If applicable) Page Object Model classes
├── data/                   # Test data (e.g., JSON files)
├── playwright.config.ts    # Main Playwright configuration file
└── package.json            # Project dependencies and scripts
