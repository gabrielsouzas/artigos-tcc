imagem2 = im5p;
linhasImagem = size(imagem2, 1);
colunasImagem = size(imagem2, 2);
cont = 0;
iv3 = 0;

% Segmenta a imagem de entrada de acordo com um classificador de pixels em
% RGB, separando os pixels que pertencem do restante dos pixels.

for i=1:linhasImagem
 	for j=1:colunasImagem
        aux = j;
        cont = cont + imagem2(i,aux) + imagem2(i,aux+1) + imagem2(i,aux+2) + imagem2(i,aux+3) + imagem2(i,aux+4) + imagem2(i,aux+5) + imagem2(i,aux+6) + imagem2(i,aux+7) + imagem2(i,aux+8) + imagem2(i,aux+9) + imagem2(i,aux+10) + imagem2(i,aux+11);	
 		if (cont < 12)
 			
            iv3(i) = imagem2(i,j);
 			
            
        end
    end
end