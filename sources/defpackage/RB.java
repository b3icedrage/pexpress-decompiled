package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class RB implements Function1 {
    public static final RB e = new RB(0);
    public static final RB g = new RB(1);
    public static final RB h = new RB(2);
    public final /* synthetic */ int d;

    public /* synthetic */ RB(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Intrinsics.checkNotNullParameter((InterfaceC2076Tj0) obj, "<this>");
                return null;
            case 1:
                InterfaceC2392Xa1 it = (InterfaceC2392Xa1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.c();
            default:
                String it2 = (String) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.length() > 1 ? C1742Pc.d(';', "L", it2) : it2;
        }
    }
}
