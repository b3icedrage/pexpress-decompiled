package defpackage;

/* JADX INFO: renamed from: n52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5441n52 {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final C5441n52 d;

    public C5441n52(Throwable th, C4376iG0 c4376iG0) {
        this.a = th.getLocalizedMessage();
        this.b = th.getClass().getName();
        this.c = c4376iG0.b(th.getStackTrace());
        Throwable cause = th.getCause();
        this.d = cause != null ? new C5441n52(cause, c4376iG0) : null;
    }
}
