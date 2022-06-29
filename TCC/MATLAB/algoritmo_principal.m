% Desenvolvimento de uma aplica��o capaz de identificar objetos            
% contidos em uma imagem utilizando o conceito de redes neurais 

% Trabalho de Conclus�o de Curso apresentado ao Instituto Municipal de     
% Ensino Superior de Assis, como requisito do Curso de Gradua��o

% Gabriel Souza da Silva

% Algoritmo Principal

% Aquisi��o e processamento das imagens

% Leitura das imagens
%im1 = imread('laranja3.png')
%im2 = imread('laranja4.png')
%im3 = imread('cenoura4.png')
%im4 = imread('cenoura5.png')

% Binariza��o das imagens
%im1p = im2bw(im1, 0.9);
%im2p = im2bw(im2, 0.9);
%im3p = im2bw(im3, 0.9);
%im4p = im2bw(im4, 0.9);

% Transforma��o das imagens em vetores coluna
%im1v = im1p(:)
%im2v = im2p(:)
%im3v = im3p(:)
%im4v = im4p(:)
%
%M = [im1v,im2v,im3v,im4v];% Cria��o da matriz de entrada da rede
%Result = [1,1,-1,-1];% Cria��o do vetor de sa�da desejada da rede

% Arquitetura da Rede

numero_entradas = 1; % numero de entradas
numero_intermediaria = 1; % numero de neuronios na camada intermedi�ria
numero_saida = 1; % numero de neuronios na camada de sa�da
tipo_intermediaria ='tansig'; % tipo de neuronios da camada intermedi�ria
tipo_saida='tansig'; % tipo de neuronios da camada de sa�da
tipo_treinamento='learngdm'; % tipo de treinamento da rede

% Cria��o da Rede Neural

redeneural = newff(M, Result,[numero_intermediaria,numero_saida],{tipo_intermediaria, tipo_saida},'trainlm', tipo_treinamento);

% A fun��o newff cria uma rede do tipo Backpropagation

% Configura��o dos par�metros para o treinamento da Rede Neural 

redeneural.trainParam.show = 25; % Atualiza��o da tela
redeneural.trainParam.lr = 0.2; % Taxa de aprendizado
redeneural.trainParam.mc = 0.9; % Taxa de momentum
redeneural.trainParam.goal = 0; % Erro final desejado
redeneural.trainParam.epochs = 1000; % N�mero de �pocas

% Treinamento da Rede Neural

redeneural = train(redeneural, M, Result);

% Simula��o da Rede Neural

saida = sim(redeneural, im1v);

