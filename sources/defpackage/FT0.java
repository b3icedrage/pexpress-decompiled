package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class FT0 {
    public static final a d;
    public static final /* synthetic */ FT0[] e;

    public final enum a extends FT0 {
        public a() {
            super("DEFAULT", 0);
        }
    }

    static {
        a aVar = new a();
        d = aVar;
        e = new FT0[]{aVar, new FT0() { // from class: FT0.b
        }};
    }

    public FT0() {
        throw null;
    }

    public static FT0 valueOf(String str) {
        return (FT0) Enum.valueOf(FT0.class, str);
    }

    public static FT0[] values() {
        return (FT0[]) e.clone();
    }
}
