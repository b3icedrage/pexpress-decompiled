package defpackage;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;

/* JADX INFO: loaded from: classes3.dex */
public final class YY implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ YY(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IllegalAccessException {
        switch (this.d) {
            case 0:
                C7718xx changeOptions = C7718xx.g;
                C2964bZ c2964bZ = (C2964bZ) this.e;
                c2964bZ.getClass();
                Intrinsics.checkNotNullParameter(changeOptions, "changeOptions");
                C3802fZ c3802fZ = c2964bZ.d;
                c3802fZ.getClass();
                C3802fZ c3802fZ2 = new C3802fZ();
                C6411rj c6411rjL = C6621sj.l(C3802fZ.class.getDeclaredFields());
                while (c6411rjL.hasNext()) {
                    Field field = (Field) c6411rjL.next();
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj = field.get(c3802fZ);
                        AbstractC3302d81 abstractC3302d81 = obj instanceof AbstractC3302d81 ? (AbstractC3302d81) obj : null;
                        if (abstractC3302d81 != null) {
                            String name = field.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            d.o(name, "is", false);
                            RI0 ri0B = C2017Sp1.a.b(C3802fZ.class);
                            String name2 = field.getName();
                            StringBuilder sb = new StringBuilder("get");
                            String name3 = field.getName();
                            Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                            if (name3.length() > 0) {
                                char upperCase = Character.toUpperCase(name3.charAt(0));
                                String strSubstring = name3.substring(1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                name3 = upperCase + strSubstring;
                            }
                            sb.append(name3);
                            C1373Kj1 property = new C1373Kj1(ri0B, name2, sb.toString());
                            Intrinsics.checkNotNullParameter(property, "property");
                            field.set(c3802fZ2, new C3592eZ(abstractC3302d81.a, c3802fZ2));
                        }
                    }
                }
                changeOptions.invoke(c3802fZ2);
                c3802fZ2.a = true;
                return new C2964bZ(c3802fZ2);
            case 1:
                return CollectionsKt.h0((Iterable) ((Function0) this.e).invoke());
            case 2:
                PI0 pi0 = (PI0) this.e;
                List<H62> listW = pi0.o().w();
                Intrinsics.checkNotNullExpressionValue(listW, "getTypeParameters(...)");
                ArrayList arrayList = new ArrayList(XE.m(listW, 10));
                for (H62 h62 : listW) {
                    Intrinsics.checkNotNull(h62);
                    arrayList.add(new YJ0(pi0, h62));
                }
                return arrayList;
            case 3:
                C6550sO0 c6550sO0 = (C6550sO0) this.e;
                ArrayList<RD0> arrayListF = c6550sO0.b.f();
                ArrayList arrayList2 = new ArrayList();
                for (RD0 rd0 : arrayListF) {
                    C5638o21 name4 = rd0.getName();
                    if (name4 == null) {
                        name4 = C3333dI0.b;
                    }
                    CK<?> ckB = c6550sO0.b(rd0);
                    Pair pair = ckB != null ? new Pair(name4, ckB) : null;
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                }
                return PW0.j(arrayList2);
            default:
                return ((QO0) this.e).h(LY.o, null);
        }
    }
}
