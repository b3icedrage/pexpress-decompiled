package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class CS {
    public static final CS d;
    public static final CS e;
    public static final CS g;
    public static final CS h;
    public static final CS i;
    public static final /* synthetic */ CS[] j;

    static {
        CS cs = new CS("LOCAL", 0);
        d = cs;
        CS cs2 = new CS("REMOTE", 1);
        e = cs2;
        CS cs3 = new CS("DATA_DISK_CACHE", 2);
        g = cs3;
        CS cs4 = new CS("RESOURCE_DISK_CACHE", 3);
        h = cs4;
        CS cs5 = new CS("MEMORY_CACHE", 4);
        i = cs5;
        j = new CS[]{cs, cs2, cs3, cs4, cs5};
    }

    public CS() {
        throw null;
    }

    public static CS valueOf(String str) {
        return (CS) Enum.valueOf(CS.class, str);
    }

    public static CS[] values() {
        return (CS[]) j.clone();
    }
}
