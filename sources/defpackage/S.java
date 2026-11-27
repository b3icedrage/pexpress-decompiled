package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class S implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ S(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                V v = (V) obj;
                QY0 qy0L0 = v.L0();
                Q q = new Q(this, 0);
                O70 o70 = C3089c72.a;
                return R70.f(v) ? R70.c(Q70.UNABLE_TO_SUBSTITUTE_TYPE, v.toString()) : C3089c72.m(v.p(), qy0L0, q);
            case 1:
                AbstractC4649jL0 type = ((N62) obj).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return type;
            case 2:
                return new C8006zJ0.a((C8006zJ0) obj);
            default:
                C7180vO0 c7180vO0 = (C7180vO0) obj;
                ArrayList<ZE0> arrayListW = c7180vO0.l.w();
                ArrayList arrayList = new ArrayList(XE.m(arrayListW, 10));
                for (ZE0 ze0 : arrayListW) {
                    H62 h62A = c7180vO0.n.b.a(ze0);
                    if (h62A == null) {
                        throw new AssertionError("Parameter " + ze0 + " surely belongs to class " + c7180vO0.l + ", so it must be resolved");
                    }
                    arrayList.add(h62A);
                }
                return arrayList;
        }
    }
}
