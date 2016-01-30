import java.awt.image.BufferedImage;

public interface IImageFilter {
    public int processPixel(int i, int j, BufferedImage inputImage);
    public BufferedImage applyFilter(BufferedImage inputImage);
}
