package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4367iD0 implements InterfaceC6510sB {

    @NotNull
    public static final C4367iD0 a = new C4367iD0();

    @Override // defpackage.InterfaceC6510sB
    public final boolean a(@NotNull AE0 functionDescriptor) {
        AbstractC5706oM1 abstractC5706oM1B;
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        Xc2 xc2 = functionDescriptor.j().get(1);
        C2820aq1.b bVar = C2820aq1.d;
        Intrinsics.checkNotNull(xc2);
        S01 module = C4900kZ.j(xc2);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(module, "module");
        FC fcA = C7859yd0.a(module, C4194hP1.a.R);
        if (fcA == null) {
            abstractC5706oM1B = null;
        } else {
            C5655o62.e.getClass();
            C5655o62 c5655o62 = C5655o62.g;
            List<H62> listB = fcA.p().b();
            Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
            Object objU = CollectionsKt.U(listB);
            Intrinsics.checkNotNullExpressionValue(objU, "single(...)");
            abstractC5706oM1B = C5492nL0.b(c5655o62, fcA, VE.c(new C4662jP1((H62) objU)));
        }
        if (abstractC5706oM1B == null) {
            return false;
        }
        AbstractC4649jL0 type = xc2.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (type == null) {
            C3089c72.a(2);
            throw null;
        }
        P92 p92H = C3089c72.h(type, false);
        Intrinsics.checkNotNullExpressionValue(p92H, "makeNotNullable(...)");
        return C0564Aa.r(abstractC5706oM1B, p92H);
    }

    @Override // defpackage.InterfaceC6510sB
    @Nullable
    public final String b(@NotNull AE0 ae0) {
        return InterfaceC6510sB.a.a(this, ae0);
    }

    @Override // defpackage.InterfaceC6510sB
    @NotNull
    public final String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
