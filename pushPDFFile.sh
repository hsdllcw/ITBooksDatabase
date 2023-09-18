cd /media/hsdllcw/PersonalFiles/hsdllcw/Documents/Book/IT/itbook/ITBooksDatabase
git add "$1"
git commit -m "$2"
git push origin master
echo "$1" >> /media/hsdllcw/PersonalFiles/hsdllcw/Documents/Book/IT/itbook/push.log