package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import defpackage.AbstractC5971pd2;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC5971pd2 abstractC5971pd2) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.a;
        if (abstractC5971pd2.h(1)) {
            i = abstractC5971pd2.i();
        }
        iconCompat.a = i;
        byte[] bArrF = iconCompat.c;
        if (abstractC5971pd2.h(2)) {
            bArrF = abstractC5971pd2.f();
        }
        iconCompat.c = bArrF;
        Parcelable parcelableJ = iconCompat.d;
        if (abstractC5971pd2.h(3)) {
            parcelableJ = abstractC5971pd2.j();
        }
        iconCompat.d = parcelableJ;
        int i2 = iconCompat.e;
        if (abstractC5971pd2.h(4)) {
            i2 = abstractC5971pd2.i();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f;
        if (abstractC5971pd2.h(5)) {
            i3 = abstractC5971pd2.i();
        }
        iconCompat.f = i3;
        Parcelable parcelableJ2 = iconCompat.g;
        if (abstractC5971pd2.h(6)) {
            parcelableJ2 = abstractC5971pd2.j();
        }
        iconCompat.g = (ColorStateList) parcelableJ2;
        String strK = iconCompat.i;
        if (abstractC5971pd2.h(7)) {
            strK = abstractC5971pd2.k();
        }
        iconCompat.i = strK;
        String strK2 = iconCompat.j;
        if (abstractC5971pd2.h(8)) {
            strK2 = abstractC5971pd2.k();
        }
        iconCompat.j = strK2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr = iconCompat.c;
                iconCompat.b = bArr;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC5971pd2 abstractC5971pd2) {
        abstractC5971pd2.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            abstractC5971pd2.m(1);
            abstractC5971pd2.q(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            abstractC5971pd2.m(2);
            abstractC5971pd2.o(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            abstractC5971pd2.m(3);
            abstractC5971pd2.r(parcelable);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            abstractC5971pd2.m(4);
            abstractC5971pd2.q(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            abstractC5971pd2.m(5);
            abstractC5971pd2.q(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            abstractC5971pd2.m(6);
            abstractC5971pd2.r(colorStateList);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC5971pd2.m(7);
            abstractC5971pd2.s(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            abstractC5971pd2.m(8);
            abstractC5971pd2.s(str2);
        }
    }
}
