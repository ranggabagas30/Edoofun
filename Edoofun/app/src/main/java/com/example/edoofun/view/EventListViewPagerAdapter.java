package com.example.edoofun.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import com.example.edoofun.R;
import com.example.edoofun.model.EventModel;

import java.util.ArrayList;

public class EventListViewPagerAdapter extends RecyclerView.Adapter<EventListViewPagerAdapter.ViewHolder> {

    private ArrayList<EventModel> events;
    private EventListAdapterListener eventListAdapterListener;

    public EventListViewPagerAdapter(ArrayList<EventModel> events, EventListAdapterListener eventListAdapterListener) {
        this.events = events;
        this.eventListAdapterListener = eventListAdapterListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater
                        .from(parent.getContext())
                        .inflate(R.layout.layout_event, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(events.get(position));
        holder.setOnDaftarClickListener(events.get(holder.getAdapterPosition()), eventListAdapterListener);
        holder.setOnViewDetailClickListener(events.get(holder.getAdapterPosition()), eventListAdapterListener);
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imagePoster;
        private TextView titlePoster;
        private TextView deskripsiPoster;
        private TextView datePoster;
        private TextView feePoster;
        private AppCompatButton btnDaftar;
        private AppCompatButton btnViewDetail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagePoster = itemView.findViewById(R.id.imagePoster);
            titlePoster = itemView.findViewById(R.id.titlePoster);
            deskripsiPoster = itemView.findViewById(R.id.deskripsiPoster);
            datePoster = itemView.findViewById(R.id.datePoster);
            feePoster = itemView.findViewById(R.id.feePoster);
            btnDaftar = itemView.findViewById(R.id.btnDaftar);
            btnViewDetail = itemView.findViewById(R.id.btnViewDetail);
        }

        public void bind(EventModel event) {
            imagePoster.setImageDrawable(imagePoster.getContext().getResources().getDrawable(event.getPosterImageResId()));
            titlePoster.setText(event.getTitle());
            deskripsiPoster.setText(event.getDescription());
            datePoster.setText(event.getDate());
            feePoster.setText(String.format("Biaya pendaftaran: %s", event.getFee()));
        }

        public void setOnDaftarClickListener(final EventModel event, final EventListAdapterListener eventListAdapterListener) {
            btnDaftar.setOnClickListener(v -> eventListAdapterListener.onDaftarClick(event));
        }

        public void setOnViewDetailClickListener(final EventModel event, final EventListAdapterListener eventListAdapterListener) {
            btnViewDetail.setOnClickListener(v -> eventListAdapterListener.onViewDetailClick(event));
        }
    }

    interface EventListAdapterListener {
        void onDaftarClick(EventModel event);
        void onViewDetailClick(EventModel event);
    }
}
