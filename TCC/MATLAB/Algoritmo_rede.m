% Arquitetura da Rede

numero_entradas = 1; % numero de entradas
numero_intermediaria = 10; % numero de neuronios na camada intermediária
numero_saida = 1; % numero de neuronios na camada de saída
tipo_intermediaria ='tansig'; % tipo de neuronios da camada intermediária
tipo_saida='tansig'; % tipo de neuronios da camada de saída
tipo_treinamento='learngdm'; % tipo de treinamento da rede

% Criação da Rede Neural

redeneural = newff([minpmaxp],[numero_intermediaria,numero_saida],{tipo_intermediaria, tipo_saida},'trainlm');

% A função newff cria uma rede do tipo Backpropagation

% Configuração dos parâmetros para o treinamento da Rede Neural 

redeneural.trainParam.show = 25;
redeneural.trainParam.lr = 0.2; % Passo de treinamento (ALFA)
redeneural.trainParam.mc = 0.9; % Momento (BETA)
redeneural.trainParam.goal = 0;
redeneural.trainParam.epochs = 1000;

% Treinamento da Rede Neural

redeneural = train(redeneural, M, Result);

% Simulação da Rede Neural

saida = sim(net, M);