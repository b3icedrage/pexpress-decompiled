package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SO0 extends C2943bS.a<FC, Unit> {
    public final /* synthetic */ C7180vO0 a;
    public final /* synthetic */ LinkedHashSet b;
    public final /* synthetic */ Function1<QY0, Collection<Object>> c;

    public SO0(C7180vO0 c7180vO0, LinkedHashSet linkedHashSet, Function1 function1) {
        this.a = c7180vO0;
        this.b = linkedHashSet;
        this.c = function1;
    }

    @Override // defpackage.C2943bS.c
    public final /* bridge */ /* synthetic */ Object a() {
        return Unit.a;
    }

    @Override // defpackage.C2943bS.c
    public final boolean c(Object obj) {
        FC current = (FC) obj;
        Intrinsics.checkNotNullParameter(current, "current");
        if (current == this.a) {
            return true;
        }
        QY0 qy0Y = current.Y();
        Intrinsics.checkNotNullExpressionValue(qy0Y, "getStaticScope(...)");
        if (!(qy0Y instanceof UO0)) {
            return true;
        }
        this.b.addAll(this.c.invoke(qy0Y));
        return false;
    }
}
