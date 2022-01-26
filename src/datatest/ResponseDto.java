package datatest;

class AirportItem {
}

class FlightItem {
}

class ResponseBox<T> {
    T data;

    public ResponseBox(T data) {
        this.data = data;
    }
}

public class ResponseDto {
    public static void main(String[] args) {
        ResponseBox<AirportItem> rb1 = new ResponseBox<AirportItem>(new AirportItem());

    }
}
