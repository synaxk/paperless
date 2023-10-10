FROM nginx
COPY ui /usr/share/nginx/html
COPY ui/cors.conf /etc/nginx/conf.d/cors.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
