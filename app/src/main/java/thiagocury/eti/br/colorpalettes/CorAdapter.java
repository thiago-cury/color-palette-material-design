package thiagocury.eti.br.colorpalettes;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CorAdapter extends ArrayAdapter<Cor>{

	private Context context;
	private ArrayList<Cor> cores = null;
	private int[] coresArray;
	
	public CorAdapter(Context context, ArrayList<Cor> cores, int[] coresArray) {
		super(context, 0, cores);
		this.cores = cores;
		this.context = context;
		this.coresArray = coresArray;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		Cor c = cores.get(position);

		if(convertView == null){
			convertView = LayoutInflater.from(context).inflate(R.layout.lista_cores, null);
		}
		
		TextView tvIdCor = (TextView) convertView.findViewById(R.id.lista_cores_tvIdCor);
		tvIdCor.setText(String.valueOf(c.getIdCor()));
		
		TextView tvHexaCor = (TextView) convertView.findViewById(R.id.lista_cores_tvIdHexaCor);
		tvHexaCor.setText(String.valueOf(c.getIdHexaCor()));
		
		LinearLayout linearCor = (LinearLayout) convertView.findViewById(R.id.lista_cores_linearCor);
		linearCor.setBackgroundColor(convertView.getResources().getColor(coresArray[position]));
		
		//linearCor.setBackgroundColor(convertView.getResources().getColor(R.color.red500));
		//linearCor.setBackgroundColor(convertView.getResources().getColor(Integer.decode("0xAA0F245C")));		
		//linearCor.setBackgroundColor(convertView.getResources().getColor(Integer.decode(cores.get(position).getIdHexaCor())));
		//linearCor.setBackgroundColor(Integer.decode(cores.get(position).getIdHexaCor()));
		//linearCor.setDrawingCacheBackgroundColor(Long.parseLong(cores.get(position).getIdHexaCor(), 16));
		
		return convertView;
	}
}//fecha classe
