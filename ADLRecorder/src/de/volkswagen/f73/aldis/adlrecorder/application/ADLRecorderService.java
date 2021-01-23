package de.volkswagen.f73.aldis.adlrecorder.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import de.volkswagen.f73.aldis.adlrecorder.model.CarInformationEntity;

public class ADLRecorderService {

	private static CarInformationEntity car = new CarInformationEntity("Das Auto", 10, 100, 22);

	public static void main(String[] args) {
		while (true) {
			sendInformations();
			try {
				TimeUnit.MINUTES.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			CarSimulator.getCurrentValues(car);
		}
	}

	private static void sendInformations() {
		URL url;
		try {
			url = new URL("http://localhost:8080/post");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json; utf-8");
			con.setRequestProperty("Accept", "application/json");
			con.setDoOutput(true);
			System.out.println("Sende:");
			try (OutputStream os = con.getOutputStream()) {
				String json = car.getAsJson();
				System.out.println(json);
				byte[] input = json.getBytes("utf-8");
				os.write(input, 0, input.length);
			}
			System.out.println("Erhalte:");
			try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
				StringBuilder response = new StringBuilder();
				String responseLine = null;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}
				System.out.println(response.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
