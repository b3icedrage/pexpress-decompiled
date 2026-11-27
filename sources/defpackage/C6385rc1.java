package defpackage;

import defpackage.InterfaceC2928bN;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6385rc1<Output extends InterfaceC2928bN<Output>> {

    /* JADX INFO: renamed from: rc1$a */
    public static final class a<Output> {
        public final InterfaceC2928bN a;

        @NotNull
        public final C7436wc1<Output> b;
        public final int c;

        public a(InterfaceC2928bN interfaceC2928bN, @NotNull C7436wc1 parserStructure, int i) {
            Intrinsics.checkNotNullParameter(parserStructure, "parserStructure");
            this.a = interfaceC2928bN;
            this.b = parserStructure;
            this.c = i;
        }
    }

    /* JADX WARN: Type inference failed for: r10v17, types: [ML0, kotlin.jvm.functions.Function0] */
    public static InterfaceC2928bN a(C7436wc1 c7436wc1, String input, InterfaceC2928bN initialContainer) throws C4445ic1 {
        String string;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(initialContainer, "initialContainer");
        ArrayList errors = new ArrayList();
        ArrayList arrayListH = WE.h(new a(initialContainer, c7436wc1, 0));
        while (true) {
            Intrinsics.checkNotNullParameter(arrayListH, "<this>");
            a aVar = (a) (arrayListH.isEmpty() ? null : arrayListH.remove(WE.e(arrayListH)));
            if (aVar != null) {
                InterfaceC2928bN interfaceC2928bN = (InterfaceC2928bN) aVar.a.a();
                C7436wc1<Output> c7436wc2 = aVar.b;
                int size = c7436wc2.a.size();
                int iIntValue = aVar.c;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        List<C7436wc1<Output>> list = c7436wc2.b;
                        if (!list.isEmpty()) {
                            int size2 = list.size() - 1;
                            if (size2 < 0) {
                                break;
                            }
                            while (true) {
                                int i2 = size2 - 1;
                                arrayListH.add(new a(interfaceC2928bN, (C7436wc1) list.get(size2), iIntValue));
                                if (i2 < 0) {
                                    break;
                                }
                                size2 = i2;
                            }
                        } else {
                            if (iIntValue != input.length()) {
                                errors.add(new C4235hc1(iIntValue, C5336mc1.d));
                                break;
                            }
                            return interfaceC2928bN;
                        }
                    } else {
                        Object objA = ((InterfaceC7015uc1) c7436wc2.a.get(i)).a(interfaceC2928bN, input, iIntValue);
                        if (!(objA instanceof Integer)) {
                            if (objA instanceof C4235hc1) {
                                errors.add((C4235hc1) objA);
                                break;
                            }
                            throw new IllegalStateException(("Unexpected parse result: " + objA).toString());
                        }
                        iIntValue = ((Number) objA).intValue();
                        i++;
                    }
                }
            } else {
                if (errors.size() > 1) {
                    C2680aF.n(errors, new C5123lc1());
                }
                Intrinsics.checkNotNullParameter(errors, "errors");
                if (errors.size() == 1) {
                    string = "Position " + ((C4235hc1) errors.get(0)).a + ": " + ((String) ((C4235hc1) errors.get(0)).b.invoke());
                } else {
                    StringBuilder sb = new StringBuilder(errors.size() * 33);
                    CollectionsKt.I(errors, sb, ", ", "Errors: ", null, C3189cd0.g, 56);
                    string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                }
                throw new C4445ic1(string);
            }
        }
    }
}
