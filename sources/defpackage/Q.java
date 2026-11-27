package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Q implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ Q(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C4267hk1 c4267hk1A;
        C4267hk1 c4267hk1A2;
        switch (this.d) {
            case 0:
                V v = (V) ((S) this.e).e;
                ((AbstractC6331rL0) obj).y(v);
                return v.e.invoke();
            case 1:
                AbstractC4649jL0 abstractC4649jL0 = (AbstractC4649jL0) obj;
                Intrinsics.checkNotNull(abstractC4649jL0);
                return ((C2964bZ) this.e).Z(abstractC4649jL0);
            case 2:
                C5638o21 it = (C5638o21) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                SZ.b bVar = (SZ.b) this.e;
                byte[] bArr = (byte[]) bVar.c.get(it);
                if (bArr != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    SZ sz = bVar.i;
                    C4476ik1 proto = (C4476ik1) C4476ik1.t.c(byteArrayInputStream, sz.b.a.p);
                    if (proto != null) {
                        OY0 oy0 = sz.b.i;
                        oy0.getClass();
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        List<C1999Sj1> list = proto.o;
                        Intrinsics.checkNotNullExpressionValue(list, "getAnnotationList(...)");
                        ArrayList annotations = new ArrayList(XE.m(list, 10));
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            boolean zHasNext = it2.hasNext();
                            C6582sZ c6582sZ = oy0.a;
                            if (!zHasNext) {
                                Intrinsics.checkNotNullParameter(annotations, "annotations");
                                InterfaceC2396Xc c2552Zc = annotations.isEmpty() ? InterfaceC2396Xc.a.a : new C2552Zc(annotations);
                                QW qwA = C7257vk1.a((EnumC5788ok1) C2061Te0.d.c(proto.h));
                                C2720aS0 c2720aS0 = c6582sZ.a.a;
                                C5638o21 c5638o21B = C6267r21.b(c6582sZ.b, proto.i);
                                C2656a72 typeTable = c6582sZ.d;
                                C3269d00 c3269d00 = new C3269d00(c2720aS0, c6582sZ.c, c2552Zc, c5638o21B, qwA, proto, c6582sZ.b, typeTable, c6582sZ.e, c6582sZ.g);
                                List<C4735jk1> list2 = proto.j;
                                Intrinsics.checkNotNullExpressionValue(list2, "getTypeParameterList(...)");
                                C7334w62 c7334w62 = c6582sZ.a(c3269d00, list2, c6582sZ.b, c6582sZ.d, c6582sZ.e, c6582sZ.f).h;
                                List<H62> listB = c7334w62.b();
                                Intrinsics.checkNotNullParameter(proto, "<this>");
                                Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                                int i = proto.g;
                                if ((i & 4) == 4) {
                                    c4267hk1A = proto.k;
                                    Intrinsics.checkNotNullExpressionValue(c4267hk1A, "getUnderlyingType(...)");
                                } else {
                                    if ((i & 8) != 8) {
                                        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                                    }
                                    c4267hk1A = typeTable.a(proto.l);
                                }
                                AbstractC5706oM1 abstractC5706oM1D = c7334w62.d(c4267hk1A, false);
                                Intrinsics.checkNotNullParameter(proto, "<this>");
                                Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                                int i2 = proto.g;
                                if ((i2 & 16) == 16) {
                                    c4267hk1A2 = proto.m;
                                    Intrinsics.checkNotNullExpressionValue(c4267hk1A2, "getExpandedType(...)");
                                } else {
                                    if ((i2 & 32) != 32) {
                                        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                                    }
                                    c4267hk1A2 = typeTable.a(proto.n);
                                }
                                c3269d00.V0(listB, abstractC5706oM1D, c7334w62.d(c4267hk1A2, false));
                                return c3269d00;
                            }
                            C1999Sj1 c1999Sj1 = (C1999Sj1) it2.next();
                            Intrinsics.checkNotNull(c1999Sj1);
                            annotations.add(oy0.b.a(c1999Sj1, c6582sZ.b));
                        }
                    }
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter((AbstractC6331rL0) obj, "it");
                C7180vO0 c7180vO0 = (C7180vO0) this.e;
                return new FO0(c7180vO0.n, c7180vO0, c7180vO0.l, c7180vO0.m != null, c7180vO0.u);
            case 4:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                C2905bF0 c2905bF0 = C4719jg1.b;
                String str = (String) this.e;
                function.a(str, c2905bF0);
                function.a(str, c2905bF0);
                return Unit.a;
            case 5:
                InterfaceC3453ds0 newBottomSheetDialog = (InterfaceC3453ds0) obj;
                Intrinsics.checkNotNullParameter(newBottomSheetDialog, "$this$newBottomSheetDialog");
                newBottomSheetDialog.b((C3668eu) this.e);
                return Unit.a;
            default:
                int iIntValue = ((Number) obj).intValue();
                C6582sZ c6582sZ2 = ((C7334w62) this.e).a;
                QC classId = C6267r21.a(c6582sZ2.b, iIntValue);
                if (!classId.c) {
                    S01 s01 = c6582sZ2.a.b;
                    Intrinsics.checkNotNullParameter(s01, "<this>");
                    Intrinsics.checkNotNullParameter(classId, "classId");
                    InterfaceC5044lD interfaceC5044lDB = C7859yd0.b(s01, classId);
                    if (interfaceC5044lDB instanceof InterfaceC3714f62) {
                        return (InterfaceC3714f62) interfaceC5044lDB;
                    }
                }
                return null;
        }
    }
}
