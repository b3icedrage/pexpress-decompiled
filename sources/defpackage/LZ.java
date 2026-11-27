package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class LZ {
    public static final LZ d;
    public static final LZ e;
    public static final /* synthetic */ LZ[] g;

    static {
        LZ lz = new LZ("STABLE", 0);
        d = lz;
        LZ lz2 = new LZ("UNSTABLE", 1);
        e = lz2;
        LZ[] lzArr = {lz, lz2};
        g = lzArr;
        C1952Ru.i(lzArr);
    }

    public LZ() {
        throw null;
    }

    public static LZ valueOf(String str) {
        return (LZ) Enum.valueOf(LZ.class, str);
    }

    public static LZ[] values() {
        return (LZ[]) g.clone();
    }
}
