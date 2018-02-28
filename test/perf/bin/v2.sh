
export MEM=64
export FLAVOR=
export FILENAME=

#scan first param
case "$2" in
	memory) export MEM=$3 ;;
	flavor) export FLAVOR=$3 ;;
	filename) export FILENAME=$3 ;;
esac
#scan second param
case "$4" in
	memory) export MEM=$5 ;;
	flavor) export FLAVOR=$5 ;;
	filename) export FILENAME=$5 ;;
esac
#scan third param
case "$6" in
	memory) export MEM=$7 ;;
	flavor) export FLAVOR=$7 ;;
	filename) export FILENAME=$7 ;;
esac

java -Xmx"$MEM"m -classpath $XMLBEANS_PERFROOT/build:$XMLBEANS_PERFROOT/schema_build/v2-purchase-order.jar:$XMLBEANS_PERFROOT/schema_build/v2-primitives.jar:$XMLBEANS_PERFROOT/schema_build/v2-non-primitives.jar:$XMLBEANS_PERFROOT/3rdparty/v2/xmlbeans-2.0.0/lib/xbean.jar:$XMLBEANS_PERFROOT/3rdparty/v2/xmlbeans-2.0.0/lib/jsr173_api.jar:$XMLBEANS_PERFROOT/3rdparty/v2/saxon8.jar:$XMLBEANS_PERFROOT/3rdparty/v2/xmlbeans-2.0.0/lib/xbean_xpath.jar -DPERF_ROOT=$XMLBEANS_PERFROOT org.apache.poi.xmlbeans.test.performance.v2.$1 $FLAVOR $FILENAME
