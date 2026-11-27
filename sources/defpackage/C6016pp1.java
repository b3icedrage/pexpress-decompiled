package defpackage;

import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: pp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6016pp1 extends C2574Zj0 implements Function1<Member, Boolean> {
    public static final C6016pp1 m = new C6016pp1(1);

    @Override // defpackage.AbstractC1568Mx, defpackage.JI0
    public final String getName() {
        return "isSynthetic";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Member member) {
        Member p0 = member;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(p0.isSynthetic());
    }

    @Override // defpackage.AbstractC1568Mx
    public final InterfaceC5486nJ0 j() {
        return C2017Sp1.a.b(Member.class);
    }

    @Override // defpackage.AbstractC1568Mx
    public final String o() {
        return "isSynthetic()Z";
    }
}
