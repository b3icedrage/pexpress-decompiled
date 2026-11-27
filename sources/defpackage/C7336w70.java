package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: w70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7336w70 implements InterfaceC2391Xa0 {

    /* JADX INFO: renamed from: w70$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C1346Ka1.b.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    @Override // defpackage.InterfaceC2391Xa0
    @NotNull
    public final InterfaceC2391Xa0.a a() {
        return InterfaceC2391Xa0.a.e;
    }

    @Override // defpackage.InterfaceC2391Xa0
    @NotNull
    public final InterfaceC2391Xa0.b b(@NotNull InterfaceC1335Jx superDescriptor, @NotNull InterfaceC1335Jx subDescriptor, @Nullable FC fc) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        boolean z = subDescriptor instanceof AE0;
        InterfaceC2391Xa0.b bVar = InterfaceC2391Xa0.b.g;
        if (z) {
            AE0 ae0 = (AE0) subDescriptor;
            List<H62> listW = ae0.w();
            Intrinsics.checkNotNullExpressionValue(listW, "getTypeParameters(...)");
            if (listW.isEmpty()) {
                C1346Ka1.b bVarI = C1346Ka1.i(superDescriptor, subDescriptor);
                if ((bVarI != null ? bVarI.b() : null) == null) {
                    List<Xc2> listJ = ae0.j();
                    Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                    C42 c42M = JH1.m(CollectionsKt.y(listJ), ZY.g);
                    AbstractC4649jL0 abstractC4649jL0 = ae0.k;
                    Intrinsics.checkNotNull(abstractC4649jL0);
                    C2139Ue0 c2139Ue0O = JH1.o(c42M, abstractC4649jL0);
                    C1154Ho1 c1154Ho1 = ae0.m;
                    List elements = WE.g(c1154Ho1 != null ? c1154Ho1.getType() : null);
                    Intrinsics.checkNotNullParameter(c2139Ue0O, "<this>");
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    Sequence[] elements2 = {c2139Ue0O, CollectionsKt.y(elements)};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    C2139Ue0.a aVar = new C2139Ue0.a(FH1.c(C1526Mj.i(elements2)));
                    while (aVar.hasNext()) {
                        AbstractC4649jL0 abstractC4649jL1 = (AbstractC4649jL0) aVar.next();
                        if (abstractC4649jL1.T0().isEmpty() || (abstractC4649jL1.Y0() instanceof C2242Vm1)) {
                        }
                    }
                    InterfaceC1335Jx interfaceC1335JxB = superDescriptor.b(new C2086Tm1().c());
                    if (interfaceC1335JxB != null) {
                        if (interfaceC1335JxB instanceof InterfaceC3765fM1) {
                            InterfaceC3765fM1 interfaceC3765fM1 = (InterfaceC3765fM1) interfaceC1335JxB;
                            List<H62> listW2 = interfaceC3765fM1.w();
                            Intrinsics.checkNotNullExpressionValue(listW2, "getTypeParameters(...)");
                            if (!listW2.isEmpty()) {
                                interfaceC1335JxB = interfaceC3765fM1.K0().k(C5653o60.d).build();
                                Intrinsics.checkNotNull(interfaceC1335JxB);
                            }
                        }
                        C1346Ka1.b.a aVarB = C1346Ka1.e.n(interfaceC1335JxB, subDescriptor, false).b();
                        Intrinsics.checkNotNullExpressionValue(aVarB, "getResult(...)");
                        if (a.a[aVarB.ordinal()] == 1) {
                            return InterfaceC2391Xa0.b.d;
                        }
                    }
                }
            }
        }
        return bVar;
    }
}
