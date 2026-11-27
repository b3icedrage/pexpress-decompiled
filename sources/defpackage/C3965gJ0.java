package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3965gJ0 extends CK<a> {

    /* JADX INFO: renamed from: gJ0$a */
    public static abstract class a {

        /* JADX INFO: renamed from: gJ0$a$a, reason: collision with other inner class name */
        public static final class C0360a extends a {

            @NotNull
            public final AbstractC4649jL0 a;

            public C0360a(@NotNull AbstractC4649jL0 type) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.a = type;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0360a) && Intrinsics.a(this.a, ((C0360a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "LocalClass(type=" + this.a + ')';
            }
        }

        /* JADX INFO: renamed from: gJ0$a$b */
        public static final class b extends a {

            @NotNull
            public final TC a;

            public b(@NotNull TC value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this.a = value;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.a(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "NormalClass(value=" + this.a + ')';
            }
        }
    }

    public C3965gJ0(@NotNull TC value) {
        Intrinsics.checkNotNullParameter(value, "value");
        a.b value2 = new a.b(value);
        Intrinsics.checkNotNullParameter(value2, "value");
        super(value2);
    }

    @Override // defpackage.CK
    @NotNull
    public final AbstractC4649jL0 a(@NotNull S01 module) {
        AbstractC4649jL0 abstractC4649jL0C;
        Intrinsics.checkNotNullParameter(module, "module");
        C5655o62.e.getClass();
        C5655o62 c5655o62 = C5655o62.g;
        RK0 rk0T = module.t();
        rk0T.getClass();
        FC fcI = rk0T.i(C4194hP1.a.Q.g());
        Intrinsics.checkNotNullExpressionValue(fcI, "getKClass(...)");
        Intrinsics.checkNotNullParameter(module, "module");
        Object obj = this.a;
        a aVar = (a) obj;
        if (aVar instanceof a.C0360a) {
            abstractC4649jL0C = ((a.C0360a) obj).a;
        } else {
            if (!(aVar instanceof a.b)) {
                throw new C6489s51();
            }
            TC tc = ((a.b) obj).a;
            QC qc = tc.a;
            FC fcA = C7859yd0.a(module, qc);
            int i = tc.b;
            if (fcA == null) {
                abstractC4649jL0C = R70.c(Q70.UNRESOLVED_KCLASS_CONSTANT_VALUE, qc.toString(), String.valueOf(i));
            } else {
                AbstractC5706oM1 abstractC5706oM1Y = fcA.y();
                Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Y, "getDefaultType(...)");
                P92 p92V = C0564Aa.v(abstractC5706oM1Y);
                for (int i2 = 0; i2 < i; i2++) {
                    RK0 rk0T2 = module.t();
                    EnumC3610ed2 enumC3610ed2 = EnumC3610ed2.INVARIANT;
                    p92V = rk0T2.g(p92V);
                }
                abstractC4649jL0C = p92V;
            }
        }
        return C5492nL0.b(c5655o62, fcI, VE.c(new P62(abstractC4649jL0C)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3965gJ0(@NotNull QC classId, int i) {
        this(new TC(classId, i));
        Intrinsics.checkNotNullParameter(classId, "classId");
    }
}
