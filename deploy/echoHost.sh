
echo "[server_host]">host.ini
terraform output server_host>>host.ini
echo "[client_host]">>host.ini
terraform output client_host>>host.ini
