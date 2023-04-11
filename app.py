from flask import Flask
from flask import render_template
from flask import request

import sqlite3
# from basisdata import *


app = Flask(__name__,
            template_folder='templates',
	        static_folder='static')

@app.route('/')
def singUp():
  error = ""
  return render_template('signUp.j2', error=error)

@app.route('/home', methods=["POST"])
def login():
  username = request.form["username"]
  email = request.form["email"]
  password = request.form["password"]
  rpassword = request.form["rpassword"]
  if password == rpassword:
     return app.send_static_file('login.html') # mengarahkan ke halaman berikutnya
  else:
    error = "Password tidak sama"
    return render_template('signUp.j2', error=error) # menampilkan pesan kesalahan pada halaman yang sama


if __name__ == '__main__':
  app.run(host='0.0.0.0', 
          port=8000,
          debug=True)
app