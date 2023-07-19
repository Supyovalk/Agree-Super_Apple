name: " Reporting a bug template"
about: Report with latest version, your issue is likely to be fixed.  Make sure you
  have searched issues and no similar is present.
title: ''
labels: ''

body:
- type: markdown
- type: input
    id: version
    attributes:
     label: Mod Version
    description: eg:1.20.1-3.0.0-rc1
    validations:
      required: true

- type: textarea
id: description
attributes:
label: error description
validations:
required: true