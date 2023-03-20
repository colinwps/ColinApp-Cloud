#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/ry_20220814.sql ./mysql/db
cp ../sql/ry_config_20220510.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../colinapp-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy colinapp-gateway "
cp ../colinapp-gateway/target/colinapp-gateway.jar ./ruoyi/gateway/jar

echo "begin copy colinapp-auth "
cp ../colinapp-auth/target/colinapp-auth.jar ./ruoyi/auth/jar

echo "begin copy colinapp-visual "
cp ../colinapp-visual/colinapp-monitor/target/colinapp-visual-monitor.jar  ./ruoyi/visual/monitor/jar

echo "begin copy colinapp-modules-system "
cp ../colinapp-modules/colinapp-system/target/colinapp-modules-system.jar ./ruoyi/modules/system/jar

echo "begin copy colinapp-modules-file "
cp ../colinapp-modules/colinapp-file/target/colinapp-modules-file.jar ./ruoyi/modules/file/jar

echo "begin copy colinapp-modules-job "
cp ../colinapp-modules/colinapp-job/target/colinapp-modules-job.jar ./ruoyi/modules/job/jar

echo "begin copy colinapp-modules-gen "
cp ../colinapp-modules/colinapp-gen/target/colinapp-modules-gen.jar ./ruoyi/modules/gen/jar

