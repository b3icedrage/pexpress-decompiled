package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4156hD {
    public static C6075q62 a(boolean z, AbstractC5912pL0 abstractC5912pL0, AbstractC6331rL0.a aVar, int i) {
        C3136cM1 typeSystemContext = C3136cM1.a;
        if ((i & 8) != 0) {
            abstractC5912pL0 = AbstractC5912pL0.a.e;
        }
        AbstractC5912pL0 kotlinTypePreparator = abstractC5912pL0;
        if ((i & 16) != 0) {
            aVar = AbstractC6331rL0.a.e;
        }
        AbstractC6331rL0.a kotlinTypeRefiner = aVar;
        Intrinsics.checkNotNullParameter(typeSystemContext, "typeSystemContext");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C6075q62(z, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }
}
