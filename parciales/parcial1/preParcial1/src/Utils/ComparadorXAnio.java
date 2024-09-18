package Utils;

import Models.Material;

import java.util.Comparator;

public class ComparadorXAnio implements Comparator<Material> {
    @Override
    public int compare(Material m1, Material m2) {
        return m1.getAnio().compareTo(m2.getAnio());
    }
}
