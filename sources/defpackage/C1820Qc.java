package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1820Qc {

    @NotNull
    public final S01 a;

    @NotNull
    public final G51 b;

    /* JADX INFO: renamed from: Qc$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C1999Sj1.b.c.EnumC0144c.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            a = iArr;
        }
    }

    public C1820Qc(@NotNull S01 module, @NotNull G51 notFoundClasses) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        this.a = module;
        this.b = notFoundClasses;
    }

    @NotNull
    public final C1664Oc a(@NotNull C1999Sj1 proto, @NotNull InterfaceC5848p21 nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        FC fcC = C7859yd0.c(this.a, C6267r21.a(nameResolver, proto.g), this.b);
        Map mapC = PW0.c();
        if (proto.h.size() != 0 && !R70.f(fcC)) {
            int i = C4432iZ.a;
            if (C4432iZ.n(fcC, SC.i)) {
                Collection<InterfaceC7984zC> collectionR = fcC.r();
                Intrinsics.checkNotNullExpressionValue(collectionR, "getConstructors(...)");
                InterfaceC7984zC interfaceC7984zC = (InterfaceC7984zC) CollectionsKt.V(collectionR);
                if (interfaceC7984zC != null) {
                    List<Xc2> listJ = interfaceC7984zC.j();
                    Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                    int iA = OW0.a(XE.m(listJ, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj : listJ) {
                        linkedHashMap.put(((Xc2) obj).getName(), obj);
                    }
                    List<C1999Sj1.b> list = proto.h;
                    Intrinsics.checkNotNullExpressionValue(list, "getArgumentList(...)");
                    ArrayList arrayList = new ArrayList();
                    for (C1999Sj1.b bVar : list) {
                        Intrinsics.checkNotNull(bVar);
                        Xc2 xc2 = (Xc2) linkedHashMap.get(C6267r21.b(nameResolver, bVar.g));
                        Object pair = null;
                        if (xc2 != null) {
                            C5638o21 c5638o21B = C6267r21.b(nameResolver, bVar.g);
                            AbstractC4649jL0 type = xc2.getType();
                            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                            C1999Sj1.b.c cVar = bVar.h;
                            Intrinsics.checkNotNullExpressionValue(cVar, "getValue(...)");
                            CK<?> ckC = c(type, cVar, nameResolver);
                            pair = b(ckC, type, cVar) ? ckC : null;
                            if (pair == null) {
                                String message = "Unexpected argument value: actual type " + cVar.g + " != expected type " + type;
                                Intrinsics.checkNotNullParameter(message, "message");
                                pair = new S70.a(message);
                            }
                            pair = new Pair(c5638o21B, pair);
                        }
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    mapC = PW0.j(arrayList);
                }
            }
        }
        return new C1664Oc(fcC.y(), mapC, VN1.a);
    }

    public final boolean b(CK<?> ck, AbstractC4649jL0 abstractC4649jL0, C1999Sj1.b.c cVar) {
        C1999Sj1.b.c.EnumC0144c enumC0144c = cVar.g;
        int i = enumC0144c == null ? -1 : a.a[enumC0144c.ordinal()];
        if (i == 10) {
            InterfaceC5044lD interfaceC5044lDC = abstractC4649jL0.V0().c();
            FC fc = interfaceC5044lDC instanceof FC ? (FC) interfaceC5044lDC : null;
            if (fc == null) {
                return true;
            }
            C5638o21 c5638o21 = RK0.e;
            return RK0.b(fc, C4194hP1.a.Q);
        }
        S01 s01 = this.a;
        if (i != 13) {
            return Intrinsics.a(ck.a(s01), abstractC4649jL0);
        }
        if (ck instanceof C1059Gj) {
            C1059Gj c1059Gj = (C1059Gj) ck;
            if (((List) c1059Gj.a).size() == cVar.o.size()) {
                AbstractC4649jL0 abstractC4649jL0F = s01.t().f(abstractC4649jL0);
                Intrinsics.checkNotNullExpressionValue(abstractC4649jL0F, "getArrayElementType(...)");
                Iterable iterableD = WE.d((Collection) c1059Gj.a);
                if ((iterableD instanceof Collection) && ((Collection) iterableD).isEmpty()) {
                    return true;
                }
                Iterator<Integer> it = iterableD.iterator();
                while (((DB0) it).g) {
                    int iB = ((CB0) it).b();
                    CK<?> ck2 = (CK) ((List) c1059Gj.a).get(iB);
                    C1999Sj1.b.c cVar2 = cVar.o.get(iB);
                    Intrinsics.checkNotNullExpressionValue(cVar2, "getArrayElement(...)");
                    if (!b(ck2, abstractC4649jL0F, cVar2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + ck).toString());
    }

    @NotNull
    public final CK<?> c(@NotNull AbstractC4649jL0 type, @NotNull C1999Sj1.b.c value, @NotNull InterfaceC5848p21 nameResolver) {
        Intrinsics.checkNotNullParameter(type, "expectedType");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        boolean zF = C1742Pc.f(C2061Te0.N, value.q, "get(...)");
        C1999Sj1.b.c.EnumC0144c enumC0144c = value.g;
        switch (enumC0144c == null ? -1 : a.a[enumC0144c.ordinal()]) {
            case 1:
                byte b = (byte) value.h;
                return zF ? new L72(b) : new C1880Qw(b);
            case 2:
                return new C6717tA(Character.valueOf((char) value.h));
            case 3:
                short s = (short) value.h;
                return zF ? new C5453n82(s) : new QK1(s);
            case 4:
                int i = (int) value.h;
                return zF ? new R72(i) : new FB0(i);
            case 5:
                long j = value.h;
                return zF ? new X72(j) : new IT0(j);
            case 6:
                return new C4924kf0(value.i);
            case 7:
                return new C3490e30(value.j);
            case 8:
                return new C1011Ft(Boolean.valueOf(value.h != 0));
            case 9:
                return new C7193vS1(nameResolver.getString(value.k));
            case 10:
                return new C3965gJ0(C6267r21.a(nameResolver, value.l), value.p);
            case 11:
                return new C6286r70(C6267r21.a(nameResolver, value.l), C6267r21.b(nameResolver, value.m));
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                C1999Sj1 c1999Sj1 = value.n;
                Intrinsics.checkNotNullExpressionValue(c1999Sj1, "getAnnotation(...)");
                C1664Oc value2 = a(c1999Sj1, nameResolver);
                Intrinsics.checkNotNullParameter(value2, "value");
                return new C2292Wc(value2);
            case 13:
                List<C1999Sj1.b.c> list = value.o;
                Intrinsics.checkNotNullExpressionValue(list, "getArrayElementList(...)");
                ArrayList value3 = new ArrayList(XE.m(list, 10));
                for (C1999Sj1.b.c cVar : list) {
                    AbstractC5706oM1 abstractC5706oM1E = this.a.t().e();
                    Intrinsics.checkNotNullExpressionValue(abstractC5706oM1E, "getAnyType(...)");
                    Intrinsics.checkNotNull(cVar);
                    value3.add(c(abstractC5706oM1E, cVar, nameResolver));
                }
                Intrinsics.checkNotNullParameter(value3, "value");
                Intrinsics.checkNotNullParameter(type, "type");
                return new C4348i72(value3, type);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.g + " (expected " + type + ')').toString());
        }
    }
}
