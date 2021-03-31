import socket

host = '127.0.0.1'
port = 123

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
print("Socket created at client successfully")
s.connect((host, port))
while True:
    text = input("Enter the text you want to send to the server: ")
    s.sendall(bytes(text, 'utf-8'))
    data = s.recv(1024)
    print(f"Server -> {repr(data)}")
