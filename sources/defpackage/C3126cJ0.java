package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3126cJ0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object g;

    public /* synthetic */ C3126cJ0(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                List<H62> listA = ((C3545eJ0.a) this.e).b().A();
                Intrinsics.checkNotNullExpressionValue(listA, "getDeclaredTypeParameters(...)");
                ArrayList arrayList = new ArrayList(XE.m(listA, 10));
                for (H62 h62 : listA) {
                    Intrinsics.checkNotNull(h62);
                    arrayList.add(new YJ0((C3545eJ0) this.g, h62));
                }
                return arrayList;
            default:
                Iterable iterable = (List) ((C5436n41) this.e).e.getValue();
                if (iterable == null) {
                    iterable = C5653o60.d;
                }
                ArrayList arrayList2 = new ArrayList(XE.m(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((P92) it.next()).X0((AbstractC6331rL0) this.g));
                }
                return arrayList2;
        }
    }
}
