from django.shortcuts import render
from django.http import HttpResponse
# Create your views here.
# request -> response
# requset handler
# action 

def say_hello(request):
    # pull data from db
    # transfform
    # send email
    # return HttpResponse('Hello World')
    return render(request,'hello.html') 