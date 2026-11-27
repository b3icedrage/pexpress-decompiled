package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MW0 {
    @NotNull
    public static final C6914u62 a(@NotNull FC from, @NotNull FC to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        from.A().size();
        to.A().size();
        AbstractC7124v62.a aVar = AbstractC7124v62.b;
        List<H62> listA = from.A();
        Intrinsics.checkNotNullExpressionValue(listA, "getDeclaredTypeParameters(...)");
        ArrayList arrayList = new ArrayList(XE.m(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((H62) it.next()).p());
        }
        List<H62> listA2 = to.A();
        Intrinsics.checkNotNullExpressionValue(listA2, "getDeclaredTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(XE.m(listA2, 10));
        Iterator<T> it2 = listA2.iterator();
        while (it2.hasNext()) {
            AbstractC5706oM1 abstractC5706oM1Y = ((H62) it2.next()).y();
            Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Y, "getDefaultType(...)");
            arrayList2.add(C0564Aa.b(abstractC5706oM1Y));
        }
        return AbstractC7124v62.a.b(aVar, PW0.j(CollectionsKt.j0(arrayList, arrayList2)));
    }
}
