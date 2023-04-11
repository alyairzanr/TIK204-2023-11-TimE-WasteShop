from flask import Flask
from flask import render_template
from flask import request

import sqlite3
# from basisdata import *


app = Flask(__name__,
            template_folder='templates',
	          static_folder='static')

@app.route('/')
def singIn():
  return app.send_static_file('signIn.html')

@app.route('/home', methods=["POST"])
def signIn():
  username = request.form["username"]
  email = request.form["email"]
  password = request.form["password"]
  rpassword = request.form["rpassword"]
  return app.send_static_file('login.html')


if __name__ == '__main__':
  app.run(host='0.0.0.0', 
          port=8000,
          debug=True)
app