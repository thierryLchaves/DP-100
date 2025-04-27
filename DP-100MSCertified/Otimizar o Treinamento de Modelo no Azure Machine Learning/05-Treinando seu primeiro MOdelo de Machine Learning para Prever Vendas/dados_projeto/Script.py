import pandas as pd
import numpy as np

# Gerando as datas
datas = pd.date_range(start='2024-01-01', end='2025-04-10', periods=100)

# Gerando temperaturas entre 24°C e 38°C
np.random.seed(42)
temperaturas = np.round(np.random.uniform(24, 38, size=100), 1)

# Gerando vendas aleatórias entre 0 a 100 unidades por dia 
vendas = (temperaturas * np.random.uniform(0,5, size=100)).astype(int)

# Criando o DataFrame
df = pd.DataFrame({
"Data": datas.strftime('%Y-%m-%d'),
"Temperatura (°C)": temperaturas,
"Vendas de Sorvete (Unidades)": vendas
})

# Salvando em CSV
caminho_csv = '/media/thierry/dados/Documentos/Estudos/DP-100/DP-100MSCertified/Otimizar o Treinamento de Modelo no Azure Machine Learning/05-Treinando seu primeiro MOdelo de Machine Learning para Prever Vendas/dados_projeto/src/vendas_sorvete.csv'
df.to_csv(caminho_csv, index=False)
caminho_csv