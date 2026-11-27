package defpackage;

/* JADX INFO: renamed from: bJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2918bJ1 implements XB0.a {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    public final int d;

    /* JADX INFO: renamed from: bJ1$a */
    public static final class a {
        public static final a a = new a();
    }

    EnumC2918bJ1(int i) {
        this.d = i;
    }

    @Override // XB0.a
    public final int getNumber() {
        return this.d;
    }
}
