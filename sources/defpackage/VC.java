package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class VC extends AbstractC6897u21 {
    @Override // defpackage.AbstractC6897u21
    public final String m(InterfaceC6237qt0 interfaceC6237qt0) {
        StackTraceElement[] stackTraceElementArrA = interfaceC6237qt0.a();
        return (stackTraceElementArrA == null || stackTraceElementArrA.length <= 0) ? "?" : stackTraceElementArrA[0].getClassName();
    }
}
