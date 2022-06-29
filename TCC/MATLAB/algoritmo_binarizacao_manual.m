
% Algoritmo de transformação preto e branco (reforço)

% Aquisição da imagem
imagem2 = imagem;

% Armazenamento do numero de linhas e colunas da imagem
linhasImagem = size(imagem2, 1);
colunasImagem = size(imagem2, 2);

% Loop que transforma a imagem original em
% uma imagem em preto e branco  
for i=1:linhasImagem
 	for j=1:colunasImagem
 		
 		if (imagem2(i,j,1) < 255 && imagem2(i,j,2) < 255 && imagem2(i,j,3) < 255)
 			imagem2(i,j,1) = 0;
 			imagem2(i,j,2) = 0;
 			imagem2(i,j,3) = 0;
 		end			
    end
end