package defpackage;

import android.widget.ImageView;

/* JADX INFO: renamed from: g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3896g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DS.values().length];
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 3;
        iArr[3] = 4;
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        a = iArr2;
        iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
        iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
        iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
    }
}
