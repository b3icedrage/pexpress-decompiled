package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: iC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4364iC0 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C4364iC0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                AbstractC6331rL0 kotlinTypeRefiner = (AbstractC6331rL0) obj;
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                C4622jC0 c4622jC0 = (C4622jC0) this.e;
                c4622jC0.getClass();
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                LinkedHashSet<AbstractC4649jL0> linkedHashSet = c4622jC0.b;
                ArrayList arrayList = new ArrayList(XE.m(linkedHashSet, 10));
                Iterator<T> it = linkedHashSet.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    arrayList.add(((AbstractC4649jL0) it.next()).X0(kotlinTypeRefiner));
                    z = true;
                }
                C4622jC0 c4622jC1 = null;
                if (z) {
                    AbstractC4649jL0 abstractC4649jL0 = c4622jC0.a;
                    AbstractC4649jL0 abstractC4649jL0X0 = abstractC4649jL0 != null ? abstractC4649jL0.X0(kotlinTypeRefiner) : null;
                    C4622jC0 c4622jC2 = new C4622jC0(new C4622jC0(arrayList).b);
                    c4622jC2.a = abstractC4649jL0X0;
                    c4622jC1 = c4622jC2;
                }
                if (c4622jC1 != null) {
                    c4622jC0 = c4622jC1;
                }
                return c4622jC0.g();
            case 1:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                C2905bF0 c2905bF0 = C4719jg1.b;
                String str = (String) this.e;
                function.a(str, c2905bF0);
                function.a(str, c2905bF0);
                function.c(str, C4719jg1.a);
                return Unit.a;
            default:
                InterfaceC1490Lx it2 = (InterfaceC1490Lx) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                AbstractC4649jL0 type = it2.j().get(((Xc2) this.e).l()).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return type;
        }
    }
}
