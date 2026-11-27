package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6550sO0 implements InterfaceC1987Sf1 {
    public static final /* synthetic */ IJ0<Object>[] i;

    @NotNull
    public final LO0 a;

    @NotNull
    public final QD0 b;

    @NotNull
    public final InterfaceC5868p71 c;

    @NotNull
    public final I51 d;

    @NotNull
    public final OE0 e;

    @NotNull
    public final I51 f;
    public final boolean g;
    public final boolean h;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        i = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(C6550sO0.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(C6550sO0.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(C6550sO0.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public C6550sO0(@NotNull QD0 javaAnnotation, @NotNull LO0 c, boolean z) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(javaAnnotation, "javaAnnotation");
        this.a = c;
        this.b = javaAnnotation;
        C2720aS0 c2720aS0 = c.a.a;
        LI0 li0 = new LI0(this, 2);
        c2720aS0.getClass();
        this.c = new C2720aS0.f(c2720aS0, li0);
        KE0 ke0 = c.a;
        C2720aS0 c2720aS1 = ke0.a;
        MI0 mi0 = new MI0(this, 1);
        c2720aS1.getClass();
        this.d = new C2720aS0.h(c2720aS1, mi0);
        this.e = ke0.j.a(javaAnnotation);
        C2720aS0 c2720aS2 = ke0.a;
        YY yy = new YY(this, 3);
        c2720aS2.getClass();
        this.f = new C2720aS0.h(c2720aS2, yy);
        this.g = false;
        this.h = z;
    }

    @Override // defpackage.InterfaceC1987Sf1
    public final boolean a() {
        return this.g;
    }

    public final CK<?> b(RD0 rd0) {
        AbstractC4649jL0 type;
        if (rd0 instanceof InterfaceC7360wE0) {
            return UE.b.l(((InterfaceC7360wE0) rd0).getValue(), null);
        }
        if (rd0 instanceof InterfaceC6310rE0) {
            InterfaceC6310rE0 interfaceC6310rE0 = (InterfaceC6310rE0) rd0;
            return new C6286r70(interfaceC6310rE0.b(), interfaceC6310rE0.d());
        }
        boolean z = rd0 instanceof YD0;
        LO0 lo0 = this.a;
        if (z) {
            YD0 yd0 = (YD0) rd0;
            C5638o21 name = yd0.getName();
            if (name == null) {
                name = C3333dI0.b;
            }
            Intrinsics.checkNotNull(name);
            ArrayList arrayListE = yd0.e();
            if (!C3686f.n((AbstractC5706oM1) Nm2.f(this.d, i[1]))) {
                FC fcD = C4900kZ.d(this);
                Intrinsics.checkNotNull(fcD);
                Xc2 xc2M = UE.m(name, fcD);
                if (xc2M == null || (type = xc2M.getType()) == null) {
                    RK0 rk0 = lo0.a.o.h;
                    EnumC3610ed2 enumC3610ed2 = EnumC3610ed2.INVARIANT;
                    type = rk0.g(R70.c(Q70.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
                    Intrinsics.checkNotNullExpressionValue(type, "getArrayType(...)");
                }
                ArrayList value = new ArrayList(XE.m(arrayListE, 10));
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    CK<?> ckB = b((RD0) it.next());
                    if (ckB == null) {
                        ckB = new C4347i71(null);
                    }
                    value.add(ckB);
                }
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(type, "type");
                return new C4348i72(value, type);
            }
        } else {
            if (rd0 instanceof SD0) {
                C6550sO0 value2 = new C6550sO0(((SD0) rd0).a(), lo0, false);
                Intrinsics.checkNotNullParameter(value2, "value");
                return new C2292Wc(value2);
            }
            if (rd0 instanceof InterfaceC3950gE0) {
                AbstractC4649jL0 argumentType = lo0.e.d(((InterfaceC3950gE0) rd0).c(), C3686f.q(EnumC2880b72.e, false, null, 7));
                Intrinsics.checkNotNullParameter(argumentType, "argumentType");
                if (!C3686f.n(argumentType)) {
                    AbstractC4649jL0 type2 = argumentType;
                    int i2 = 0;
                    while (RK0.y(type2)) {
                        type2 = ((N62) CollectionsKt.U(type2.T0())).getType();
                        i2++;
                    }
                    InterfaceC5044lD interfaceC5044lDC = type2.V0().c();
                    if (interfaceC5044lDC instanceof FC) {
                        QC qcF = C4900kZ.f(interfaceC5044lDC);
                        if (qcF != null) {
                            return new C3965gJ0(qcF, i2);
                        }
                        C3965gJ0.a.C0360a value3 = new C3965gJ0.a.C0360a(argumentType);
                        Intrinsics.checkNotNullParameter(value3, "value");
                        return new C3965gJ0(value3);
                    }
                    if (interfaceC5044lDC instanceof H62) {
                        C1758Ph0 topLevelFqName = C4194hP1.a.a.g();
                        Intrinsics.checkNotNullExpressionValue(topLevelFqName, "toSafe(...)");
                        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                        C1758Ph0 c1758Ph0E = topLevelFqName.e();
                        return new C3965gJ0(new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)")), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC1583Nc
    @Nullable
    public final C1758Ph0 c() {
        IJ0<Object> p = i[0];
        InterfaceC5868p71 interfaceC5868p71 = this.c;
        Intrinsics.checkNotNullParameter(interfaceC5868p71, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        return (C1758Ph0) interfaceC5868p71.invoke();
    }

    @Override // defpackage.InterfaceC1583Nc
    public final AbstractC4649jL0 getType() {
        return (AbstractC5706oM1) Nm2.f(this.d, i[1]);
    }

    @Override // defpackage.InterfaceC1583Nc
    public final VN1 i() {
        return this.e;
    }

    @Override // defpackage.InterfaceC1583Nc
    @NotNull
    public final Map<C5638o21, CK<?>> j() {
        return (Map) Nm2.f(this.f, i[2]);
    }

    @NotNull
    public final String toString() {
        return XY.a.x(this, null);
    }
}
