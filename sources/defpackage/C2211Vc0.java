package defpackage;

/* JADX INFO: renamed from: Vc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2211Vc0 extends AbstractC3946gD {
    public C2211Vc0() {
        super(0);
    }

    @Override // defpackage.AbstractC3946gD
    public final String d(QS0 qs0) {
        StackTraceElement[] stackTraceElementArrA = qs0.a();
        return (stackTraceElementArrA == null || stackTraceElementArrA.length <= 0) ? "?" : stackTraceElementArrA[0].getFileName();
    }
}
