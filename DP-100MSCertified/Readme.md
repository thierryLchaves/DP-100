# Informações Importante !

## Informações gerais sobre execução de código Python e problemas 

### Devido a algumas alterações do Linux (Ubuntu 24.10 oracular ), os processos que envolverem execução de código em Python deverão ser realizados utilizando-se a configuração do ambiente virtual Python para o projeto que está sendo desenvolvido. 

1. Para realizar esse processo siga os passos descritos abaixo \
No terminal bash dentro da pasta do projeto, ou através do bash do &nbsp;&nbsp;&nbsp;![Vscode](https://img.shields.io/badge/Vscode-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)

    ```
    python3 -m venv NomeAmbienteVirtual
    source NomeAmbienteVirtual/bin/activate
    ```
- Com os comandos descritos acima, é possível criar um ambiente virutal do python para o diretório do projeto em questão. 
- ### Em casos de problemas de execução do código no &nbsp;&nbsp;&nbsp;![Vscode](https://img.shields.io/badge/Vscode-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)&nbsp; devido a Kernel do Python não encontrado, pode-se utilizar o seguinte comando descrito abaixo: 
    ```
    python -m pip install ipykernel -U --force-reinstall
    ```
  </br>
  </br>
- No caso descrito acima para quando já houve a instalação de um Kernel padrão porém o código não está sendo executado, o proprio VsCode indica qual comando deverá ser seguido</br></br> 
[![Sugestão Vsode](https://i.postimg.cc/4dqr72pZ/Captura-de-tela-de-2025-04-11-21-02-17.png)](https://postimg.cc/mz3dKwd6)
</br>

- Para desativar o ambiente virtual anteriormente criado, basta utilizar o seguinte comando:
```
deactivate

```
---
## Informações sobre utilização do ![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54) &nbsp; Notebook para o Bootecamp dio


Conforme descrito em [Ferramentas de Desenvolvimento com Azure Machine Learning](https://github.com/thierryLchaves/DP-100/blob/NewBranUbx/DP-100MSCertified/Explorar%20e%20Configurar%20o%20Workspace%20do%20Azure%20Machine%20Learning/02-Ferramentas%20de%20Desenvolvimento%20com%20Azure%20Machine%20Learning/Ferramentas%20de%20Desenvolvimento%20com%20Azure%20Machine%20Learning.odt)&nbsp; é necessário realizar a importação de algumas <b> biblioteca</b> &#x1F4DA;.</br>
Com o ambiente virtual instalado e o kernel do Python devidamente funcionando dever ser utilizado o seguinte comando &#x1F468;&#x200D;&#x1F4BB;; 
```
pip install azure-ai-ml
```




<table>
 <caption><b>Skils</b></caption>
  <tr>
    <td><img src="https://img.shields.io/badge/Python-3.10-blue" /></td>
    <td><img src="https://img.shields.io/badge/Venv-Ativado-green" /></td>
    <td><img src="https://img.shields.io/badge/VSCode-Recomendado-blueviolet" /></td>
    <td><img src="https://img.shields.io/badge/Bash-3.0-brightgreen" /></td>
  </tr>
</table>

