package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ZY implements Function1 {
    public static final ZY e = new ZY(0);
    public static final ZY g = new ZY(1);
    public final /* synthetic */ int d;

    public /* synthetic */ ZY(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                AbstractC4649jL0 it = (AbstractC4649jL0) obj;
                int i = C2964bZ.f;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof XT1)) {
                    return it;
                }
                ((XT1) it).getClass();
                return null;
            default:
                return ((Xc2) obj).getType();
        }
    }
}
