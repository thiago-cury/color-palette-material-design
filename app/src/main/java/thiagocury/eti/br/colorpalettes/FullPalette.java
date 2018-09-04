package thiagocury.eti.br.colorpalettes;

import java.util.ArrayList;

public class FullPalette {

	private static ArrayList<Cor> red;
	private static int[] arrayCoresRed;
	private static ArrayList<Cor> pink;
	private static int[] arrayCoresPink;		
	private static ArrayList<Cor> purple;
	private static int[] arrayCoresPurple;
	private static ArrayList<Cor> deepPurple;
	private static int[] arrayCoresDeepPurple;
	private static ArrayList<Cor> indigo;
	private static int[] arrayCoresIndigo;	
	private static ArrayList<Cor> blue;
	private static int[] arrayCoresBlue;
	private static ArrayList<Cor> lightBlue;
	private static int[] arrayCoresLightBlue;
	private static ArrayList<Cor> cyan;
	private static int[] arrayCoresCyan;
	private static ArrayList<Cor> teal;
	private static int[] arrayCoresTeal;
	private static ArrayList<Cor> green;
	private static int[] arrayCoresGreen;
	private static ArrayList<Cor> lightGreen;
	private static int[] arrayCoresLightGreen;	
	private static ArrayList<Cor> lime;
	private static int[] arrayCoresLime;
	private static ArrayList<Cor> yellow;
	private static int[] arrayCoresYellow;
	private static ArrayList<Cor> amber;
	private static int[] arrayCoresAmber;	
	private static ArrayList<Cor> orange;
	private static int[] arrayCoresOrange;	
	private static ArrayList<Cor> deepOrange;
	private static int[] arrayCoresDeepOrange;
	private static ArrayList<Cor> brown;
	private static int[] arrayCoresBrown;	
	private static ArrayList<Cor> gray;
	private static int[] arrayCoresGray;	
	
	private static ArrayList<Cor> blueGray;
	private static int[] arrayCoresBlueGray;	

	//INICIO
	//RED METHODS
	public static ArrayList<Cor> getArrayListRed(){
		red = new ArrayList<Cor>();
		red.add(new Cor("50", "#FFEBEE"));
		red.add(new Cor("100", "#FFCDD2"));
		red.add(new Cor("200", "#EF9A9A"));
		red.add(new Cor("300", "#E57373"));
		red.add(new Cor("400", "#EF5350"));
		red.add(new Cor("500", "#F44336"));
		red.add(new Cor("600", "#E53935"));
		red.add(new Cor("700", "#D32F2F"));
		red.add(new Cor("800", "#C62828"));
		red.add(new Cor("900", "#B71C1C"));
		red.add(new Cor("A100", "#FF8A80"));
		red.add(new Cor("A200", "#FF5252"));
		red.add(new Cor("A400", "#FF1744"));
		red.add(new Cor("A700", "#D50000"));
		return red;
	}//fecha getRed
	
	public static int[] getArrayRed(){
		arrayCoresRed = new int[]{R.color.red50,R.color.red100,R.color.red200,
								  R.color.red300,R.color.red400,R.color.red500,
								  R.color.red600,R.color.red700,R.color.red800,
								  R.color.red900,R.color.redA100,R.color.redA200,
								  R.color.redA400,R.color.redA700};
		return arrayCoresRed;
	}//fecha getArrayRed
	//FIM RED METHODS
	
	//INICIO
	//PINK METHODS
	public static ArrayList<Cor> getArrayListPink(){
		pink = new ArrayList<Cor>();
		
		pink.add(new Cor("50","#fce4ec"));
		pink.add(new Cor("100","#f8bbd0"));
		pink.add(new Cor("200","#f48fb1"));
		pink.add(new Cor("300","#f06292"));
		pink.add(new Cor("400","#ec407a"));
		pink.add(new Cor("500","#e91e63"));
		pink.add(new Cor("600","#d81b60"));
		pink.add(new Cor("700","#c2185b"));
		pink.add(new Cor("800","#ad1457"));
		pink.add(new Cor("900","#880e4f"));
		pink.add(new Cor("A100","#ff80ab"));								
		pink.add(new Cor("A200","#ff4081"));
		pink.add(new Cor("A400","#f50057"));
		pink.add(new Cor("A700","#c51162"));
		
		return pink;
	}//fecha getRed
	
	public static int[] getArrayPink(){
		arrayCoresPink = new int[]{R.color.pink50,R.color.pink100,R.color.pink200,
								  R.color.pink300,R.color.pink400,R.color.pink500,
								  R.color.pink600,R.color.pink700,R.color.pink800,
								  R.color.pink900,R.color.pinkA100,R.color.pinkA200,
								  R.color.pinkA400,R.color.pinkA700};
		return arrayCoresPink;
	}//fecha getArrayRed
	//FIM PINK METHODS
	
	//INICIO
	//PURPLE METHODS
	public static ArrayList<Cor> getArrayListPurple(){
		purple = new ArrayList<Cor>();
		
		purple.add(new Cor("50", "#f3e5f5"));
		purple.add(new Cor("100", "#e1bee7"));
		purple.add(new Cor("200", "#ce93d8"));
		purple.add(new Cor("300", "#ba68c8"));
		purple.add(new Cor("400", "#ab47bc"));
		purple.add(new Cor("500", "#9c27b0"));
		purple.add(new Cor("600", "#8e24aa"));
		purple.add(new Cor("700", "#7b1fa2"));
		purple.add(new Cor("800", "#6a1b9a"));
		purple.add(new Cor("900", "#4a148c"));
		purple.add(new Cor("A100", "#ea80fc"));
		purple.add(new Cor("A200", "#e040fb"));
		purple.add(new Cor("A400", "#d500f9"));
		purple.add(new Cor("A700", "#aa00ff"));
		
		return purple;
	}//fecha getPurple
	
	public static int[] getArrayPurple(){
		arrayCoresPurple = new int[]{R.color.purple50,R.color.purple100,R.color.purple200,
								  R.color.purple300,R.color.purple400,R.color.purple500,
								  R.color.purple600,R.color.purple700,R.color.purple800,
								  R.color.purple900,R.color.purpleA100,R.color.purpleA200,
								  R.color.purpleA400,R.color.purpleA700};
		return arrayCoresPurple;
	}//fecha getArrayPurple
	//FIM PURPLE METHODS	
	
	//INICIO
	//DEEP PURPLE METHODS
	public static ArrayList<Cor> getArrayListDeepPurple(){
		deepPurple = new ArrayList<Cor>();
		deepPurple.add(new Cor("50", "#ede7f6"));
		deepPurple.add(new Cor("100", "#d1c4e9"));
		deepPurple.add(new Cor("200", "#b39ddb"));
		deepPurple.add(new Cor("300", "#9575cd"));
		deepPurple.add(new Cor("400", "#7e57c2"));
		deepPurple.add(new Cor("500", "#673ab7"));
		deepPurple.add(new Cor("600", "#5e35b1"));
		deepPurple.add(new Cor("700", "#512da8"));
		deepPurple.add(new Cor("800", "#4527a0"));
		deepPurple.add(new Cor("900", "#311b92"));
		deepPurple.add(new Cor("A100", "#b388ff"));
		deepPurple.add(new Cor("A200", "#7c4dff"));
		deepPurple.add(new Cor("A400", "#651fff"));
		deepPurple.add(new Cor("A700", "#6200ea"));	

		return deepPurple;
	}//fecha getDeepPurple
	
	public static int[] getArrayDeepPurple(){
		arrayCoresDeepPurple = new int[]{R.color.deepPurple50,R.color.deepPurple100,R.color.deepPurple200,
								  R.color.deepPurple300,R.color.deepPurple400,R.color.deepPurple500,
								  R.color.deepPurple600,R.color.deepPurple700,R.color.deepPurple800,
								  R.color.deepPurple900,R.color.deepPurpleA100,R.color.deepPurpleA200,
								  R.color.deepPurpleA400,R.color.deepPurpleA700};
		return arrayCoresDeepPurple;
	}//fecha getArrayDeepPurple
	//FIM DEEPPURPLE METHODS	

	//INICIO
	//INDIGO METHODS
	public static ArrayList<Cor> getArrayListIndigo(){
		indigo = new ArrayList<Cor>();
		
		indigo.add(new Cor("50", "#e8eaf6"));
		indigo.add(new Cor("100", "#c5cae9"));
		indigo.add(new Cor("200", "#9fa8da"));
		indigo.add(new Cor("300", "#7986cb"));
		indigo.add(new Cor("400", "#5c6bc0"));
		indigo.add(new Cor("500", "#3f51b5"));
		indigo.add(new Cor("600", "#3949ab"));
		indigo.add(new Cor("700", "#303f9f"));
		indigo.add(new Cor("800", "#283593"));
		indigo.add(new Cor("900", "#1a237e"));
		indigo.add(new Cor("A100", "#8c9eff"));
		indigo.add(new Cor("A200", "#536dfe"));
		indigo.add(new Cor("A400", "#3d5afe"));
		indigo.add(new Cor("A700", "#304ffe"));
		
		return indigo;
	}//fecha getIndigo
	
	public static int[] getArrayIndigo(){
		arrayCoresIndigo = new int[]{R.color.indigo50,R.color.indigo100,R.color.indigo200,
								  R.color.indigo300,R.color.indigo400,R.color.indigo500,
								  R.color.indigo600,R.color.indigo700,R.color.indigo800,
								  R.color.indigo900,R.color.indigoA100,R.color.indigoA200,
								  R.color.indigoA400,R.color.indigoA700};
		return arrayCoresIndigo;
	}//fecha getArrayIndigo
	//FIM INDIGO METHODS	

	//INICIO
	//BLUE METHODS
	public static ArrayList<Cor> getArrayListBlue(){
		blue = new ArrayList<Cor>();
		
		blue.add(new Cor("50", "#e3f2fd"));
		blue.add(new Cor("100", "#bbdefb"));
		blue.add(new Cor("200", "#90caf9"));
		blue.add(new Cor("300", "#64b5f6"));
		blue.add(new Cor("400", "#42a5f5"));
		blue.add(new Cor("500", "#2196f3"));
		blue.add(new Cor("600", "#1e88e5"));
		blue.add(new Cor("700", "#1976d2"));
		blue.add(new Cor("800", "#1565c0"));
		blue.add(new Cor("900", "#0d47a1"));
		blue.add(new Cor("A100", "#82b1ff"));
		blue.add(new Cor("A200", "#448aff"));
		blue.add(new Cor("A400", "#2979ff"));
		blue.add(new Cor("A700", "#2962ff"));				
		return blue;
	}//fecha getBlue
	
	public static int[] getArrayBlue(){
		arrayCoresBlue = new int[]{R.color.blue50,R.color.blue100,R.color.blue200,
								  R.color.blue300,R.color.blue400,R.color.blue500,
								  R.color.blue600,R.color.blue700,R.color.blue800,
								  R.color.blue900,R.color.blueA100,R.color.blueA200,
								  R.color.blueA400,R.color.blueA700};
		return arrayCoresBlue;
	}//fecha getArrayBlue
	//FIM BLUE METHODS	
	
	//INICIO
	//LIGHTBLUE METHODS
	public static ArrayList<Cor> getArrayListLightBlue(){
		
		lightBlue = new ArrayList<Cor>();
		
		lightBlue.add(new Cor("50", "#e1f5fe"));
		lightBlue.add(new Cor("100", "#b3e5fc"));
		lightBlue.add(new Cor("200", "#81d4fa"));
		lightBlue.add(new Cor("300", "#4fc3f7"));
		lightBlue.add(new Cor("400", "#29b6f6"));
		lightBlue.add(new Cor("500", "#03a9f4"));
		lightBlue.add(new Cor("600", "#039be5"));	
		lightBlue.add(new Cor("700", "#0288d1"));
		lightBlue.add(new Cor("800", "#0277bd"));
		lightBlue.add(new Cor("900", "#01579b"));
		lightBlue.add(new Cor("A100", "#80d8ff"));
		lightBlue.add(new Cor("A200", "#40c4ff"));
		lightBlue.add(new Cor("A400", "#00b0ff"));
		lightBlue.add(new Cor("A700", "#0091ea"));

	return lightBlue;
	}//fecha getLightBlue
	
	public static int[] getArrayLightBlue(){
		arrayCoresLightBlue = new int[]{R.color.lightBlue50,R.color.lightBlue100,R.color.lightBlue200,
								  R.color.lightBlue300,R.color.lightBlue400,R.color.lightBlue500,
								  R.color.lightBlue600,R.color.lightBlue700,R.color.lightBlue800,
								  R.color.lightBlue900,R.color.lightBlueA100,R.color.lightBlueA200,
								  R.color.lightBlueA400,R.color.lightBlueA700};
		return arrayCoresLightBlue;
	}//fecha getArrayLightBlue
	//FIM LIGHTBLUE METHODS	
	
	//INICIO
	//CYAN METHODS
	public static ArrayList<Cor> getArrayListCyan(){
		cyan = new ArrayList<Cor>();
		
		cyan.add(new Cor("50", "#e0f7fa"));
		cyan.add(new Cor("100", "#b2ebf2"));
		cyan.add(new Cor("200", "#80deea"));
		cyan.add(new Cor("300", "#4dd0e1"));
		cyan.add(new Cor("400", "#26c6da"));
		cyan.add(new Cor("500", "#00bcd4"));
		cyan.add(new Cor("600", "#00acc1"));
		cyan.add(new Cor("700", "#0097a7"));
		cyan.add(new Cor("800", "#00838f"));
		cyan.add(new Cor("900", "#006064"));
		cyan.add(new Cor("A100", "#84ffff"));
		cyan.add(new Cor("A200", "#18ffff"));
		cyan.add(new Cor("A400", "#00e5ff"));		
		cyan.add(new Cor("A700", "#00b8d4"));		
	return cyan;
	}//fecha getCyan
	
	public static int[] getArrayCyan(){
		arrayCoresCyan = new int[]{R.color.cyan50,R.color.cyan100,R.color.cyan200,
								  R.color.cyan300,R.color.cyan400,R.color.cyan500,
								  R.color.cyan600,R.color.cyan700,R.color.cyan800,
								  R.color.cyan900,R.color.cyanA100,R.color.cyanA200,
								  R.color.cyanA400,R.color.cyanA700};
		return arrayCoresCyan;
	}//fecha getArrayCyan
	//FIM CYAN METHODS	

	//INICIO
	//TEAL METHODS
	public static ArrayList<Cor> getArrayListTeal(){
		teal = new ArrayList<Cor>();
		
		teal.add(new Cor("50", "#e0f2f1"));
		teal.add(new Cor("100", "#b2dfdb"));
		teal.add(new Cor("200", "#80cbc4"));
		teal.add(new Cor("300", "#4db6ac"));
		teal.add(new Cor("400", "#26a69a"));
		teal.add(new Cor("500", "#009688"));
		teal.add(new Cor("600", "#00897b"));
		teal.add(new Cor("700", "#00796b"));
		teal.add(new Cor("800", "#00695c"));
		teal.add(new Cor("900", "#004d40"));
		teal.add(new Cor("A100", "#a7ffeb"));
		teal.add(new Cor("A200", "#64ffda"));
		teal.add(new Cor("A400", "#1de9b6"));
		teal.add(new Cor("A700", "#00bfa5"));		
	return teal;
	}//fecha getTeal
	
	public static int[] getArrayTeal(){
		arrayCoresTeal = new int[]{R.color.teal50,R.color.teal100,R.color.teal200,
								  R.color.teal300,R.color.teal400,R.color.teal500,
								  R.color.teal600,R.color.teal700,R.color.teal800,
								  R.color.teal900,R.color.tealA100,R.color.tealA200,
								  R.color.tealA400,R.color.tealA700};
		return arrayCoresTeal;
	}//fecha getArrayTeal
	//FIM Teal METHODS	
	
	//INICIO
	//GREEN METHODS
	public static ArrayList<Cor> getArrayListGreen(){
		green = new ArrayList<Cor>();
		
		green.add(new Cor("50", "#e8f5e9"));
		green.add(new Cor("100", "#c8e6c9"));
		green.add(new Cor("200", "#a5d6a7"));		
		green.add(new Cor("300", "#81c784"));
		green.add(new Cor("400", "#66bb6a"));
		green.add(new Cor("500", "#4caf50"));
		green.add(new Cor("600", "#43a047"));
		green.add(new Cor("700", "#388e3c"));
		green.add(new Cor("800", "#2e7d32"));
		green.add(new Cor("900", "#1b5e20"));
		green.add(new Cor("A100", "#b9f6ca"));
		green.add(new Cor("A200", "#69f0ae"));
		green.add(new Cor("A400", "#00e676"));
		green.add(new Cor("A700", "#00c853"));		
	return green;
	}//fecha getGreen
	
	public static int[] getArrayGreen(){
		arrayCoresGreen = new int[]{R.color.green50,R.color.green100,R.color.green200,
								  R.color.green300,R.color.green400,R.color.green500,
								  R.color.green600,R.color.green700,R.color.green800,
								  R.color.green900,R.color.greenA100,R.color.greenA200,
								  R.color.greenA400,R.color.greenA700};
		return arrayCoresGreen;
	}//fecha getArrayGreen
	//FIM GREEN METHODS	
	
	//INICIO
	//LIGHTGREEN METHODS
	public static ArrayList<Cor> getArrayListLightGreen(){
		lightGreen = new ArrayList<Cor>();
		
		lightGreen.add(new Cor("50", "#f1f8e9"));
		lightGreen.add(new Cor("100", "#dcedc8"));
		lightGreen.add(new Cor("200", "#c5e1a5"));
		lightGreen.add(new Cor("300", "#aed581"));
		lightGreen.add(new Cor("400", "#9ccc65"));
		lightGreen.add(new Cor("500", "#8bc34a"));
		lightGreen.add(new Cor("600", "#7cb342"));
		lightGreen.add(new Cor("700", "#689f38"));
		lightGreen.add(new Cor("800", "#558b2f"));
		lightGreen.add(new Cor("900", "#33691e"));
		lightGreen.add(new Cor("A100", "#ccff90"));
		lightGreen.add(new Cor("A200", "#b2ff59"));
		lightGreen.add(new Cor("A400", "#76ff03"));
		lightGreen.add(new Cor("A700", "#64dd17"));		
	return lightGreen;
	}//fecha getLightGreen
	
	public static int[] getArrayLightGreen(){
		arrayCoresLightGreen = new int[]{R.color.lightGreen50,R.color.lightGreen100,R.color.lightGreen200,
								  R.color.lightGreen300,R.color.lightGreen400,R.color.lightGreen500,
								  R.color.lightGreen600,R.color.lightGreen700,R.color.lightGreen800,
								  R.color.lightGreen900,R.color.lightGreenA100,R.color.lightGreenA200,
								  R.color.lightGreenA400,R.color.lightGreenA700};
		return arrayCoresLightGreen;
	}//fecha getArrayLightGreen
	//FIM LIGHTGREEN METHODS
	
	//INICIO
	//LIME METHODS
	public static ArrayList<Cor> getArrayListLime(){
		lime = new ArrayList<Cor>();
		
		lime.add(new Cor("50", "#f9fbe7"));
		lime.add(new Cor("100", "#f0f4c3"));
		lime.add(new Cor("200", "#e6ee9c"));
		lime.add(new Cor("300", "#dce775"));
		lime.add(new Cor("400", "#d4e157"));
		lime.add(new Cor("500", "#cddc39"));
		lime.add(new Cor("600", "#c0ca33"));
		lime.add(new Cor("700", "#afb42b"));
		lime.add(new Cor("800", "#9e9d24"));
		lime.add(new Cor("900", "#827717"));
		lime.add(new Cor("A100", "#f4ff81"));
		lime.add(new Cor("A200", "#eeff41"));
		lime.add(new Cor("A400", "#c6ff00"));
		lime.add(new Cor("A700", "#aeea00"));
	return lime;
	}//fecha getLime
	
	public static int[] getArrayLime(){
		arrayCoresLime= new int[]{R.color.lime50,R.color.lime100,R.color.lime200,
								  R.color.lime300,R.color.lime400,R.color.lime500,
								  R.color.lime600,R.color.lime700,R.color.lime800,
								  R.color.lime900,R.color.limeA100,R.color.limeA200,
								  R.color.limeA400,R.color.limeA700};
		return arrayCoresLime;
	}//fecha getArrayLime
	//FIM LIME METHODS	
		
	//INICIO
	//YELLOW METHODS
	public static ArrayList<Cor> getArrayListYellow(){
		yellow = new ArrayList<Cor>();
		
		yellow.add(new Cor("50", "#fffde7"));
		yellow.add(new Cor("100", "#fff9c4"));
		yellow.add(new Cor("200", "#fff59d"));
		yellow.add(new Cor("300", "#fff176"));
		yellow.add(new Cor("400", "#ffee58"));
		yellow.add(new Cor("500", "#ffeb3b"));
		yellow.add(new Cor("600", "#fdd835"));
		yellow.add(new Cor("700", "#fbc02d"));
		yellow.add(new Cor("800", "#f9a825"));
		yellow.add(new Cor("900", "#f57f17"));
		yellow.add(new Cor("A100", "#ffff8d"));
		yellow.add(new Cor("A200", "#ffff00"));
		yellow.add(new Cor("A400", "#ffea00"));
		yellow.add(new Cor("A700", "#ffd600"));
	return yellow;
	}//fecha getYellow
	
	public static int[] getArrayYellow(){
		arrayCoresYellow = new int[]{R.color.yellow50,R.color.yellow100,R.color.yellow200,
								  R.color.yellow300,R.color.yellow400,R.color.yellow500,
								  R.color.yellow600,R.color.yellow700,R.color.yellow800,
								  R.color.yellow900,R.color.yellowA100,R.color.yellowA200,
								  R.color.yellowA400,R.color.yellowA700};
		return arrayCoresYellow;
	}//fecha getArrayYellow
	//FIM YELLOW METHODS
		
	//INICIO
	//AMBER METHODS
	public static ArrayList<Cor> getArrayListAmber(){
		amber = new ArrayList<Cor>();
		
		amber.add(new Cor("50", "#fff8e1"));
		amber.add(new Cor("100", "#ffecb3"));
		amber.add(new Cor("200", "#ffe082"));
		amber.add(new Cor("300", "#ffd54f"));
		amber.add(new Cor("400", "#ffca28"));
		amber.add(new Cor("500", "#ffc107"));
		amber.add(new Cor("600", "#ffb300"));
		amber.add(new Cor("700", "#ffa000"));
		amber.add(new Cor("800", "#ff8f00"));
		amber.add(new Cor("900", "#ff6f00"));
		amber.add(new Cor("A100", "#ffe57f"));
		amber.add(new Cor("A200", "#ffd740"));
		amber.add(new Cor("A400", "#ffc400"));
		amber.add(new Cor("A700", "#ffab00"));
	return amber;
	}//fecha getAmber
	
	public static int[] getArrayAmber(){
		arrayCoresAmber = new int[]{R.color.amber50,R.color.amber100,R.color.amber200,
								  R.color.amber300,R.color.amber400,R.color.amber500,
								  R.color.amber600,R.color.amber700,R.color.amber800,
								  R.color.amber900,R.color.amberA100,R.color.amberA200,
								  R.color.amberA400,R.color.amberA700};
		return arrayCoresAmber;
	}//fecha getArrayAmber
	//FIM AMBER METHODS	

	//INICIO
	//ORANGE METHODS
	public static ArrayList<Cor> getArrayListOrange(){
		orange = new ArrayList<Cor>();
		
		orange.add(new Cor("50", "#fff3e0"));
		orange.add(new Cor("100", "#ffe0b2"));
		orange.add(new Cor("200", "#ffcc80"));
		orange.add(new Cor("300", "#ffb74d"));
		orange.add(new Cor("400", "#ffa726"));
		orange.add(new Cor("500", "#ff9800"));
		orange.add(new Cor("600", "#fb8c00"));
		orange.add(new Cor("700", "#f57c00"));
		orange.add(new Cor("800", "#ef6c00"));
		orange.add(new Cor("900", "#e65100"));
		orange.add(new Cor("A100", "#ffd180"));
		orange.add(new Cor("A200", "#ffab40"));
		orange.add(new Cor("A400", "#ff9100"));
		orange.add(new Cor("A700", "#ff6d00"));
	return orange;
	}//fecha getOrange
	
	public static int[] getArrayOrange(){
		arrayCoresOrange = new int[]{R.color.orange50,R.color.orange100,R.color.orange200,
								  R.color.orange300,R.color.orange400,R.color.orange500,
								  R.color.orange600,R.color.orange700,R.color.orange800,
								  R.color.orange900,R.color.orangeA100,R.color.orangeA200,
								  R.color.orangeA400,R.color.orangeA700};
		return arrayCoresOrange;
	}//fecha getArrayOrange
	//FIM ORANGE METHODS	
		
	//INICIO
	//DEEPORANGE METHODS
	public static ArrayList<Cor> getArrayListDeepOrange(){
		deepOrange = new ArrayList<Cor>();
		
		deepOrange.add(new Cor("50", "#fbe9e7"));
		deepOrange.add(new Cor("100", "#ffccbc"));
		deepOrange.add(new Cor("200", "#ffab91"));
		deepOrange.add(new Cor("300", "#ff8a65"));
		deepOrange.add(new Cor("400", "#ff7043"));
		deepOrange.add(new Cor("500", "#ff5722"));
		deepOrange.add(new Cor("600", "#f4511e"));
		deepOrange.add(new Cor("700", "#e64a19"));
		deepOrange.add(new Cor("800", "#d84315"));
		deepOrange.add(new Cor("900", "#bf360c"));
		deepOrange.add(new Cor("A100", "#ff9e80"));
		deepOrange.add(new Cor("A200", "#ff6e40"));
		deepOrange.add(new Cor("A400", "#ff3d00"));
		deepOrange.add(new Cor("A700", "#dd2c00"));
	return deepOrange;
	}//fecha getDeepOrange
	
	public static int[] getArrayDeepOrange(){
		arrayCoresDeepOrange = new int[]{R.color.deepOrange50,R.color.deepOrange100,R.color.deepOrange200,
								  R.color.deepOrange300,R.color.deepOrange400,R.color.deepOrange500,
								  R.color.deepOrange600,R.color.deepOrange700,R.color.deepOrange800,
								  R.color.deepOrange900,R.color.deepOrangeA100,R.color.deepOrangeA200,
								  R.color.deepOrangeA400,R.color.deepOrangeA700};
		return arrayCoresDeepOrange;
	}//fecha getArrayDeepOrange
	//FIM DEEPORANGE METHODS

	//INICIO
	//BROWN METHODS
	public static ArrayList<Cor> getArrayListBrown(){
		brown = new ArrayList<Cor>();
		
		brown.add(new Cor("50", "#efebe9"));
		brown.add(new Cor("100", "#d7ccc8"));
		brown.add(new Cor("200", "#bcaaa4"));
		brown.add(new Cor("300", "#a1887f"));
		brown.add(new Cor("400", "#8d6e63"));
		brown.add(new Cor("500", "#795548"));
		brown.add(new Cor("600", "#6d4c41"));
		brown.add(new Cor("700", "#5d4037"));
		brown.add(new Cor("800", "#4e342e"));
		brown.add(new Cor("900", "#3e2723"));
	return brown;
	}//fecha getBrown
	
	public static int[] getArrayBrown(){
		arrayCoresBrown = new int[]{R.color.brown50,R.color.brown100,R.color.brown200,
								  R.color.brown300,R.color.brown400,R.color.brown500,
								  R.color.brown600,R.color.brown700,R.color.brown800,
								  R.color.brown900};
		return arrayCoresBrown;
	}//fecha getArrayBrown
	//FIM BROWN METHODS	

	//INICIO
	//GRAY METHODS
	public static ArrayList<Cor> getArrayListGray(){
		gray = new ArrayList<Cor>();
		
		gray.add(new Cor("50", "#fafafa"));
		gray.add(new Cor("100", "#f5f5f5"));
		gray.add(new Cor("200", "#eeeeee"));
		gray.add(new Cor("300", "#e0e0e0"));
		gray.add(new Cor("400", "#bdbdbd"));
		gray.add(new Cor("500", "#9e9e9e"));
		gray.add(new Cor("600", "#757575"));
		gray.add(new Cor("700", "#616161"));
		gray.add(new Cor("800", "#424242"));
		gray.add(new Cor("900", "#212121"));
	return gray;
	}//fecha getGray
	
	public static int[] getArrayGray(){
		arrayCoresGray = new int[]{R.color.gray50,R.color.gray100,R.color.gray200,
								  R.color.gray300,R.color.gray400,R.color.gray500,
								  R.color.gray600,R.color.gray700,R.color.gray800,
								  R.color.gray900};
		return arrayCoresGray;
	}//fecha getArrayGray
	//FIM GRAY METHODS	

	//INICIO
	//BLUE GRAY METHODS
	public static ArrayList<Cor> getArrayListBlueGray(){
		blueGray = new ArrayList<Cor>();
		
		blueGray.add(new Cor("50", "#eceff1"));
		blueGray.add(new Cor("100", "#cfd8dc"));
		blueGray.add(new Cor("200", "#b0bec5"));
		blueGray.add(new Cor("300", "#90a4ae"));
		blueGray.add(new Cor("400", "#78909c"));
		blueGray.add(new Cor("500", "#607d8b"));
		blueGray.add(new Cor("600", "#546e7a"));
		blueGray.add(new Cor("700", "#455a64"));
		blueGray.add(new Cor("800", "#37474f"));
		blueGray.add(new Cor("900", "#263238"));
	return blueGray;
	}//fecha getBlueGray
		
	public static int[] getArrayBlueGray(){
		arrayCoresBlueGray = new int[]{R.color.blueGray50,R.color.blueGray100,R.color.blueGray200,
								  R.color.blueGray300,R.color.blueGray400,R.color.blueGray500,
								  R.color.blueGray600,R.color.blueGray700,R.color.blueGray800,
								  R.color.blueGray900};
		return arrayCoresBlueGray;
	}//fecha getArrayBlueGray
	//FIM BLUEGRAY METHODS	
}//fecha classe
