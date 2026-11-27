package defpackage;

/* JADX INFO: renamed from: Hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1134Hi implements XB0.a {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public final int d;

    /* JADX INFO: renamed from: Hi$a */
    public static final class a {
        public static final a a = new a();
    }

    EnumC1134Hi(int i) {
        this.d = i;
    }

    @Override // XB0.a
    public final int getNumber() {
        return this.d;
    }
}
