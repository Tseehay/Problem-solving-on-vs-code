from django.shortcuts import render
from django.http import HttpResponse
# Create your views here.
# request -> response
# requset handler
# action 


    # pull data from db
    # transfform
    # send email
    # return HttpResponse('Hello World')
def say_hello(request):
    x=1
    y=2
    return render(request,'hello.html', {'name':'tse'})   