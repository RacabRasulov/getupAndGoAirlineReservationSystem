package com.example.getupandgoairlinereservationsystem.service;

import com.example.getupandgoairlinereservationsystem.entity.PortsEntity;
import com.example.getupandgoairlinereservationsystem.repository.PortRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Builder
public class PortService {

    public final PortRepository repository;

    @Scheduled(fixedRate = 50000)
    public void addData() throws IOException {

        repository.deleteAll();

        List<PortsEntity> entities = new ArrayList<>();

        Document doc = (Document) Jsoup.connect("https://butaairways.az/az/").get();
        var airportsListElements = doc.select("#list_airports_from");
        var airportsListChildElements = airportsListElements.select("li");
        var airportsAList = airportsListChildElements.select("a");
        for (var elem : airportsAList) {
            var airportDataValue = elem.attr("data-value");
            var airportDataName = elem.attr("data-name");

            PortsEntity entity = new PortsEntity();

            entity.setAirportName(airportDataName);
            entity.setAirportValue(airportDataValue);
            entities.add(entity);

        }

        repository.saveAll(entities);
    }

}
