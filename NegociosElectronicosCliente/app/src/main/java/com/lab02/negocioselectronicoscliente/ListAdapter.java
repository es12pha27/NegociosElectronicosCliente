package com.lab02.negocioselectronicoscliente;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> mData;
    private LayoutInflater mInflanter;
    private Context context;

    public ListAdapter(List<ListElement> itemList, Context context){
        this.mInflanter=LayoutInflater.from(context);
        this.context=context;
        this.mData=itemList;
    }
    @Override
    public int getItemCount(){
        return mData.size();
    }
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
    View view=mInflanter.inflate(R.layout.list_element,null);
    return new ListAdapter.ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position){
    holder.bindData(mData.get(position));

    }
    public void setItems(List<ListElement> Items){
        mData=Items;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView codigoV,nombreV,estadoV;
        ViewHolder(View itemView){
            super(itemView);
            codigoV=itemView.findViewById((R.id.codigo));
            nombreV=itemView.findViewById((R.id.nombre));
            estadoV=itemView.findViewById((R.id.estadoregistro));
        }
        void bindData(final ListElement item){
            codigoV.setText(item.getCodigo());
            nombreV.setText(item.getNombre());
            estadoV.setText(item.getEstado());
        }
    }
}
