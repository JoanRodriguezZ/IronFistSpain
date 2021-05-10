package com.renegade.ironfistspain;

import android.app.TimePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.dpro.widgets.WeekdaysPicker;
import com.renegade.ironfistspain.databinding.FragmentCrearRetoBinding;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CrearRetoFragment extends BaseFragment {
    int hora1 = 0;
    int minutos1 = 0;
    private FragmentCrearRetoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentCrearRetoBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);



        WeekdaysPicker weekdaysPicker = binding.weekdays;
        weekdaysPicker.setOnWeekdaysChangeListener((view1, clickedDayOfWeek, selectedDays) -> {

        });

        binding.botonHora1.setOnClickListener(v -> {
            TimePickerDialog timePickerDialog = new TimePickerDialog(
                    getContext(),
                    android.R.style.Theme_Black,
                    (view1, hourOfDay, minute) -> {
                        hora1 = hourOfDay;
                        minutos1 = minute;
                        String tiempo = hora1 + ":" + minutos1;
                        SimpleDateFormat f24horas = new SimpleDateFormat(
                                "HH:mm"
                        );
                        try {
                            Date date = f24horas.parse(tiempo);
                            binding.botonHora1.setText(f24horas.format(date));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    },12,0,true
            );
            timePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));

            timePickerDialog.show();
        });

        binding.enviarRetoButton.setOnClickListener(v ->
                navController.navigate(R.id.action_crearRetoFragment_to_inicioFragment));

        binding.enviarRetoButton.setOnClickListener(v ->
                Toast.makeText(getActivity(), "¡Se ha enviado el reto correctamente!", Toast.LENGTH_SHORT).show());

    }
}