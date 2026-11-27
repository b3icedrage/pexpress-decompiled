package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4561iz extends ML0 implements Function1 {
    public static final C4561iz e = new C4561iz(1, 0);
    public static final C4561iz g = new C4561iz(1, 1);
    public static final C4561iz h = new C4561iz(1, 2);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4561iz(int i, int i2) {
        super(i);
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                String $receiver = (String) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                return QO.f($receiver);
            case 1:
                Intrinsics.checkNotNullParameter(obj, "$this$null");
                return Unit.a;
            case 2:
                ((Boolean) obj).booleanValue();
                return Unit.a;
            default:
                return 1500L;
        }
    }
}
