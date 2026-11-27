package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5276mJ0 {

    /* JADX INFO: renamed from: mJ0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC2920bK0.values().length];
            try {
                EnumC2920bK0 enumC2920bK0 = EnumC2920bK0.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC2920bK0 enumC2920bK1 = EnumC2920bK0.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC2920bK0 enumC2920bK2 = EnumC2920bK0.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @NotNull
    public static final WJ0 a(@NotNull RI0 ri0, @NotNull List arguments, boolean z, @NotNull List annotations) {
        InterfaceC5044lD interfaceC5044lDC;
        C5655o62 c5655o62;
        InterfaceC4812k62 c4662jP1;
        Intrinsics.checkNotNullParameter(ri0, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        InterfaceC5063lJ0 interfaceC5063lJ0 = ri0 instanceof InterfaceC5063lJ0 ? (InterfaceC5063lJ0) ri0 : null;
        if (interfaceC5063lJ0 == null || (interfaceC5044lDC = interfaceC5063lJ0.c()) == null) {
            throw new C3761fL0("Cannot create type for an unsupported classifier: " + ri0 + " (" + ri0.getClass() + ')');
        }
        InterfaceC6494s62 interfaceC6494s62P = interfaceC5044lDC.p();
        Intrinsics.checkNotNullExpressionValue(interfaceC6494s62P, "getTypeConstructor(...)");
        List<H62> listB = interfaceC6494s62P.b();
        Intrinsics.checkNotNullExpressionValue(listB, "getParameters(...)");
        if (listB.size() != arguments.size()) {
            throw new IllegalArgumentException("Class declares " + listB.size() + " type parameters, but " + arguments.size() + " were provided.");
        }
        if (annotations.isEmpty()) {
            C5655o62.e.getClass();
            c5655o62 = C5655o62.g;
        } else {
            C5655o62.e.getClass();
            c5655o62 = C5655o62.g;
        }
        List<H62> listB2 = interfaceC6494s62P.b();
        Intrinsics.checkNotNullExpressionValue(listB2, "getParameters(...)");
        ArrayList arrayList = new ArrayList(XE.m(arguments, 10));
        int i = 0;
        for (Object obj : arguments) {
            int i2 = i + 1;
            if (i < 0) {
                WE.l();
                throw null;
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj;
            WJ0 wj0 = (WJ0) kTypeProjection.b;
            AbstractC4649jL0 abstractC4649jL0 = wj0 != null ? wj0.a : null;
            EnumC2920bK0 enumC2920bK0 = kTypeProjection.a;
            int i3 = enumC2920bK0 == null ? -1 : a.a[enumC2920bK0.ordinal()];
            if (i3 == -1) {
                H62 h62 = listB2.get(i);
                Intrinsics.checkNotNullExpressionValue(h62, "get(...)");
                c4662jP1 = new C4662jP1(h62);
            } else if (i3 == 1) {
                EnumC3610ed2 enumC3610ed2 = EnumC3610ed2.INVARIANT;
                Intrinsics.checkNotNull(abstractC4649jL0);
                c4662jP1 = new P62(abstractC4649jL0, enumC3610ed2);
            } else if (i3 == 2) {
                EnumC3610ed2 enumC3610ed3 = EnumC3610ed2.IN_VARIANCE;
                Intrinsics.checkNotNull(abstractC4649jL0);
                c4662jP1 = new P62(abstractC4649jL0, enumC3610ed3);
            } else {
                if (i3 != 3) {
                    throw new C6489s51();
                }
                EnumC3610ed2 enumC3610ed4 = EnumC3610ed2.OUT_VARIANCE;
                Intrinsics.checkNotNull(abstractC4649jL0);
                c4662jP1 = new P62(abstractC4649jL0, enumC3610ed4);
            }
            arrayList.add(c4662jP1);
            i = i2;
        }
        return new WJ0(C5492nL0.c(c5655o62, interfaceC6494s62P, arrayList, z, null), null);
    }
}
