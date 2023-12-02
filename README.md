# java-core


The SSH agent is a central part of OpenSSH

ssh-agent is a key manager for SSH. It holds your keys and certificates in memory, unencrypted, and ready for use by ssh. It saves you from typing a passphrase every time you connect to a server. It runs in the background on your system, separately from ssh, and it usually starts up the first time you run ssh after a reboot.

The SSH agent keeps private keys safe because of what it doesn't do:

It doesn't write any key material to disk.
It doesn't allow your private keys to be exported

https://github.com/lkanthrao/java-core.git
The next time you git fetch, git pull, or git push to the remote repository, you'll be asked for your GitHub username and password. When Git prompts you for your password, enter your personal access token

git@github.com:lkanthrao/java-core.git
you'll have to setup ssh keys and configure it in ssh agent.