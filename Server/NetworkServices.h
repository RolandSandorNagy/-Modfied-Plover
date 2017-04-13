int NetworkServices::sendMessage(SOCKET curSocket, char * message, int messageSize)
{
    return send(curSocket, message, messageSize, 0);
}