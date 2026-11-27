package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DS {
    public static final DS d;
    public static final DS e;
    public static final DS g;
    public static final DS h;
    public static final /* synthetic */ DS[] i;

    static {
        DS ds = new DS("MEMORY_CACHE", 0);
        d = ds;
        DS ds2 = new DS("MEMORY", 1);
        e = ds2;
        DS ds3 = new DS("DISK", 2);
        g = ds3;
        DS ds4 = new DS("NETWORK", 3);
        h = ds4;
        i = new DS[]{ds, ds2, ds3, ds4};
    }

    public DS() {
        throw null;
    }

    public static DS valueOf(String str) {
        return (DS) Enum.valueOf(DS.class, str);
    }

    public static DS[] values() {
        return (DS[]) i.clone();
    }
}
