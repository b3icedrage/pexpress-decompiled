package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7682xl1 {
    public static final EnumC7682xl1 d;
    public static final /* synthetic */ EnumC7682xl1[] e;

    static {
        EnumC7682xl1 enumC7682xl1 = new EnumC7682xl1("DEFAULT", 0);
        d = enumC7682xl1;
        EnumC7682xl1 enumC7682xl2 = new EnumC7682xl1("UNMETERED_ONLY", 1);
        EnumC7682xl1 enumC7682xl3 = new EnumC7682xl1("UNMETERED_OR_DAILY", 2);
        EnumC7682xl1 enumC7682xl4 = new EnumC7682xl1("FAST_IF_RADIO_AWAKE", 3);
        EnumC7682xl1 enumC7682xl5 = new EnumC7682xl1("NEVER", 4);
        EnumC7682xl1 enumC7682xl6 = new EnumC7682xl1("UNRECOGNIZED", 5);
        e = new EnumC7682xl1[]{enumC7682xl1, enumC7682xl2, enumC7682xl3, enumC7682xl4, enumC7682xl5, enumC7682xl6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC7682xl1);
        sparseArray.put(1, enumC7682xl2);
        sparseArray.put(2, enumC7682xl3);
        sparseArray.put(3, enumC7682xl4);
        sparseArray.put(4, enumC7682xl5);
        sparseArray.put(-1, enumC7682xl6);
    }

    public EnumC7682xl1() {
        throw null;
    }

    public static EnumC7682xl1 valueOf(String str) {
        return (EnumC7682xl1) Enum.valueOf(EnumC7682xl1.class, str);
    }

    public static EnumC7682xl1[] values() {
        return (EnumC7682xl1[]) e.clone();
    }
}
