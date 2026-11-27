package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class VO1 {
    public static final /* synthetic */ int a = 0;

    static {
        Object objA;
        Object objA2;
        Exception exc = new Exception();
        String simpleName = Ql2.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            objA = AbstractC7487wq.class.getCanonicalName();
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        if (C1717Ot1.a(objA) != null) {
            objA = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objA2 = VO1.class.getCanonicalName();
        } catch (Throwable th2) {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            objA2 = C1795Pt1.a(th2);
        }
        if (C1717Ot1.a(objA2) != null) {
            objA2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
