package defpackage;

/* JADX INFO: renamed from: dQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3357dQ0 extends AbstractC3946gD {
    public C3357dQ0() {
        super(0);
    }

    @Override // defpackage.AbstractC3946gD
    public final String d(QS0 qs0) {
        StackTraceElement[] stackTraceElementArrA = qs0.a();
        return (stackTraceElementArrA == null || stackTraceElementArrA.length <= 0) ? "?" : Integer.toString(stackTraceElementArrA[0].getLineNumber());
    }
}
