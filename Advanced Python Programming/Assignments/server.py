import socket

host = '127.0.0.1'
port = 123

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
print("Socket created at server successfully")
s.bind((host, port))
s.listen()
print("server is listening")
conn, addr = s.accept()
print(f"Connected to {addr}")
while True:
    data = conn.recv(1024)
    print(f"Client -> {repr(data)}")
    text = input("Enter the text you want to send to the Client: ")
    conn.sendall(bytes(text, 'utf-8'))
