package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3156cT0 extends C2784ak0 implements Function1 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3156cT0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                return ((C40) this.e).a((JM) obj);
            case 1:
                Pf2.a p1 = (Pf2.a) obj;
                Intrinsics.checkNotNullParameter(p1, "p1");
                F81 f81 = (F81) this.e;
                f81.getClass();
                if (p1 instanceof Pf2.a.d) {
                    H81 h81 = f81.a;
                    Qf2 webSocket = ((Pf2.a.d) p1).a;
                    if (webSocket == null) {
                        throw new NullPointerException("null cannot be cast to non-null type okhttp3.WebSocket");
                    }
                    Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                    h81.a = webSocket;
                } else if (p1 instanceof Pf2.a.b) {
                    f81.b(FL1.c);
                } else if ((p1 instanceof Pf2.a.C0116a) || (p1 instanceof Pf2.a.c)) {
                    synchronized (f81) {
                        f81.a.a = null;
                        f81.b.e.onComplete();
                    }
                }
                return Unit.a;
            default:
                return ((InterfaceC5158ll0) this.e).a((JM) obj);
        }
    }
}
