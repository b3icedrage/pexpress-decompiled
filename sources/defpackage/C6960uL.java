package defpackage;

import com.jivosite.sdk.model.repository.contacts.ContactForm;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6960uL extends SA<C3970gL> {

    @NotNull
    public final InterfaceC7170vL e;

    @NotNull
    public final M8 f;

    @NotNull
    public final EY0<String> g;

    @NotNull
    public final EY0<String> h;

    @NotNull
    public final EY0<String> i;

    @NotNull
    public final EY0 j;

    @NotNull
    public final EY0 k;

    @NotNull
    public final EY0 l;

    @NotNull
    public final EY0 m;

    @NotNull
    public final EY0 n;

    @NotNull
    public final EY0 o;

    /* JADX INFO: renamed from: uL$a */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public a() {
            this(false, false, false, false);
        }

        public static a a(a aVar, boolean z, boolean z2, boolean z3, boolean z4, int i) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            if ((i & 2) != 0) {
                z2 = aVar.b;
            }
            if ((i & 4) != 0) {
                z3 = aVar.c;
            }
            if ((i & 8) != 0) {
                z4 = aVar.d;
            }
            return new a(z, z2, z3, z4);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        public final int hashCode() {
            boolean z = this.a;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = r1 * 31;
            boolean z2 = this.b;
            ?? r2 = z2;
            if (z2) {
                r2 = 1;
            }
            int i2 = (i + r2) * 31;
            boolean z3 = this.c;
            ?? r3 = z3;
            if (z3) {
                r3 = 1;
            }
            int i3 = (i2 + r3) * 31;
            boolean z4 = this.d;
            return i3 + (z4 ? 1 : z4);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CanSendState(hasSentContactForm=");
            sb.append(this.a);
            sb.append(", isNameValid=");
            sb.append(this.b);
            sb.append(", isPhoneValid=");
            sb.append(this.c);
            sb.append(", isEmailValid=");
            return C4564j.f(sb, this.d, ')');
        }

        public a(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }
    }

    public C6960uL(@NotNull EK1 storage, @NotNull InterfaceC7170vL contactFormRepository, @NotNull M8 agentRepository) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(contactFormRepository, "contactFormRepository");
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        this.e = contactFormRepository;
        this.f = agentRepository;
        EY0<String> ey0 = new EY0<>();
        ey0.k("");
        ey0.l(this.d, new C5281mL(ey0, 0));
        this.g = ey0;
        final EY0<String> ey1 = new EY0<>();
        ey1.k("");
        ey1.l(this.d, new InterfaceC4819k81() { // from class: oL
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                String str;
                EY0 this_apply = ey1;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                ContactForm contactForm = ((C3970gL) obj).a.b;
                if (contactForm == null || (str = contactForm.b) == null) {
                    str = "";
                }
                this_apply.k(str);
            }
        });
        this.h = ey1;
        final EY0<String> ey2 = new EY0<>();
        ey2.k("");
        ey2.l(this.d, new InterfaceC4819k81() { // from class: pL
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                String str;
                EY0 this_apply = ey2;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                ContactForm contactForm = ((C3970gL) obj).a.b;
                if (contactForm == null || (str = contactForm.c) == null) {
                    str = "";
                }
                this_apply.k(str);
            }
        });
        this.i = ey2;
        final EY0 ey3 = new EY0();
        ey3.k(new a(false, false, false, false));
        ey3.l(this.d, new InterfaceC4819k81() { // from class: qL
            @Override // defpackage.InterfaceC4819k81
            public final void d(Object obj) {
                C3970gL c3970gL = (C3970gL) obj;
                EY0 this_apply = ey3;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                C6960uL.a aVar = (C6960uL.a) this_apply.d();
                this_apply.k(aVar != null ? C6960uL.a.a(aVar, c3970gL.a.a, false, false, false, 14) : null);
            }
        });
        ey3.l(ey0, new C6330rL(0, ey3));
        ey3.l(ey1, new C6540sL(0, ey3));
        ey3.l(ey2, new C6750tL(0, ey3));
        EY0 ey0A = C7747y42.a(ey3, new C6495s7(1));
        Intrinsics.checkNotNullExpressionValue(ey0A, "map(_canSendState) {\n        it.isNameValid\n    }");
        this.j = ey0A;
        EY0 ey0A2 = C7747y42.a(ey3, new C1039Gc0(2));
        Intrinsics.checkNotNullExpressionValue(ey0A2, "map(_canSendState) {\n        it.isPhoneValid\n    }");
        this.k = ey0A2;
        EY0 ey0A3 = C7747y42.a(ey3, new C5491nL(0));
        Intrinsics.checkNotNullExpressionValue(ey0A3, "map(_canSendState) {\n        it.isEmailValid\n    }");
        this.l = ey0A3;
        EY0 ey0A4 = C7747y42.a(this.d, new C2983be(1));
        Intrinsics.checkNotNullExpressionValue(ey0A4, "map(_entry) {\n        it….hasSentContactInfo\n    }");
        this.m = ey0A4;
        EY0 ey0A5 = C7747y42.a(ey3, new C5244m9(1));
        Intrinsics.checkNotNullExpressionValue(ey0A5, "map(_canSendState) {\n   … && it.isEmailValid\n    }");
        this.n = ey0A5;
        EY0 ey0A6 = C7747y42.a(agentRepository.A(), new EF0());
        Intrinsics.checkNotNullExpressionValue(ey0A6, "map(agentRepository.hasA…nline) {\n        it\n    }");
        this.o = ey0A6;
    }
}
