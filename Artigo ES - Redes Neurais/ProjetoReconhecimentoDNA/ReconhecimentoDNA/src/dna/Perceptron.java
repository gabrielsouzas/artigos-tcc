package dna;

public class Perceptron {

	public static void main(String[] args) {
		
		/*
		double[] vetorAmostra = new double[] { 
				0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25,
				0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.5 , 0.25, 0.25, 0.25,
				0.25, 0.25, 0.25, 0.25, 0.25, 0.5 , 0.25, 0.25, 0.25, 0.25,
				0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25,
				0.25, 0.25, 0.25, 0.25, 0.5 , 0.25, 0.5 , 0.25, 0.5 , 0.25,
				0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25,
				0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25,
				0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 
				0.25, 0.25, 0.5 , 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 
				0.25, 0.25, 0.5 , 0.5 , 0.25, 0.25, 0.25, 0.25, 0.25, 0.25 
				}; //*/// Padr�o 1
		/*
		double[] vetorAmostra = new double[] { 
				0.5 , 1.0, 0.5 , 1.0 , 1.0 , 1.0, 0.5, 0.5 , 0.5, 1.0 , 
				0.25, 1.0, 0.25, 1.0 , 1.0 , 1.0, 0.5, 0.25, 1.0, 1.0 ,
				1.0 , 0.5, 1.0 , 1.0 , 1.0 , 0.5, 1.0, 1.0 , 1.0, 1.0 ,
				0.25, 0.5, 0.5 , 0.25, 0.5 , 0.5, 0.5, 1.0 , 1.0, 1.0 ,
				1.0 , 1.0, 0.25, 0.5 , 1.0 , 1.0, 1.0, 0.5 , 1.0, 1.0 ,
				1.0 , 0.5, 1.0 , 0.25, 1.0 , 1.0, 1.0, 0.5 , 0.5, 0.25,
				1.0 , 1.0, 1.0 , 1.0 , 1.0 , 1.0, 1.0, 1.0 , 0.5, 1.0 ,
				1.0 , 1.0, 0.5 , 0.5 , 0.25, 0.5, 1.0, 1.0 , 0.5, 1.0 ,
				0.5 , 0.5, 0.5 , 1.0 , 1.0 , 0.5, 1.0, 1.0 , 0.5, 1.0 ,
				1.0 , 1.0, 1.0 , 0.5 , 1.0 , 1.0, 0.5, 0.5 , 0.5, 0.5  
				}; //*/// Padr�o 2
		///*
		double[] vetorAmostra = new double[] { 
				1.0 , 1.0, 1.0, 1.0, 0.25, 1.0 , 1.0, 0.25, 1.0, 0.5 ,
				0.5 , 0.5, 1.0, 0.5, 1.0 , 0.25, 1.0, 1.0 , 1.0, 1.0 , 
				1.0 , 1.0, 0.5, 0.5, 1.0 , 1.0 , 1.0, 1.0 , 1.0, 0.5 , 
				0.25, 1.0, 0.5, 0.5, 1.0 , 1.0 , 1.0, 1.0 , 1.0, 0.25,
				1.0 , 0.5, 1.0, 1.0, 1.0 , 1.0 , 0.5, 1.0 , 1.0, 1.0 ,
				0.5 , 1.0, 0.5, 1.0, 0.5 , 1.0 , 0.5, 0.5 , 1.0, 0.25,
				0.5 , 1.0, 1.0, 1.0, 1.0 , 1.0 , 1.0, 1.0 , 0.5, 1.0 , 
				1.0 , 0.5, 1.0, 1.0, 1.0 , 0.25, 0.5, 1.0 , 1.0, 0.5 ,
				0.25, 1.0, 1.0, 0.5, 0.5 , 1.0 , 1.0, 0.5 , 1.0, 0.25,
				0.5 , 1.0, 0.5, 1.0, 0.25, 0.25, 1.0, 0.5 , 1.0, 1.0 
				}; //*/// Padr�o 2
		/*
		double[] vetorAmostra = new double[] { 
				0.25, 0.25, 0.25, 0.5,  0.25, 0.25, 0.25, 0.25, 0.25, 0.5 , 
				0.25, 0.25, 0.25, 0.25, 0.5 , 0.25, 0.25, 0.25, 0.5 , 0.5 , 
				0.25, 0.25, 0.5,  0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 
				0.25, 0.25, 0.25, 0.25, 0.5 , 0.25, 0.5 , 0.25, 0.25, 0.25, 
				0.25, 0.5 , 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 
				0.5 , 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.5 ,
				0.5 , 0.25, 0.25, 0.25, 0.25, 0.5,  0.25, 0.25, 0.25, 0.25, 
				0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25,
				0.5 , 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.5 , 
				0.25, 0.5 , 0.25, 0.5 , 0.25, 0.25, 0.25, 0.25, 0.5 , 0.5 
				}; //*/// Padrao 1

		
		// Avalia��o de Pesos: Regular
		//double[] w = new double[] { 0.01492537313432836, -0.05887096774193553, 0.07380952380952381, -0.13888888888888895, -0.11296296296296301, -0.12916666666666674, 0.060000000000000005, 0.07777777777777778, 0.06123595505617978, 0.02439024390243902, 0.10064102564102564, -0.10833333333333339, 0.2916666666666667, -0.03461538461538464, -0.11153846153846159, 0.011764705882352948, 0.33563829787234045, 0.23765822784810128, -0.1341269841269842, 0.014084507042253502, -0.01249999999999999, 0.175, -0.13823529411764712, 0.01785714285714285, -0.06875000000000006, 0.16176470588235298, -0.08529411764705888, 0.07692307692307693, -0.12222222222222229, -0.13387096774193555, 0.0855263157894737, 0.06265822784810127, 0.016949152542372878, 0.0903846153846154, 0.0625, 0.020408163265306124, 0.3333333333333336, -0.11296296296296301, -0.05652173913043481, -0.1214285714285715, -0.03412698412698415, 0.05000000000000001, 0.2053030303030303, 0.17702702702702708, 0.09, -0.03684210526315793, 0.049999999999999996, 0.1136986301369863, 0.016393442622950817, -0.0833333333333334, -0.08305084745762717, 0.015151515151515152, -0.06424731182795704, 0.13992537313432835, -0.13275862068965522, -0.13648648648648654, -0.09117647058823533, 0.017241379310344827, 0.013157894736842105, 0.08530927835051547, -0.13611111111111118, -0.1341269841269842, -0.026744186046511666, -0.13717948717948725, -0.13888888888888895, -0.12619047619047624, 0.04285714285714284, -0.12297297297297302, 0.11724137931034481, -0.08989898989898995, -0.035294117647058844, -0.09444444444444447, 0.06923076923076923, 0.014492753623188408, 0.08586956521739131, 0.06923076923076923, -0.009090909090909101, -0.09117647058823533, 0.023255813953488372, 0.3333333333333333, 0.12692307692307692, 0.18575268817204302, 0.16123595505617977, -0.12777777777777782, -0.0743589743589744, 0.1, -0.08305084745762717, -0.13611111111111118, 0.041666666666666664, -0.03333333333333336, -0.0772727272727273, -0.0882352941176471, 0.08225806451612903, 0.16785714285714287, -0.067741935483871, -0.08750000000000005, 0.11499999999999999, 0.010000000000000002, 0.19545454545454546, 0.1108695652173913 };
		// Avalia��o de Pesos: Pessima
		//double[] w = new double[] { -0.05613207547169812, -0.1636363636363637, -0.02236842105263158, -0.13653846153846158, 0.051923076923076926, -0.16130136986301377, -0.05459183673469389, 0.09087301587301588, -0.059848484848484866, 0.27499999999999997, 0.0869047619047619, -0.06401098901098903, 0.04166666666666667, 0.042241379310344836, -0.13928571428571435, 0.12045454545454545, 0.31666666666666665, 0.09224137931034482, -0.16323529411764712, -0.029545454545454555, -0.16217948717948724, -0.06413043478260871, -0.04051724137931036, 0.043867924528301884, -0.15576923076923083, 0.3000000000000001, -0.06388888888888891, -0.06469072164948454, -0.15539215686274516, -0.051744186046511674, 0.15064102564102563, -0.06479591836734694, 0.035869565217391305, 0.08765822784810126, -0.05459183673469389, -0.06458333333333335, -0.06388888888888888, -0.14868421052631584, -0.16323529411764712, -0.012654320987654358, -0.06350574712643677, 0.03541666666666668, 0.1, 0.03992537313432836, -0.03245614035087719, -0.062179487179487195, 0.0857142857142857, 0.07763157894736841, 0.012500000000000011, -0.0840909090909091, -0.06337209302325589, -0.05961538461538462, -0.06050724637681162, -0.013372093023255816, -0.05775862068965517, -0.16413043478260878, -0.02236842105263158, 0.03833333333333334, -0.06111111111111111, 0.1422413793103448, -0.058606557377049194, -0.1517441860465117, -0.05912698412698415, -0.14469696969696974, -0.15459183673469393, -0.1583333333333334, -0.15539215686274516, -0.1596153846153847, 0.1472222222222222, -0.15648148148148153, -0.06007462686567168, -0.019444444444444445, -0.065, 0.06785714285714282, -0.012804878048780485, 0.09087301587301588, -0.03333333333333334, -0.09807692307692312, 0.9250000000000002, 0.04139344262295081, 0.0871951219512195, 0.04038461538461539, 0.06851851851851853, -0.0035714285714285796, -0.03796296296296297, -0.05613207547169812, -0.1623417721518988, -0.047972972972972976, 0.25833333333333347, 0.09194915254237288, -0.06469072164948456, -0.164795918367347, 0.06333333333333334, 0.06851851851851853, -0.011301369863013729, -0.011666666666666665, 0.0019230769230769232, 0.06847826086956521, 0.03662790697674419, 0.35833333333333334};
		// Avalia��o de Pesos: Otima
		double[] w = new double[] { -0.20372340425531915, 0.1583333333333333, 0.07272727272727272, -0.31424731182795695, 0.14999999999999997, -0.31499999999999995, -0.0621794871794872, 0.22631578947368425, -0.0105072463768116, 0.27564102564102566, 0.30833333333333374, -0.15613207547169833, 0.06041666666666667, 0.11282051282051281, -0.3057692307692308, 0.3035714285714286, 0.5520270270270272, 0.22222222222222224, -0.25416666666666665, 0.1878205128205128, -0.023076923076923092, -0.059375000000000004, -0.09469696969696986, 0.24999999999999997, -0.15648148148148155, 0.027027027027027042, 0.0378205128205128, 0.060869565217391314, -0.17500000000000013, -0.04807692307692318, 0.11612903225806451, 0.024390243902439032, 0.11666666666666668, 0.11265822784810128, -0.019444444444444473, -0.16401098901098907, -0.1972222222222223, -0.2535714285714286, -0.14642857142857152, 0.0634615384615384, -0.011111111111111155, 0.07500000000000001, 0.38333333333333325, 0.24038461538461542, 0.06408450704225352, -0.03611111111111115, 0.061111111111111116, 0.08333333333333336, -0.04999999999999998, -0.07500000000000004, 0.044230769230769185, -0.20681818181818185, 0.06886792452830184, 0.05441176470588235, -0.15775862068965535, -0.24166666666666672, -0.16469072164948473, -0.06130136986301373, 0.016666666666666663, 0.06075268817204301, -0.09166666666666681, -0.14736842105263165, 0.040151515151515105, -0.22500000000000012, -0.23500000000000007, -0.2327586206896551, -0.09558823529411772, -0.26617647058823535, 0.16162790697674423, -0.03765432098765438, -0.0882352941176471, -0.16295180722891583, 0.04999999999999992, -0.09736842105263169, 0.041666666666666595, 0.33970588235294125, -0.00887096774193552, -0.25372340425531903, -0.0864864864864865, 0.21388888888888888, 0.1663934426229508, 0.32272727272727275, 0.011627906976744179, 0.06111111111111109, 0.03563829787234041, -0.03653846153846156, -0.08409090909090913, -0.14375000000000016, 0.0749999999999999, 0.13690476190476192, -0.006481481481481477, -0.11401098901098913, 0.21666666666666654, 0.018867924528301896, 0.1482558139534883, 0.06234567901234564, 0.20357142857142857, -0.014690721649484609, 0.2055555555555556, 0.13851351351351354 };
		
		double wsoma = 0.0;
		for (int k = 0; k < vetorAmostra.length; k++) {
			wsoma += w[k] * vetorAmostra[k];
		}

		// Fun��o de verifica��o
		int x = funcaotransicao(wsoma);

		
		if (x == -1) {
			System.out.println("Amostra compativel com o padrao 2 (-1).");
		} else if (x == 1) {
			System.out.println("Amostra compativel com o padrao 1 (1).");
		}
	}

	private static int funcaotransicao(double wsoma) {
		return (wsoma >= 0.0) ? 1 : -1;
	}

}