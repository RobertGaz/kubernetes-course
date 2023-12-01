{{- define "mychart.config_map_labels" }}
  labels:
    version: {{ .Chart.Version }}
    date: {{ now | htmlDate }}
{{- end }}
