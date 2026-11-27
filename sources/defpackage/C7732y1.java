package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7732y1 implements Function1 {
    public final B1 d;

    public C7732y1(B1 b1) {
        this.d = b1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        B1.a supertypes = (B1.a) obj;
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        B1 b1 = this.d;
        InterfaceC3792fV1 interfaceC3792fV1K = b1.k();
        Collection<AbstractC4649jL0> collection = supertypes.a;
        interfaceC3792fV1K.a(b1, collection, new C7942z1(b1, 0), new A1(b1, 0));
        if (collection.isEmpty()) {
            AbstractC4649jL0 abstractC4649jL0I = b1.i();
            List listC = abstractC4649jL0I != null ? VE.c(abstractC4649jL0I) : null;
            if (listC == null) {
                listC = C5653o60.d;
            }
            collection = listC;
        }
        List<AbstractC4649jL0> listE0 = collection instanceof List ? (List) collection : null;
        if (listE0 == null) {
            listE0 = CollectionsKt.e0(collection);
        }
        List<AbstractC4649jL0> listM = b1.m(listE0);
        Intrinsics.checkNotNullParameter(listM, "<set-?>");
        supertypes.b = listM;
        return Unit.a;
    }
}
