package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Pa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1738Pa1 {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <H> Collection<H> a(@NotNull Collection<? extends H> collection, @NotNull Function1<? super H, ? extends InterfaceC1335Jx> descriptorByHandle) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C3768fN1 c3768fN1 = new C3768fN1();
        while (!linkedList.isEmpty()) {
            Object objF = CollectionsKt.F(linkedList);
            C3768fN1 c3768fN2 = new C3768fN1();
            ArrayList<A12> arrayListG = C1346Ka1.g(objF, linkedList, descriptorByHandle, new CO0(c3768fN2, 1));
            Intrinsics.checkNotNullExpressionValue(arrayListG, "extractMembersOverridableInBothWays(...)");
            if (arrayListG.size() == 1 && c3768fN2.isEmpty()) {
                Object objT = CollectionsKt.T(arrayListG);
                Intrinsics.checkNotNullExpressionValue(objT, "single(...)");
                c3768fN1.add(objT);
            } else {
                A2 a2 = (Object) C1346Ka1.s(arrayListG, descriptorByHandle);
                InterfaceC1335Jx interfaceC1335JxInvoke = descriptorByHandle.invoke(a2);
                for (A12 a12 : arrayListG) {
                    Intrinsics.checkNotNull(a12);
                    if (!C1346Ka1.k(interfaceC1335JxInvoke, descriptorByHandle.invoke(a12))) {
                        c3768fN2.add(a12);
                    }
                }
                if (!c3768fN2.isEmpty()) {
                    c3768fN1.addAll(c3768fN2);
                }
                c3768fN1.add(a2);
            }
        }
        return c3768fN1;
    }
}
