package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1842Qj0 extends V {

    @NotNull
    public static final QC p;

    @NotNull
    public static final QC q;

    @NotNull
    public final C2720aS0 i;

    @NotNull
    public final InterfaceC8132zv j;

    @NotNull
    public final AbstractC3008bk0 k;
    public final int l;

    @NotNull
    public final a m;

    @NotNull
    public final C1998Sj0 n;

    @NotNull
    public final List<H62> o;

    /* JADX INFO: renamed from: Qj0$a */
    public final class a extends W {
        public a() {
            super(C1842Qj0.this.i);
        }

        @Override // defpackage.InterfaceC6494s62
        @NotNull
        public final List<H62> b() {
            return C1842Qj0.this.o;
        }

        @Override // defpackage.W, defpackage.InterfaceC6494s62
        public final InterfaceC5044lD c() {
            return C1842Qj0.this;
        }

        @Override // defpackage.InterfaceC6494s62
        public final boolean e() {
            return true;
        }

        @Override // defpackage.B1
        @NotNull
        public final Collection<AbstractC4649jL0> h() {
            List<QC> listF;
            C1842Qj0 c1842Qj0 = C1842Qj0.this;
            AbstractC3008bk0 abstractC3008bk0 = c1842Qj0.k;
            AbstractC3008bk0.a aVar = AbstractC3008bk0.a.c;
            if (Intrinsics.a(abstractC3008bk0, aVar)) {
                listF = VE.c(C1842Qj0.p);
            } else {
                boolean zA = Intrinsics.a(abstractC3008bk0, AbstractC3008bk0.b.c);
                int i = c1842Qj0.l;
                if (zA) {
                    listF = WE.f(C1842Qj0.q, new QC(C4194hP1.l, aVar.a(i)));
                } else {
                    AbstractC3008bk0.d dVar = AbstractC3008bk0.d.c;
                    if (Intrinsics.a(abstractC3008bk0, dVar)) {
                        listF = VE.c(C1842Qj0.p);
                    } else {
                        if (!Intrinsics.a(abstractC3008bk0, AbstractC3008bk0.c.c)) {
                            int i2 = C3300d8.a;
                            Intrinsics.checkNotNullParameter("should not be called", "message");
                            throw new IllegalStateException("should not be called");
                        }
                        listF = WE.f(C1842Qj0.q, new QC(C4194hP1.f, dVar.a(i)));
                    }
                }
            }
            S01 s01E = c1842Qj0.j.e();
            ArrayList arrayList = new ArrayList(XE.m(listF, 10));
            for (QC qc : listF) {
                FC fcA = C7859yd0.a(s01E, qc);
                if (fcA == null) {
                    throw new IllegalStateException(("Built-in class " + qc + " not found").toString());
                }
                List listB0 = CollectionsKt.b0(fcA.p().b().size(), c1842Qj0.o);
                ArrayList arrayList2 = new ArrayList(XE.m(listB0, 10));
                Iterator it = listB0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new P62(((H62) it.next()).y()));
                }
                C5655o62.e.getClass();
                arrayList.add(C5492nL0.b(C5655o62.g, fcA, arrayList2));
            }
            return CollectionsKt.e0(arrayList);
        }

        @Override // defpackage.B1
        @NotNull
        public final InterfaceC3792fV1 k() {
            return InterfaceC3792fV1.a.a;
        }

        @Override // defpackage.W
        /* JADX INFO: renamed from: p */
        public final FC c() {
            return C1842Qj0.this;
        }

        @NotNull
        public final String toString() {
            return C1842Qj0.this.toString();
        }
    }

    static {
        C1758Ph0 c1758Ph0 = C4194hP1.l;
        C5638o21 c5638o21K = C5638o21.k("Function");
        Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
        p = new QC(c1758Ph0, c5638o21K);
        C1758Ph0 c1758Ph1 = C4194hP1.i;
        C5638o21 c5638o21K2 = C5638o21.k("KFunction");
        Intrinsics.checkNotNullExpressionValue(c5638o21K2, "identifier(...)");
        q = new QC(c1758Ph1, c5638o21K2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1842Qj0(@NotNull C2720aS0 storageManager, @NotNull InterfaceC8132zv containingDeclaration, @NotNull AbstractC3008bk0 functionTypeKind, int i) {
        super(storageManager, functionTypeKind.a(i));
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(functionTypeKind, "functionTypeKind");
        this.i = storageManager;
        this.j = containingDeclaration;
        this.k = functionTypeKind;
        this.l = i;
        this.m = new a();
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(this, "containingClass");
        this.n = new C1998Sj0(storageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i, 1);
        ArrayList arrayList2 = new ArrayList(XE.m(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (((DB0) it).g) {
            int iB = ((CB0) it).b();
            arrayList.add(I62.Y0(this, EnumC3610ed2.IN_VARIANCE, C5638o21.k("P" + iB), arrayList.size(), this.i));
            arrayList2.add(Unit.a);
        }
        arrayList.add(I62.Y0(this, EnumC3610ed2.OUT_VARIANCE, C5638o21.k("R"), arrayList.size(), this.i));
        this.o = CollectionsKt.e0(arrayList);
        EnumC1920Rj0.a aVar = EnumC1920Rj0.d;
        AbstractC3008bk0 functionTypeKind2 = this.k;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(functionTypeKind2, "functionTypeKind");
        if (Intrinsics.a(functionTypeKind2, AbstractC3008bk0.a.c) || Intrinsics.a(functionTypeKind2, AbstractC3008bk0.d.c) || Intrinsics.a(functionTypeKind2, AbstractC3008bk0.b.c)) {
            return;
        }
        Intrinsics.a(functionTypeKind2, AbstractC3008bk0.c.c);
    }

    @Override // defpackage.FC, defpackage.InterfaceC5257mD
    @NotNull
    public final List<H62> A() {
        return this.o;
    }

    @Override // defpackage.GY0
    public final boolean D() {
        return false;
    }

    @Override // defpackage.FC
    public final boolean E() {
        return false;
    }

    @Override // defpackage.FC
    @Nullable
    public final Rc2<AbstractC5706oM1> F0() {
        return null;
    }

    @Override // defpackage.O01
    public final QY0 G0(AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.n;
    }

    @Override // defpackage.FC
    public final boolean I() {
        return false;
    }

    @Override // defpackage.GY0
    public final boolean M0() {
        return false;
    }

    @Override // defpackage.FC
    public final Collection P() {
        return C5653o60.d;
    }

    @Override // defpackage.GY0
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.FC
    public final boolean Q0() {
        return false;
    }

    @Override // defpackage.InterfaceC5257mD
    public final boolean R() {
        return false;
    }

    @Override // defpackage.FC
    public final /* bridge */ /* synthetic */ InterfaceC7984zC X() {
        return null;
    }

    @Override // defpackage.FC
    public final QY0 Y() {
        return QY0.b.b;
    }

    @Override // defpackage.FC
    public final /* bridge */ /* synthetic */ FC a0() {
        return null;
    }

    @Override // defpackage.FC, defpackage.GY0
    @NotNull
    public final AbstractC5533nZ d() {
        C5323mZ.h PUBLIC = C5323mZ.e;
        Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // defpackage.InterfaceC4675jU
    public final InterfaceC4675jU e() {
        return this.j;
    }

    @Override // defpackage.FC
    @NotNull
    public final SC h() {
        return SC.e;
    }

    @Override // defpackage.InterfaceC5728oU
    @NotNull
    public final VN1 i() {
        VN1.a NO_SOURCE = VN1.a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // defpackage.InterfaceC0726Cc
    @NotNull
    public final InterfaceC2396Xc k() {
        return InterfaceC2396Xc.a.a;
    }

    @Override // defpackage.FC
    public final boolean m() {
        return false;
    }

    @Override // defpackage.InterfaceC5044lD
    @NotNull
    public final InterfaceC6494s62 p() {
        return this.m;
    }

    @Override // defpackage.FC, defpackage.GY0
    @NotNull
    public final C01 q() {
        return C01.i;
    }

    @Override // defpackage.FC
    public final Collection r() {
        return C5653o60.d;
    }

    @Override // defpackage.FC
    public final boolean s() {
        return false;
    }

    @NotNull
    public final String toString() {
        String strE = getName().e();
        Intrinsics.checkNotNullExpressionValue(strE, "asString(...)");
        return strE;
    }
}
