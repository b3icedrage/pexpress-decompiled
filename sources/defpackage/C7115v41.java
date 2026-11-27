package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: v41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7115v41 implements InterfaceC6905u41 {

    @NotNull
    public final AbstractC6331rL0.a c;

    @NotNull
    public final AbstractC5912pL0 d;

    @NotNull
    public final C1346Ka1 e;

    public C7115v41(AbstractC6331rL0.a kotlinTypeRefiner) {
        AbstractC5912pL0.a kotlinTypePreparator = AbstractC5912pL0.a.e;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        this.c = kotlinTypeRefiner;
        this.d = kotlinTypePreparator;
        if (kotlinTypeRefiner == null) {
            C1346Ka1.a(0);
            throw null;
        }
        C1346Ka1 c1346Ka1 = new C1346Ka1(C1346Ka1.f, kotlinTypeRefiner, kotlinTypePreparator);
        Intrinsics.checkNotNullExpressionValue(c1346Ka1, "createWithTypeRefiner(...)");
        this.e = c1346Ka1;
    }

    @Override // defpackage.InterfaceC6905u41
    @NotNull
    public final C1346Ka1 a() {
        return this.e;
    }

    @Override // defpackage.InterfaceC6905u41
    @NotNull
    public final AbstractC6331rL0 b() {
        return this.c;
    }

    public final boolean c(@NotNull AbstractC4649jL0 a, @NotNull AbstractC4649jL0 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        C6075q62 c6075q62A = C4156hD.a(false, this.d, this.c, 6);
        P92 a2 = a.Y0();
        P92 b2 = b.Y0();
        Intrinsics.checkNotNullParameter(c6075q62A, "<this>");
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return C7311w1.e(c6075q62A, a2, b2);
    }

    public final boolean d(@NotNull AbstractC4649jL0 subtype, @NotNull AbstractC4649jL0 supertype) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        C6075q62 c6075q62A = C4156hD.a(true, this.d, this.c, 6);
        P92 subType = subtype.Y0();
        P92 superType = supertype.Y0();
        Intrinsics.checkNotNullParameter(c6075q62A, "<this>");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return C7311w1.i(C7311w1.a, c6075q62A, subType, superType);
    }
}
