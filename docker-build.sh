#!/bin/bash

imagenTag="ppt/tutorial"

echo "Reconstruyendo Fuentes en Docker de $imagenTag"

echo "-> Bajando y Borrando containers"
for cnt in $(docker container ls | grep "${imagenTag} " | awk '{ print $1 }'); do
  echo "->   Container:${cnt}"
  echo "->     docker stop ${cnt}"
  docker stop ${cnt}
  echo "->     docker rm ${cnt}"
  docker rm ${cnt}
done

echo "-> Reconstruyendo Imagen"
img=$(docker images -a | grep "${imagenTag} ")
imgHash="$(echo $img | awk '{ print $3 }')"
echo "->   Image-::${imgHash}::-${img}"
echo "->   docker build -t $imagenTag ."
docker build -t $imagenTag .

imgNew="$(docker images -a | grep "${imagenTag} " | awk '{ print $3 }')"
if [[ $imgHash != $imgNew ]]; then
  echo "->   docker rmi $imgHash"
fi

echo '==FIN del Build=='
