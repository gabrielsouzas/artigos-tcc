% Desenvolvimento de uma aplicação capaz de identificar objetos            
% contidos em uma imagem utilizando o conceito de redes neurais 

% Trabalho de Conclusão de Curso apresentado ao Instituto Municipal de     
% Ensino Superior de Assis, como requisito do Curso de Graduação

% Gabriel Souza da Silva

% Algoritmo de detecção da laranja com fundo

% Leitura da imagem
imagem = imread('laranjafr4.png'); 

% Armazenamento do numero de linhas e colunas da imagem
linhasImagem = size(imagem, 1); 
colunasImagem = size(imagem, 2);

% Loop que detecta a laranja na imagem a partir de um 
% classificador de pixels em RGB, tornando preto(0) onde  
% existe a laranja e branco(255) onde não exite a laranja

for i=1:linhasImagem
 	for j=1:colunasImagem
 		laranja = false;
 		if (imagem(i,j,1) > 210 && imagem(i,j,2) > 31 && imagem(i,j,3) > 0)
 			if (imagem(i,j,1) < 255 && imagem(i,j,2) < 221 && imagem(i,j,3) < 110)
 						laranja = true;
						imagem(i,j,1) = 0;
						imagem(i,j,2) = 0;
						imagem(i,j,3) = 0;
 					end
        end
 		if laranja == false
 			imagem(i,j,1) = 255;
 			imagem(i,j,2) = 255;
 			imagem(i,j,3) = 255;
 		end			
    end
end


