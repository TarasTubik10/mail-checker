iniName=
while true; do
	flag="$1"
	shift
	case "$flag" in
		--help|-h|'-?') usage && exit 0 ;;
		--ini-name) iniName="$1" && shift ;;
		--) break ;;
		*)

  	case "$iniName" in
		/*)
			# allow an absolute path
			ini="$iniName"
			;;
		*)
