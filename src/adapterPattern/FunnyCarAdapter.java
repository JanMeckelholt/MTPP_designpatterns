package adapterPattern;

public class FunnyCarAdapter extends Auto {
    FunnyCar funnyCar = new FunnyCar();
    public FunnyCarAdapter() {
    }

    @Override
    public void drive() {
        funnyCar.glide();
    }

    @Override
    public void parkIn(String parkingPlace) {
        funnyCar.parkIn(parkingPlace);
    }
}
